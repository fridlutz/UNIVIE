/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLFactory
 * @model kind="package"
 * @generated
 */
public interface WikiMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wikiML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/univie/swa/ase2015/a9902268/task3/WikiML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wikiML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WikiMLPackage eINSTANCE = at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiPageImpl <em>Wiki Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiPageImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getWikiPage()
   * @generated
   */
  int WIKI_PAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_PAGE__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Wiki Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphTypesImpl <em>Paragraph Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphTypesImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getParagraphTypes()
   * @generated
   */
  int PARAGRAPH_TYPES = 1;

  /**
   * The number of structural features of the '<em>Paragraph Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BlockQuoteImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBlockQuote()
   * @generated
   */
  int BLOCK_QUOTE = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_QUOTE__CONTENT = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Quote</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_QUOTE_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TemplateImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__CONTENT = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel2Impl <em>Un Order List Item Level2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel2Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnOrderListItemLevel2()
   * @generated
   */
  int UN_ORDER_LIST_ITEM_LEVEL2 = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL2__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL2__LIST = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Un Order List Item Level2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL2_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel1Impl <em>Un Order List Item Level1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel1Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnOrderListItemLevel1()
   * @generated
   */
  int UN_ORDER_LIST_ITEM_LEVEL1 = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL1__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL1__LIST = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Un Order List Item Level1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_ORDER_LIST_ITEM_LEVEL1_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemLevel1Impl <em>Order List Item Level1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemLevel1Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderListItemLevel1()
   * @generated
   */
  int ORDER_LIST_ITEM_LEVEL1 = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_LIST_ITEM_LEVEL1__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_LIST_ITEM_LEVEL1__LIST = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Order List Item Level1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_LIST_ITEM_LEVEL1_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__TYPE = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__HALIGN = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__ALT_TEXT = PARAGRAPH_TYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Caption</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CAPTION = PARAGRAPH_TYPES_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.CategoryImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__VALUE = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading1Impl <em>Heading1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading1Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading1()
   * @generated
   */
  int HEADING1 = 9;

  /**
   * The feature id for the '<em><b>Heading Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1__HEADING_VALUE1 = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl <em>Heading2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading2()
   * @generated
   */
  int HEADING2 = 10;

  /**
   * The feature id for the '<em><b>Heading Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2__HEADING_VALUE2 = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading3Impl <em>Heading3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading3Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading3()
   * @generated
   */
  int HEADING3 = 11;

  /**
   * The feature id for the '<em><b>Heading Value3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3__HEADING_VALUE3 = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading4Impl <em>Heading4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading4Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading4()
   * @generated
   */
  int HEADING4 = 12;

  /**
   * The feature id for the '<em><b>Heading Value4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING4__HEADING_VALUE4 = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING4_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading5Impl <em>Heading5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading5Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading5()
   * @generated
   */
  int HEADING5 = 13;

  /**
   * The feature id for the '<em><b>Heading Value5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING5__HEADING_VALUE5 = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Heading5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING5_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl <em>Abstract Formatted Inline Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractFormattedInlineContent()
   * @generated
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT__NAME = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Formatted Inline Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl <em>Bold</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBold()
   * @generated
   */
  int BOLD = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD__NAME = ABSTRACT_FORMATTED_INLINE_CONTENT__NAME;

  /**
   * The number of structural features of the '<em>Bold</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_FEATURE_COUNT = ABSTRACT_FORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicImpl <em>Italic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalic()
   * @generated
   */
  int ITALIC = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC__NAME = ABSTRACT_FORMATTED_INLINE_CONTENT__NAME;

  /**
   * The number of structural features of the '<em>Italic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_FEATURE_COUNT = ABSTRACT_FORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicBoldImpl <em>Italic Bold</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicBoldImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicBold()
   * @generated
   */
  int ITALIC_BOLD = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_BOLD__NAME = ABSTRACT_FORMATTED_INLINE_CONTENT__NAME;

  /**
   * The number of structural features of the '<em>Italic Bold</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_BOLD_FEATURE_COUNT = ABSTRACT_FORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractUnformattedInlineContentImpl <em>Abstract Unformatted Inline Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractUnformattedInlineContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractUnformattedInlineContent()
   * @generated
   */
  int ABSTRACT_UNFORMATTED_INLINE_CONTENT = 18;

  /**
   * The number of structural features of the '<em>Abstract Unformatted Inline Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getText()
   * @generated
   */
  int TEXT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__NAME = ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperLinkImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHyperLink()
   * @generated
   */
  int HYPER_LINK = 20;

  /**
   * The number of structural features of the '<em>Hyper Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_LINK_FEATURE_COUNT = ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl <em>Internal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternal()
   * @generated
   */
  int INTERNAL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL__NAME = HYPER_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Internal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FEATURE_COUNT = HYPER_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalAltImpl <em>Internal Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalAltImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalAlt()
   * @generated
   */
  int INTERNAL_ALT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_ALT__NAME = HYPER_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_ALT__ALT_TEXT = HYPER_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Internal Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_ALT_FEATURE_COUNT = HYPER_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl <em>External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternal()
   * @generated
   */
  int EXTERNAL = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__NAME = HYPER_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FEATURE_COUNT = HYPER_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalAltImpl <em>External Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalAltImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalAlt()
   * @generated
   */
  int EXTERNAL_ALT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ALT__NAME = HYPER_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ALT__ALT_TEXT = HYPER_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ALT_FEATURE_COUNT = HYPER_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl <em>Any Text Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyTextSequence()
   * @generated
   */
  int ANY_TEXT_SEQUENCE = 25;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT_SEQUENCE__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Any Text Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl <em>Any Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyText()
   * @generated
   */
  int ANY_TEXT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT__NAME = 0;

  /**
   * The number of structural features of the '<em>Any Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType <em>View Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getViewType()
   * @generated
   */
  int VIEW_TYPE = 27;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign <em>Horizontal Align</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHorizontalAlign()
   * @generated
   */
  int HORIZONTAL_ALIGN = 28;


  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage <em>Wiki Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wiki Page</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage
   * @generated
   */
  EClass getWikiPage();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getName()
   * @see #getWikiPage()
   * @generated
   */
  EReference getWikiPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getElements()
   * @see #getWikiPage()
   * @generated
   */
  EReference getWikiPage_Elements();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes <em>Paragraph Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph Types</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes
   * @generated
   */
  EClass getParagraphTypes();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote <em>Block Quote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Quote</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote
   * @generated
   */
  EClass getBlockQuote();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote#getContent()
   * @see #getBlockQuote()
   * @generated
   */
  EReference getBlockQuote_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template#getContent()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2 <em>Un Order List Item Level2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Order List Item Level2</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2
   * @generated
   */
  EClass getUnOrderListItemLevel2();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2#getName()
   * @see #getUnOrderListItemLevel2()
   * @generated
   */
  EReference getUnOrderListItemLevel2_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2#getList()
   * @see #getUnOrderListItemLevel2()
   * @generated
   */
  EReference getUnOrderListItemLevel2_List();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1 <em>Un Order List Item Level1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Order List Item Level1</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1
   * @generated
   */
  EClass getUnOrderListItemLevel1();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1#getName()
   * @see #getUnOrderListItemLevel1()
   * @generated
   */
  EReference getUnOrderListItemLevel1_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1#getList()
   * @see #getUnOrderListItemLevel1()
   * @generated
   */
  EReference getUnOrderListItemLevel1_List();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1 <em>Order List Item Level1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order List Item Level1</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1
   * @generated
   */
  EClass getOrderListItemLevel1();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1#getName()
   * @see #getOrderListItemLevel1()
   * @generated
   */
  EReference getOrderListItemLevel1_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1#getList()
   * @see #getOrderListItemLevel1()
   * @generated
   */
  EReference getOrderListItemLevel1_List();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getType()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Type();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HAlign</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getHAlign()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_HAlign();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getAltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getAltText()
   * @see #getImage()
   * @generated
   */
  EReference getImage_AltText();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Caption</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getCaption()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Caption();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category#getName()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category#getValue()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Value();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading1</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1
   * @generated
   */
  EClass getHeading1();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1#getHeadingValue1 <em>Heading Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading Value1</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1#getHeadingValue1()
   * @see #getHeading1()
   * @generated
   */
  EReference getHeading1_HeadingValue1();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading2</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2
   * @generated
   */
  EClass getHeading2();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2#getHeadingValue2 <em>Heading Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading Value2</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2#getHeadingValue2()
   * @see #getHeading2()
   * @generated
   */
  EReference getHeading2_HeadingValue2();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3 <em>Heading3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading3</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3
   * @generated
   */
  EClass getHeading3();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3#getHeadingValue3 <em>Heading Value3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading Value3</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3#getHeadingValue3()
   * @see #getHeading3()
   * @generated
   */
  EReference getHeading3_HeadingValue3();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4 <em>Heading4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading4</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4
   * @generated
   */
  EClass getHeading4();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4#getHeadingValue4 <em>Heading Value4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading Value4</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4#getHeadingValue4()
   * @see #getHeading4()
   * @generated
   */
  EReference getHeading4_HeadingValue4();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5 <em>Heading5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading5</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5
   * @generated
   */
  EClass getHeading5();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5#getHeadingValue5 <em>Heading Value5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading Value5</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5#getHeadingValue5()
   * @see #getHeading5()
   * @generated
   */
  EReference getHeading5_HeadingValue5();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent <em>Abstract Formatted Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Formatted Inline Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent
   * @generated
   */
  EClass getAbstractFormattedInlineContent();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent#getName()
   * @see #getAbstractFormattedInlineContent()
   * @generated
   */
  EReference getAbstractFormattedInlineContent_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold
   * @generated
   */
  EClass getBold();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic
   * @generated
   */
  EClass getItalic();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold <em>Italic Bold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic Bold</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold
   * @generated
   */
  EClass getItalicBold();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent <em>Abstract Unformatted Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Unformatted Inline Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent
   * @generated
   */
  EClass getAbstractUnformattedInlineContent();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text#getName()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink <em>Hyper Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyper Link</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink
   * @generated
   */
  EClass getHyperLink();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal
   * @generated
   */
  EClass getInternal();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getName()
   * @see #getInternal()
   * @generated
   */
  EReference getInternal_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt <em>Internal Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Alt</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt
   * @generated
   */
  EClass getInternalAlt();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt#getName()
   * @see #getInternalAlt()
   * @generated
   */
  EReference getInternalAlt_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt#getAltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt#getAltText()
   * @see #getInternalAlt()
   * @generated
   */
  EReference getInternalAlt_AltText();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External
   * @generated
   */
  EClass getExternal();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External#getName()
   * @see #getExternal()
   * @generated
   */
  EAttribute getExternal_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt <em>External Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Alt</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt
   * @generated
   */
  EClass getExternalAlt();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt#getName()
   * @see #getExternalAlt()
   * @generated
   */
  EAttribute getExternalAlt_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt#getAltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt#getAltText()
   * @see #getExternalAlt()
   * @generated
   */
  EReference getExternalAlt_AltText();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence <em>Any Text Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Text Sequence</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence
   * @generated
   */
  EClass getAnyTextSequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence#getContent()
   * @see #getAnyTextSequence()
   * @generated
   */
  EReference getAnyTextSequence_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText <em>Any Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText
   * @generated
   */
  EClass getAnyText();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText#getName()
   * @see #getAnyText()
   * @generated
   */
  EReference getAnyText_Name();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>View Type</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
   * @generated
   */
  EEnum getViewType();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign <em>Horizontal Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Horizontal Align</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
   * @generated
   */
  EEnum getHorizontalAlign();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WikiMLFactory getWikiMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiPageImpl <em>Wiki Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiPageImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getWikiPage()
     * @generated
     */
    EClass WIKI_PAGE = eINSTANCE.getWikiPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKI_PAGE__NAME = eINSTANCE.getWikiPage_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKI_PAGE__ELEMENTS = eINSTANCE.getWikiPage_Elements();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphTypesImpl <em>Paragraph Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphTypesImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getParagraphTypes()
     * @generated
     */
    EClass PARAGRAPH_TYPES = eINSTANCE.getParagraphTypes();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BlockQuoteImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBlockQuote()
     * @generated
     */
    EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_QUOTE__CONTENT = eINSTANCE.getBlockQuote_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TemplateImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__CONTENT = eINSTANCE.getTemplate_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel2Impl <em>Un Order List Item Level2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel2Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnOrderListItemLevel2()
     * @generated
     */
    EClass UN_ORDER_LIST_ITEM_LEVEL2 = eINSTANCE.getUnOrderListItemLevel2();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_ORDER_LIST_ITEM_LEVEL2__NAME = eINSTANCE.getUnOrderListItemLevel2_Name();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_ORDER_LIST_ITEM_LEVEL2__LIST = eINSTANCE.getUnOrderListItemLevel2_List();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel1Impl <em>Un Order List Item Level1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnOrderListItemLevel1Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnOrderListItemLevel1()
     * @generated
     */
    EClass UN_ORDER_LIST_ITEM_LEVEL1 = eINSTANCE.getUnOrderListItemLevel1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_ORDER_LIST_ITEM_LEVEL1__NAME = eINSTANCE.getUnOrderListItemLevel1_Name();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_ORDER_LIST_ITEM_LEVEL1__LIST = eINSTANCE.getUnOrderListItemLevel1_List();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemLevel1Impl <em>Order List Item Level1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemLevel1Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderListItemLevel1()
     * @generated
     */
    EClass ORDER_LIST_ITEM_LEVEL1 = eINSTANCE.getOrderListItemLevel1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_LIST_ITEM_LEVEL1__NAME = eINSTANCE.getOrderListItemLevel1_Name();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_LIST_ITEM_LEVEL1__LIST = eINSTANCE.getOrderListItemLevel1_List();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__NAME = eINSTANCE.getImage_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__TYPE = eINSTANCE.getImage_Type();

    /**
     * The meta object literal for the '<em><b>HAlign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__HALIGN = eINSTANCE.getImage_HAlign();

    /**
     * The meta object literal for the '<em><b>Alt Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__ALT_TEXT = eINSTANCE.getImage_AltText();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__CAPTION = eINSTANCE.getImage_Caption();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.CategoryImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__NAME = eINSTANCE.getCategory_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__VALUE = eINSTANCE.getCategory_Value();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading1Impl <em>Heading1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading1Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading1()
     * @generated
     */
    EClass HEADING1 = eINSTANCE.getHeading1();

    /**
     * The meta object literal for the '<em><b>Heading Value1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING1__HEADING_VALUE1 = eINSTANCE.getHeading1_HeadingValue1();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl <em>Heading2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading2()
     * @generated
     */
    EClass HEADING2 = eINSTANCE.getHeading2();

    /**
     * The meta object literal for the '<em><b>Heading Value2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING2__HEADING_VALUE2 = eINSTANCE.getHeading2_HeadingValue2();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading3Impl <em>Heading3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading3Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading3()
     * @generated
     */
    EClass HEADING3 = eINSTANCE.getHeading3();

    /**
     * The meta object literal for the '<em><b>Heading Value3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING3__HEADING_VALUE3 = eINSTANCE.getHeading3_HeadingValue3();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading4Impl <em>Heading4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading4Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading4()
     * @generated
     */
    EClass HEADING4 = eINSTANCE.getHeading4();

    /**
     * The meta object literal for the '<em><b>Heading Value4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING4__HEADING_VALUE4 = eINSTANCE.getHeading4_HeadingValue4();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading5Impl <em>Heading5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading5Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading5()
     * @generated
     */
    EClass HEADING5 = eINSTANCE.getHeading5();

    /**
     * The meta object literal for the '<em><b>Heading Value5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING5__HEADING_VALUE5 = eINSTANCE.getHeading5_HeadingValue5();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl <em>Abstract Formatted Inline Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractFormattedInlineContent()
     * @generated
     */
    EClass ABSTRACT_FORMATTED_INLINE_CONTENT = eINSTANCE.getAbstractFormattedInlineContent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FORMATTED_INLINE_CONTENT__NAME = eINSTANCE.getAbstractFormattedInlineContent_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl <em>Bold</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBold()
     * @generated
     */
    EClass BOLD = eINSTANCE.getBold();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicImpl <em>Italic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalic()
     * @generated
     */
    EClass ITALIC = eINSTANCE.getItalic();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicBoldImpl <em>Italic Bold</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicBoldImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicBold()
     * @generated
     */
    EClass ITALIC_BOLD = eINSTANCE.getItalicBold();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractUnformattedInlineContentImpl <em>Abstract Unformatted Inline Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractUnformattedInlineContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractUnformattedInlineContent()
     * @generated
     */
    EClass ABSTRACT_UNFORMATTED_INLINE_CONTENT = eINSTANCE.getAbstractUnformattedInlineContent();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__NAME = eINSTANCE.getText_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperLinkImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHyperLink()
     * @generated
     */
    EClass HYPER_LINK = eINSTANCE.getHyperLink();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl <em>Internal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternal()
     * @generated
     */
    EClass INTERNAL = eINSTANCE.getInternal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL__NAME = eINSTANCE.getInternal_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalAltImpl <em>Internal Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalAltImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalAlt()
     * @generated
     */
    EClass INTERNAL_ALT = eINSTANCE.getInternalAlt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_ALT__NAME = eINSTANCE.getInternalAlt_Name();

    /**
     * The meta object literal for the '<em><b>Alt Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_ALT__ALT_TEXT = eINSTANCE.getInternalAlt_AltText();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl <em>External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternal()
     * @generated
     */
    EClass EXTERNAL = eINSTANCE.getExternal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL__NAME = eINSTANCE.getExternal_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalAltImpl <em>External Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalAltImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalAlt()
     * @generated
     */
    EClass EXTERNAL_ALT = eINSTANCE.getExternalAlt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_ALT__NAME = eINSTANCE.getExternalAlt_Name();

    /**
     * The meta object literal for the '<em><b>Alt Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ALT__ALT_TEXT = eINSTANCE.getExternalAlt_AltText();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl <em>Any Text Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyTextSequence()
     * @generated
     */
    EClass ANY_TEXT_SEQUENCE = eINSTANCE.getAnyTextSequence();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANY_TEXT_SEQUENCE__CONTENT = eINSTANCE.getAnyTextSequence_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl <em>Any Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyText()
     * @generated
     */
    EClass ANY_TEXT = eINSTANCE.getAnyText();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANY_TEXT__NAME = eINSTANCE.getAnyText_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType <em>View Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getViewType()
     * @generated
     */
    EEnum VIEW_TYPE = eINSTANCE.getViewType();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign <em>Horizontal Align</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHorizontalAlign()
     * @generated
     */
    EEnum HORIZONTAL_ALIGN = eINSTANCE.getHorizontalAlign();

  }

} //WikiMLPackage
