/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.User#getRole <em>Role</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.User#getMode <em>Mode</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.User#getRegistrationTimestamp <em>Registration Timestamp</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getUser_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.User#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(Mode)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getUser_Mode()
	 * @model required="true"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.User#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Registration Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Timestamp</em>' attribute.
	 * @see #setRegistrationTimestamp(int)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getUser_RegistrationTimestamp()
	 * @model required="true"
	 * @generated
	 */
	int getRegistrationTimestamp();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.User#getRegistrationTimestamp <em>Registration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Timestamp</em>' attribute.
	 * @see #getRegistrationTimestamp()
	 * @generated
	 */
	void setRegistrationTimestamp(int value);

} // User
