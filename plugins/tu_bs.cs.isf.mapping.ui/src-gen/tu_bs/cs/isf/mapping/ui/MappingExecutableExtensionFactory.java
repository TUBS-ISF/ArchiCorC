/*
 * generated by Xtext 2.15.0
 */
package tu_bs.cs.isf.mapping.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import tu_bs.cs.isf.mapping.ui.internal.MappingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MappingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MappingActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MappingActivator activator = MappingActivator.getInstance();
		return activator != null ? activator.getInjector(MappingActivator.TU_BS_CS_ISF_MAPPING_MAPPING) : null;
	}

}