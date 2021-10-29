package tu_bs.cs.isf.mapping.solver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

import de.tu_bs.cs.isf.cbc.cbcmodel.Condition;
import de.tu_bs.cs.isf.cbc.cbcmodel.GlobalConditions;
import de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariable;
import de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables;
import de.tu_bs.cs.isf.cbc.cbcmodel.Rename;
import de.tu_bs.cs.isf.cbc.cbcmodel.Renaming;
import de.uka.ilkd.key.control.KeYEnvironment;
import de.uka.ilkd.key.gui.MainWindow;
import de.uka.ilkd.key.proof.Proof;
import de.uka.ilkd.key.proof.io.ProblemLoaderException;
import de.uka.ilkd.key.settings.ChoiceSettings;
import de.uka.ilkd.key.settings.ProofSettings;
import de.uka.ilkd.key.strategy.StrategyProperties;
import de.uka.ilkd.key.util.MiscTools;

public class KeyProve implements Prover {
	
	static int maxSteps = 20000;
	
	private String method;
	private Condition cidePre;
	private Condition cidePost;
	private Condition corcPre;
	private Condition corcPost;
	private JavaVariables corcVars;
	private GlobalConditions corcConds;
	private Renaming corcRenaming;
	private URI uri;

	public KeyProve(String method, Condition cidePre, Condition cidePost, Condition corcPre, Condition corcPost, JavaVariables corcVars, GlobalConditions corcConds, Renaming corcRenaming, URI uri) {
	  
		this.method = method;
		this.cidePre = cidePre;
		this.cidePost = cidePost;
		this.corcPre = corcPre;
		this.corcPost = corcPost;
		this.corcVars = corcVars;
		this.corcConds = corcConds;
		this.corcRenaming = corcRenaming;
		this.uri = uri;
	}

	@Override
	public int[] provePreCideCorc() {
		File location = createProvePreCideCorcWithKey(method, cidePre, corcPre, corcVars, corcConds, corcRenaming, uri, 0, true);
		return proveWithKey(location);
	}

	@Override
	public int[] provePostCorcCide() {
		File location = createProvePostCorcCideWithKey(method, cidePost, corcPost, corcVars, corcConds, corcRenaming, uri, 1, true);
		return proveWithKey(location);
	}


