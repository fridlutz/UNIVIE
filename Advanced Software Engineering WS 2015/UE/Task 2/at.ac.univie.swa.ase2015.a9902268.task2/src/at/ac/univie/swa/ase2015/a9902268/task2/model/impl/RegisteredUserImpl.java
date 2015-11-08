/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getRegistrationDate <em>Registration Date</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getNumberOfEdits <em>Number Of Edits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredUserImpl extends UserImpl implements RegisteredUser {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationDate() <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REGISTRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrationDate() <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDate()
	 * @generated
	 * @ordered
	 */
	protected Date registrationDate = REGISTRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfEdits() <em>Number Of Edits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEdits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_EDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfEdits() <em>Number Of Edits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEdits()
	 * @generated
	 * @ordered
	 */
	protected int numberOfEdits = NUMBER_OF_EDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REGISTERED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTERED_USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationDate(Date newRegistrationDate) {
		Date oldRegistrationDate = registrationDate;
		registrationDate = newRegistrationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTERED_USER__REGISTRATION_DATE, oldRegistrationDate, registrationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfEdits() {
		return numberOfEdits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEdits(int newNumberOfEdits) {
		int oldNumberOfEdits = numberOfEdits;
		numberOfEdits = newNumberOfEdits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTERED_USER__NUMBER_OF_EDITS, oldNumberOfEdits, numberOfEdits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REGISTERED_USER__USER_NAME:
				return getUserName();
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE:
				return getRegistrationDate();
			case ModelPackage.REGISTERED_USER__NUMBER_OF_EDITS:
				return getNumberOfEdits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.REGISTERED_USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE:
				setRegistrationDate((Date)newValue);
				return;
			case ModelPackage.REGISTERED_USER__NUMBER_OF_EDITS:
				setNumberOfEdits((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.REGISTERED_USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE:
				setRegistrationDate(REGISTRATION_DATE_EDEFAULT);
				return;
			case ModelPackage.REGISTERED_USER__NUMBER_OF_EDITS:
				setNumberOfEdits(NUMBER_OF_EDITS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.REGISTERED_USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE:
				return REGISTRATION_DATE_EDEFAULT == null ? registrationDate != null : !REGISTRATION_DATE_EDEFAULT.equals(registrationDate);
			case ModelPackage.REGISTERED_USER__NUMBER_OF_EDITS:
				return numberOfEdits != NUMBER_OF_EDITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (userName: ");
		result.append(userName);
		result.append(", registrationDate: ");
		result.append(registrationDate);
		result.append(", numberOfEdits: ");
		result.append(numberOfEdits);
		result.append(')');
		return result.toString();
	}

} //RegisteredUserImpl
