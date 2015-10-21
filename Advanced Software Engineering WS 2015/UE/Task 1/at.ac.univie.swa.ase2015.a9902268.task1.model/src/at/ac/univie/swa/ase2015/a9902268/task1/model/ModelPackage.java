/**
 */
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.ModelFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.example.org/model";

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
	ModelPackage eINSTANCE = at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.NodeImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__URI = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ContentImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__URI = NODE__URI;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ArticleImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__URI = CONTENT__URI;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.MediaImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__URI = CONTENT__URI;

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
	 * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.InternalImpl <em>Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.InternalImpl
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getInternal()
	 * @generated
	 */
	int INTERNAL = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL__URI = CONTENT__URI;

	/**
	 * The number of structural features of the '<em>Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Internal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Internal
	 * @generated
	 */
	EClass getInternal();

	/**
	 * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.Node#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.Node#getUri()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Uri();

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
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ContentImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ArticleImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.MediaImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.InternalImpl <em>Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.InternalImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getInternal()
		 * @generated
		 */
		EClass INTERNAL = eINSTANCE.getInternal();

		/**
		 * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task1.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.NodeImpl
		 * @see at.ac.univie.swa.ase2015.a9902268.task1.model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__URI = eINSTANCE.getNode_Uri();

	}

} //ModelPackage
