/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wikiSampleSolution.wikiSampleSolution.Content;
import wikiSampleSolution.wikiSampleSolution.DiscussionPage;
import wikiSampleSolution.wikiSampleSolution.Group;
import wikiSampleSolution.wikiSampleSolution.History;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getHistory <em>History</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getDiscussionpage <em>Discussionpage</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getTtile <em>Ttile</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl#getContentMarkup <em>Content Markup</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected History history;

	/**
	 * The cached value of the '{@link #getDiscussionpage() <em>Discussionpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionpage()
	 * @generated
	 * @ordered
	 */
	protected DiscussionPage discussionpage;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected User editor;

	/**
	 * The default value of the '{@link #getTtile() <em>Ttile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtile()
	 * @generated
	 * @ordered
	 */
	protected static final String TTILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTtile() <em>Ttile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtile()
	 * @generated
	 * @ordered
	 */
	protected String ttile = TTILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentMarkup() <em>Content Markup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMarkup()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_MARKUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentMarkup() <em>Content Markup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMarkup()
	 * @generated
	 * @ordered
	 */
	protected String contentMarkup = CONTENT_MARKUP_EDEFAULT;

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
		return WikiSampleSolutionPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(History newHistory, NotificationChain msgs) {
		History oldHistory = history;
		history = newHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__HISTORY, oldHistory, newHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(History newHistory) {
		if (newHistory != history) {
			NotificationChain msgs = null;
			if (history != null)
				msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiSampleSolutionPackage.CONTENT__HISTORY, null, msgs);
			if (newHistory != null)
				msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiSampleSolutionPackage.CONTENT__HISTORY, null, msgs);
			msgs = basicSetHistory(newHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__HISTORY, newHistory, newHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionPage getDiscussionpage() {
		return discussionpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussionpage(DiscussionPage newDiscussionpage, NotificationChain msgs) {
		DiscussionPage oldDiscussionpage = discussionpage;
		discussionpage = newDiscussionpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE, oldDiscussionpage, newDiscussionpage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscussionpage(DiscussionPage newDiscussionpage) {
		if (newDiscussionpage != discussionpage) {
			NotificationChain msgs = null;
			if (discussionpage != null)
				msgs = ((InternalEObject)discussionpage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE, null, msgs);
			if (newDiscussionpage != null)
				msgs = ((InternalEObject)newDiscussionpage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE, null, msgs);
			msgs = basicSetDiscussionpage(newDiscussionpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE, newDiscussionpage, newDiscussionpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectResolvingEList<Group>(Group.class, this, WikiSampleSolutionPackage.CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getEditor() {
		if (editor != null && editor.eIsProxy()) {
			InternalEObject oldEditor = (InternalEObject)editor;
			editor = (User)eResolveProxy(oldEditor);
			if (editor != oldEditor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiSampleSolutionPackage.CONTENT__EDITOR, oldEditor, editor));
			}
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(User newEditor) {
		User oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__EDITOR, oldEditor, editor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTtile() {
		return ttile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTtile(String newTtile) {
		String oldTtile = ttile;
		ttile = newTtile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__TTILE, oldTtile, ttile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentMarkup() {
		return contentMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentMarkup(String newContentMarkup) {
		String oldContentMarkup = contentMarkup;
		contentMarkup = newContentMarkup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.CONTENT__CONTENT_MARKUP, oldContentMarkup, contentMarkup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikiSampleSolutionPackage.CONTENT__HISTORY:
				return basicSetHistory(null, msgs);
			case WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE:
				return basicSetDiscussionpage(null, msgs);
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
			case WikiSampleSolutionPackage.CONTENT__HISTORY:
				return getHistory();
			case WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE:
				return getDiscussionpage();
			case WikiSampleSolutionPackage.CONTENT__GROUP:
				return getGroup();
			case WikiSampleSolutionPackage.CONTENT__EDITOR:
				if (resolve) return getEditor();
				return basicGetEditor();
			case WikiSampleSolutionPackage.CONTENT__TTILE:
				return getTtile();
			case WikiSampleSolutionPackage.CONTENT__CONTENT_MARKUP:
				return getContentMarkup();
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
			case WikiSampleSolutionPackage.CONTENT__HISTORY:
				setHistory((History)newValue);
				return;
			case WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE:
				setDiscussionpage((DiscussionPage)newValue);
				return;
			case WikiSampleSolutionPackage.CONTENT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case WikiSampleSolutionPackage.CONTENT__EDITOR:
				setEditor((User)newValue);
				return;
			case WikiSampleSolutionPackage.CONTENT__TTILE:
				setTtile((String)newValue);
				return;
			case WikiSampleSolutionPackage.CONTENT__CONTENT_MARKUP:
				setContentMarkup((String)newValue);
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
			case WikiSampleSolutionPackage.CONTENT__HISTORY:
				setHistory((History)null);
				return;
			case WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE:
				setDiscussionpage((DiscussionPage)null);
				return;
			case WikiSampleSolutionPackage.CONTENT__GROUP:
				getGroup().clear();
				return;
			case WikiSampleSolutionPackage.CONTENT__EDITOR:
				setEditor((User)null);
				return;
			case WikiSampleSolutionPackage.CONTENT__TTILE:
				setTtile(TTILE_EDEFAULT);
				return;
			case WikiSampleSolutionPackage.CONTENT__CONTENT_MARKUP:
				setContentMarkup(CONTENT_MARKUP_EDEFAULT);
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
			case WikiSampleSolutionPackage.CONTENT__HISTORY:
				return history != null;
			case WikiSampleSolutionPackage.CONTENT__DISCUSSIONPAGE:
				return discussionpage != null;
			case WikiSampleSolutionPackage.CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case WikiSampleSolutionPackage.CONTENT__EDITOR:
				return editor != null;
			case WikiSampleSolutionPackage.CONTENT__TTILE:
				return TTILE_EDEFAULT == null ? ttile != null : !TTILE_EDEFAULT.equals(ttile);
			case WikiSampleSolutionPackage.CONTENT__CONTENT_MARKUP:
				return CONTENT_MARKUP_EDEFAULT == null ? contentMarkup != null : !CONTENT_MARKUP_EDEFAULT.equals(contentMarkup);
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
		result.append(" (Ttile: ");
		result.append(ttile);
		result.append(", contentMarkup: ");
		result.append(contentMarkup);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
