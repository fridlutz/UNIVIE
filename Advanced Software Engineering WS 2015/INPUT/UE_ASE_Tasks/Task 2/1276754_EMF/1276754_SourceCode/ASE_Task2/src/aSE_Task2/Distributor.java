/**
 */
package aSE_Task2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Distributor#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.Distributor#getName <em>Name</em>}</li>
 *   <li>{@link aSE_Task2.Distributor#getHat <em>Hat</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getDistributor()
 * @model
 * @generated
 */
public interface Distributor extends EObject {
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
	 * @see aSE_Task2.ASE_Task2Package#getDistributor_ID()
	 * @model id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link aSE_Task2.Distributor#getID <em>ID</em>}' attribute.
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
	 * @see aSE_Task2.ASE_Task2Package#getDistributor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aSE_Task2.Distributor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hat</em>' containment reference.
	 * @see #setHat(Media)
	 * @see aSE_Task2.ASE_Task2Package#getDistributor_Hat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Media getHat();

	/**
	 * Sets the value of the '{@link aSE_Task2.Distributor#getHat <em>Hat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hat</em>' containment reference.
	 * @see #getHat()
	 * @generated
	 */
	void setHat(Media value);

} // Distributor
