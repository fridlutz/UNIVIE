/**
 */
package aSE_Task2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Library#getNewMedia <em>New Media</em>}</li>
 *   <li>{@link aSE_Task2.Library#getNewAccount <em>New Account</em>}</li>
 *   <li>{@link aSE_Task2.Library#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>New Media</b></em>' containment reference list.
	 * The list contents are of type {@link aSE_Task2.Media}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Media</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Media</em>' containment reference list.
	 * @see aSE_Task2.ASE_Task2Package#getLibrary_NewMedia()
	 * @model containment="true"
	 * @generated
	 */
	EList<Media> getNewMedia();

	/**
	 * Returns the value of the '<em><b>New Account</b></em>' containment reference list.
	 * The list contents are of type {@link aSE_Task2.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Account</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Account</em>' containment reference list.
	 * @see aSE_Task2.ASE_Task2Package#getLibrary_NewAccount()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getNewAccount();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aSE_Task2.ASE_Task2Package#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aSE_Task2.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Library
