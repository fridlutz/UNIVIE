/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Confirmed User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#getAutoConfirmedDate <em>Auto Confirmed Date</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getAutoConfirmedUser()
 * @model
 * @generated
 */
public interface AutoConfirmedUser extends RegisteredUser {
	/**
	 * Returns the value of the '<em><b>Auto Confirmed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Confirmed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Confirmed Date</em>' attribute.
	 * @see #setAutoConfirmedDate(Date)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getAutoConfirmedUser_AutoConfirmedDate()
	 * @model dataType="at.ac.univie.swa.ase2015.a9902268.task2.model.Date"
	 * @generated
	 */
	Date getAutoConfirmedDate();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#getAutoConfirmedDate <em>Auto Confirmed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Confirmed Date</em>' attribute.
	 * @see #getAutoConfirmedDate()
	 * @generated
	 */
	void setAutoConfirmedDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createArticle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveArticle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void uploadMedia();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveMedia();

} // AutoConfirmedUser
