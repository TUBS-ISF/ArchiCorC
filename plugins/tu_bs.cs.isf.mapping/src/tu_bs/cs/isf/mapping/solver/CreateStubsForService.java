package tu_bs.cs.isf.mapping.solver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.tu_bs.ccc.contracting.idl.cidl.Argument;
import de.tu_bs.ccc.contracting.idl.cidl.ContractPair;
import de.tu_bs.ccc.contracting.idl.cidl.Interface;
import de.tu_bs.ccc.contracting.idl.cidl.Method;
import tu_bs.cs.isf.mapping.validation.Console;
import tu_bs.cs.isf.mapping.validation.FileFinder;

public class CreateStubsForService {
	
	public static void create(EObject e, List<Interface> interfaces, String root) {
		for (Interface i: interfaces){
			String interfaceName = i.getName();
			String path = FileFinder.path(e, interfaceName+".java", root);
			String code = constructCodeBlock(i);
			writeFile(path, code);	
			}
	}
	
	public static String constructCodeBlock(Interface i) {
		StringBuffer code = new StringBuffer();
		code.append("//created stub file\n" );
		code.append("public class "+i.getName()+" {\n");
		EList<Method> methods = i.getMethods();
		
		if(methods != null) {
			for(Method m: methods) {
				EList<Argument> outArgs = m.getOutArgs();
				
				if(outArgs.size() == 0 || outArgs.size() == 1) {
					String outType = "void";
					String outTypeName = "no Output";
					String content = "";
					if(outArgs.size() == 1) {
						outType = outArgs.get(0).getType().getPredefined().getName();
						outType = typeEncoding(outType);
						if(outArgs.get(0).isArray()) {
							outType += "[]";
						}
						outTypeName = m.getOutArgs().get(0).getName();
						content = "		return 0;";
					}
					EList<ContractPair> cps = m.getSpec().getContracts();
					String req0 = cps.get(0).getReq().get(0).getExpr();
					req0 = req0.replace("\"", "");
					req0 = "requires "+req0+";";
					req0 = adjust(req0);
					String ens0 = cps.get(0).getEns().get(0).getExpr();
					ens0 = ens0.replace("\"", "");
					if(ens0.contains(outTypeName)) {
						ens0 = ens0.replace(outTypeName, "\\result");
					}
					ens0 = "ensures "+ens0+";";
					ens0 = adjust(ens0);
					
					
					EList<Argument> inArgs = m.getInArgs();
					String inType = "";
					for(int j = 0; j < inArgs.size(); j++) {
						String type = inArgs.get(j).getType().getPredefined().getName();
						type = typeEncoding(type);
						if(j>0) {
							inType += ", ";
						}
						inType += type+"";
						if(inArgs.get(j).isArray()) {
							inType += "[]";
						}
						inType += " "+inArgs.get(j).getName();
						
					}
					
					code.append("\n	/*@\n	@ normal_behavior\n		@ "+req0+"\n	@ "+ens0);
					if(cps.size()>1) {
						for(int j = 1; j<cps.size(); j++) {
							String reqj = cps.get(j).getReq().get(0).getExpr();
							reqj = reqj.replace("\"", "");
							reqj = "requires "+reqj+";";;
							reqj = adjust(reqj);
							String ensj = cps.get(j).getEns().get(0).getExpr();
							ensj = ensj.replace("\"", "");
							if(ensj.contains(outTypeName)) {
								ensj = ensj.replace(outTypeName, "\\result");
							}
							ensj = "ensures "+ensj+";";
							ensj = adjust(ensj);
							code.append("\n 	@ also\n	@ "+reqj+"\n	@ "+ensj);
						}
					}
						code.append("\n	*/\n	public static "+outType+" "+m.getName()+"("+inType+"){\n"+content+"\n	}\n");
					
				} else {
					code.append("\n	Error: Method \"+m.getName()+\" in \"+i.getName()+\" has multiple Output-Types");
					Console.println("Error: Method "+m.getName()+" in "+i.getName()+" has multiple Output-Types");
				}
			}
		}
		code.append("\n}");
		
		String codeString = code.toString();
		codeString = codeString.replace(";;", ";");
		codeString = codeString.replace("TRUE", "true");
		codeString = codeString.replace("FALSE", "false");
		return codeString;
	}
	
	public static void writeFile(String location, String code) {
		File javaFile = new File(location);
		try {
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileWriter fw = new FileWriter(javaFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(code);
			bw.close();
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IPath iLocation = Path.fromOSString(javaFile.getAbsolutePath());
			IFile ifile = workspace.getRoot().getFileForLocation(iLocation);
			ifile.refreshLocal(0, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private static String typeEncoding(String type) {
		switch (type) {
		case "Int8":
		case "UInt8":
		case "Int16":
		case "UInt16":
		case "Int32":
		case "UInt32":
			type = "int";
			break;
		case "Int64":
		case "UInt64":
			type = "long";
			break;
		case "Boolean":
			type = "boolean";
			break;
		case "String":
			type = "string";
			break;
		case "Float":
			type = "float";
			break;
		case "Double":
			type = "double";
			break;
		case "ByteBuffer":
			type = "Byte[]";
			break;
		}
		return type;
	}
	
	private static String adjust(String t) {
		String s = t;
		
		String[] arr = s.split("&&");
		String t2 = "";
		for(int i = 0; i < arr.length; i++){
			//Console.println(arr[i]);
			String v = arr[i];
			if(v.contains("\\forall")||v.contains("\\exists")||v.contains("\\sum")||
				v.contains("\\product")||v.contains("\\max")||v.contains("\\min")){
				v = adjustFunction(v);
			}
			if(i == 0){
				t2 = v;
			} else {
				t2 += "&"+v;
			}
		}
		s = t2;
		return s;
	}

	private static String adjustFunction(String t) {
		String s = t;
		StringBuffer buffer = new StringBuffer(s);
		int first = buffer.indexOf(";");
		int second = buffer.indexOf(";", first+2);
		int intType = buffer.indexOf("int");
		String intName = buffer.substring(intType+4, first);
		buffer.replace(second, second+1, "<");
		buffer.insert(second+1, "="+intName+"&"+intName+"<");
		int third = buffer.indexOf(";", second+1);
		String subString = buffer.substring(third+1, buffer.length()-1);
		
		if(subString.contains("\\forall")||subString.contains("\\exists")||subString.contains("\\sum")||
				subString.contains("\\product")||subString.contains("\\max")||subString.contains("\\min")){
				String newSubString = adjust(subString);
				buffer.replace(third+1, buffer.length()-1, newSubString);
		}
		s = buffer.toString();
		return s;
	}
}