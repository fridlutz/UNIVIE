/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getProfile <em>Profile</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRegisteredUser()
 * @model
 * @generated
 */
public interface RegisteredUser extends User {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Profile)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRegisteredUser_Profile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Subscribable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRegisteredUser_Subscriptions()
	 * @model
	 * @generated
	 */
	EList<Subscribable> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRegisteredUser_Username()
	 * @model id="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // RegisteredUser
