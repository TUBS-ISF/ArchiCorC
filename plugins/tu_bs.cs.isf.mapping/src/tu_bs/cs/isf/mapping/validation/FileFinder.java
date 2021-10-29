package tu_bs.cs.isf.mapping.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;


public class FileFinder {
	
	public static String path(EObject e, String objectName, String root) {
		String project="\\"+e.eResource().getURI().segment(1);
		String sourcePath=root+project+"\\src";
		String filePath = sourcePath+"\\"+objectName;
		
		return filePath;
	}
		
	public static IFile file(String path, IWorkspace w) {
		IPath ipath = Path.fromOSString(path);
		IFile f = w.getRoot().getFileForLocation(ipath);
		
		return f;
	}
	
}