/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Wikipedia";

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
	String eNS_PREFIX = "wikipedia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl <em>Wikipedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getWikipedia()
	 * @generated
	 */
	int WIKIPEDIA = 0;

	/**
	 * The feature id for the '<em><b>Current Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA__CURRENT_DATE_JD = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA__USER = 2;

	/**
	 * The feature id for the '<em><b>Average Edited Pages Per User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER = 3;

	/**
	 * The number of structural features of the '<em>Wikipedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Wikipedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKIPEDIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CURRENT_REVISION = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VERSIONHISTORY = 3;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DISCUSSION = 4;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ArticleImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 2;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

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
	 * The feature id for the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__VERSIONHISTORY = CONTENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DISCUSSION = CONTENT__DISCUSSION;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MediaImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 3;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

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
	 * The feature id for the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__VERSIONHISTORY = CONTENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DISCUSSION = CONTENT__DISCUSSION;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.InternalContentImpl <em>Internal Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.InternalContentImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getInternalContent()
	 * @generated
	 */
	int INTERNAL_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__CURRENT_REVISION = CONTENT__CURRENT_REVISION;

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
	 * The feature id for the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__VERSIONHISTORY = CONTENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTENT__DISCUSSION = CONTENT__DISCUSSION;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

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
	 * The feature id for the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WIKI_TIME = 3;

	/**
	 * The feature id for the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COUNT_REVISIONS = 4;

	/**
	 * The feature id for the '<em><b>Authored Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AUTHORED_REVISIONS = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RegisteredUserImpl <em>Registered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RegisteredUserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getRegisteredUser()
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
	 * The feature id for the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__WIKI_TIME = USER__WIKI_TIME;

	/**
	 * The feature id for the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__COUNT_REVISIONS = USER__COUNT_REVISIONS;

	/**
	 * The feature id for the '<em><b>Authored Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__AUTHORED_REVISIONS = USER__AUTHORED_REVISIONS;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USER_NAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registration Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__REGISTRATION_DATE_JD = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registered Since Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__REGISTERED_SINCE_DAYS = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USER_TYPE = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Admin Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__ADMIN_ACTION = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RevisionImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 7;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.DiscussionImpl <em>Discussion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.DiscussionImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getDiscussion()
	 * @generated
	 */
	int DISCUSSION = 8;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.VersionHistoryImpl <em>Version History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.VersionHistoryImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getVersionHistory()
	 * @generated
	 */
	int VERSION_HISTORY = 9;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MetaDataImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 10;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikiProjectImpl <em>Wiki Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikiProjectImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getWikiProject()
	 * @generated
	 */
	int WIKI_PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__CURRENT_REVISION = INTERNAL_CONTENT__CURRENT_REVISION;

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
	 * The feature id for the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__VERSIONHISTORY = INTERNAL_CONTENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PROJECT__DISCUSSION = INTERNAL_CONTENT__DISCUSSION;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UnregisteredUserImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getUnregisteredUser()
	 * @generated
	 */
	int UNREGISTERED_USER = 12;

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
	 * The feature id for the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__WIKI_TIME = USER__WIKI_TIME;

	/**
	 * The feature id for the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__COUNT_REVISIONS = USER__COUNT_REVISIONS;

	/**
	 * The feature id for the '<em><b>Authored Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__AUTHORED_REVISIONS = USER__AUTHORED_REVISIONS;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.AdministratorImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 13;

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
	 * The feature id for the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__WIKI_TIME = REGISTERED_USER__WIKI_TIME;

	/**
	 * The feature id for the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__COUNT_REVISIONS = REGISTERED_USER__COUNT_REVISIONS;

	/**
	 * The feature id for the '<em><b>Authored Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__AUTHORED_REVISIONS = REGISTERED_USER__AUTHORED_REVISIONS;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__USER_NAME = REGISTERED_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Registration Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__REGISTRATION_DATE_JD = REGISTERED_USER__REGISTRATION_DATE_JD;

	/**
	 * The feature id for the '<em><b>Registered Since Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__REGISTERED_SINCE_DAYS = REGISTERED_USER__REGISTERED_SINCE_DAYS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__USER_TYPE = REGISTERED_USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Admin Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__ADMIN_ACTION = REGISTERED_USER__ADMIN_ACTION;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.SysOpImpl <em>Sys Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.SysOpImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getSysOp()
	 * @generated
	 */
	int SYS_OP = 14;

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
	 * The feature id for the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__WIKI_TIME = REGISTERED_USER__WIKI_TIME;

	/**
	 * The feature id for the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__COUNT_REVISIONS = REGISTERED_USER__COUNT_REVISIONS;

	/**
	 * The feature id for the '<em><b>Authored Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__AUTHORED_REVISIONS = REGISTERED_USER__AUTHORED_REVISIONS;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__USER_NAME = REGISTERED_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Registration Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__REGISTRATION_DATE_JD = REGISTERED_USER__REGISTRATION_DATE_JD;

	/**
	 * The feature id for the '<em><b>Registered Since Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__REGISTERED_SINCE_DAYS = REGISTERED_USER__REGISTERED_SINCE_DAYS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__USER_TYPE = REGISTERED_USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Admin Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP__ADMIN_ACTION = REGISTERED_USER__ADMIN_ACTION;

	/**
	 * The number of structural features of the '<em>Sys Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_FEATURE_COUNT = REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sys Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_OPERATION_COUNT = REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType <em>user Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getuserType()
	 * @generated
	 */
	int USER_TYPE = 15;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions <em>admin Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getadminActions()
	 * @generated
	 */
	int ADMIN_ACTIONS = 16;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 17;


	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia <em>Wikipedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wikipedia</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia
	 * @generated
	 */
	EClass getWikipedia();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getCurrentDateJD <em>Current Date JD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Date JD</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getCurrentDateJD()
	 * @see #getWikipedia()
	 * @generated
	 */
	EAttribute getWikipedia_CurrentDateJD();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getContent()
	 * @see #getWikipedia()
	 * @generated
	 */
	EReference getWikipedia_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getUser()
	 * @see #getWikipedia()
	 * @generated
	 */
	EReference getWikipedia_User();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getAverageEditedPagesPerUser <em>Average Edited Pages Per User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Edited Pages Per User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getAverageEditedPagesPerUser()
	 * @see #getWikipedia()
	 * @generated
	 */
	EAttribute getWikipedia_AverageEditedPagesPerUser();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getCurrentRevision <em>Current Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getCurrentRevision()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_CurrentRevision();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getTitle()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getRevision()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getVersionhistory <em>Versionhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versionhistory</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getVersionhistory()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Versionhistory();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getDiscussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discussion</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getDiscussion()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Discussion();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#createNewRevision() <em>Create New Revision</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create New Revision</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#createNewRevision()
	 * @generated
	 */
	EOperation getContent__CreateNewRevision();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#addDiscussionItem() <em>Add Discussion Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discussion Item</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#addDiscussionItem()
	 * @generated
	 */
	EOperation getContent__AddDiscussionItem();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#renderHTML()
	 * @generated
	 */
	EOperation getContent__RenderHTML();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#render()
	 * @generated
	 */
	EOperation getContent__Render();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getUsage()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Usage();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getMeta()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Meta();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#addContentToFileUsage() <em>Add Content To File Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Content To File Usage</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#addContentToFileUsage()
	 * @generated
	 */
	EOperation getMedia__AddContentToFileUsage();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#removeContent() <em>Remove Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Content</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#removeContent()
	 * @generated
	 */
	EOperation getMedia__RemoveContent();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getFileUsage() <em>Get File Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File Usage</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getFileUsage()
	 * @generated
	 */
	EOperation getMedia__GetFileUsage();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#addMetaData() <em>Add Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#addMetaData()
	 * @generated
	 */
	EOperation getMedia__AddMetaData();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#removeMetaData() <em>Remove Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#removeMetaData()
	 * @generated
	 */
	EOperation getMedia__RemoveMetaData();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getMetaData() <em>Get Meta Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Meta Data</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media#getMetaData()
	 * @generated
	 */
	EOperation getMedia__GetMetaData();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent <em>Internal Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent
	 * @generated
	 */
	EClass getInternalContent();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent#getContent()
	 * @see #getInternalContent()
	 * @generated
	 */
	EAttribute getInternalContent_Content();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsBlocked <em>Is Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blocked</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsBlocked()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsBlocked();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsReader <em>Is Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reader</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsReader()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsReader();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsEditor <em>Is Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editor</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsEditor()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsEditor();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getWikiTime <em>Wiki Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiki Time</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getWikiTime()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_WikiTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getCountRevisions <em>Count Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Revisions</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getCountRevisions()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_CountRevisions();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getAuthoredRevisions <em>Authored Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authored Revisions</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getAuthoredRevisions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_AuthoredRevisions();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser
	 * @generated
	 */
	EClass getRegisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserName()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegistrationDateJD <em>Registration Date JD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Date JD</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegistrationDateJD()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_RegistrationDateJD();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegisteredSinceDays <em>Registered Since Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered Since Days</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getRegisteredSinceDays()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_RegisteredSinceDays();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getUserType()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_UserType();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getAdminAction <em>Admin Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Action</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser#getAdminAction()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_AdminAction();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision#getAuthor()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Author();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision#getContent()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Content();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion
	 * @generated
	 */
	EClass getDiscussion();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion#renderHTML()
	 * @generated
	 */
	EOperation getDiscussion__RenderHTML();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion#add() <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion#add()
	 * @generated
	 */
	EOperation getDiscussion__Add();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory <em>Version History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version History</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory
	 * @generated
	 */
	EClass getVersionHistory();

	/**
	 * Returns the meta object for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory#renderHTML() <em>Render HTML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render HTML</em>' operation.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory#renderHTML()
	 * @generated
	 */
	EOperation getVersionHistory__RenderHTML();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData#getKey()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Key();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject <em>Wiki Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Project</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject
	 * @generated
	 */
	EClass getWikiProject();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject#getMember()
	 * @see #getWikiProject()
	 * @generated
	 */
	EReference getWikiProject_Member();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unregistered User</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser
	 * @generated
	 */
	EClass getUnregisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser#getIPAddress()
	 * @see #getUnregisteredUser()
	 * @generated
	 */
	EAttribute getUnregisteredUser_IPAddress();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp <em>Sys Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Op</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp
	 * @generated
	 */
	EClass getSysOp();

	/**
	 * Returns the meta object for enum '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType <em>user Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>user Type</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType
	 * @generated
	 */
	EEnum getuserType();

	/**
	 * Returns the meta object for enum '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions <em>admin Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>admin Actions</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions
	 * @generated
	 */
	EEnum getadminActions();

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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl <em>Wikipedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikipediaImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getWikipedia()
		 * @generated
		 */
		EClass WIKIPEDIA = eINSTANCE.getWikipedia();

		/**
		 * The meta object literal for the '<em><b>Current Date JD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKIPEDIA__CURRENT_DATE_JD = eINSTANCE.getWikipedia_CurrentDateJD();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKIPEDIA__CONTENT = eINSTANCE.getWikipedia_Content();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKIPEDIA__USER = eINSTANCE.getWikipedia_User();

		/**
		 * The meta object literal for the '<em><b>Average Edited Pages Per User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKIPEDIA__AVERAGE_EDITED_PAGES_PER_USER = eINSTANCE.getWikipedia_AverageEditedPagesPerUser();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ContentImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Current Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CURRENT_REVISION = eINSTANCE.getContent_CurrentRevision();

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
		 * The meta object literal for the '<em><b>Versionhistory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__VERSIONHISTORY = eINSTANCE.getContent_Versionhistory();

		/**
		 * The meta object literal for the '<em><b>Discussion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DISCUSSION = eINSTANCE.getContent_Discussion();

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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ArticleImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MediaImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getMedia()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.InternalContentImpl <em>Internal Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.InternalContentImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getInternalContent()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getUser()
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
		 * The meta object literal for the '<em><b>Wiki Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WIKI_TIME = eINSTANCE.getUser_WikiTime();

		/**
		 * The meta object literal for the '<em><b>Count Revisions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COUNT_REVISIONS = eINSTANCE.getUser_CountRevisions();

		/**
		 * The meta object literal for the '<em><b>Authored Revisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__AUTHORED_REVISIONS = eINSTANCE.getUser_AuthoredRevisions();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RegisteredUserImpl <em>Registered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RegisteredUserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getRegisteredUser()
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
		 * The meta object literal for the '<em><b>Registration Date JD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__REGISTRATION_DATE_JD = eINSTANCE.getRegisteredUser_RegistrationDateJD();

		/**
		 * The meta object literal for the '<em><b>Registered Since Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__REGISTERED_SINCE_DAYS = eINSTANCE.getRegisteredUser_RegisteredSinceDays();

		/**
		 * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__USER_TYPE = eINSTANCE.getRegisteredUser_UserType();

		/**
		 * The meta object literal for the '<em><b>Admin Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__ADMIN_ACTION = eINSTANCE.getRegisteredUser_AdminAction();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.RevisionImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getRevision()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.DiscussionImpl <em>Discussion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.DiscussionImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getDiscussion()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.VersionHistoryImpl <em>Version History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.VersionHistoryImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getVersionHistory()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.MetaDataImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getMetaData()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikiProjectImpl <em>Wiki Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.WikiProjectImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getWikiProject()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.UnregisteredUserImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getUnregisteredUser()
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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.AdministratorImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.SysOpImpl <em>Sys Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.SysOpImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getSysOp()
		 * @generated
		 */
		EClass SYS_OP = eINSTANCE.getSysOp();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType <em>user Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.userType
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getuserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getuserType();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions <em>admin Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.adminActions
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getadminActions()
		 * @generated
		 */
		EEnum ADMIN_ACTIONS = eINSTANCE.getadminActions();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.impl.ModelPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //ModelPackage
