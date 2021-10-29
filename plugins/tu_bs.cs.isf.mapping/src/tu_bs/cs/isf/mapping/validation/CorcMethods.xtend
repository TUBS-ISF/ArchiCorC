package tu_bs.cs.isf.mapping.validation

import de.tu_bs.cs.isf.cbc.cbcmodel.CbCFormula
import de.tu_bs.cs.isf.cbc.cbcmodel.impl.CbCFormulaImpl
import de.tu_bs.cs.isf.cbc.tool.helper.GetDiagramUtil
import java.util.Collection
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspace
import org.eclipse.emf.ecore.EObject
import org.eclipse.graphiti.mm.pictograms.Diagram
import org.eclipse.graphiti.mm.pictograms.Shape
import tu_bs.cs.isf.mapping.mapping.CbcDiagram
import de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables
import de.tu_bs.cs.isf.cbc.cbcmodel.AbstractStatement
import de.tu_bs.cs.isf.cbc.cbcmodel.GlobalConditions
import de.tu_bs.cs.isf.cbc.cbcmodel.Renaming

class CorcMethods {
	
	def static List<Shape> getShapes(CbcDiagram cbc, String root, IWorkspace w) {
		val String filePath = FileFinder.path(cbc, cbc.name, root)
		val IFile f = FileFinder.file(filePath,w)
		val IProject project = f.project
		val Collection<Diagram> diagrams = GetDiagramUtil.getDiagrams(project)
		var List<Shape> shapes = null
		
		for(i : 0 ..< diagrams.size) {
			val Diagram d = diagrams.get(i)
			val String dPath = d.eResource.URI.path
			val String projectName= cbc.eResource().getURI().segment(1)
			val String cbcPath = "/resource/"+projectName+"/src/"+cbc.name
			
			if(cbcPath.equals(dPath)){
				shapes = d.children
			}
		}
		return shapes
	}
	
	def static AbstractStatement getContractPair(List<Shape> shapes) {
		for(j : 0 ..< shapes.size){
			val Shape shape = shapes.get(j)
			val List<EObject> objects = shape.link.businessObjects
			
			for (k : 0 ..< objects.size) {
				val EObject o = objects.get(k)
				
				if (o instanceof CbCFormula){
					val CbCFormula formula = CbCFormulaImpl.cast(o)
					val AbstractStatement statement = formula.statement
					
					return statement
				}
			}
		}					
	}
	
	def static JavaVariables getJavaVariables(List<Shape> shapes) {
		for(j : 0 ..< shapes.size){
			val Shape shape = shapes.get(j)
			val List<EObject> objects = shape.link.businessObjects
			
			for (k : 0 ..< objects.size) {
				val EObject o = objects.get(k)
				
				if (o instanceof JavaVariables){
					val JavaVariables vars = o as JavaVariables							
					return vars
				}
			}
		}
		return null					
	}
	
	
	def static GlobalConditions getGlobalConditions(List<Shape> shapes) {
		for(j : 0 ..< shapes.size){
			val Shape shape = shapes.get(j)
			val List<EObject> objects = shape.link.businessObjects
			
			for (k : 0 ..< objects.size) {
				val EObject o = objects.get(k)
				
				if (o instanceof GlobalConditions){
					val GlobalConditions conds = o as GlobalConditions							
					return conds
				}
			}
		}
		return null					
	}
	
	def static Renaming getRenaming(List<Shape> shapes) {
		for(j : 0 ..< shapes.size){
			val Shape shape = shapes.get(j)
			val List<EObject> objects = shape.link.businessObjects
			
			for (k : 0 ..< objects.size) {
				val EObject o = objects.get(k)
				
				if (o instanceof Renaming){
					val Renaming renaming = o as Renaming							
					return renaming
				}
			}
		}
		return null					
	}
}