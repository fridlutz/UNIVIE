/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://task2.a9902268.ase2015.swa.univie.ac.at/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Discussion Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DISCUSSION_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CURRENT_REVISION = 1;

	/**
	 * The feature id for the '<em><b>Version History Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VERSION_HISTORY_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__REVISION = 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Create New Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___CREATE_NEW_REVISION = 0;

	/**
	 * The operation id for the '<em>Add Discussion Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_DISCUSSION_ITEM = 1;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___RENDER_HTML = 2;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___RENDER = 3;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ArticleImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 1;

	/**
	 * The feature id for the '<em><b>Discussion Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DISCUSSION_PAGE = CONTENT__DISCUSSION_PAGE;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Version History Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__VERSION_HISTORY_PAGE = CONTENT__VERSION_HISTORY_PAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__REVISION = CONTENT__REVISION;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create New Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___CREATE_NEW_REVISION = CONTENT___CREATE_NEW_REVISION;

	/**
	 * The operation id for the '<em>Add Discussion Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___ADD_DISCUSSION_ITEM = CONTENT___ADD_DISCUSSION_ITEM;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___RENDER_HTML = CONTENT___RENDER_HTML;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___RENDER = CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MediaImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 2;

	/**
	 * The feature id for the '<em><b>Discussion Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DISCUSSION_PAGE = CONTENT__DISCUSSION_PAGE;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Version History Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__VERSION_HISTORY_PAGE = CONTENT__VERSION_HISTORY_PAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TITLE = CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__REVISION = CONTENT__REVISION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__USAGE = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__META = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create New Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___CREATE_NEW_REVISION = CONTENT___CREATE_NEW_REVISION;

	/**
	 * The operation id for the '<em>Add Discussion Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___ADD_DISCUSSION_ITEM = CONTENT___ADD_DISCUSSION_ITEM;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___RENDER_HTML = CONTENT___RENDER_HTML;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___RENDER = CONTENT___RENDER;

	/**
	 * The operation id for the '<em>Add Content To File Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___ADD_CONTENT_TO_FILE_USAGE = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___REMOVE_CONTENT = CONTENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get File Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___GET_FILE_USAGE = CONTENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___ADD_META_DATA = CONTENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___REMOVE_META_DATA = CONTENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Meta Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA___GET_META_DATA = CONTENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.InternalContentImpl <em>Internal Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.InternalContentImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getInternalContent()
	 * @generated
	 */
	int INTERNAL_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Discussion Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__DISCUSSION_PAGE = CONTENT__DISCUSSION_PAGE;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Version History Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__VERSION_HISTORY_PAGE = CONTENT__VERSION_HISTORY_PAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__TITLE = CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__REVISION = CONTENT__REVISION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__CONTENT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create New Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT___CREATE_NEW_REVISION = CONTENT___CREATE_NEW_REVISION;

	/**
	 * The operation id for the '<em>Add Discussion Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT___ADD_DISCUSSION_ITEM = CONTENT___ADD_DISCUSSION_ITEM;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT___RENDER_HTML = CONTENT___RENDER_HTML;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT___RENDER = CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>Internal Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 4;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_BLOCKED = 0;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_READER = 1;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_EDITOR = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RevisionImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl <em>Registered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getRegisteredUser()
	 * @generated
	 */
	int REGISTERED_USER = 6;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__IS_BLOCKED = USER__IS_BLOCKED;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__IS_READER = USER__IS_READER;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__IS_EDITOR = USER__IS_EDITOR;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USER_NAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__REGISTRATION_DATE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Edits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__NUMBER_OF_EDITS = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AutoConfirmedUserImpl <em>Auto Confirmed User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AutoConfirmedUserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getAutoConfirmedUser()
	 * @generated
	 */
	int AUTO_CONFIRMED_USER = 7;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__IS_BLOCKED = REGISTERED_USER__IS_BLOCKED;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__IS_READER = REGISTERED_USER__IS_READER;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__IS_EDITOR = REGISTERED_USER__IS_EDITOR;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__USER_NAME = REGISTERED_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__REGISTRATION_DATE = REGISTERED_USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Number Of Edits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__NUMBER_OF_EDITS = REGISTERED_USER__NUMBER_OF_EDITS;

	/**
	 * The feature id for the '<em><b>Auto Confirmed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE = REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Confirmed User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER_FEATURE_COUNT = REGISTERED_USER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Article</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___CREATE_ARTICLE = REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Move Article</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___MOVE_ARTICLE = REGISTERED_USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Upload Media</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___UPLOAD_MEDIA = REGISTERED_USER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Move Media</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___MOVE_MEDIA = REGISTERED_USER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Auto Confirmed User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER_OPERATION_COUNT = REGISTERED_USER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AdministratorImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 8;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__IS_BLOCKED = REGISTERED_USER__IS_BLOCKED;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__IS_READER = REGISTERED_USER__IS_READER;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__IS_EDITOR = REGISTERED_USER__IS_EDITOR;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__USER_NAME = REGISTERED_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__REGISTRATION_DATE = REGISTERED_USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Number Of Edits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__NUMBER_OF_EDITS = REGISTERED_USER__NUMBER_OF_EDITS;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Block User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___BLOCK_USER = REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___DELETE_CONTENT = REGISTERED_USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = REGISTERED_USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.SysOpImpl <em>Sys Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.SysOpImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getSysOp()
	 * @generated
	 */
	int SYS_OP = 9;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__IS_BLOCKED = REGISTERED_USER__IS_BLOCKED;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__IS_READER = REGISTERED_USER__IS_READER;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__IS_EDITOR = REGISTERED_USER__IS_EDITOR;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__USER_NAME = REGISTERED_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__REGISTRATION_DATE = REGISTERED_USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Number Of Edits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__NUMBER_OF_EDITS = REGISTERED_USER__NUMBER_OF_EDITS;

	/**
	 * The number of structural features of the '<em>Sys Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_FEATURE_COUNT = REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Make Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP___MAKE_ADMIN = REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP___REMOVE_ADMIN = REGISTERED_USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Block Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP___BLOCK_ADMIN = REGISTERED_USER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sys Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_OPERATION_COUNT = REGISTERED_USER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.DiscussionImpl <em>Discussion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.DiscussionImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getDiscussion()
	 * @generated
	 */
	int DISCUSSION = 10;

	/**
	 * The number of structural features of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___RENDER_HTML = 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION___ADD = 1;

	/**
	 * The number of operations of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.VersionHistoryImpl <em>Version History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.VersionHistoryImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getVersionHistory()
	 * @generated
	 */
	int VERSION_HISTORY = 11;

	/**
	 * The number of structural features of the '<em>Version History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY___RENDER_HTML = 0;

	/**
	 * The number of operations of the '<em>Version History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MetaDataImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiProjectImpl <em>Wiki Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiProjectImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getWikiProject()
	 * @generated
	 */
	int WIKI_PROJECT = 13;

	/**
	 * The feature id for the '<em><b>Discussion Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__DISCUSSION_PAGE = INTERNAL_CONTENT__DISCUSSION_PAGE;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__CURRENT_REVISION = INTERNAL_CONTENT__CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Version History Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__VERSION_HISTORY_PAGE = INTERNAL_CONTENT__VERSION_HISTORY_PAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__TITLE = INTERNAL_CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__REVISION = INTERNAL_CONTENT__REVISION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__CONTENT = INTERNAL_CONTENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__MEMBER = INTERNAL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wiki Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT_FEATURE_COUNT = INTERNAL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create New Revision</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT___CREATE_NEW_REVISION = INTERNAL_CONTENT___CREATE_NEW_REVISION;

	/**
	 * The operation id for the '<em>Add Discussion Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT___ADD_DISCUSSION_ITEM = INTERNAL_CONTENT___ADD_DISCUSSION_ITEM;

	/**
	 * The operation id for the '<em>Render HTML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT___RENDER_HTML = INTERNAL_CONTENT___RENDER_HTML;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT___RENDER = INTERNAL_CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>Wiki Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT_OPERATION_COUNT = INTERNAL_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UnregisteredUserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getUnregisteredUser()
	 * @generated
	 */
	int UNREGISTERED_USER = 14;

	/**
	 * The feature id for the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__IS_BLOCKED = USER__IS_BLOCKED;

	/**
	 * The feature id for the '<em><b>Is Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__IS_READER = USER__IS_READER;

	/**
	 * The feature id for the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__IS_EDITOR = USER__IS_EDITOR;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__IP_ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unregistered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unregistered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiPediaImpl <em>Wiki Pedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiPediaImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getWikiPedia()
	 * @generated
	 */
	int WIKI_PEDIA = 15;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PEDIA__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PEDIA__USER = 1;

	/**
	 * The number of structural features of the '<em>Wiki Pedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PEDIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wiki Pedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PEDIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 16;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 17;


	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getDiscussionPage <em>Discussion Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discussion Page</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getDiscussionPage()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_DiscussionPage();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getCurrentRevision <em>Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getCurrentRevision()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_CurrentRevision();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getVersionHistoryPage <em>Version History Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version History Page</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getVersionHistoryPage()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_VersionHistoryPage();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getTitle()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#getRevision()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Revision();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#createNewRevision() <em>Create New Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create New Revision</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#createNewRevision()
	 * @generated
	 */
	EOperation getContent__CreateNewRevision();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#addDiscussionItem() <em>Add Discussion Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discussion Item</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#addDiscussionItem()
	 * @generated
	 */
	EOperation getContent__AddDiscussionItem();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#renderHTML()
	 * @generated
	 */
	EOperation getContent__RenderHTML();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content#render()
	 * @generated
	 */
	EOperation getContent__Render();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getUsage()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Usage();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getMeta()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Meta();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#addContentToFileUsage() <em>Add Content To File Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Content To File Usage</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#addContentToFileUsage()
	 * @generated
	 */
	EOperation getMedia__AddContentToFileUsage();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#removeContent() <em>Remove Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Content</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#removeContent()
	 * @generated
	 */
	EOperation getMedia__RemoveContent();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getFileUsage() <em>Get File Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File Usage</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getFileUsage()
	 * @generated
	 */
	EOperation getMedia__GetFileUsage();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#addMetaData() <em>Add Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#addMetaData()
	 * @generated
	 */
	EOperation getMedia__AddMetaData();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#removeMetaData() <em>Remove Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#removeMetaData()
	 * @generated
	 */
	EOperation getMedia__RemoveMetaData();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getMetaData() <em>Get Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media#getMetaData()
	 * @generated
	 */
	EOperation getMedia__GetMetaData();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent <em>Internal Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent
	 * @generated
	 */
	EClass getInternalContent();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent#getContent()
	 * @see #getInternalContent()
	 * @generated
	 */
	EAttribute getInternalContent_Content();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsBlocked <em>Is Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blocked</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsBlocked()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsBlocked();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsReader <em>Is Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reader</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsReader()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsReader();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsEditor <em>Is Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editor</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.User#isIsEditor()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsEditor();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Revision#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Revision#getAuthor()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Author();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Revision#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Revision#getContent()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Content();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser
	 * @generated
	 */
	EClass getRegisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getUserName()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getRegistrationDate <em>Registration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Date</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getRegistrationDate()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_RegistrationDate();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getNumberOfEdits <em>Number Of Edits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Edits</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser#getNumberOfEdits()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_NumberOfEdits();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser <em>Auto Confirmed User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Confirmed User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser
	 * @generated
	 */
	EClass getAutoConfirmedUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#getAutoConfirmedDate <em>Auto Confirmed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Confirmed Date</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#getAutoConfirmedDate()
	 * @see #getAutoConfirmedUser()
	 * @generated
	 */
	EAttribute getAutoConfirmedUser_AutoConfirmedDate();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#createArticle() <em>Create Article</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Article</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#createArticle()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__CreateArticle();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#moveArticle() <em>Move Article</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Article</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#moveArticle()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__MoveArticle();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#uploadMedia() <em>Upload Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload Media</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#uploadMedia()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__UploadMedia();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#moveMedia() <em>Move Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Media</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.AutoConfirmedUser#moveMedia()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__MoveMedia();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator#blockUser() <em>Block User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Block User</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator#blockUser()
	 * @generated
	 */
	EOperation getAdministrator__BlockUser();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator#deleteContent() <em>Delete Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Content</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator#deleteContent()
	 * @generated
	 */
	EOperation getAdministrator__DeleteContent();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp <em>Sys Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Op</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp
	 * @generated
	 */
	EClass getSysOp();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#makeAdmin() <em>Make Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Admin</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#makeAdmin()
	 * @generated
	 */
	EOperation getSysOp__MakeAdmin();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#removeAdmin() <em>Remove Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Admin</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#removeAdmin()
	 * @generated
	 */
	EOperation getSysOp__RemoveAdmin();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#blockAdmin() <em>Block Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Block Admin</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp#blockAdmin()
	 * @generated
	 */
	EOperation getSysOp__BlockAdmin();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion
	 * @generated
	 */
	EClass getDiscussion();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion#renderHTML()
	 * @generated
	 */
	EOperation getDiscussion__RenderHTML();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion#add() <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion#add()
	 * @generated
	 */
	EOperation getDiscussion__Add();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory <em>Version History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version History</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory
	 * @generated
	 */
	EClass getVersionHistory();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory#renderHTML()
	 * @generated
	 */
	EOperation getVersionHistory__RenderHTML();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData#getKey()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Key();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject <em>Wiki Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Project</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject
	 * @generated
	 */
	EClass getWikiProject();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject#getMember()
	 * @see #getWikiProject()
	 * @generated
	 */
	EReference getWikiProject_Member();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unregistered User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser
	 * @generated
	 */
	EClass getUnregisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser#getIPAddress()
	 * @see #getUnregisteredUser()
	 * @generated
	 */
	EAttribute getUnregisteredUser_IPAddress();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia <em>Wiki Pedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Pedia</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia
	 * @generated
	 */
	EClass getWikiPedia();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getContent()
	 * @see #getWikiPedia()
	 * @generated
	 */
	EReference getWikiPedia_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiPedia#getUser()
	 * @see #getWikiPedia()
	 * @generated
	 */
	EReference getWikiPedia_User();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ContentImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Discussion Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DISCUSSION_PAGE = eINSTANCE.getContent_DiscussionPage();

		/**
		 * The meta object literal for the '<em><b>Current Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CURRENT_REVISION = eINSTANCE.getContent_CurrentRevision();

		/**
		 * The meta object literal for the '<em><b>Version History Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__VERSION_HISTORY_PAGE = eINSTANCE.getContent_VersionHistoryPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TITLE = eINSTANCE.getContent_Title();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__REVISION = eINSTANCE.getContent_Revision();

		/**
		 * The meta object literal for the '<em><b>Create New Revision</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___CREATE_NEW_REVISION = eINSTANCE.getContent__CreateNewRevision();

		/**
		 * The meta object literal for the '<em><b>Add Discussion Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___ADD_DISCUSSION_ITEM = eINSTANCE.getContent__AddDiscussionItem();

		/**
		 * The meta object literal for the '<em><b>Render HTML</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___RENDER_HTML = eINSTANCE.getContent__RenderHTML();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___RENDER = eINSTANCE.getContent__Render();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ArticleImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MediaImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__USAGE = eINSTANCE.getMedia_Usage();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__META = eINSTANCE.getMedia_Meta();

		/**
		 * The meta object literal for the '<em><b>Add Content To File Usage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___ADD_CONTENT_TO_FILE_USAGE = eINSTANCE.getMedia__AddContentToFileUsage();

		/**
		 * The meta object literal for the '<em><b>Remove Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___REMOVE_CONTENT = eINSTANCE.getMedia__RemoveContent();

		/**
		 * The meta object literal for the '<em><b>Get File Usage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___GET_FILE_USAGE = eINSTANCE.getMedia__GetFileUsage();

		/**
		 * The meta object literal for the '<em><b>Add Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___ADD_META_DATA = eINSTANCE.getMedia__AddMetaData();

		/**
		 * The meta object literal for the '<em><b>Remove Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___REMOVE_META_DATA = eINSTANCE.getMedia__RemoveMetaData();

		/**
		 * The meta object literal for the '<em><b>Get Meta Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIA___GET_META_DATA = eINSTANCE.getMedia__GetMetaData();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.InternalContentImpl <em>Internal Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.InternalContentImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getInternalContent()
		 * @generated
		 */
		EClass INTERNAL_CONTENT = eINSTANCE.getInternalContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_CONTENT__CONTENT = eINSTANCE.getInternalContent_Content();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Is Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IS_BLOCKED = eINSTANCE.getUser_IsBlocked();

		/**
		 * The meta object literal for the '<em><b>Is Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IS_READER = eINSTANCE.getUser_IsReader();

		/**
		 * The meta object literal for the '<em><b>Is Editor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IS_EDITOR = eINSTANCE.getUser_IsEditor();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RevisionImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__AUTHOR = eINSTANCE.getRevision_Author();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__CONTENT = eINSTANCE.getRevision_Content();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl <em>Registered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.RegisteredUserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getRegisteredUser()
		 * @generated
		 */
		EClass REGISTERED_USER = eINSTANCE.getRegisteredUser();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__USER_NAME = eINSTANCE.getRegisteredUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Registration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__REGISTRATION_DATE = eINSTANCE.getRegisteredUser_RegistrationDate();

		/**
		 * The meta object literal for the '<em><b>Number Of Edits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__NUMBER_OF_EDITS = eINSTANCE.getRegisteredUser_NumberOfEdits();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AutoConfirmedUserImpl <em>Auto Confirmed User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AutoConfirmedUserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getAutoConfirmedUser()
		 * @generated
		 */
		EClass AUTO_CONFIRMED_USER = eINSTANCE.getAutoConfirmedUser();

		/**
		 * The meta object literal for the '<em><b>Auto Confirmed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_CONFIRMED_USER__AUTO_CONFIRMED_DATE = eINSTANCE.getAutoConfirmedUser_AutoConfirmedDate();

		/**
		 * The meta object literal for the '<em><b>Create Article</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___CREATE_ARTICLE = eINSTANCE.getAutoConfirmedUser__CreateArticle();

		/**
		 * The meta object literal for the '<em><b>Move Article</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___MOVE_ARTICLE = eINSTANCE.getAutoConfirmedUser__MoveArticle();

		/**
		 * The meta object literal for the '<em><b>Upload Media</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___UPLOAD_MEDIA = eINSTANCE.getAutoConfirmedUser__UploadMedia();

		/**
		 * The meta object literal for the '<em><b>Move Media</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___MOVE_MEDIA = eINSTANCE.getAutoConfirmedUser__MoveMedia();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.AdministratorImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Block User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___BLOCK_USER = eINSTANCE.getAdministrator__BlockUser();

		/**
		 * The meta object literal for the '<em><b>Delete Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___DELETE_CONTENT = eINSTANCE.getAdministrator__DeleteContent();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.SysOpImpl <em>Sys Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.SysOpImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getSysOp()
		 * @generated
		 */
		EClass SYS_OP = eINSTANCE.getSysOp();

		/**
		 * The meta object literal for the '<em><b>Make Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_OP___MAKE_ADMIN = eINSTANCE.getSysOp__MakeAdmin();

		/**
		 * The meta object literal for the '<em><b>Remove Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_OP___REMOVE_ADMIN = eINSTANCE.getSysOp__RemoveAdmin();

		/**
		 * The meta object literal for the '<em><b>Block Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYS_OP___BLOCK_ADMIN = eINSTANCE.getSysOp__BlockAdmin();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.DiscussionImpl <em>Discussion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.DiscussionImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getDiscussion()
		 * @generated
		 */
		EClass DISCUSSION = eINSTANCE.getDiscussion();

		/**
		 * The meta object literal for the '<em><b>Render HTML</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___RENDER_HTML = eINSTANCE.getDiscussion__RenderHTML();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCUSSION___ADD = eINSTANCE.getDiscussion__Add();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.VersionHistoryImpl <em>Version History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.VersionHistoryImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getVersionHistory()
		 * @generated
		 */
		EClass VERSION_HISTORY = eINSTANCE.getVersionHistory();

		/**
		 * The meta object literal for the '<em><b>Render HTML</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_HISTORY___RENDER_HTML = eINSTANCE.getVersionHistory__RenderHTML();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.MetaDataImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__KEY = eINSTANCE.getMetaData_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__VALUE = eINSTANCE.getMetaData_Value();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiProjectImpl <em>Wiki Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiProjectImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getWikiProject()
		 * @generated
		 */
		EClass WIKI_PROJECT = eINSTANCE.getWikiProject();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PROJECT__MEMBER = eINSTANCE.getWikiProject_Member();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.UnregisteredUserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getUnregisteredUser()
		 * @generated
		 */
		EClass UNREGISTERED_USER = eINSTANCE.getUnregisteredUser();

		/**
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNREGISTERED_USER__IP_ADDRESS = eINSTANCE.getUnregisteredUser_IPAddress();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiPediaImpl <em>Wiki Pedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.WikiPediaImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getWikiPedia()
		 * @generated
		 */
		EClass WIKI_PEDIA = eINSTANCE.getWikiPedia();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PEDIA__CONTENT = eINSTANCE.getWikiPedia_Content();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PEDIA__USER = eINSTANCE.getWikiPedia_User();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.impl.ModelPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //ModelPackage
