/**
 */
package aSE_Task2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Account#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.Account#getName <em>Name</em>}</li>
 *   <li>{@link aSE_Task2.Account#getPasswort <em>Passwort</em>}</li>
 *   <li>{@link aSE_Task2.Account#getLand <em>Land</em>}</li>
 *   <li>{@link aSE_Task2.Account#getAbo <em>Abo</em>}</li>
 *   <li>{@link aSE_Task2.Account#getBeinhaltet <em>Beinhaltet</em>}</li>
 *   <li>{@link aSE_Task2.Account#getLeiht <em>Leiht</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getAccount()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='self.beinhaltet->size() <= 5'"
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see aSE_Task2.ASE_Task2Package#getAccount_ID()
	 * @model id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link aSE_Task2.Account#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

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
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aSE_Task2.Account#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passwort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passwort</em>' attribute.
	 * @see #setPasswort(String)
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Passwort()
	 * @model
	 * @generated
	 */
	String getPasswort();

	/**
	 * Sets the value of the '{@link aSE_Task2.Account#getPasswort <em>Passwort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passwort</em>' attribute.
	 * @see #getPasswort()
	 * @generated
	 */
	void setPasswort(String value);

	/**
	 * Returns the value of the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land</em>' attribute.
	 * @see #setLand(String)
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Land()
	 * @model
	 * @generated
	 */
	String getLand();

	/**
	 * Sets the value of the '{@link aSE_Task2.Account#getLand <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land</em>' attribute.
	 * @see #getLand()
	 * @generated
	 */
	void setLand(String value);

	/**
	 * Returns the value of the '<em><b>Abo</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abo</em>' attribute.
	 * @see #setAbo(int)
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Abo()
	 * @model default="30"
	 * @generated
	 */
	int getAbo();

	/**
	 * Sets the value of the '{@link aSE_Task2.Account#getAbo <em>Abo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abo</em>' attribute.
	 * @see #getAbo()
	 * @generated
	 */
	void setAbo(int value);

	/**
	 * Returns the value of the '<em><b>Beinhaltet</b></em>' containment reference list.
	 * The list contents are of type {@link aSE_Task2.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beinhaltet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beinhaltet</em>' containment reference list.
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Beinhaltet()
	 * @model containment="true" required="true" upper="5"
	 * @generated
	 */
	EList<Profile> getBeinhaltet();

	/**
	 * Returns the value of the '<em><b>Leiht</b></em>' reference list.
	 * The list contents are of type {@link aSE_Task2.RentalMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leiht</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leiht</em>' reference list.
	 * @see aSE_Task2.ASE_Task2Package#getAccount_Leiht()
	 * @model
	 * @generated
	 */
	EList<RentalMedia> getLeiht();

} // Account
