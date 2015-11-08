/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser;
import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Confirmed User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AutoConfirmedUserImpl#getAutoConfirmedDate <em>Auto Confirmed Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoConfirmedUserImpl extends RegisteredUserImpl implements AutoConfirmedUser {
	/**
	 * The default value of the '{@link #getAutoConfirmedDate() <em>Auto Confirmed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoConfirmedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AUTO_CONFIRMED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoConfirmedDate() <em>Auto Confirmed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoConfirmedDate()
	 * @generated
	 * @ordered
	 */
	protected Date autoConfirmedDate = AUTO_CONFIRMED_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoConfirmedUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.AUTO_CONFIRMED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAutoConfirmedDate() {
		return autoConfirmedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoConfirmedDate(Date newAutoConfirmedDate) {
		Date oldAutoConfirmedDate = autoConfirmedDate;
		autoConfirmedDate = newAutoConfirmedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE, oldAutoConfirmedDate, autoConfirmedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createArticle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveArticle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uploadMedia() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveMedia() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE:
				return getAutoConfirmedDate();
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
			case ModelPackage.AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE:
				setAutoConfirmedDate((Date)newValue);
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
			case ModelPackage.AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE:
				setAutoConfirmedDate(AUTO_CONFIRMED_DATE_EDEFAULT);
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
			case ModelPackage.AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE:
				return AUTO_CONFIRMED_DATE_EDEFAULT == null ? autoConfirmedDate != null : !AUTO_CONFIRMED_DATE_EDEFAULT.equals(autoConfirmedDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.AUTO_CONFIRMED_USER___CREATE_ARTICLE:
				createArticle();
				return null;
			case ModelPackage.AUTO_CONFIRMED_USER___MOVE_ARTICLE:
				moveArticle();
				return null;
			case ModelPackage.AUTO_CONFIRMED_USER___UPLOAD_MEDIA:
				uploadMedia();
				return null;
			case ModelPackage.AUTO_CONFIRMED_USER___MOVE_MEDIA:
				moveMedia();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (autoConfirmedDate: ");
		result.append(autoConfirmedDate);
		result.append(')');
		return result.toString();
	}

} //AutoConfirmedUserImpl
