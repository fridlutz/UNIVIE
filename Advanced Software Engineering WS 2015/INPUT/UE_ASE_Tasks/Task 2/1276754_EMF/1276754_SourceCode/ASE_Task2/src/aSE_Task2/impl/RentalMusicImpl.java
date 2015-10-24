/**
 */
package aSE_Task2.impl;

import aSE_Task2.ASE_Task2Package;
import aSE_Task2.RentalMusic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aSE_Task2.impl.RentalMusicImpl#getKuenstler <em>Kuenstler</em>}</li>
 *   <li>{@link aSE_Task2.impl.RentalMusicImpl#getEpsioden <em>Epsioden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalMusicImpl extends RentalMediaImpl implements RentalMusic {
	/**
	 * The default value of the '{@link #getKuenstler() <em>Kuenstler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKuenstler()
	 * @generated
	 * @ordered
	 */
	protected static final String KUENSTLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKuenstler() <em>Kuenstler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKuenstler()
	 * @generated
	 * @ordered
	 */
	protected String kuenstler = KUENSTLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpsioden() <em>Epsioden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsioden()
	 * @generated
	 * @ordered
	 */
	protected static final int EPSIODEN_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getEpsioden() <em>Epsioden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsioden()
	 * @generated
	 * @ordered
	 */
	protected int epsioden = EPSIODEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalMusicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASE_Task2Package.Literals.RENTAL_MUSIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKuenstler() {
		return kuenstler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKuenstler(String newKuenstler) {
		String oldKuenstler = kuenstler;
		kuenstler = newKuenstler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.RENTAL_MUSIC__KUENSTLER, oldKuenstler, kuenstler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEpsioden() {
		return epsioden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpsioden(int newEpsioden) {
		int oldEpsioden = epsioden;
		epsioden = newEpsioden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.RENTAL_MUSIC__EPSIODEN, oldEpsioden, epsioden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASE_Task2Package.RENTAL_MUSIC__KUENSTLER:
				return getKuenstler();
			case ASE_Task2Package.RENTAL_MUSIC__EPSIODEN:
				return getEpsioden();
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
			case ASE_Task2Package.RENTAL_MUSIC__KUENSTLER:
				setKuenstler((String)newValue);
				return;
			case ASE_Task2Package.RENTAL_MUSIC__EPSIODEN:
				setEpsioden((Integer)newValue);
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
			case ASE_Task2Package.RENTAL_MUSIC__KUENSTLER:
				setKuenstler(KUENSTLER_EDEFAULT);
				return;
			case ASE_Task2Package.RENTAL_MUSIC__EPSIODEN:
				setEpsioden(EPSIODEN_EDEFAULT);
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
			case ASE_Task2Package.RENTAL_MUSIC__KUENSTLER:
				return KUENSTLER_EDEFAULT == null ? kuenstler != null : !KUENSTLER_EDEFAULT.equals(kuenstler);
			case ASE_Task2Package.RENTAL_MUSIC__EPSIODEN:
				return epsioden != EPSIODEN_EDEFAULT;
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
		result.append(" (Kuenstler: ");
		result.append(kuenstler);
		result.append(", Epsioden: ");
		result.append(epsioden);
		result.append(')');
		return result.toString();
	}

} //RentalMusicImpl
