/**
 */
package aSE_Task2.impl;

import aSE_Task2.ASE_Task2Package;
import aSE_Task2.RentalMedia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aSE_Task2.impl.RentalMediaImpl#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RentalMediaImpl extends MediaImpl implements RentalMedia {
	/**
	 * The default value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected int anzahl = ANZAHL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASE_Task2Package.Literals.RENTAL_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnzahl(int newAnzahl) {
		int oldAnzahl = anzahl;
		anzahl = newAnzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.RENTAL_MEDIA__ANZAHL, oldAnzahl, anzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASE_Task2Package.RENTAL_MEDIA__ANZAHL:
				return getAnzahl();
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
			case ASE_Task2Package.RENTAL_MEDIA__ANZAHL:
				setAnzahl((Integer)newValue);
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
			case ASE_Task2Package.RENTAL_MEDIA__ANZAHL:
				setAnzahl(ANZAHL_EDEFAULT);
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
			case ASE_Task2Package.RENTAL_MEDIA__ANZAHL:
				return anzahl != ANZAHL_EDEFAULT;
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
		result.append(" (Anzahl: ");
		result.append(anzahl);
		result.append(')');
		return result.toString();
	}

} //RentalMediaImpl
