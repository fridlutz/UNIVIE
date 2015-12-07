/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Administrator;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.util.ModelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wikipediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registeredUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wikiProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unregisteredUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adminActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWikipedia() {
		return wikipediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWikipedia_CurrentDateJD() {
		return (EAttribute)wikipediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWikipedia_Content() {
		return (EReference)wikipediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWikipedia_User() {
		return (EReference)wikipediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWikipedia_AverageEditedPagesPerUser() {
		return (EAttribute)wikipediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_CurrentRevision() {
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Title() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Revision() {
		return (EReference)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Versionhistory() {
		return (EReference)contentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Discussion() {
		return (EReference)contentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__CreateNewRevision() {
		return contentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__AddDiscussionItem() {
		return contentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__RenderHTML() {
		return contentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__Render() {
		return contentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArticle() {
		return articleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Usage() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Meta() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__AddContentToFileUsage() {
		return mediaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__RemoveContent() {
		return mediaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__GetFileUsage() {
		return mediaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__AddMetaData() {
		return mediaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__RemoveMetaData() {
		return mediaEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedia__GetMetaData() {
		return mediaEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalContent() {
		return internalContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalContent_Content() {
		return (EAttribute)internalContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IsBlocked() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IsReader() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IsEditor() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_WikiTime() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_CountRevisions() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_AuthoredRevisions() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredUser() {
		return registeredUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_UserName() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_RegistrationDateJD() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_RegisteredSinceDays() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_UserType() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_AdminAction() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Author() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Content() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussion() {
		return discussionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__RenderHTML() {
		return discussionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscussion__Add() {
		return discussionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionHistory() {
		return versionHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionHistory__RenderHTML() {
		return versionHistoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Key() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Value() {
		return (EAttribute)metaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWikiProject() {
		return wikiProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWikiProject_Member() {
		return (EReference)wikiProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnregisteredUser() {
		return unregisteredUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnregisteredUser_IPAddress() {
		return (EAttribute)unregisteredUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysOp() {
		return sysOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getuserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getadminActions() {
		return adminActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wikipediaEClass = createEClass(WIKIPEDIA);
		createEAttribute(wikipediaEClass, WIKIPEDIA__CURRENT_DATE_JD);
		createEReference(wikipediaEClass, WIKIPEDIA__CONTENT);
		createEReference(wikipediaEClass, WIKIPEDIA__USER);
		createEAttribute(wikipediaEClass, WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER);

		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__CURRENT_REVISION);
		createEAttribute(contentEClass, CONTENT__TITLE);
		createEReference(contentEClass, CONTENT__REVISION);
		createEReference(contentEClass, CONTENT__VERSIONHISTORY);
		createEReference(contentEClass, CONTENT__DISCUSSION);
		createEOperation(contentEClass, CONTENT___CREATE_NEW_REVISION);
		createEOperation(contentEClass, CONTENT___ADD_DISCUSSION_ITEM);
		createEOperation(contentEClass, CONTENT___RENDER_HTML);
		createEOperation(contentEClass, CONTENT___RENDER);

		articleEClass = createEClass(ARTICLE);

		mediaEClass = createEClass(MEDIA);
		createEReference(mediaEClass, MEDIA__USAGE);
		createEReference(mediaEClass, MEDIA__META);
		createEOperation(mediaEClass, MEDIA___ADD_CONTENT_TO_FILE_USAGE);
		createEOperation(mediaEClass, MEDIA___REMOVE_CONTENT);
		createEOperation(mediaEClass, MEDIA___GET_FILE_USAGE);
		createEOperation(mediaEClass, MEDIA___ADD_META_DATA);
		createEOperation(mediaEClass, MEDIA___REMOVE_META_DATA);
		createEOperation(mediaEClass, MEDIA___GET_META_DATA);

		internalContentEClass = createEClass(INTERNAL_CONTENT);
		createEAttribute(internalContentEClass, INTERNAL_CONTENT__CONTENT);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__IS_BLOCKED);
		createEAttribute(userEClass, USER__IS_READER);
		createEAttribute(userEClass, USER__IS_EDITOR);
		createEAttribute(userEClass, USER__WIKI_TIME);
		createEAttribute(userEClass, USER__COUNT_REVISIONS);
		createEReference(userEClass, USER__AUTHORED_REVISIONS);

		registeredUserEClass = createEClass(REGISTERED_USER);
		createEAttribute(registeredUserEClass, REGISTERED_USER__USER_NAME);
		createEAttribute(registeredUserEClass, REGISTERED_USER__REGISTRATION_DATE_JD);
		createEAttribute(registeredUserEClass, REGISTERED_USER__REGISTERED_SINCE_DAYS);
		createEAttribute(registeredUserEClass, REGISTERED_USER__USER_TYPE);
		createEAttribute(registeredUserEClass, REGISTERED_USER__ADMIN_ACTION);

		revisionEClass = createEClass(REVISION);
		createEReference(revisionEClass, REVISION__AUTHOR);
		createEAttribute(revisionEClass, REVISION__CONTENT);

		discussionEClass = createEClass(DISCUSSION);
		createEOperation(discussionEClass, DISCUSSION___RENDER_HTML);
		createEOperation(discussionEClass, DISCUSSION___ADD);

		versionHistoryEClass = createEClass(VERSION_HISTORY);
		createEOperation(versionHistoryEClass, VERSION_HISTORY___RENDER_HTML);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__KEY);
		createEAttribute(metaDataEClass, META_DATA__VALUE);

		wikiProjectEClass = createEClass(WIKI_PROJECT);
		createEReference(wikiProjectEClass, WIKI_PROJECT__MEMBER);

		unregisteredUserEClass = createEClass(UNREGISTERED_USER);
		createEAttribute(unregisteredUserEClass, UNREGISTERED_USER__IP_ADDRESS);

		administratorEClass = createEClass(ADMINISTRATOR);

		sysOpEClass = createEClass(SYS_OP);

		// Create enums
		userTypeEEnum = createEEnum(USER_TYPE);
		adminActionsEEnum = createEEnum(ADMIN_ACTIONS);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		articleEClass.getESuperTypes().add(this.getContent());
		mediaEClass.getESuperTypes().add(this.getContent());
		internalContentEClass.getESuperTypes().add(this.getContent());
		registeredUserEClass.getESuperTypes().add(this.getUser());
		wikiProjectEClass.getESuperTypes().add(this.getInternalContent());
		unregisteredUserEClass.getESuperTypes().add(this.getUser());
		administratorEClass.getESuperTypes().add(this.getRegisteredUser());
		sysOpEClass.getESuperTypes().add(this.getRegisteredUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(wikipediaEClass, Wikipedia.class, "Wikipedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWikipedia_CurrentDateJD(), ecorePackage.getEBigInteger(), "currentDateJD", null, 1, 1, Wikipedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWikipedia_Content(), this.getContent(), null, "content", null, 0, -1, Wikipedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWikipedia_User(), this.getUser(), null, "user", null, 0, -1, Wikipedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWikipedia_AverageEditedPagesPerUser(), ecorePackage.getEBigDecimal(), "averageEditedPagesPerUser", null, 1, 1, Wikipedia.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_CurrentRevision(), this.getRevision(), null, "currentRevision", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Title(), ecorePackage.getEString(), "title", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Revision(), this.getRevision(), null, "revision", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Versionhistory(), this.getVersionHistory(), null, "versionhistory", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Discussion(), this.getDiscussion(), null, "discussion", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContent__CreateNewRevision(), this.getRevision(), "createNewRevision", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContent__AddDiscussionItem(), null, "addDiscussionItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContent__RenderHTML(), null, "renderHTML", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContent__Render(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMedia_Usage(), this.getArticle(), null, "usage", null, 1, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_Meta(), this.getMetaData(), null, "meta", null, 0, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMedia__AddContentToFileUsage(), null, "addContentToFileUsage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMedia__RemoveContent(), null, "removeContent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMedia__GetFileUsage(), null, "getFileUsage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMedia__AddMetaData(), null, "addMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMedia__RemoveMetaData(), null, "removeMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMedia__GetMetaData(), null, "getMetaData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(internalContentEClass, InternalContent.class, "InternalContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalContent_Content(), ecorePackage.getEString(), "content", null, 0, 1, InternalContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_IsBlocked(), ecorePackage.getEBoolean(), "isBlocked", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_IsReader(), ecorePackage.getEBoolean(), "isReader", "true", 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_IsEditor(), ecorePackage.getEBoolean(), "isEditor", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_WikiTime(), ecorePackage.getEBigInteger(), "wikiTime", null, 1, 1, User.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_CountRevisions(), ecorePackage.getEBigInteger(), "countRevisions", null, 1, 1, User.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUser_AuthoredRevisions(), this.getRevision(), null, "authoredRevisions", null, 0, -1, User.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(registeredUserEClass, RegisteredUser.class, "RegisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisteredUser_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_RegistrationDateJD(), ecorePackage.getEBigInteger(), "registrationDateJD", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_RegisteredSinceDays(), ecorePackage.getEBigInteger(), "registeredSinceDays", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_UserType(), this.getuserType(), "userType", "RegisteredUser", 1, 1, RegisteredUser.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_AdminAction(), this.getadminActions(), "adminAction", null, 0, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevision_Author(), this.getUser(), null, "author", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Content(), theXMLTypePackage.getAnySimpleType(), "content", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discussionEClass, Discussion.class, "Discussion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDiscussion__RenderHTML(), null, "renderHTML", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscussion__Add(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionHistoryEClass, VersionHistory.class, "VersionHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVersionHistory__RenderHTML(), null, "renderHTML", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_Key(), ecorePackage.getEString(), "key", null, 1, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Value(), ecorePackage.getEString(), "value", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wikiProjectEClass, WikiProject.class, "WikiProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWikiProject_Member(), this.getUser(), null, "member", null, 0, -1, WikiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unregisteredUserEClass, UnregisteredUser.class, "UnregisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnregisteredUser_IPAddress(), ecorePackage.getEString(), "IPAddress", null, 1, 1, UnregisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysOpEClass, SysOp.class, "SysOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(userTypeEEnum, userType.class, "userType");
		addEEnumLiteral(userTypeEEnum, userType.AUTO_CONFIRMED_USER);
		addEEnumLiteral(userTypeEEnum, userType.REGISTERED_USER);

		initEEnum(adminActionsEEnum, adminActions.class, "adminActions");
		addEEnumLiteral(adminActionsEEnum, adminActions.CREATE_CONTENT);
		addEEnumLiteral(adminActionsEEnum, adminActions.CREATE_DELETE_CONTENT);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "ecore.xml.type", "http://www.eclipse.org/emf/2003/XMLType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (wikipediaEClass, 
		   source, 
		   new String[] {
			 "constraints", "atLeastOneSysOpOrAdminAvailable qualityOfWikipedia"
		   });	
		addAnnotation
		  (registeredUserEClass, 
		   source, 
		   new String[] {
			 "constraints", "timeIsCorrect"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (wikipediaEClass, 
		   source, 
		   new String[] {
			 "atLeastOneSysOpOrAdminAvailable", "user->select(obj |\n\t\t\t\tobj.oclIsKindOf(RegisteredUser))->size() > 0 implies (user->select(obj |\n\t\t\t\tobj.oclIsKindOf(SysOp))->size() > 0 and user->select(obj | obj.oclIsKindOf(Administrator))->size() > 0)",
			 "qualityOfWikipedia", "averageEditedPagesPerUser >= 1"
		   });	
		addAnnotation
		  (getWikipedia_AverageEditedPagesPerUser(), 
		   source, 
		   new String[] {
			 "derivation", "user.countRevisions->sum() / user->size()"
		   });	
		addAnnotation
		  (getUser_WikiTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.Wikipedia.currentDateJD"
		   });	
		addAnnotation
		  (getUser_CountRevisions(), 
		   source, 
		   new String[] {
			 "derivation", "self.authoredRevisions->size()"
		   });	
		addAnnotation
		  (getUser_AuthoredRevisions(), 
		   source, 
		   new String[] {
			 "derivation", "Revision.allInstances()->select(author = self)"
		   });	
		addAnnotation
		  (registeredUserEClass, 
		   source, 
		   new String[] {
			 "timeIsCorrect", "wikiTime >= registrationDateJD"
		   });	
		addAnnotation
		  (getRegisteredUser_RegisteredSinceDays(), 
		   source, 
		   new String[] {
			 "derivation", "wikiTime - registrationDateJD"
		   });	
		addAnnotation
		  (getRegisteredUser_UserType(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.countRevisions < 1 or registeredSinceDays < 7) then userType::RegisteredUser\n\t\t\t\t\t\t\t\telse userType::AutoConfirmedUser\n\t\t\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getRegisteredUser_AdminAction(), 
		   source, 
		   new String[] {
			 "derivation", "if (self.oclIsKindOf(Administrator) or self.oclIsKindOf(SysOp)) then adminActions::CreateDeleteContent\n\t\t\t\t\t\t\t\t\telse (if self.userType = userType::AutoConfirmedUser then adminActions::CreateContent\n\t\t\t\t\t\t\t\t\t\telse (null)\n\t\t\t\t\t\t\t\t\t\tendif) endif"
		   });
	}

} //ModelPackageImpl
