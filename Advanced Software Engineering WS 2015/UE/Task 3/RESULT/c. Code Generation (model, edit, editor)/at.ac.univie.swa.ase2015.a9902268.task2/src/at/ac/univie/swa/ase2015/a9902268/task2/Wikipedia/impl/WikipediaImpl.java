/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wikipedia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl#getCurrentDateJD <em>Current Date JD</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl#getContent <em>Content</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl#getUser <em>User</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl#getAverageEditedPagesPerUser <em>Average Edited Pages Per User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WikipediaImpl extends MinimalEObjectImpl.Container implements Wikipedia {
	/**
	 * The default value of the '{@link #getCurrentDateJD() <em>Current Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDateJD()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CURRENT_DATE_JD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDateJD() <em>Current Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDateJD()
	 * @generated
	 * @ordered
	 */
	protected BigInteger currentDateJD = CURRENT_DATE_JD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> content;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached setting delegate for the '{@link #getAverageEditedPagesPerUser() <em>Average Edited Pages Per User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageEditedPagesPerUser()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AVERAGE_EDITED_PAGES_PER_USER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikipediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.WIKIPEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCurrentDateJD() {
		return currentDateJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDateJD(BigInteger newCurrentDateJD) {
		BigInteger oldCurrentDateJD = currentDateJD;
		currentDateJD = newCurrentDateJD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WIKIPEDIA__CURRENT_DATE_JD, oldCurrentDateJD, currentDateJD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, ModelPackage.WIKIPEDIA__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, ModelPackage.WIKIPEDIA__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getAverageEditedPagesPerUser() {
		return (BigDecimal)AVERAGE_EDITED_PAGES_PER_USER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.WIKIPEDIA__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case ModelPackage.WIKIPEDIA__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.WIKIPEDIA__CURRENT_DATE_JD:
				return getCurrentDateJD();
			case ModelPackage.WIKIPEDIA__CONTENT:
				return getContent();
			case ModelPackage.WIKIPEDIA__USER:
				return getUser();
			case ModelPackage.WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER:
				return getAverageEditedPagesPerUser();
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
			case ModelPackage.WIKIPEDIA__CURRENT_DATE_JD:
				setCurrentDateJD((BigInteger)newValue);
				return;
			case ModelPackage.WIKIPEDIA__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
				return;
			case ModelPackage.WIKIPEDIA__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
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
			case ModelPackage.WIKIPEDIA__CURRENT_DATE_JD:
				setCurrentDateJD(CURRENT_DATE_JD_EDEFAULT);
				return;
			case ModelPackage.WIKIPEDIA__CONTENT:
				getContent().clear();
				return;
			case ModelPackage.WIKIPEDIA__USER:
				getUser().clear();
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
			case ModelPackage.WIKIPEDIA__CURRENT_DATE_JD:
				return CURRENT_DATE_JD_EDEFAULT == null ? currentDateJD != null : !CURRENT_DATE_JD_EDEFAULT.equals(currentDateJD);
			case ModelPackage.WIKIPEDIA__CONTENT:
				return content != null && !content.isEmpty();
			case ModelPackage.WIKIPEDIA__USER:
				return user != null && !user.isEmpty();
			case ModelPackage.WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER:
				return AVERAGE_EDITED_PAGES_PER_USER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (currentDateJD: ");
		result.append(currentDateJD);
		result.append(')');
		return result.toString();
	}

} //WikipediaImpl
