package tu_bs.cs.isf.mapping.validation;

import de.tu_bs.ccc.contracting.Verification.Ports;
import de.tu_bs.ccc.contracting.core.localization.StringTable;
import de.tu_bs.ccc.contracting.core.util.CoreUtil;
import de.tu_bs.ccc.contracting.idl.CidlPersistenceManager;
import de.tu_bs.ccc.contracting.idl.cidl.ContractPair;
import de.tu_bs.ccc.contracting.idl.cidl.Interface;
import de.tu_bs.ccc.contracting.idl.cidl.Method;
import de.tu_bs.ccc.contracting.idl.cidl.Model;
import de.tu_bs.ccc.contracting.idl.cidl.impl.ModelImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import tu_bs.cs.isf.mapping.mapping.Component;
import tu_bs.cs.isf.mapping.mapping.ServiceMethod;
import tu_bs.cs.isf.mapping.mapping.impl.ComponentImpl;
import tu_bs.cs.isf.mapping.validation.FileFinder;

@SuppressWarnings("all")
public class CideMethods {
  public static List<Interface> interfaces(final IProject p) {
    final Collection<EObject> objects = CidlPersistenceManager.getIdlModels(p);
    List<Model> modelList = new ArrayList<Model>();
    int _size = objects.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Model m = ModelImpl.class.cast(((Object[])Conversions.unwrapArray(objects, Object.class))[(i).intValue()]);
        modelList.add(m);
      }
    }
    List<Interface> interfaceList = new ArrayList<Interface>();
    int _size_1 = modelList.size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final Integer i_1 : _doubleDotLessThan_1) {
      int _size_2 = modelList.get((i_1).intValue()).getInterfaces().size();
      ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
      for (final Integer j : _doubleDotLessThan_2) {
        {
          final Interface in = modelList.get((i_1).intValue()).getInterfaces().get((j).intValue());
          interfaceList.add(in);
        }
      }
    }
    return interfaceList;
  }
  
  public static List<ContractPair> getContractPair(final ServiceMethod sm, final String root, final IWorkspace w) {
    Object _xifexpression = null;
    boolean _contains = sm.getName().contains(".");
    if (_contains) {
      Object _xblockexpression = null;
      {
        final String[] smParts = sm.getName().split("\\.");
        final String portName = smParts[0];
        final String methodName = smParts[1];
        final EObject smComponent = sm.eContainer().eContainer();
        final Component c = ComponentImpl.class.cast(smComponent);
        final String componentPath = FileFinder.path(c, c.getName(), root);
        final IFile f = FileFinder.file(componentPath, w);
        Object _xifexpression_1 = null;
        boolean _exists = f.exists();
        if (_exists) {
          final IProject p = f.getProject();
          final Collection<de.tu_bs.ccc.contracting.Verification.Module> cm = CoreUtil.getRootModules(p);
          int _size = cm.size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for (final Integer i : _doubleDotLessThan) {
            boolean _endsWith = c.getName().endsWith(StringTable.DIAGRAM_FILE_EXTENSION);
            if (_endsWith) {
              final String[] parts = c.getName().split("\\.");
              int _size_1 = ((List<String>)Conversions.doWrapArray(parts)).size();
              int _minus = (_size_1 - 2);
              String name = parts[_minus];
              boolean _contains_1 = name.contains("/");
              if (_contains_1) {
                final String[] parts2 = name.split("/");
                int _size_2 = ((List<String>)Conversions.doWrapArray(parts2)).size();
                int _minus_1 = (_size_2 - 1);
                name = parts2[_minus_1];
              }
              boolean _equals = name.equals(((de.tu_bs.ccc.contracting.Verification.Module[])Conversions.unwrapArray(cm, de.tu_bs.ccc.contracting.Verification.Module.class))[(i).intValue()].getName());
              if (_equals) {
                final EList<Ports> ports = ((de.tu_bs.ccc.contracting.Verification.Module[])Conversions.unwrapArray(cm, de.tu_bs.ccc.contracting.Verification.Module.class))[(i).intValue()].getPorts();
                int _size_3 = ports.size();
                ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_3, true);
                for (final Integer j : _doubleDotLessThan_1) {
                  if ((portName.equals(ports.get((j).intValue()).getName()) && ports.get((j).intValue()).getType().getName().equals("SERVICE"))) {
                    final List<Interface> interfaces = CideMethods.interfaces(p);
                    int _size_4 = interfaces.size();
                    ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_4, true);
                    for (final Integer k : _doubleDotLessThan_2) {
                      boolean _equals_1 = interfaces.get((k).intValue()).getName().equals(ports.get((j).intValue()).getService());
                      if (_equals_1) {
                        final EList<Method> methods = interfaces.get((k).intValue()).getMethods();
                        int _size_5 = methods.size();
                        ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _size_5, true);
                        for (final Integer l : _doubleDotLessThan_3) {
                          boolean _equals_2 = methods.get((l).intValue()).getName().equals(methodName);
                          if (_equals_2) {
                            List<ContractPair> contractPairs = new ArrayList<ContractPair>();
                            int _size_6 = methods.get((l).intValue()).getSpec().getContracts().size();
                            ExclusiveRange _doubleDotLessThan_4 = new ExclusiveRange(0, _size_6, true);
                            for (final Integer m : _doubleDotLessThan_4) {
                              {
                                final ContractPair contractPair = methods.get((l).intValue()).getSpec().getContracts().get((m).intValue());
                                contractPairs.add(contractPair);
                              }
                            }
                            return contractPairs;
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
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return ((List<ContractPair>)_xifexpression);
  }
}
