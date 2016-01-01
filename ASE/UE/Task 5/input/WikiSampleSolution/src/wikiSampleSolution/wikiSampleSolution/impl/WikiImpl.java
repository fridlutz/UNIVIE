/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wikiSampleSolution.wikiSampleSolution.Content;
import wikiSampleSolution.wikiSampleSolution.Group;
import wikiSampleSolution.wikiSampleSolution.History;
import wikiSampleSolution.wikiSampleSolution.Mode;
import wikiSampleSolution.wikiSampleSolution.Privileg;
import wikiSampleSolution.wikiSampleSolution.Role;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;
import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiki</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getContent <em>Content</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getPrivilegs <em>Privilegs</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getRole <em>Role</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getHistory <em>History</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WikiImpl extends MinimalEObjectImpl.Container implements Wiki {
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
	 * The cached value of the '{@link #getPrivilegs() <em>Privilegs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegs()
	 * @generated
	 * @ordered
	 */
	protected EList<Privileg> privilegs;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<History> history;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikiSampleSolutionPackage.Literals.WIKI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, WikiSampleSolutionPackage.WIKI__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Privileg> getPrivilegs() {
		if (privilegs == null) {
			privilegs = new EObjectContainmentEList<Privileg>(Privileg.class, this, WikiSampleSolutionPackage.WIKI__PRIVILEGS);
		}
		return privilegs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, WikiSampleSolutionPackage.WIKI__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, WikiSampleSolutionPackage.WIKI__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectContainmentEList<Mode>(Mode.class, this, WikiSampleSolutionPackage.WIKI__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, WikiSampleSolutionPackage.WIKI__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getHistory() {
		if (history == null) {
			history = new EObjectResolvingEList<History>(History.class, this, WikiSampleSolutionPackage.WIKI__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersions() {
		if (versions == null) {
			versions = new EObjectResolvingEList<Version>(Version.class, this, WikiSampleSolutionPackage.WIKI__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikiSampleSolutionPackage.WIKI__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
				return ((InternalEList<?>)getPrivilegs()).basicRemove(otherEnd, msgs);
			case WikiSampleSolutionPackage.WIKI__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case WikiSampleSolutionPackage.WIKI__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case WikiSampleSolutionPackage.WIKI__MODE:
				return ((InternalEList<?>)getMode()).basicRemove(otherEnd, msgs);
			case WikiSampleSolutionPackage.WIKI__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case WikiSampleSolutionPackage.WIKI__CONTENT:
				return getContent();
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
				return getPrivilegs();
			case WikiSampleSolutionPackage.WIKI__GROUPS:
				return getGroups();
			case WikiSampleSolutionPackage.WIKI__USERS:
				return getUsers();
			case WikiSampleSolutionPackage.WIKI__MODE:
				return getMode();
			case WikiSampleSolutionPackage.WIKI__ROLE:
				return getRole();
			case WikiSampleSolutionPackage.WIKI__HISTORY:
				return getHistory();
			case WikiSampleSolutionPackage.WIKI__VERSIONS:
				return getVersions();
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
			case WikiSampleSolutionPackage.WIKI__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
				getPrivilegs().clear();
				getPrivilegs().addAll((Collection<? extends Privileg>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends History>)newValue);
				return;
			case WikiSampleSolutionPackage.WIKI__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
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
			case WikiSampleSolutionPackage.WIKI__CONTENT:
				getContent().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
				getPrivilegs().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__GROUPS:
				getGroups().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__USERS:
				getUsers().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__MODE:
				getMode().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__ROLE:
				getRole().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__HISTORY:
				getHistory().clear();
				return;
			case WikiSampleSolutionPackage.WIKI__VERSIONS:
				getVersions().clear();
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
			case WikiSampleSolutionPackage.WIKI__CONTENT:
				return content != null && !content.isEmpty();
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
				return privilegs != null && !privilegs.isEmpty();
			case WikiSampleSolutionPackage.WIKI__GROUPS:
				return groups != null && !groups.isEmpty();
			case WikiSampleSolutionPackage.WIKI__USERS:
				return users != null && !users.isEmpty();
			case WikiSampleSolutionPackage.WIKI__MODE:
				return mode != null && !mode.isEmpty();
			case WikiSampleSolutionPackage.WIKI__ROLE:
				return role != null && !role.isEmpty();
			case WikiSampleSolutionPackage.WIKI__HISTORY:
				return history != null && !history.isEmpty();
			case WikiSampleSolutionPackage.WIKI__VERSIONS:
				return versions != null && !versions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WikiImpl
