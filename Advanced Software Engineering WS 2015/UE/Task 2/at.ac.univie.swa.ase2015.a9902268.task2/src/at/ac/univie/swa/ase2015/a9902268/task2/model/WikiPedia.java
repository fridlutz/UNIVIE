/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki Pedia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getContent <em>Content</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getWikiPedia()
 * @model
 * @generated
 */
public interface WikiPedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getWikiPedia_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.model.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getWikiPedia_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

} // WikiPedia
