/**
 * generated by Xtext 2.15.0
 */
package tu_bs.cs.isf.mapping;

import tu_bs.cs.isf.mapping.MappingStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MappingStandaloneSetup extends MappingStandaloneSetupGenerated {
  public static void doSetup() {
    new MappingStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}