/*
 * generated by Xtext 2.10.0
 */
package de.darmstadt.tu.crossing.validation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.darmstadt.tu.crossing.crySL.ForbMethod;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CrySLValidator extends AbstractCrySLValidator {
	
	public static final EStructuralFeature INVALID_NAME = null;

	@Check
	public void checkGreetingStartsWithCapital(ForbMethod greeting) {

	}
	
	
}
