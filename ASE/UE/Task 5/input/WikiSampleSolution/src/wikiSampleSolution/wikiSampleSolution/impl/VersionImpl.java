/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl#getCommitMsg <em>Commit Msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version {
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Version previous;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditedBy() <em>Edited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected User editedBy;

	/**
	 * The default value of the '{@link #getDiff() <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiff() <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected String diff = DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitMsg() <em>Commit Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMIT_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitMsg() <em>Commit Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitMsg()
	 * @generated
	 * @ordered
	 */
	protected String commitMsg = COMMIT_MSG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikiSampleSolutionPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Version)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiSampleSolutionPackage.VERSION__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Version newPrevious) {
		Version oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.VERSION__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.VERSION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getEditedBy() {
		if (editedBy != null && editedBy.eIsProxy()) {
			InternalEObject oldEditedBy = (InternalEObject)editedBy;
			editedBy = (User)eResolveProxy(oldEditedBy);
			if (editedBy != oldEditedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiSampleSolutionPackage.VERSION__EDITED_BY, oldEditedBy, editedBy));
			}
		}
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetEditedBy() {
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditedBy(User newEditedBy) {
		User oldEditedBy = editedBy;
		editedBy = newEditedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.VERSION__EDITED_BY, oldEditedBy, editedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiff() {
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff(String newDiff) {
		String oldDiff = diff;
		diff = newDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.VERSION__DIFF, oldDiff, diff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommitMsg() {
		return commitMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitMsg(String newCommitMsg) {
		String oldCommitMsg = commitMsg;
		commitMsg = newCommitMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikiSampleSolutionPackage.VERSION__COMMIT_MSG, oldCommitMsg, commitMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikiSampleSolutionPackage.VERSION__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case WikiSampleSolutionPackage.VERSION__TIMESTAMP:
				return getTimestamp();
			case WikiSampleSolutionPackage.VERSION__EDITED_BY:
				if (resolve) return getEditedBy();
				return basicGetEditedBy();
			case WikiSampleSolutionPackage.VERSION__DIFF:
				return getDiff();
			case WikiSampleSolutionPackage.VERSION__COMMIT_MSG:
				return getCommitMsg();
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
			case WikiSampleSolutionPackage.VERSION__PREVIOUS:
				setPrevious((Version)newValue);
				return;
			case WikiSampleSolutionPackage.VERSION__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case WikiSampleSolutionPackage.VERSION__EDITED_BY:
				setEditedBy((User)newValue);
				return;
			case WikiSampleSolutionPackage.VERSION__DIFF:
				setDiff((String)newValue);
				return;
			case WikiSampleSolutionPackage.VERSION__COMMIT_MSG:
				setCommitMsg((String)newValue);
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
			case WikiSampleSolutionPackage.VERSION__PREVIOUS:
				setPrevious((Version)null);
				return;
			case WikiSampleSolutionPackage.VERSION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case WikiSampleSolutionPackage.VERSION__EDITED_BY:
				setEditedBy((User)null);
				return;
			case WikiSampleSolutionPackage.VERSION__DIFF:
				setDiff(DIFF_EDEFAULT);
				return;
			case WikiSampleSolutionPackage.VERSION__COMMIT_MSG:
				setCommitMsg(COMMIT_MSG_EDEFAULT);
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
			case WikiSampleSolutionPackage.VERSION__PREVIOUS:
				return previous != null;
			case WikiSampleSolutionPackage.VERSION__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case WikiSampleSolutionPackage.VERSION__EDITED_BY:
				return editedBy != null;
			case WikiSampleSolutionPackage.VERSION__DIFF:
				return DIFF_EDEFAULT == null ? diff != null : !DIFF_EDEFAULT.equals(diff);
			case WikiSampleSolutionPackage.VERSION__COMMIT_MSG:
				return COMMIT_MSG_EDEFAULT == null ? commitMsg != null : !COMMIT_MSG_EDEFAULT.equals(commitMsg);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", diff: ");
		result.append(diff);
		result.append(", commitMsg: ");
		result.append(commitMsg);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
