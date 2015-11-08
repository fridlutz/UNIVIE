/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Article;
import at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion;
import at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Media;
import at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData;
import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.model.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp;
import at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.model.User;
import at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory;
import at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia;
import at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass revisionEClass = null;

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
	private EClass autoConfirmedUserEClass = null;

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
	private EClass wikiPediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

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
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#eNS_URI
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
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_DiscussionPage() {
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_CurrentRevision() {
		return (EReference)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_VersionHistoryPage() {
		return (EReference)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Title() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Revision() {
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
	public EAttribute getRegisteredUser_RegistrationDate() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_NumberOfEdits() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoConfirmedUser() {
		return autoConfirmedUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoConfirmedUser_AutoConfirmedDate() {
		return (EAttribute)autoConfirmedUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__CreateArticle() {
		return autoConfirmedUserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__MoveArticle() {
		return autoConfirmedUserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__UploadMedia() {
		return autoConfirmedUserEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__MoveMedia() {
		return autoConfirmedUserEClass.getEOperations().get(3);
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
	public EOperation getAdministrator__BlockUser() {
		return administratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministrator__DeleteContent() {
		return administratorEClass.getEOperations().get(1);
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
	public EOperation getSysOp__MakeAdmin() {
		return sysOpEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSysOp__RemoveAdmin() {
		return sysOpEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSysOp__BlockAdmin() {
		return sysOpEClass.getEOperations().get(2);
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
	public EClass getWikiPedia() {
		return wikiPediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWikiPedia_Content() {
		return (EReference)wikiPediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWikiPedia_User() {
		return (EReference)wikiPediaEClass.getEStructuralFeatures().get(1);
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
	public EDataType getDate() {
		return dateEDataType;
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
		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__DISCUSSION_PAGE);
		createEReference(contentEClass, CONTENT__CURRENT_REVISION);
		createEReference(contentEClass, CONTENT__VERSION_HISTORY_PAGE);
		createEAttribute(contentEClass, CONTENT__TITLE);
		createEReference(contentEClass, CONTENT__REVISION);
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

		revisionEClass = createEClass(REVISION);
		createEReference(revisionEClass, REVISION__AUTHOR);
		createEAttribute(revisionEClass, REVISION__CONTENT);

		registeredUserEClass = createEClass(REGISTERED_USER);
		createEAttribute(registeredUserEClass, REGISTERED_USER__USER_NAME);
		createEAttribute(registeredUserEClass, REGISTERED_USER__REGISTRATION_DATE);
		createEAttribute(registeredUserEClass, REGISTERED_USER__NUMBER_OF_EDITS);

		autoConfirmedUserEClass = createEClass(AUTO_CONFIRMED_USER);
		createEAttribute(autoConfirmedUserEClass, AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___CREATE_ARTICLE);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___MOVE_ARTICLE);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___UPLOAD_MEDIA);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___MOVE_MEDIA);

		administratorEClass = createEClass(ADMINISTRATOR);
		createEOperation(administratorEClass, ADMINISTRATOR___BLOCK_USER);
		createEOperation(administratorEClass, ADMINISTRATOR___DELETE_CONTENT);

		sysOpEClass = createEClass(SYS_OP);
		createEOperation(sysOpEClass, SYS_OP___MAKE_ADMIN);
		createEOperation(sysOpEClass, SYS_OP___REMOVE_ADMIN);
		createEOperation(sysOpEClass, SYS_OP___BLOCK_ADMIN);

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

		wikiPediaEClass = createEClass(WIKI_PEDIA);
		createEReference(wikiPediaEClass, WIKI_PEDIA__CONTENT);
		createEReference(wikiPediaEClass, WIKI_PEDIA__USER);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
		dateEDataType = createEDataType(DATE);
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
		autoConfirmedUserEClass.getESuperTypes().add(this.getRegisteredUser());
		administratorEClass.getESuperTypes().add(this.getRegisteredUser());
		sysOpEClass.getESuperTypes().add(this.getRegisteredUser());
		wikiProjectEClass.getESuperTypes().add(this.getInternalContent());
		unregisteredUserEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_DiscussionPage(), this.getDiscussion(), null, "discussionPage", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_CurrentRevision(), this.getRevision(), null, "currentRevision", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_VersionHistoryPage(), this.getVersionHistory(), null, "versionHistoryPage", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Title(), ecorePackage.getEString(), "title", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Revision(), this.getRevision(), null, "revision", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevision_Author(), this.getUser(), null, "author", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Content(), theXMLTypePackage.getAnySimpleType(), "content", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registeredUserEClass, RegisteredUser.class, "RegisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisteredUser_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_RegistrationDate(), this.getDate(), "registrationDate", null, 0, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_NumberOfEdits(), theXMLTypePackage.getInt(), "numberOfEdits", "0", 0, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoConfirmedUserEClass, AutoConfirmedUser.class, "AutoConfirmedUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoConfirmedUser_AutoConfirmedDate(), this.getDate(), "autoConfirmedDate", null, 0, 1, AutoConfirmedUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAutoConfirmedUser__CreateArticle(), null, "createArticle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutoConfirmedUser__MoveArticle(), null, "moveArticle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutoConfirmedUser__UploadMedia(), null, "uploadMedia", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutoConfirmedUser__MoveMedia(), null, "moveMedia", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAdministrator__BlockUser(), null, "blockUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdministrator__DeleteContent(), null, "deleteContent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sysOpEClass, SysOp.class, "SysOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSysOp__MakeAdmin(), null, "makeAdmin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSysOp__RemoveAdmin(), null, "removeAdmin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSysOp__BlockAdmin(), null, "blockAdmin", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(wikiPediaEClass, WikiPedia.class, "WikiPedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWikiPedia_Content(), this.getContent(), null, "content", null, 0, -1, WikiPedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWikiPedia_User(), this.getUser(), null, "user", null, 0, -1, WikiPedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
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

} //ModelPackageImpl
