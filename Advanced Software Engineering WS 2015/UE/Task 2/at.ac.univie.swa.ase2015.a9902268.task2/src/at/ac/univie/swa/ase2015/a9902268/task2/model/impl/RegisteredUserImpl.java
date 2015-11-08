/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.model.adminActions;
import at.ac.univie.swa.ase2015.a9902268.task2.model.userType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

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
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getRegistrationDateJD <em>Registration Date JD</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getRegisteredSinceDays <em>Registered Since Days</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl#getAdminAction <em>Admin Action</em>}</li>
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
	 * The default value of the '{@link #getRegistrationDateJD() <em>Registration Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDateJD()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REGISTRATION_DATE_JD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrationDateJD() <em>Registration Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDateJD()
	 * @generated
	 * @ordered
	 */
	protected BigInteger registrationDateJD = REGISTRATION_DATE_JD_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getRegisteredSinceDays() <em>Registered Since Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredSinceDays()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REGISTERED_SINCE_DAYS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.REGISTERED_USER__REGISTERED_SINCE_DAYS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USER_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.REGISTERED_USER__USER_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAdminAction() <em>Admin Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ADMIN_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.REGISTERED_USER__ADMIN_ACTION).getSettingDelegate();

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
	public BigInteger getRegistrationDateJD() {
		return registrationDateJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationDateJD(BigInteger newRegistrationDateJD) {
		BigInteger oldRegistrationDateJD = registrationDateJD;
		registrationDateJD = newRegistrationDateJD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTERED_USER__REGISTRATION_DATE_JD, oldRegistrationDateJD, registrationDateJD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRegisteredSinceDays() {
		return (BigInteger)REGISTERED_SINCE_DAYS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public userType getUserType() {
		return (userType)USER_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public adminActions getAdminAction() {
		return (adminActions)ADMIN_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE_JD:
				return getRegistrationDateJD();
			case ModelPackage.REGISTERED_USER__REGISTERED_SINCE_DAYS:
				return getRegisteredSinceDays();
			case ModelPackage.REGISTERED_USER__USER_TYPE:
				return getUserType();
			case ModelPackage.REGISTERED_USER__ADMIN_ACTION:
				return getAdminAction();
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
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE_JD:
				setRegistrationDateJD((BigInteger)newValue);
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
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE_JD:
				setRegistrationDateJD(REGISTRATION_DATE_JD_EDEFAULT);
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
			case ModelPackage.REGISTERED_USER__REGISTRATION_DATE_JD:
				return REGISTRATION_DATE_JD_EDEFAULT == null ? registrationDateJD != null : !REGISTRATION_DATE_JD_EDEFAULT.equals(registrationDateJD);
			case ModelPackage.REGISTERED_USER__REGISTERED_SINCE_DAYS:
				return REGISTERED_SINCE_DAYS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.REGISTERED_USER__USER_TYPE:
				return USER_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.REGISTERED_USER__ADMIN_ACTION:
				return ADMIN_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", registrationDateJD: ");
		result.append(registrationDateJD);
		result.append(')');
		return result.toString();
	}

} //RegisteredUserImpl
