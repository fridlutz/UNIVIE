/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion;
import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory;

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
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl#getDiscussionPage <em>Discussion Page</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl#getCurrentRevision <em>Current Revision</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl#getVersionHistoryPage <em>Version History Page</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The cached value of the '{@link #getDiscussionPage() <em>Discussion Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionPage()
	 * @generated
	 * @ordered
	 */
	protected Discussion discussionPage;

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
	 * The cached value of the '{@link #getVersionHistoryPage() <em>Version History Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionHistoryPage()
	 * @generated
	 * @ordered
	 */
	protected VersionHistory versionHistoryPage;

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
	public Discussion getDiscussionPage() {
		if (discussionPage != null && discussionPage.eIsProxy()) {
			InternalEObject oldDiscussionPage = (InternalEObject)discussionPage;
			discussionPage = (Discussion)eResolveProxy(oldDiscussionPage);
			if (discussionPage != oldDiscussionPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONTENT__DISCUSSION_PAGE, oldDiscussionPage, discussionPage));
			}
		}
		return discussionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discussion basicGetDiscussionPage() {
		return discussionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscussionPage(Discussion newDiscussionPage) {
		Discussion oldDiscussionPage = discussionPage;
		discussionPage = newDiscussionPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__DISCUSSION_PAGE, oldDiscussionPage, discussionPage));
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
	public VersionHistory getVersionHistoryPage() {
		if (versionHistoryPage != null && versionHistoryPage.eIsProxy()) {
			InternalEObject oldVersionHistoryPage = (InternalEObject)versionHistoryPage;
			versionHistoryPage = (VersionHistory)eResolveProxy(oldVersionHistoryPage);
			if (versionHistoryPage != oldVersionHistoryPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONTENT__VERSION_HISTORY_PAGE, oldVersionHistoryPage, versionHistoryPage));
			}
		}
		return versionHistoryPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHistory basicGetVersionHistoryPage() {
		return versionHistoryPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionHistoryPage(VersionHistory newVersionHistoryPage) {
		VersionHistory oldVersionHistoryPage = versionHistoryPage;
		versionHistoryPage = newVersionHistoryPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENT__VERSION_HISTORY_PAGE, oldVersionHistoryPage, versionHistoryPage));
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
			case ModelPackage.CONTENT__DISCUSSION_PAGE:
				if (resolve) return getDiscussionPage();
				return basicGetDiscussionPage();
			case ModelPackage.CONTENT__CURRENT_REVISION:
				if (resolve) return getCurrentRevision();
				return basicGetCurrentRevision();
			case ModelPackage.CONTENT__VERSION_HISTORY_PAGE:
				if (resolve) return getVersionHistoryPage();
				return basicGetVersionHistoryPage();
			case ModelPackage.CONTENT__TITLE:
				return getTitle();
			case ModelPackage.CONTENT__REVISION:
				return getRevision();
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
			case ModelPackage.CONTENT__DISCUSSION_PAGE:
				setDiscussionPage((Discussion)newValue);
				return;
			case ModelPackage.CONTENT__CURRENT_REVISION:
				setCurrentRevision((Revision)newValue);
				return;
			case ModelPackage.CONTENT__VERSION_HISTORY_PAGE:
				setVersionHistoryPage((VersionHistory)newValue);
				return;
			case ModelPackage.CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case ModelPackage.CONTENT__REVISION:
				getRevision().clear();
				getRevision().addAll((Collection<? extends Revision>)newValue);
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
			case ModelPackage.CONTENT__DISCUSSION_PAGE:
				setDiscussionPage((Discussion)null);
				return;
			case ModelPackage.CONTENT__CURRENT_REVISION:
				setCurrentRevision((Revision)null);
				return;
			case ModelPackage.CONTENT__VERSION_HISTORY_PAGE:
				setVersionHistoryPage((VersionHistory)null);
				return;
			case ModelPackage.CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModelPackage.CONTENT__REVISION:
				getRevision().clear();
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
			case ModelPackage.CONTENT__DISCUSSION_PAGE:
				return discussionPage != null;
			case ModelPackage.CONTENT__CURRENT_REVISION:
				return currentRevision != null;
			case ModelPackage.CONTENT__VERSION_HISTORY_PAGE:
				return versionHistoryPage != null;
			case ModelPackage.CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModelPackage.CONTENT__REVISION:
				return revision != null && !revision.isEmpty();
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
