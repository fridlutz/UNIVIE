/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getContent <em>Content</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getPrivilegs <em>Privilegs</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getGroups <em>Groups</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getUsers <em>Users</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getMode <em>Mode</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getRole <em>Role</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getHistory <em>History</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Wiki#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveSysopAndAdmin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveSysopAndAdmin='\n\t\t\tusers->exists(user | user.role.type = RoleType::ADMIN )\n\t\t\tand\n\t\t\tusers->exists(user | user.role.type = RoleType::SYSOP )\n\t\t'"
 * @generated
 */
public interface Wiki extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

	/**
	 * Returns the value of the '<em><b>Privilegs</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Privileg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privilegs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilegs</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Privilegs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Privileg> getPrivilegs();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Mode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getMode();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>History</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.History}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_History()
	 * @model
	 * @generated
	 */
	EList<History> getHistory();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getWiki_Versions()
	 * @model
	 * @generated
	 */
	EList<Version> getVersions();

} // Wiki
