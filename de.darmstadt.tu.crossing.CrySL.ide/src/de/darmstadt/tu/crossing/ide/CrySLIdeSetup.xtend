/*
 * generated by Xtext 2.11.0
 */
package de.darmstadt.tu.crossing.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import de.darmstadt.tu.crossing.CrySLRuntimeModule
import de.darmstadt.tu.crossing.CrySLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CrySLIdeSetup extends CrySLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CrySLRuntimeModule, new CrySLIdeModule))
	}
	
}
