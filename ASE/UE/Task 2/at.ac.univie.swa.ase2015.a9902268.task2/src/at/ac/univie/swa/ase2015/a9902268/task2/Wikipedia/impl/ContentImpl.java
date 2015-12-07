/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl#getCurrentRevision <em>Current Revision</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl#getVersionhistory <em>Versionhistory</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The cached value of the '{@link #getCurrentRevision() <em>Current Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRevision()
	 * @generated
	 * @ordered
	 */
	protected Revision currentRevision;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revision;

	/**
	 * The cached value of the '{@link #getVersionhistory() <em>Versionhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionhistory()
	 * @generated
	 * @ordered
	 */
	protected VersionHistory versionhistory;

	/**
	 * The cached value of the '{@link #getDiscussion() <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion()
	 * @generated
	 * @ordered
	 */
	protected Discussion discussion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getCurrentRevision() {
		if (currentRevision != null && currentRevision.eIsProxy()) {
			InternalEObject oldCurrentRevision = (InternalEObject)currentRevision;
			currentRevision = (Revision)eResolveProxy(oldCurrentRevision);
			if (currentRevision != oldCurrentRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONTENT__CURRENT_REVISION, oldCurrentRevision, currentRevision));
			}
		}
		return currentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetCurrentRevision() {
		return currentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRevision(Revision newCurrentRevision) {
		Revision oldCurrentRevision = currentRevision;
		currentRevision = newCurrentRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__CURRENT_REVISION, oldCurrentRevision, currentRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevision() {
		if (revision == null) {
			revision = new EObjectContainmentEList<Revision>(Revision.class, this, ModelPackage.CONTENT__REVISION);
		}
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHistory getVersionhistory() {
		return versionhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionhistory(VersionHistory newVersionhistory, NotificationChain msgs) {
		VersionHistory oldVersionhistory = versionhistory;
		versionhistory = newVersionhistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__VERSIONHISTORY, oldVersionhistory, newVersionhistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionhistory(VersionHistory newVersionhistory) {
		if (newVersionhistory != versionhistory) {
			NotificationChain msgs = null;
			if (versionhistory != null)
				msgs = ((InternalEObject)versionhistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONTENT__VERSIONHISTORY, null, msgs);
			if (newVersionhistory != null)
				msgs = ((InternalEObject)newVersionhistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONTENT__VERSIONHISTORY, null, msgs);
			msgs = basicSetVersionhistory(newVersionhistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__VERSIONHISTORY, newVersionhistory, newVersionhistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discussion getDiscussion() {
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussion(Discussion newDiscussion, NotificationChain msgs) {
		Discussion oldDiscussion = discussion;
		discussion = newDiscussion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__DISCUSSION, oldDiscussion, newDiscussion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscussion(Discussion newDiscussion) {
		if (newDiscussion != discussion) {
			NotificationChain msgs = null;
			if (discussion != null)
				msgs = ((InternalEObject)discussion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONTENT__DISCUSSION, null, msgs);
			if (newDiscussion != null)
				msgs = ((InternalEObject)newDiscussion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONTENT__DISCUSSION, null, msgs);
			msgs = basicSetDiscussion(newDiscussion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__DISCUSSION, newDiscussion, newDiscussion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision createNewRevision() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDiscussionItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void renderHTML() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void render() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONTENT__REVISION:
				return ((InternalEList<?>)getRevision()).basicRemove(otherEnd, msgs);
			case ModelPackage.CONTENT__VERSIONHISTORY:
				return basicSetVersionhistory(null, msgs);
			case ModelPackage.CONTENT__DISCUSSION:
				return basicSetDiscussion(null, msgs);
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
			case ModelPackage.CONTENT__CURRENT_REVISION:
				if (resolve) return getCurrentRevision();
				return basicGetCurrentRevision();
			case ModelPackage.CONTENT__TITLE:
				return getTitle();
			case ModelPackage.CONTENT__REVISION:
				return getRevision();
			case ModelPackage.CONTENT__VERSIONHISTORY:
				return getVersionhistory();
			case ModelPackage.CONTENT__DISCUSSION:
				return getDiscussion();
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
			case ModelPackage.CONTENT__CURRENT_REVISION:
				setCurrentRevision((Revision)newValue);
				return;
			case ModelPackage.CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case ModelPackage.CONTENT__REVISION:
				getRevision().clear();
				getRevision().addAll((Collection<? extends Revision>)newValue);
				return;
			case ModelPackage.CONTENT__VERSIONHISTORY:
				setVersionhistory((VersionHistory)newValue);
				return;
			case ModelPackage.CONTENT__DISCUSSION:
				setDiscussion((Discussion)newValue);
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
			case ModelPackage.CONTENT__CURRENT_REVISION:
				setCurrentRevision((Revision)null);
				return;
			case ModelPackage.CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModelPackage.CONTENT__REVISION:
				getRevision().clear();
				return;
			case ModelPackage.CONTENT__VERSIONHISTORY:
				setVersionhistory((VersionHistory)null);
				return;
			case ModelPackage.CONTENT__DISCUSSION:
				setDiscussion((Discussion)null);
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
			case ModelPackage.CONTENT__CURRENT_REVISION:
				return currentRevision != null;
			case ModelPackage.CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModelPackage.CONTENT__REVISION:
				return revision != null && !revision.isEmpty();
			case ModelPackage.CONTENT__VERSIONHISTORY:
				return versionhistory != null;
			case ModelPackage.CONTENT__DISCUSSION:
				return discussion != null;
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
			case ModelPackage.CONTENT___CREATE_NEW_REVISION:
				return createNewRevision();
			case ModelPackage.CONTENT___ADD_DISCUSSION_ITEM:
				addDiscussionItem();
				return null;
			case ModelPackage.CONTENT___RENDER_HTML:
				renderHTML();
				return null;
			case ModelPackage.CONTENT___RENDER:
				render();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
