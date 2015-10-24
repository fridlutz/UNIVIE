/**
 */
package aSE_Task2.impl;

import aSE_Task2.ASE_Task2Package;
import aSE_Task2.Account;
import aSE_Task2.Profile;
import aSE_Task2.RentalMedia;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getPasswort <em>Passwort</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getLand <em>Land</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getAbo <em>Abo</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getBeinhaltet <em>Beinhaltet</em>}</li>
 *   <li>{@link aSE_Task2.impl.AccountImpl#getLeiht <em>Leiht</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswort() <em>Passwort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswort()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswort() <em>Passwort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswort()
	 * @generated
	 * @ordered
	 */
	protected String passwort = PASSWORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected static final String LAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected String land = LAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbo() <em>Abo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbo()
	 * @generated
	 * @ordered
	 */
	protected static final int ABO_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getAbo() <em>Abo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbo()
	 * @generated
	 * @ordered
	 */
	protected int abo = ABO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeinhaltet() <em>Beinhaltet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeinhaltet()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> beinhaltet;

	/**
	 * The cached value of the '{@link #getLeiht() <em>Leiht</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeiht()
	 * @generated
	 * @ordered
	 */
	protected EList<RentalMedia> leiht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASE_Task2Package.Literals.ACCOUNT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.ACCOUNT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.ACCOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswort() {
		return passwort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswort(String newPasswort) {
		String oldPasswort = passwort;
		passwort = newPasswort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.ACCOUNT__PASSWORT, oldPasswort, passwort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLand() {
		return land;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLand(String newLand) {
		String oldLand = land;
		land = newLand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.ACCOUNT__LAND, oldLand, land));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAbo() {
		return abo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbo(int newAbo) {
		int oldAbo = abo;
		abo = newAbo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.ACCOUNT__ABO, oldAbo, abo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getBeinhaltet() {
		if (beinhaltet == null) {
			beinhaltet = new EObjectContainmentEList<Profile>(Profile.class, this, ASE_Task2Package.ACCOUNT__BEINHALTET);
		}
		return beinhaltet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RentalMedia> getLeiht() {
		if (leiht == null) {
			leiht = new EObjectResolvingEList<RentalMedia>(RentalMedia.class, this, ASE_Task2Package.ACCOUNT__LEIHT);
		}
		return leiht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASE_Task2Package.ACCOUNT__BEINHALTET:
				return ((InternalEList<?>)getBeinhaltet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASE_Task2Package.ACCOUNT__ID:
				return getID();
			case ASE_Task2Package.ACCOUNT__NAME:
				return getName();
			case ASE_Task2Package.ACCOUNT__PASSWORT:
				return getPasswort();
			case ASE_Task2Package.ACCOUNT__LAND:
				return getLand();
			case ASE_Task2Package.ACCOUNT__ABO:
				return getAbo();
			case ASE_Task2Package.ACCOUNT__BEINHALTET:
				return getBeinhaltet();
			case ASE_Task2Package.ACCOUNT__LEIHT:
				return getLeiht();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASE_Task2Package.ACCOUNT__ID:
				setID((Integer)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__NAME:
				setName((String)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__PASSWORT:
				setPasswort((String)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__LAND:
				setLand((String)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__ABO:
				setAbo((Integer)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__BEINHALTET:
				getBeinhaltet().clear();
				getBeinhaltet().addAll((Collection<? extends Profile>)newValue);
				return;
			case ASE_Task2Package.ACCOUNT__LEIHT:
				getLeiht().clear();
				getLeiht().addAll((Collection<? extends RentalMedia>)newValue);
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
			case ASE_Task2Package.ACCOUNT__ID:
				setID(ID_EDEFAULT);
				return;
			case ASE_Task2Package.ACCOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ASE_Task2Package.ACCOUNT__PASSWORT:
				setPasswort(PASSWORT_EDEFAULT);
				return;
			case ASE_Task2Package.ACCOUNT__LAND:
				setLand(LAND_EDEFAULT);
				return;
			case ASE_Task2Package.ACCOUNT__ABO:
				setAbo(ABO_EDEFAULT);
				return;
			case ASE_Task2Package.ACCOUNT__BEINHALTET:
				getBeinhaltet().clear();
				return;
			case ASE_Task2Package.ACCOUNT__LEIHT:
				getLeiht().clear();
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
			case ASE_Task2Package.ACCOUNT__ID:
				return id != ID_EDEFAULT;
			case ASE_Task2Package.ACCOUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ASE_Task2Package.ACCOUNT__PASSWORT:
				return PASSWORT_EDEFAULT == null ? passwort != null : !PASSWORT_EDEFAULT.equals(passwort);
			case ASE_Task2Package.ACCOUNT__LAND:
				return LAND_EDEFAULT == null ? land != null : !LAND_EDEFAULT.equals(land);
			case ASE_Task2Package.ACCOUNT__ABO:
				return abo != ABO_EDEFAULT;
			case ASE_Task2Package.ACCOUNT__BEINHALTET:
				return beinhaltet != null && !beinhaltet.isEmpty();
			case ASE_Task2Package.ACCOUNT__LEIHT:
				return leiht != null && !leiht.isEmpty();
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
		result.append(", Name: ");
		result.append(name);
		result.append(", Passwort: ");
		result.append(passwort);
		result.append(", Land: ");
		result.append(land);
		result.append(", Abo: ");
		result.append(abo);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
