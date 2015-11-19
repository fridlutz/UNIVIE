/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.util;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia";

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
	public ModelValidator() {
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
	  return ModelPackage.eINSTANCE;
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
			case ModelPackage.WIKIPEDIA:
				return validateWikipedia((Wikipedia)value, diagnostics, context);
			case ModelPackage.CONTENT:
				return validateContent((Content)value, diagnostics, context);
			case ModelPackage.ARTICLE:
				return validateArticle((Article)value, diagnostics, context);
			case ModelPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case ModelPackage.INTERNAL_CONTENT:
				return validateInternalContent((InternalContent)value, diagnostics, context);
			case ModelPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case ModelPackage.REGISTERED_USER:
				return validateRegisteredUser((RegisteredUser)value, diagnostics, context);
			case ModelPackage.REVISION:
				return validateRevision((Revision)value, diagnostics, context);
			case ModelPackage.DISCUSSION:
				return validateDiscussion((Discussion)value, diagnostics, context);
			case ModelPackage.VERSION_HISTORY:
				return validateVersionHistory((VersionHistory)value, diagnostics, context);
			case ModelPackage.META_DATA:
				return validateMetaData((MetaData)value, diagnostics, context);
			case ModelPackage.WIKI_PROJECT:
				return validateWikiProject((WikiProject)value, diagnostics, context);
			case ModelPackage.UNREGISTERED_USER:
				return validateUnregisteredUser((UnregisteredUser)value, diagnostics, context);
			case ModelPackage.ADMINISTRATOR:
				return validateAdministrator((Administrator)value, diagnostics, context);
			case ModelPackage.SYS_OP:
				return validateSysOp((SysOp)value, diagnostics, context);
			case ModelPackage.USER_TYPE:
				return validateuserType((userType)value, diagnostics, context);
			case ModelPackage.ADMIN_ACTIONS:
				return validateadminActions((adminActions)value, diagnostics, context);
			case ModelPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWikipedia(Wikipedia wikipedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wikipedia, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validateWikipedia_atLeastOneSysOpOrAdminAvailable(wikipedia, diagnostics, context);
		if (result || diagnostics != null) result &= validateWikipedia_qualityOfWikipedia(wikipedia, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atLeastOneSysOpOrAdminAvailable constraint of '<em>Wikipedia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WIKIPEDIA__AT_LEAST_ONE_SYS_OP_OR_ADMIN_AVAILABLE__EEXPRESSION = "user->select(obj |\n" +
		"\t\t\t\tobj.oclIsKindOf(RegisteredUser))->size() > 0 implies (user->select(obj |\n" +
		"\t\t\t\tobj.oclIsKindOf(SysOp))->size() > 0 and user->select(obj | obj.oclIsKindOf(Administrator))->size() > 0)";

	/**
	 * Validates the atLeastOneSysOpOrAdminAvailable constraint of '<em>Wikipedia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWikipedia_atLeastOneSysOpOrAdminAvailable(Wikipedia wikipedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModelPackage.Literals.WIKIPEDIA,
				 wikipedia,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneSysOpOrAdminAvailable",
				 WIKIPEDIA__AT_LEAST_ONE_SYS_OP_OR_ADMIN_AVAILABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the qualityOfWikipedia constraint of '<em>Wikipedia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WIKIPEDIA__QUALITY_OF_WIKIPEDIA__EEXPRESSION = "averageEditedPagesPerUser >= 1";

	/**
	 * Validates the qualityOfWikipedia constraint of '<em>Wikipedia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWikipedia_qualityOfWikipedia(Wikipedia wikipedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModelPackage.Literals.WIKIPEDIA,
				 wikipedia,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "qualityOfWikipedia",
				 WIKIPEDIA__QUALITY_OF_WIKIPEDIA__EEXPRESSION,
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
	public boolean validateInternalContent(InternalContent internalContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internalContent, diagnostics, context);
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
	public boolean validateRegisteredUser(RegisteredUser registeredUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registeredUser, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(registeredUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegisteredUser_timeIsCorrect(registeredUser, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the timeIsCorrect constraint of '<em>Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGISTERED_USER__TIME_IS_CORRECT__EEXPRESSION = "wikiTime >= registrationDateJD";

	/**
	 * Validates the timeIsCorrect constraint of '<em>Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisteredUser_timeIsCorrect(RegisteredUser registeredUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModelPackage.Literals.REGISTERED_USER,
				 registeredUser,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "timeIsCorrect",
				 REGISTERED_USER__TIME_IS_CORRECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(revision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscussion(Discussion discussion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discussion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionHistory(VersionHistory versionHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaData(MetaData metaData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWikiProject(WikiProject wikiProject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wikiProject, diagnostics, context);
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
	public boolean validateAdministrator(Administrator administrator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(administrator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(administrator, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegisteredUser_timeIsCorrect(administrator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSysOp(SysOp sysOp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sysOp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sysOp, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegisteredUser_timeIsCorrect(sysOp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateuserType(userType userType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateadminActions(adminActions adminActions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ModelValidator