	public static IProject getProject(URI uri) {
		uri = uri.trimFragment();
		String uriPath = uri.toPlatformString(true);
		uriPath = uriPath.substring(1, uriPath.length());
		int positionOfSlash = uriPath.indexOf('/') + 1;
		uriPath = uriPath.substring(positionOfSlash, uriPath.length());
		IProject thisProject = null;
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (p.getFile(new Path(uriPath)).exists()) {
				thisProject = p;
			}
		}
		return thisProject;
	}
	
	private static File writeFile(String problem, String location, int numberFile, boolean override) {
		File keyFile = new File(location + "/prove" + numberFile + ".key");
		File keyHelperFile = new File(location + "/helper.key");
		if (!keyFile.exists() || override) {
			try {
				keyFile.getParentFile().mkdirs();
				keyFile.createNewFile();
				FileWriter fw = new FileWriter(keyFile);
				BufferedWriter bw = new BufferedWriter(fw);
	
				bw.write(problem);
				bw.close();
				
				if (!keyHelperFile.exists()) {
					keyHelperFile.createNewFile();
				}
				IWorkspace workspace = ResourcesPlugin.getWorkspace();    
				IPath iLocation = Path.fromOSString(keyFile.getAbsolutePath()); 
				IFile ifile = workspace.getRoot().getFileForLocation(iLocation);
				ifile.refreshLocal(0, null);
				return keyFile;
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	//status: 0 - proven, 1 - interactively proven, 2 - Timeout, 3 - OpenGoals, 4 - not proven (doesn't exists in KeY), 5 - unknown
	public static int[] proveWithKey(File location) {
		final long timeStart = System.currentTimeMillis();
		long timeEnd = System.currentTimeMillis();
		Proof proof = createKeyProof(location);
		//results[0] = status, results[1] = steps, results[2] = time
		int[] results = {5, 0, 0};
		if (proof != null) {
			boolean closed = proof.openGoals().isEmpty();
			if(!closed) {
				int steps = proof.countNodes();
				if(steps >= maxSteps) {
					results[0] = 2;
					results[1] = steps;
					timeEnd = System.currentTimeMillis();
				} else {
					MainWindow.getInstance().loadProblem(location);
					MainWindow.getInstance().setVisible(true);
					while(MainWindow.getInstance().isShowing()) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(proof.openGoals().isEmpty()) {
						results[0] = 1;
						results[1] = steps;
						timeEnd = System.currentTimeMillis();
					} else {
						results[0] = 3;
						results[1] = steps;
						timeEnd = System.currentTimeMillis();
					}
					
				}
				
			} else {
				results[0] = 0;
				int steps = proof.countNodes();
				results[1] = steps;
				timeEnd = System.currentTimeMillis();
			}
		}
		
		final long timeLong = timeEnd - timeStart;
		int time = (int) timeLong; 
		results[2] = time;
		return results;
	}

	private static String useRenamingCondition(Renaming renaming, String toRename) {
		for (Rename rename : renaming.getRename()) {
			if (rename.getType().equalsIgnoreCase("boolean")) {
				toRename = toRename.replaceAll(rename.getNewName(), "TRUE=" + rename.getFunction());
			} else {
				toRename = toRename.replaceAll(rename.getNewName(), rename.getFunction());
			}
		}
		return toRename;
	}
	
	
	
	public static File createProvePreCideCorcWithKey(String method, Condition cidePre, Condition corcPre, JavaVariables vars,
			GlobalConditions conds, Renaming renaming, URI uri, int numberFile, boolean override) {
		
		String programVariablesString = "";
		if (vars != null) {
			for (JavaVariable var : vars.getVariables()) {
				programVariablesString += var.getName() + "; ";
			}
		}
		
		String globalConditionsString = "";
		if (conds != null) {
			for (Condition cond : conds.getConditions()) {
				if (!cond.getName().isEmpty()) {
					globalConditionsString += " & " + cond.getName();
				}
			}
		}
		
		IProject thisProject = getProject(uri);
		
		String cidePreString = cidePre.getName();
		String corcPreString = corcPre.getName();
		
		if (cidePreString == null || cidePreString.length() == 0) {
			cidePreString = "true";
		}
		if (corcPreString == null || corcPreString.length() == 0) {
			corcPreString = "true";
		}
		
		if(renaming != null) {
			globalConditionsString = useRenamingCondition(renaming, globalConditionsString);
			cidePreString = useRenamingCondition(renaming, cidePreString);
			corcPreString = useRenamingCondition(renaming, corcPreString);
		}
		
		String problem = "\\javaSource \"" + thisProject.getLocation() + "/\";"
				+ "\\programVariables {" + programVariablesString + " Heap heapAtPre;}"
				+ "\\problem {(" + cidePreString + " " + globalConditionsString+ "&wellFormed(heap)) -> {heapAtPre := heap} (" + corcPreString + " " + globalConditionsString + "&wellFormed(heap))}";
		//Console.println("pre: "+problem);
		String location = thisProject.getLocation() + "/src/prove/"+method+"_" + uri.trimFileExtension().lastSegment();
		File keyFile = writeFile(problem, location, numberFile, override);
		return keyFile;
	}

	
	public static File createProvePostCorcCideWithKey(String method, Condition cidePost, Condition corcPost, JavaVariables vars,
			GlobalConditions conds, Renaming renaming, URI uri, int numberFile, boolean override) {
		
		String programVariablesString = "";
		if (vars != null) {
			for (JavaVariable var : vars.getVariables()) {
				programVariablesString += var.getName() + "; ";
			}
		}
		
		String globalConditionsString = "";
		if (conds != null) {
			for (Condition cond : conds.getConditions()) {
				if (!cond.getName().isEmpty()) {
					globalConditionsString += " & " + cond.getName();
				}
			}
		}
		
		IProject thisProject = getProject(uri);
		
		String cidePostString = cidePost.getName();
		String corcPostString = corcPost.getName();
		
		if (cidePostString == null || cidePostString.length() == 0) {
			cidePostString = "true";
		}
		if (corcPostString == null || corcPostString.length() == 0) {
			corcPostString = "true";
		}
		
		if(renaming != null) {
			globalConditionsString = useRenamingCondition(renaming, globalConditionsString);
			cidePostString = useRenamingCondition(renaming, cidePostString);
			corcPostString = useRenamingCondition(renaming, corcPostString);
		}
		
		String problem = "\\javaSource \"" + thisProject.getLocation() + "/\";"
				+ "\\programVariables {" + programVariablesString + " Heap heapAtPre;}"
				+ "\\problem {(" + corcPostString + " " + globalConditionsString + "&wellFormed(heap)) -> {heapAtPre := heap} (" + cidePostString+ " " + globalConditionsString + "&wellFormed(heap))}";
		//Console.println("post: "+problem);
		String location = thisProject.getLocation() + "/src/prove/"+method+"_"  + uri.trimFileExtension().lastSegment();
		File keyFile = writeFile(problem, location, numberFile, override);
		return keyFile;
	}
	
	public static boolean checkFileIsProved(String method, URI uri, int numberFile) {
		IProject project = getProject(uri);
		File location = new File(project.getLocation() + "/src/prove/"+method+"_" + uri.trimFileExtension().lastSegment() + "/prove" + numberFile + ".key");
		if (location.exists()) {
			try {
				KeYEnvironment<?> env = KeYEnvironment.load(location, null, null, null);
				Proof proof = env.getLoadedProof();
				return proof.openGoals().isEmpty();
			} catch (ProblemLoaderException e) {
				e.printStackTrace();
			}
		}
		return false;
				
	}

	private static Proof createKeyProof(File location) {
		Proof proof = null;
		List<File> classPaths = null; // Optionally: Additional specifications
										// for API classes
		File bootClassPath = null; // Optionally: Different default
									// specifications for Java API
		List<File> includes = null; // Optionally: Additional includes to
									// consider
		try {
			// Ensure that Taclets are parsed
			if (!ProofSettings.isChoiceSettingInitialised()) {
				KeYEnvironment<?> env = KeYEnvironment.load(location, classPaths, bootClassPath, includes);
				env.dispose();
			}
			// Set Taclet options
			ChoiceSettings choiceSettings = ProofSettings.DEFAULT_SETTINGS.getChoiceSettings();
			HashMap<String, String> oldSettings = choiceSettings.getDefaultChoices();
			HashMap<String, String> newSettings = new HashMap<String, String>(oldSettings);
			newSettings.putAll(MiscTools.getDefaultTacletOptions());
			newSettings.put("runtimeExceptions", "runtimeExceptions:ban");
			choiceSettings.setDefaultChoices(newSettings);
			// Load source code
			KeYEnvironment<?> env = KeYEnvironment.load(location, classPaths, bootClassPath, includes);
			proof = env.getLoadedProof();
			// Set proof strategy options
			StrategyProperties sp = proof.getSettings().getStrategySettings().getActiveStrategyProperties();
			sp.setProperty(StrategyProperties.METHOD_OPTIONS_KEY, StrategyProperties.METHOD_CONTRACT);
			sp.setProperty(StrategyProperties.LOOP_OPTIONS_KEY, StrategyProperties.LOOP_EXPAND);
			sp.setProperty(StrategyProperties.DEP_OPTIONS_KEY, StrategyProperties.DEP_ON);
			sp.setProperty(StrategyProperties.QUERY_OPTIONS_KEY, StrategyProperties.QUERY_RESTRICTED);// StrategyProperties.QUERY_ON
			sp.setProperty(StrategyProperties.NON_LIN_ARITH_OPTIONS_KEY, StrategyProperties.NON_LIN_ARITH_DEF_OPS);
			sp.setProperty(StrategyProperties.STOPMODE_OPTIONS_KEY, StrategyProperties.STOPMODE_NONCLOSE);
			proof.getSettings().getStrategySettings().setActiveStrategyProperties(sp);
			// Make sure that the new options are used
			
			ProofSettings.DEFAULT_SETTINGS.getStrategySettings().setMaxSteps(maxSteps);
			ProofSettings.DEFAULT_SETTINGS.getStrategySettings().setActiveStrategyProperties(sp);
			proof.getSettings().getStrategySettings().setMaxSteps(maxSteps);
			proof.setActiveStrategy(proof.getServices().getProfile().getDefaultStrategyFactory().create(proof, sp));
			// Start auto mode			
			final long timeStart = System.currentTimeMillis();
			env.getUi().getProofControl().startAndWaitForAutoMode(proof);
			final long timeEnd = System.currentTimeMillis();
			long time = timeEnd-timeStart;
			//Console.println(time);
			// Show proof result
			try {
				proof.saveToFile(location);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ProblemLoaderException e) {
			e.printStackTrace();
		}
		return proof;
	}




	
}