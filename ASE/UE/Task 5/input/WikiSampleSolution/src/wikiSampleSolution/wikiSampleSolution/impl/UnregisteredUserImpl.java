/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wikiSampleSolution.wikiSampleSolution.UnregisteredUser;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unregistered User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.UnregisteredUserImpl#getIPAddress <em>IP Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnregisteredUserImpl extends UserImpl implements UnregisteredUser {
	/**
	 * The default value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikiSampleSolutionPackage.Literals.UNREGISTERED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPAddress(String newIPAddress) {
		String oldIPAddress = ipAddress;
		ipAddress = newIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.UNREGISTERED_USER__IP_ADDRESS, oldIPAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikiSampleSolutionPackage.UNREGISTERED_USER__IP_ADDRESS:
				return getIPAddress();
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
			case WikiSampleSolutionPackage.UNREGISTERED_USER__IP_ADDRESS:
				setIPAddress((String)newValue);
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
			case WikiSampleSolutionPackage.UNREGISTERED_USER__IP_ADDRESS:
				setIPAddress(IP_ADDRESS_EDEFAULT);
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
			case WikiSampleSolutionPackage.UNREGISTERED_USER__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
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
		result.append(" (IPAddress: ");
		result.append(ipAddress);
		result.append(')');
		return result.toString();
	}

} //UnregisteredUserImpl
