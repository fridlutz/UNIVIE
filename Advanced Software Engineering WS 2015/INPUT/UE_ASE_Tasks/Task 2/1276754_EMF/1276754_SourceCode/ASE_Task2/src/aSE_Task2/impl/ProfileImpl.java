/**
 */
package aSE_Task2.impl;

import aSE_Task2.ASE_Task2Package;
import aSE_Task2.Media;
import aSE_Task2.Profile;
import aSE_Task2.Review;
import aSE_Task2.StreamingMedia;

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
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getPasswort <em>Passwort</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getWrites <em>Writes</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getFriend <em>Friend</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getStreamt <em>Streamt</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getMediaQeue <em>Media Qeue</em>}</li>
 *   <li>{@link aSE_Task2.impl.ProfileImpl#getRecommandation <em>Recommandation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile {
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
	 * The cached value of the '{@link #getWrites() <em>Writes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrites()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> writes;

	/**
	 * The cached value of the '{@link #getFriend() <em>Friend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriend()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> friend;

	/**
	 * The cached value of the '{@link #getStreamt() <em>Streamt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamt()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamingMedia> streamt;

	/**
	 * The cached value of the '{@link #getMediaQeue() <em>Media Qeue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaQeue()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamingMedia> mediaQeue;

	/**
	 * The cached value of the '{@link #getRecommandation() <em>Recommandation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommandation()
	 * @generated
	 * @ordered
	 */
	protected EList<Media> recommandation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASE_Task2Package.Literals.PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.PROFILE__PASSWORT, oldPasswort, passwort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.PROFILE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ASE_Task2Package.PROFILE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getWrites() {
		if (writes == null) {
			writes = new EObjectContainmentEList<Review>(Review.class, this, ASE_Task2Package.PROFILE__WRITES);
		}
		return writes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getFriend() {
		if (friend == null) {
			friend = new EObjectResolvingEList<Profile>(Profile.class, this, ASE_Task2Package.PROFILE__FRIEND);
		}
		return friend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamingMedia> getStreamt() {
		if (streamt == null) {
			streamt = new EObjectResolvingEList<StreamingMedia>(StreamingMedia.class, this, ASE_Task2Package.PROFILE__STREAMT);
		}
		return streamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamingMedia> getMediaQeue() {
		if (mediaQeue == null) {
			mediaQeue = new EObjectResolvingEList<StreamingMedia>(StreamingMedia.class, this, ASE_Task2Package.PROFILE__MEDIA_QEUE);
		}
		return mediaQeue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Media> getRecommandation() {
		if (recommandation == null) {
			recommandation = new EObjectResolvingEList<Media>(Media.class, this, ASE_Task2Package.PROFILE__RECOMMANDATION);
		}
		return recommandation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASE_Task2Package.PROFILE__WRITES:
				return ((InternalEList<?>)getWrites()).basicRemove(otherEnd, msgs);
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
			case ASE_Task2Package.PROFILE__PASSWORT:
				return getPasswort();
			case ASE_Task2Package.PROFILE__NAME:
				return getName();
			case ASE_Task2Package.PROFILE__ID:
				return getID();
			case ASE_Task2Package.PROFILE__WRITES:
				return getWrites();
			case ASE_Task2Package.PROFILE__FRIEND:
				return getFriend();
			case ASE_Task2Package.PROFILE__STREAMT:
				return getStreamt();
			case ASE_Task2Package.PROFILE__MEDIA_QEUE:
				return getMediaQeue();
			case ASE_Task2Package.PROFILE__RECOMMANDATION:
				return getRecommandation();
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
			case ASE_Task2Package.PROFILE__PASSWORT:
				setPasswort((String)newValue);
				return;
			case ASE_Task2Package.PROFILE__NAME:
				setName((String)newValue);
				return;
			case ASE_Task2Package.PROFILE__ID:
				setID((Integer)newValue);
				return;
			case ASE_Task2Package.PROFILE__WRITES:
				getWrites().clear();
				getWrites().addAll((Collection<? extends Review>)newValue);
				return;
			case ASE_Task2Package.PROFILE__FRIEND:
				getFriend().clear();
				getFriend().addAll((Collection<? extends Profile>)newValue);
				return;
			case ASE_Task2Package.PROFILE__STREAMT:
				getStreamt().clear();
				getStreamt().addAll((Collection<? extends StreamingMedia>)newValue);
				return;
			case ASE_Task2Package.PROFILE__MEDIA_QEUE:
				getMediaQeue().clear();
				getMediaQeue().addAll((Collection<? extends StreamingMedia>)newValue);
				return;
			case ASE_Task2Package.PROFILE__RECOMMANDATION:
				getRecommandation().clear();
				getRecommandation().addAll((Collection<? extends Media>)newValue);
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
			case ASE_Task2Package.PROFILE__PASSWORT:
				setPasswort(PASSWORT_EDEFAULT);
				return;
			case ASE_Task2Package.PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ASE_Task2Package.PROFILE__ID:
				setID(ID_EDEFAULT);
				return;
			case ASE_Task2Package.PROFILE__WRITES:
				getWrites().clear();
				return;
			case ASE_Task2Package.PROFILE__FRIEND:
				getFriend().clear();
				return;
			case ASE_Task2Package.PROFILE__STREAMT:
				getStreamt().clear();
				return;
			case ASE_Task2Package.PROFILE__MEDIA_QEUE:
				getMediaQeue().clear();
				return;
			case ASE_Task2Package.PROFILE__RECOMMANDATION:
				getRecommandation().clear();
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
			case ASE_Task2Package.PROFILE__PASSWORT:
				return PASSWORT_EDEFAULT == null ? passwort != null : !PASSWORT_EDEFAULT.equals(passwort);
			case ASE_Task2Package.PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ASE_Task2Package.PROFILE__ID:
				return id != ID_EDEFAULT;
			case ASE_Task2Package.PROFILE__WRITES:
				return writes != null && !writes.isEmpty();
			case ASE_Task2Package.PROFILE__FRIEND:
				return friend != null && !friend.isEmpty();
			case ASE_Task2Package.PROFILE__STREAMT:
				return streamt != null && !streamt.isEmpty();
			case ASE_Task2Package.PROFILE__MEDIA_QEUE:
				return mediaQeue != null && !mediaQeue.isEmpty();
			case ASE_Task2Package.PROFILE__RECOMMANDATION:
				return recommandation != null && !recommandation.isEmpty();
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
		result.append(" (Passwort: ");
		result.append(passwort);
		result.append(", Name: ");
		result.append(name);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
