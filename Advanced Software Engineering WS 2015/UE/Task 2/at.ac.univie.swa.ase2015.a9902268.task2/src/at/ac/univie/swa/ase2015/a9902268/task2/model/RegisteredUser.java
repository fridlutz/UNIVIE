/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getUserName <em>User Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getRegistrationDate <em>Registration Date</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getNumberOfEdits <em>Number Of Edits</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getRegisteredUser()
 * @model
 * @generated
 */
public interface RegisteredUser extends User {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getRegisteredUser_UserName()
	 * @model required="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Date</em>' attribute.
	 * @see #setRegistrationDate(Date)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getRegisteredUser_RegistrationDate()
	 * @model dataType="at.ac.univie.swa.ase2015.a9902268.task2.model.Date"
	 * @generated
	 */
	Date getRegistrationDate();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getRegistrationDate <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Date</em>' attribute.
	 * @see #getRegistrationDate()
	 * @generated
	 */
	void setRegistrationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Number Of Edits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Edits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Edits</em>' attribute.
	 * @see #setNumberOfEdits(int)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getRegisteredUser_NumberOfEdits()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumberOfEdits();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getNumberOfEdits <em>Number Of Edits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Edits</em>' attribute.
	 * @see #getNumberOfEdits()
	 * @generated
	 */
	void setNumberOfEdits(int value);

} // RegisteredUser
