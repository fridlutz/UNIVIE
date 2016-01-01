/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wikiSampleSolution.wikiSampleSolution.Mode;
import wikiSampleSolution.wikiSampleSolution.Role;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.UserImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.UserImpl#getRegistrationTimestamp <em>Registration Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode;

	/**
	 * The default value of the '{@link #getRegistrationTimestamp() <em>Registration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRATION_TIMESTAMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistrationTimestamp() <em>Registration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationTimestamp()
	 * @generated
	 * @ordered
	 */
	protected int registrationTimestamp = REGISTRATION_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikiSampleSolutionPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiSampleSolutionPackage.USER__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.USER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Mode)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiSampleSolutionPackage.USER__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.USER__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistrationTimestamp() {
		return registrationTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationTimestamp(int newRegistrationTimestamp) {
		int oldRegistrationTimestamp = registrationTimestamp;
		registrationTimestamp = newRegistrationTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.USER__REGISTRATION_TIMESTAMP, oldRegistrationTimestamp, registrationTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikiSampleSolutionPackage.USER__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case WikiSampleSolutionPackage.USER__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case WikiSampleSolutionPackage.USER__REGISTRATION_TIMESTAMP:
				return getRegistrationTimestamp();
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
			case WikiSampleSolutionPackage.USER__ROLE:
				setRole((Role)newValue);
				return;
			case WikiSampleSolutionPackage.USER__MODE:
				setMode((Mode)newValue);
				return;
			case WikiSampleSolutionPackage.USER__REGISTRATION_TIMESTAMP:
				setRegistrationTimestamp((Integer)newValue);
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
			case WikiSampleSolutionPackage.USER__ROLE:
				setRole((Role)null);
				return;
			case WikiSampleSolutionPackage.USER__MODE:
				setMode((Mode)null);
				return;
			case WikiSampleSolutionPackage.USER__REGISTRATION_TIMESTAMP:
				setRegistrationTimestamp(REGISTRATION_TIMESTAMP_EDEFAULT);
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
			case WikiSampleSolutionPackage.USER__ROLE:
				return role != null;
			case WikiSampleSolutionPackage.USER__MODE:
				return mode != null;
			case WikiSampleSolutionPackage.USER__REGISTRATION_TIMESTAMP:
				return registrationTimestamp != REGISTRATION_TIMESTAMP_EDEFAULT;
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
		result.append(" (registrationTimestamp: ");
		result.append(registrationTimestamp);
		result.append(')');
		return result.toString();
	}

} //UserImpl
