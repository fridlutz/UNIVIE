/**
 */
package wikiSampleSolution.wikiSampleSolution.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wikiSampleSolution.wikiSampleSolution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiSampleSolutionFactoryImpl extends EFactoryImpl implements WikiSampleSolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WikiSampleSolutionFactory init() {
		try {
			WikiSampleSolutionFactory theWikiSampleSolutionFactory = (WikiSampleSolutionFactory)EPackage.Registry.INSTANCE.getEFactory(WikiSampleSolutionPackage.eNS_URI);
			if (theWikiSampleSolutionFactory != null) {
				return theWikiSampleSolutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WikiSampleSolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiSampleSolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WikiSampleSolutionPackage.WIKI: return createWiki();
			case WikiSampleSolutionPackage.ARTICLE: return createArticle();
			case WikiSampleSolutionPackage.MEDIA: return createMedia();
			case WikiSampleSolutionPackage.PROJECT_PAGE: return createProjectPage();
			case WikiSampleSolutionPackage.DISCUSSION_PAGE: return createDiscussionPage();
			case WikiSampleSolutionPackage.VERSION: return createVersion();
			case WikiSampleSolutionPackage.HISTORY: return createHistory();
			case WikiSampleSolutionPackage.GROUP: return createGroup();
			case WikiSampleSolutionPackage.MODE: return createMode();
			case WikiSampleSolutionPackage.ACTION: return createAction();
			case WikiSampleSolutionPackage.PRIVILEG: return createPrivileg();
			case WikiSampleSolutionPackage.REGISTERED_USER: return createRegisteredUser();
			case WikiSampleSolutionPackage.UNREGISTERED_USER: return createUnregisteredUser();
			case WikiSampleSolutionPackage.PROFILE: return createProfile();
			case WikiSampleSolutionPackage.ROLE: return createRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WikiSampleSolutionPackage.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WikiSampleSolutionPackage.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wiki createWiki() {
		WikiImpl wiki = new WikiImpl();
		return wiki;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPage createProjectPage() {
		ProjectPageImpl projectPage = new ProjectPageImpl();
		return projectPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionPage createDiscussionPage() {
		DiscussionPageImpl discussionPage = new DiscussionPageImpl();
		return discussionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privileg createPrivileg() {
		PrivilegImpl privileg = new PrivilegImpl();
		return privileg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredUser createRegisteredUser() {
		RegisteredUserImpl registeredUser = new RegisteredUserImpl();
		return registeredUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisteredUser createUnregisteredUser() {
		UnregisteredUserImpl unregisteredUser = new UnregisteredUserImpl();
		return unregisteredUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue) {
		RoleType result = RoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiSampleSolutionPackage getWikiSampleSolutionPackage() {
		return (WikiSampleSolutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WikiSampleSolutionPackage getPackage() {
		return WikiSampleSolutionPackage.eINSTANCE;
	}

} //WikiSampleSolutionFactoryImpl
