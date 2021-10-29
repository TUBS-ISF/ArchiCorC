package tu_bs.cs.isf.mapping.validation;

import de.tu_bs.ccc.contracting.Verification.Module
import de.tu_bs.ccc.contracting.Verification.Ports
import de.tu_bs.ccc.contracting.core.localization.StringTable
import de.tu_bs.ccc.contracting.core.util.CoreUtil
import de.tu_bs.ccc.contracting.idl.cidl.Interface
import de.tu_bs.ccc.contracting.idl.cidl.Method
import java.util.Collection
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspace
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import tu_bs.cs.isf.mapping.mapping.CbcDiagram
import tu_bs.cs.isf.mapping.mapping.Component
import tu_bs.cs.isf.mapping.mapping.ServiceMethod
import tu_bs.cs.isf.mapping.mapping.impl.ComponentImpl

class CorrectMappingPair {
	
	def static boolean correctMappingPair (CbcDiagram cbc, ServiceMethod sm, String root, IWorkspace w) {
		val boolean b = correctCbCDiagram(cbc, root, w)
		val boolean b2 = correctServiceMethod(sm, root, w)
		
		return (b && b2)
	}
	
	def static boolean correctCbCDiagram (CbcDiagram cbc, String root, IWorkspace w) {
		val String filePath = FileFinder.path(cbc, cbc.name, root);
		val IFile f = FileFinder.file(filePath,w);
		if (f.exists() && cbc.name.endsWith(".diagram")){
	    	return true;
		}
		return false;
	}
	
	def static boolean correctServiceMethod (ServiceMethod sm, String root, IWorkspace w) {
		if (sm.name.contains(".")){
			val String[] smParts = sm.name.split("\\.")
			val String portName = smParts.get(0)
			val String methodName = smParts.get(1)
			val EObject smComponent = sm.eContainer.eContainer
			val Component c = ComponentImpl.cast(smComponent)
			val String componentPath = FileFinder.path(c, c.name, root)
			val IFile f = FileFinder.file(componentPath, w)
		
			if (f.exists){
				val IProject p = f.project
				val Collection<Module> cm = CoreUtil.getRootModules(p)
			
				for	(i : 0 ..< cm.size){
					if (c.name.endsWith(StringTable.DIAGRAM_FILE_EXTENSION)){
						val String[] parts = c.name.split("\\.")
						var String name = parts.get(parts.size-2)
					
						if (name.contains("/")){
							val String[] parts2= name.split("/")
							name = parts2.get(parts2.size-1)
						}
						if(name.equals(cm.get(i).name)){
							val EList<Ports> ports = cm.get(i).ports
						
							for (j : 0 ..< ports.size){
								if ((portName.equals(ports.get(j).name)) && (ports.get(j).type.getName.equals("SERVICE"))){
									val List<Interface> interfaces = CideMethods.getInterfaces(p)
									for	(k : 0 ..< interfaces.size){
										if (interfaces.get(k).name.equals(ports.get(j).service)){
											val EList<Method> methods = interfaces.get(k).methods
											
											for (l : 0 ..< methods.size){
												if (methods.get(l).name.equals(methodName)){
													return true
												}
											}
										}	
									}
								} 
							}
						}
					}
				}
			}
		}
		return false;
	}
}