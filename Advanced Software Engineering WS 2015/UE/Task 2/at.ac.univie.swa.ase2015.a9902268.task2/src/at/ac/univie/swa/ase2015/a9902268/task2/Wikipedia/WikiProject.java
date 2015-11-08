/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikiProject()
 * @model
 * @generated
 */
public interface WikiProject extends InternalContent {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikiProject_Member()
	 * @model
	 * @generated
	 */
	EList<User> getMember();

} // WikiProject
