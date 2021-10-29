package tu_bs.cs.isf.mapping.validation;

import de.tu_bs.cs.isf.cbc.cbcmodel.AbstractStatement;
import de.tu_bs.cs.isf.cbc.cbcmodel.CbCFormula;
import de.tu_bs.cs.isf.cbc.cbcmodel.GlobalConditions;
import de.tu_bs.cs.isf.cbc.cbcmodel.JavaVariables;
import de.tu_bs.cs.isf.cbc.cbcmodel.Renaming;
import de.tu_bs.cs.isf.cbc.cbcmodel.impl.CbCFormulaImpl;
import de.tu_bs.cs.isf.cbc.tool.helper.GetDiagramUtil;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import tu_bs.cs.isf.mapping.mapping.CbcDiagram;
import tu_bs.cs.isf.mapping.validation.FileFinder;

@SuppressWarnings("all")
public class CorcMethods {
  public static List<Shape> getShapes(final CbcDiagram cbc, final String root, final IWorkspace w) {
    final String filePath = FileFinder.path(cbc, cbc.getName(), root);
    final IFile f = FileFinder.file(filePath, w);
    final IProject project = f.getProject();
    final Collection<Diagram> diagrams = GetDiagramUtil.getDiagrams(project);
    List<Shape> shapes = null;
    int _size = diagrams.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Diagram d = ((Diagram[])Conversions.unwrapArray(diagrams, Diagram.class))[(i).intValue()];
        final String dPath = d.eResource().getURI().path();
        final String projectName = cbc.eResource().getURI().segment(1);
        String _name = cbc.getName();
        final String cbcPath = ((("/resource/" + projectName) + "/src/") + _name);
        boolean _equals = cbcPath.equals(dPath);
        if (_equals) {
          shapes = d.getChildren();
        }
      }
    }
    return shapes;
  }
  
  public static AbstractStatement getContractPair(final List<Shape> shapes) {
    int _size = shapes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final Shape shape = shapes.get((j).intValue());
        final List<EObject> objects = shape.getLink().getBusinessObjects();
        int _size_1 = objects.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer k : _doubleDotLessThan_1) {
          {
            final EObject o = objects.get((k).intValue());
            if ((o instanceof CbCFormula)) {
              final CbCFormula formula = CbCFormulaImpl.class.cast(o);
              final AbstractStatement statement = formula.getStatement();
              return statement;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static JavaVariables getJavaVariables(final List<Shape> shapes) {
    int _size = shapes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final Shape shape = shapes.get((j).intValue());
        final List<EObject> objects = shape.getLink().getBusinessObjects();
        int _size_1 = objects.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer k : _doubleDotLessThan_1) {
          {
            final EObject o = objects.get((k).intValue());
            if ((o instanceof JavaVariables)) {
              final JavaVariables vars = ((JavaVariables) o);
              return vars;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static GlobalConditions getGlobalConditions(final List<Shape> shapes) {
    int _size = shapes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final Shape shape = shapes.get((j).intValue());
        final List<EObject> objects = shape.getLink().getBusinessObjects();
        int _size_1 = objects.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer k : _doubleDotLessThan_1) {
          {
            final EObject o = objects.get((k).intValue());
            if ((o instanceof GlobalConditions)) {
              final GlobalConditions conds = ((GlobalConditions) o);
              return conds;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static Renaming getRenaming(final List<Shape> shapes) {
    int _size = shapes.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer j : _doubleDotLessThan) {
      {
        final Shape shape = shapes.get((j).intValue());
        final List<EObject> objects = shape.getLink().getBusinessObjects();
        int _size_1 = objects.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer k : _doubleDotLessThan_1) {
          {
            final EObject o = objects.get((k).intValue());
            if ((o instanceof Renaming)) {
              final Renaming renaming = ((Renaming) o);
              return renaming;
            }
          }
        }
      }
    }
    return null;
  }
}
