/**
 *
 * $Id$
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.validation;


/**
 * A sample validator interface for {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UnregisteredUserValidator {
	boolean validate();

	boolean validateIPAddress(String value);
}
