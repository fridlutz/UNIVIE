/**
 */
package aSE_Task2.impl;

import aSE_Task2.ASE_Task2Package;
import aSE_Task2.Media;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aSE_Task2.impl.MediaImpl#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.impl.MediaImpl#getTitel <em>Titel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MediaImpl extends MinimalEObjectImpl.Container implements Media {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected static final String TITEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected String titel = TITEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASE_Task2Package.Literals.MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.MEDIA__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitel() {
		return titel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitel(String newTitel) {
		String oldTitel = titel;
		titel = newTitel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.MEDIA__TITEL, oldTitel, titel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASE_Task2Package.MEDIA__ID:
				return getID();
			case ASE_Task2Package.MEDIA__TITEL:
				return getTitel();
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
			case ASE_Task2Package.MEDIA__ID:
				setID((Integer)newValue);
				return;
			case ASE_Task2Package.MEDIA__TITEL:
				setTitel((String)newValue);
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
			case ASE_Task2Package.MEDIA__ID:
				setID(ID_EDEFAULT);
				return;
			case ASE_Task2Package.MEDIA__TITEL:
				setTitel(TITEL_EDEFAULT);
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
			case ASE_Task2Package.MEDIA__ID:
				return id != ID_EDEFAULT;
			case ASE_Task2Package.MEDIA__TITEL:
				return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Titel: ");
		result.append(titel);
		result.append(')');
		return result.toString();
	}

} //MediaImpl
