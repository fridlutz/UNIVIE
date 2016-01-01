/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WikiSampleSolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wikiSampleSolution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:swa.univie.ac.at:ase15:task2:wiki";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wiki";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WikiSampleSolutionPackage eINSTANCE = wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl <em>Wiki</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getWiki()
	 * @generated
	 */
	int WIKI = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Privilegs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__PRIVILEGS = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__USERS = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__MODE = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__ROLE = 5;

	/**
	 * The feature id for the '<em><b>History</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__HISTORY = 6;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__VERSIONS = 7;

	/**
	 * The number of structural features of the '<em>Wiki</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Wiki</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ContentImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 1;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DISCUSSIONPAGE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__EDITOR = 3;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TTILE = 4;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_MARKUP = 5;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ArticleImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 2;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__HISTORY = CONTENT__HISTORY;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__GROUP = CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__EDITOR = CONTENT__EDITOR;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TTILE = CONTENT__TTILE;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CONTENT_MARKUP = CONTENT__CONTENT_MARKUP;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.MediaImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 3;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__HISTORY = CONTENT__HISTORY;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__GROUP = CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__EDITOR = CONTENT__EDITOR;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TTILE = CONTENT__TTILE;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CONTENT_MARKUP = CONTENT__CONTENT_MARKUP;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ProjectPageImpl <em>Project Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ProjectPageImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getProjectPage()
	 * @generated
	 */
	int PROJECT_PAGE = 4;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__HISTORY = CONTENT__HISTORY;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__GROUP = CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__EDITOR = CONTENT__EDITOR;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__TTILE = CONTENT__TTILE;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__CONTENT_MARKUP = CONTENT__CONTENT_MARKUP;

	/**
	 * The number of structural features of the '<em>Project Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.DiscussionPageImpl <em>Discussion Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.DiscussionPageImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getDiscussionPage()
	 * @generated
	 */
	int DISCUSSION_PAGE = 5;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__HISTORY = CONTENT__HISTORY;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__GROUP = CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__EDITOR = CONTENT__EDITOR;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__TTILE = CONTENT__TTILE;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE__CONTENT_MARKUP = CONTENT__CONTENT_MARKUP;

	/**
	 * The number of structural features of the '<em>Discussion Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discussion Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.VersionImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 6;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Edited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__EDITED_BY = 2;

	/**
	 * The feature id for the '<em><b>Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DIFF = 3;

	/**
	 * The feature id for the '<em><b>Commit Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COMMIT_MSG = 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.HistoryImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 7;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__VERSIONS = 0;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.UserImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getUser()
	 * @generated
	 */
	int USER = 8;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODE = 1;

	/**
	 * The feature id for the '<em><b>Registration Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REGISTRATION_TIMESTAMP = 2;

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
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.Subscribable <em>Subscribable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.Subscribable
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getSubscribable()
	 * @generated
	 */
	int SUBSCRIBABLE = 16;

	/**
	 * The number of structural features of the '<em>Subscribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Subscribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.GroupImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 9;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAMESPACE = SUBSCRIBABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = SUBSCRIBABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = SUBSCRIBABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ModeImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 10;

	/**
	 * The feature id for the '<em><b>Available Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__AVAILABLE_ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ActionImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EXECUTE__CONTENT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.PrivilegImpl <em>Privileg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.PrivilegImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getPrivileg()
	 * @generated
	 */
	int PRIVILEG = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEG__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEG__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEG__NAME = 2;

	/**
	 * The number of structural features of the '<em>Privileg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Privileg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.RegisteredUserImpl <em>Registered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.RegisteredUserImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRegisteredUser()
	 * @generated
	 */
	int REGISTERED_USER = 13;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__ROLE = USER__ROLE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__MODE = USER__MODE;

	/**
	 * The feature id for the '<em><b>Registration Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__REGISTRATION_TIMESTAMP = USER__REGISTRATION_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__PROFILE = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__SUBSCRIPTIONS = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USERNAME = USER_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.UnregisteredUserImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getUnregisteredUser()
	 * @generated
	 */
	int UNREGISTERED_USER = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__ROLE = USER__ROLE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__MODE = USER__MODE;

	/**
	 * The feature id for the '<em><b>Registration Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__REGISTRATION_TIMESTAMP = USER__REGISTRATION_TIMESTAMP;

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
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.ProfileImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 15;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__HISTORY = CONTENT__HISTORY;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__GROUP = CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__EDITOR = CONTENT__EDITOR;

	/**
	 * The feature id for the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__TTILE = CONTENT__TTILE;

	/**
	 * The feature id for the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__CONTENT_MARKUP = CONTENT__CONTENT_MARKUP;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.impl.RoleImpl
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 17;

	/**
	 * The feature id for the '<em><b>Privileg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PRIVILEG = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikiSampleSolution.wikiSampleSolution.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikiSampleSolution.wikiSampleSolution.RoleType
	 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Wiki <em>Wiki</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki
	 * @generated
	 */
	EClass getWiki();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getContent()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getPrivilegs <em>Privilegs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Privilegs</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getPrivilegs()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Privilegs();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getGroups()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getUsers()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getMode()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Mode();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getRole()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Role();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>History</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getHistory()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_History();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.Wiki#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Wiki#getVersions()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Versions();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference '{@link wikiSampleSolution.wikiSampleSolution.Content#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getHistory()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_History();

	/**
	 * Returns the meta object for the containment reference '{@link wikiSampleSolution.wikiSampleSolution.Content#getDiscussionpage <em>Discussionpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discussionpage</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getDiscussionpage()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Discussionpage();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.Content#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Group</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getGroup()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Group();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.Content#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editor</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getEditor()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Editor();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Content#getTtile <em>Ttile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ttile</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getTtile()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Ttile();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Content#getContentMarkup <em>Content Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Markup</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Content#getContentMarkup()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentMarkup();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.ProjectPage <em>Project Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Page</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.ProjectPage
	 * @generated
	 */
	EClass getProjectPage();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.DiscussionPage <em>Discussion Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion Page</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.DiscussionPage
	 * @generated
	 */
	EClass getDiscussionPage();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.Version#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version#getPrevious()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Previous();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Version#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version#getTimestamp()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.Version#getEditedBy <em>Edited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edited By</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version#getEditedBy()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_EditedBy();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Version#getDiff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version#getDiff()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Diff();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Version#getCommitMsg <em>Commit Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Msg</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Version#getCommitMsg()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_CommitMsg();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.History#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.History#getVersions()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Versions();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Role();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.User#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.User#getMode()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Mode();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.User#getRegistrationTimestamp <em>Registration Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Timestamp</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.User#getRegistrationTimestamp()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_RegistrationTimestamp();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Group#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Group#getNamespace()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Namespace();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.Mode#getAvailableActions <em>Available Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Actions</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Mode#getAvailableActions()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_AvailableActions();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.Mode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Mode#getParent()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the '{@link wikiSampleSolution.wikiSampleSolution.Action#execute(wikiSampleSolution.wikiSampleSolution.Content) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see wikiSampleSolution.wikiSampleSolution.Action#execute(wikiSampleSolution.wikiSampleSolution.Content)
	 * @generated
	 */
	EOperation getAction__Execute__Content();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Privileg <em>Privileg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privileg</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Privileg
	 * @generated
	 */
	EClass getPrivileg();

	/**
	 * Returns the meta object for the reference '{@link wikiSampleSolution.wikiSampleSolution.Privileg#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Privileg#getParent()
	 * @see #getPrivileg()
	 * @generated
	 */
	EReference getPrivileg_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link wikiSampleSolution.wikiSampleSolution.Privileg#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Privileg#getAction()
	 * @see #getPrivileg()
	 * @generated
	 */
	EReference getPrivileg_Action();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Privileg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Privileg#getName()
	 * @see #getPrivileg()
	 * @generated
	 */
	EAttribute getPrivileg_Name();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered User</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.RegisteredUser
	 * @generated
	 */
	EClass getRegisteredUser();

	/**
	 * Returns the meta object for the containment reference '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.RegisteredUser#getProfile()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Profile();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getSubscriptions <em>Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscriptions</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.RegisteredUser#getSubscriptions()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Subscriptions();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.RegisteredUser#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.RegisteredUser#getUsername()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_Username();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unregistered User</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.UnregisteredUser
	 * @generated
	 */
	EClass getUnregisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.UnregisteredUser#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.UnregisteredUser#getIPAddress()
	 * @see #getUnregisteredUser()
	 * @generated
	 */
	EAttribute getUnregisteredUser_IPAddress();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Subscribable <em>Subscribable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribable</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Subscribable
	 * @generated
	 */
	EClass getSubscribable();

	/**
	 * Returns the meta object for class '{@link wikiSampleSolution.wikiSampleSolution.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link wikiSampleSolution.wikiSampleSolution.Role#getPrivileg <em>Privileg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Privileg</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Role#getPrivileg()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Privileg();

	/**
	 * Returns the meta object for the attribute '{@link wikiSampleSolution.wikiSampleSolution.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for enum '{@link wikiSampleSolution.wikiSampleSolution.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see wikiSampleSolution.wikiSampleSolution.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WikiSampleSolutionFactory getWikiSampleSolutionFactory();

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
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.WikiImpl <em>Wiki</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getWiki()
		 * @generated
		 */
		EClass WIKI = eINSTANCE.getWiki();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__CONTENT = eINSTANCE.getWiki_Content();

		/**
		 * The meta object literal for the '<em><b>Privilegs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__PRIVILEGS = eINSTANCE.getWiki_Privilegs();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__GROUPS = eINSTANCE.getWiki_Groups();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__USERS = eINSTANCE.getWiki_Users();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__MODE = eINSTANCE.getWiki_Mode();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__ROLE = eINSTANCE.getWiki_Role();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__HISTORY = eINSTANCE.getWiki_History();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__VERSIONS = eINSTANCE.getWiki_Versions();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ContentImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__HISTORY = eINSTANCE.getContent_History();

		/**
		 * The meta object literal for the '<em><b>Discussionpage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DISCUSSIONPAGE = eINSTANCE.getContent_Discussionpage();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__GROUP = eINSTANCE.getContent_Group();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__EDITOR = eINSTANCE.getContent_Editor();

		/**
		 * The meta object literal for the '<em><b>Ttile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TTILE = eINSTANCE.getContent_Ttile();

		/**
		 * The meta object literal for the '<em><b>Content Markup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_MARKUP = eINSTANCE.getContent_ContentMarkup();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ArticleImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.MediaImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ProjectPageImpl <em>Project Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ProjectPageImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getProjectPage()
		 * @generated
		 */
		EClass PROJECT_PAGE = eINSTANCE.getProjectPage();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.DiscussionPageImpl <em>Discussion Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.DiscussionPageImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getDiscussionPage()
		 * @generated
		 */
		EClass DISCUSSION_PAGE = eINSTANCE.getDiscussionPage();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.VersionImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__PREVIOUS = eINSTANCE.getVersion_Previous();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__TIMESTAMP = eINSTANCE.getVersion_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Edited By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__EDITED_BY = eINSTANCE.getVersion_EditedBy();

		/**
		 * The meta object literal for the '<em><b>Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DIFF = eINSTANCE.getVersion_Diff();

		/**
		 * The meta object literal for the '<em><b>Commit Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__COMMIT_MSG = eINSTANCE.getVersion_CommitMsg();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.HistoryImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__VERSIONS = eINSTANCE.getHistory_Versions();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.UserImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__MODE = eINSTANCE.getUser_Mode();

		/**
		 * The meta object literal for the '<em><b>Registration Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__REGISTRATION_TIMESTAMP = eINSTANCE.getUser_RegistrationTimestamp();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.GroupImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAMESPACE = eINSTANCE.getGroup_Namespace();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ModeImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Available Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__AVAILABLE_ACTIONS = eINSTANCE.getMode_AvailableActions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__PARENT = eINSTANCE.getMode_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ActionImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___EXECUTE__CONTENT = eINSTANCE.getAction__Execute__Content();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.PrivilegImpl <em>Privileg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.PrivilegImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getPrivileg()
		 * @generated
		 */
		EClass PRIVILEG = eINSTANCE.getPrivileg();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVILEG__PARENT = eINSTANCE.getPrivileg_Parent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVILEG__ACTION = eINSTANCE.getPrivileg_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVILEG__NAME = eINSTANCE.getPrivileg_Name();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.RegisteredUserImpl <em>Registered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.RegisteredUserImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRegisteredUser()
		 * @generated
		 */
		EClass REGISTERED_USER = eINSTANCE.getRegisteredUser();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__PROFILE = eINSTANCE.getRegisteredUser_Profile();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__SUBSCRIPTIONS = eINSTANCE.getRegisteredUser_Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__USERNAME = eINSTANCE.getRegisteredUser_Username();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.UnregisteredUserImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getUnregisteredUser()
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
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.ProfileImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.Subscribable <em>Subscribable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.Subscribable
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getSubscribable()
		 * @generated
		 */
		EClass SUBSCRIBABLE = eINSTANCE.getSubscribable();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.impl.RoleImpl
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Privileg</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PRIVILEG = eINSTANCE.getRole_Privileg();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '{@link wikiSampleSolution.wikiSampleSolution.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikiSampleSolution.wikiSampleSolution.RoleType
		 * @see wikiSampleSolution.wikiSampleSolution.impl.WikiSampleSolutionPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

	}

} //WikiSampleSolutionPackage
