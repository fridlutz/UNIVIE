/**
 */
package wikiSampleSolution.wikiSampleSolution.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wikiSampleSolution.wikiSampleSolution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage
 * @generated
 */
public class WikiSampleSolutionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WikiSampleSolutionValidator INSTANCE = new WikiSampleSolutionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wikiSampleSolution.wikiSampleSolution";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiSampleSolutionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WikiSampleSolutionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WikiSampleSolutionPackage.WIKI:
				return validateWiki((Wiki)value, diagnostics, context);
			case WikiSampleSolutionPackage.CONTENT:
				return validateContent((Content)value, diagnostics, context);
			case WikiSampleSolutionPackage.ARTICLE:
				return validateArticle((Article)value, diagnostics, context);
			case WikiSampleSolutionPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case WikiSampleSolutionPackage.PROJECT_PAGE:
				return validateProjectPage((ProjectPage)value, diagnostics, context);
			case WikiSampleSolutionPackage.DISCUSSION_PAGE:
				return validateDiscussionPage((DiscussionPage)value, diagnostics, context);
			case WikiSampleSolutionPackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case WikiSampleSolutionPackage.HISTORY:
				return validateHistory((History)value, diagnostics, context);
			case WikiSampleSolutionPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case WikiSampleSolutionPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case WikiSampleSolutionPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case WikiSampleSolutionPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case WikiSampleSolutionPackage.PRIVILEG:
				return validatePrivileg((Privileg)value, diagnostics, context);
			case WikiSampleSolutionPackage.REGISTERED_USER:
				return validateRegisteredUser((RegisteredUser)value, diagnostics, context);
			case WikiSampleSolutionPackage.UNREGISTERED_USER:
				return validateUnregisteredUser((UnregisteredUser)value, diagnostics, context);
			case WikiSampleSolutionPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case WikiSampleSolutionPackage.SUBSCRIBABLE:
				return validateSubscribable((Subscribable)value, diagnostics, context);
			case WikiSampleSolutionPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case WikiSampleSolutionPackage.ROLE_TYPE:
				return validateRoleType((RoleType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWiki(Wiki wiki, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wiki, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wiki, diagnostics, context);
		if (result || diagnostics != null) result &= validateWiki_mustHaveSysopAndAdmin(wiki, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveSysopAndAdmin constraint of '<em>Wiki</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WIKI__MUST_HAVE_SYSOP_AND_ADMIN__EEXPRESSION = "\n" +
		"\t\t\tusers->exists(user | user.role.type = RoleType::ADMIN )\n" +
		"\t\t\tand\n" +
		"\t\t\tusers->exists(user | user.role.type = RoleType::SYSOP )\n" +
		"\t\t";

	/**
	 * Validates the mustHaveSysopAndAdmin constraint of '<em>Wiki</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWiki_mustHaveSysopAndAdmin(Wiki wiki, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WikiSampleSolutionPackage.Literals.WIKI,
				 wiki,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveSysopAndAdmin",
				 WIKI__MUST_HAVE_SYSOP_AND_ADMIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContent(Content content, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(content, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArticle(Article article, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(article, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectPage(ProjectPage projectPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscussionPage(DiscussionPage discussionPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discussionPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(version, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistory(History history, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(history, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivileg(Privileg privileg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privileg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisteredUser(RegisteredUser registeredUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registeredUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnregisteredUser(UnregisteredUser unregisteredUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unregisteredUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribable(Subscribable subscribable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscribable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleType(RoleType roleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WikiSampleSolutionValidator
