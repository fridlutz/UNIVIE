/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserName <em>User Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegistrationDateJD <em>Registration Date JD</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegisteredSinceDays <em>Registered Since Days</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserType <em>User Type</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getAdminAction <em>Admin Action</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='timeIsCorrect'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot timeIsCorrect='wikiTime >= registrationDateJD'"
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
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser_UserName()
	 * @model required="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Registration Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Date JD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Date JD</em>' attribute.
	 * @see #setRegistrationDateJD(BigInteger)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser_RegistrationDateJD()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getRegistrationDateJD();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegistrationDateJD <em>Registration Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Date JD</em>' attribute.
	 * @see #getRegistrationDateJD()
	 * @generated
	 */
	void setRegistrationDateJD(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Registered Since Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Since Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Since Days</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser_RegisteredSinceDays()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='wikiTime - registrationDateJD'"
	 * @generated
	 */
	BigInteger getRegisteredSinceDays();

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The default value is <code>"RegisteredUser"</code>.
	 * The literals are from the enumeration {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser_UserType()
	 * @model default="RegisteredUser" required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (self.countRevisions < 20 or registeredSinceDays < 7) then userType::RegisteredUser\n\t\t\t\t\t\t\t\telse userType::AutoConfirmedUser\n\t\t\t\t\t\t\t\tendif'"
	 * @generated
	 */
	userType getUserType();

	/**
	 * Returns the value of the '<em><b>Admin Action</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Action</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getRegisteredUser_AdminAction()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if (self.oclIsKindOf(Administrator) or self.oclIsKindOf(SysOp)) then adminActions::CreateDeleteContent\n\t\t\t\t\t\t\t\t\telse (if self.userType = userType::AutoConfirmedUser then adminActions::CreateContent\n\t\t\t\t\t\t\t\t\t\telse (null)\n\t\t\t\t\t\t\t\t\t\tendif) endif'"
	 * @generated
	 */
	adminActions getAdminAction();

} // RegisteredUser
