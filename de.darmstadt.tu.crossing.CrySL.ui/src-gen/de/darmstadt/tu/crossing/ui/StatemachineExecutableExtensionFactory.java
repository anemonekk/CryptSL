/*
 * generated by Xtext 2.23.0
 */
package de.darmstadt.tu.crossing.ui;

import com.google.inject.Injector;
import de.darmstadt.tu.crossing.CrySL.ui.internal.CrySLActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StatemachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CrySLActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CrySLActivator activator = CrySLActivator.getInstance();
		return activator != null ? activator.getInjector(CrySLActivator.DE_DARMSTADT_TU_CROSSING_STATEMACHINE) : null;
	}

}