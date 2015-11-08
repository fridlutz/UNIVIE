/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unregistered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser#getIPAddress <em>IP Address</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUnregisteredUser()
 * @model
 * @generated
 */
public interface UnregisteredUser extends User {
	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUnregisteredUser_IPAddress()
	 * @model required="true"
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

} // UnregisteredUser
