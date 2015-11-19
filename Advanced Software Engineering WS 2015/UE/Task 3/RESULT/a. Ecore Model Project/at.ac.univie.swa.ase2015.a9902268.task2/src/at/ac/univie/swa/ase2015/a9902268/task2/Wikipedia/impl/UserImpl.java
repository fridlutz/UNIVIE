/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#isIsBlocked <em>Is Blocked</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#isIsReader <em>Is Reader</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#isIsEditor <em>Is Editor</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#getWikiTime <em>Wiki Time</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#getCountRevisions <em>Count Revisions</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl#getAuthoredRevisions <em>Authored Revisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #isIsBlocked() <em>Is Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBlocked() <em>Is Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean isBlocked = IS_BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReader() <em>Is Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsReader() <em>Is Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReader()
	 * @generated
	 * @ordered
	 */
	protected boolean isReader = IS_READER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEditor() <em>Is Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EDITOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEditor() <em>Is Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditor()
	 * @generated
	 * @ordered
	 */
	protected boolean isEditor = IS_EDITOR_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getWikiTime() <em>Wiki Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate WIKI_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.USER__WIKI_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCountRevisions() <em>Count Revisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountRevisions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COUNT_REVISIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.USER__COUNT_REVISIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAuthoredRevisions() <em>Authored Revisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredRevisions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AUTHORED_REVISIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.USER__AUTHORED_REVISIONS).getSettingDelegate();

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
		return ModelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBlocked() {
		return isBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBlocked(boolean newIsBlocked) {
		boolean oldIsBlocked = isBlocked;
		isBlocked = newIsBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__IS_BLOCKED, oldIsBlocked, isBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReader() {
		return isReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReader(boolean newIsReader) {
		boolean oldIsReader = isReader;
		isReader = newIsReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__IS_READER, oldIsReader, isReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEditor() {
		return isEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEditor(boolean newIsEditor) {
		boolean oldIsEditor = isEditor;
		isEditor = newIsEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER__IS_EDITOR, oldIsEditor, isEditor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWikiTime() {
		return (BigInteger)WIKI_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCountRevisions() {
		return (BigInteger)COUNT_REVISIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Revision> getAuthoredRevisions() {
		return (EList<Revision>)AUTHORED_REVISIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USER__IS_BLOCKED:
				return isIsBlocked();
			case ModelPackage.USER__IS_READER:
				return isIsReader();
			case ModelPackage.USER__IS_EDITOR:
				return isIsEditor();
			case ModelPackage.USER__WIKI_TIME:
				return getWikiTime();
			case ModelPackage.USER__COUNT_REVISIONS:
				return getCountRevisions();
			case ModelPackage.USER__AUTHORED_REVISIONS:
				return getAuthoredRevisions();
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
			case ModelPackage.USER__IS_BLOCKED:
				setIsBlocked((Boolean)newValue);
				return;
			case ModelPackage.USER__IS_READER:
				setIsReader((Boolean)newValue);
				return;
			case ModelPackage.USER__IS_EDITOR:
				setIsEditor((Boolean)newValue);
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
			case ModelPackage.USER__IS_BLOCKED:
				setIsBlocked(IS_BLOCKED_EDEFAULT);
				return;
			case ModelPackage.USER__IS_READER:
				setIsReader(IS_READER_EDEFAULT);
				return;
			case ModelPackage.USER__IS_EDITOR:
				setIsEditor(IS_EDITOR_EDEFAULT);
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
			case ModelPackage.USER__IS_BLOCKED:
				return isBlocked != IS_BLOCKED_EDEFAULT;
			case ModelPackage.USER__IS_READER:
				return isReader != IS_READER_EDEFAULT;
			case ModelPackage.USER__IS_EDITOR:
				return isEditor != IS_EDITOR_EDEFAULT;
			case ModelPackage.USER__WIKI_TIME:
				return WIKI_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.USER__COUNT_REVISIONS:
				return COUNT_REVISIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.USER__AUTHORED_REVISIONS:
				return AUTHORED_REVISIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (isBlocked: ");
		result.append(isBlocked);
		result.append(", isReader: ");
		result.append(isReader);
		result.append(", isEditor: ");
		result.append(isEditor);
		result.append(')');
		return result.toString();
	}

} //UserImpl
