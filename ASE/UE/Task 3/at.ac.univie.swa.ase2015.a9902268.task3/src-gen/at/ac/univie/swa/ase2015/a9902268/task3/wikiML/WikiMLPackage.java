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
   * The feature id for the '<em><b>Name</b></em>' attribute.
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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__TYPE = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AboutTemplateImpl <em>About Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AboutTemplateImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAboutTemplate()
   * @generated
   */
  int ABOUT_TEMPLATE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOUT_TEMPLATE__TYPE = TEMPLATE__TYPE;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOUT_TEMPLATE__CONTENT = TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>About Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOUT_TEMPLATE_FEATURE_COUNT = TEMPLATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.MainTemplateImpl <em>Main Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.MainTemplateImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getMainTemplate()
   * @generated
   */
  int MAIN_TEMPLATE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TEMPLATE__TYPE = TEMPLATE__TYPE;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TEMPLATE__CONTENT = TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Main Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TEMPLATE_FEATURE_COUNT = TEMPLATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.QuoteTemplateImpl <em>Quote Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.QuoteTemplateImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getQuoteTemplate()
   * @generated
   */
  int QUOTE_TEMPLATE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTE_TEMPLATE__TYPE = TEMPLATE__TYPE;

  /**
   * The number of structural features of the '<em>Quote Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTE_TEMPLATE_FEATURE_COUNT = TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderedListImpl <em>Ordered List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderedListImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderedList()
   * @generated
   */
  int ORDERED_LIST = 7;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST__ITEMS = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST__END = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ordered List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderedListImpl <em>Unordered List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderedListImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnorderedList()
   * @generated
   */
  int UNORDERED_LIST = 8;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST__ITEMS = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST__END = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unordered List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl <em>Unorder List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnorderListItem()
   * @generated
   */
  int UNORDER_LIST_ITEM = 9;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDER_LIST_ITEM__LEVEL = 0;

  /**
   * The feature id for the '<em><b>Itemtext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDER_LIST_ITEM__ITEMTEXT = 1;

  /**
   * The number of structural features of the '<em>Unorder List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDER_LIST_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemImpl <em>Order List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderListItem()
   * @generated
   */
  int ORDER_LIST_ITEM = 10;

  /**
   * The feature id for the '<em><b>Itemtext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_LIST_ITEM__ITEMTEXT = 0;

  /**
   * The number of structural features of the '<em>Order List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_LIST_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
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
  int CATEGORY = 12;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl <em>Heading2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHeading2()
   * @generated
   */
  int HEADING2 = 13;

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
  int HEADING3 = 14;

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
  int HEADING4 = 15;

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
  int HEADING5 = 16;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl <em>Any Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyText()
   * @generated
   */
  int ANY_TEXT = 27;

  /**
   * The number of structural features of the '<em>Any Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_TEXT_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl <em>Abstract Formatted Inline Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractFormattedInlineContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractFormattedInlineContent()
   * @generated
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT__NAME = ANY_TEXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Formatted Inline Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FORMATTED_INLINE_CONTENT_FEATURE_COUNT = ANY_TEXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl <em>Bold</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBold()
   * @generated
   */
  int BOLD = 18;

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
  int ITALIC = 19;

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
  int ITALIC_BOLD = 20;

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
  int ABSTRACT_UNFORMATTED_INLINE_CONTENT = 21;

  /**
   * The number of structural features of the '<em>Abstract Unformatted Inline Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT = ANY_TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getText()
   * @generated
   */
  int TEXT = 22;

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
  int HYPER_LINK = 23;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_LINK__ALT_TEXT = ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hyper Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPER_LINK_FEATURE_COUNT = ABSTRACT_UNFORMATTED_INLINE_CONTENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl <em>Internal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternal()
   * @generated
   */
  int INTERNAL = 24;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL__ALT_TEXT = HYPER_LINK__ALT_TEXT;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL__LINK = HYPER_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Anchor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL__ANCHOR = HYPER_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Internal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_FEATURE_COUNT = HYPER_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl <em>External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternal()
   * @generated
   */
  int EXTERNAL = 25;

  /**
   * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__ALT_TEXT = HYPER_LINK__ALT_TEXT;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl <em>Any Text Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AnyTextSequenceImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAnyTextSequence()
   * @generated
   */
  int ANY_TEXT_SEQUENCE = 26;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 28;

  /**
   * The feature id for the '<em><b>Paragraph</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__PARAGRAPH = PARAGRAPH_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = PARAGRAPH_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType <em>View Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getViewType()
   * @generated
   */
  int VIEW_TYPE = 29;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign <em>Horizontal Align</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHorizontalAlign()
   * @generated
   */
  int HORIZONTAL_ALIGN = 30;


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
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage#getName()
   * @see #getWikiPage()
   * @generated
   */
  EAttribute getWikiPage_Name();

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
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template#getType()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Type();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate <em>About Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>About Template</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate
   * @generated
   */
  EClass getAboutTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate#getContent()
   * @see #getAboutTemplate()
   * @generated
   */
  EReference getAboutTemplate_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate <em>Main Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Template</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate
   * @generated
   */
  EClass getMainTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate#getContent()
   * @see #getMainTemplate()
   * @generated
   */
  EReference getMainTemplate_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.QuoteTemplate <em>Quote Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quote Template</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.QuoteTemplate
   * @generated
   */
  EClass getQuoteTemplate();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList <em>Ordered List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordered List</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList
   * @generated
   */
  EClass getOrderedList();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getItems()
   * @see #getOrderedList()
   * @generated
   */
  EReference getOrderedList_Items();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getEnd()
   * @see #getOrderedList()
   * @generated
   */
  EReference getOrderedList_End();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList <em>Unordered List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unordered List</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList
   * @generated
   */
  EClass getUnorderedList();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList#getItems()
   * @see #getUnorderedList()
   * @generated
   */
  EReference getUnorderedList_Items();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList#getEnd()
   * @see #getUnorderedList()
   * @generated
   */
  EReference getUnorderedList_End();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem <em>Unorder List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unorder List Item</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem
   * @generated
   */
  EClass getUnorderListItem();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getLevel()
   * @see #getUnorderListItem()
   * @generated
   */
  EAttribute getUnorderListItem_Level();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getItemtext <em>Itemtext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Itemtext</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getItemtext()
   * @see #getUnorderListItem()
   * @generated
   */
  EReference getUnorderListItem_Itemtext();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem <em>Order List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order List Item</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem
   * @generated
   */
  EClass getOrderListItem();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem#getItemtext <em>Itemtext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Itemtext</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem#getItemtext()
   * @see #getOrderListItem()
   * @generated
   */
  EReference getOrderListItem_Itemtext();

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
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Name();

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
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink#getAltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink#getAltText()
   * @see #getHyperLink()
   * @generated
   */
  EReference getHyperLink_AltText();

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
   * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getLink()
   * @see #getInternal()
   * @generated
   */
  EReference getInternal_Link();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getAnchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anchor</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal#getAnchor()
   * @see #getInternal()
   * @generated
   */
  EReference getInternal_Anchor();

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
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph#getParagraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph#getParagraph()
   * @see #getParagraph()
   * @generated
   */
  EAttribute getParagraph_Paragraph();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIKI_PAGE__NAME = eINSTANCE.getWikiPage_Name();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__TYPE = eINSTANCE.getTemplate_Type();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AboutTemplateImpl <em>About Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AboutTemplateImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAboutTemplate()
     * @generated
     */
    EClass ABOUT_TEMPLATE = eINSTANCE.getAboutTemplate();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABOUT_TEMPLATE__CONTENT = eINSTANCE.getAboutTemplate_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.MainTemplateImpl <em>Main Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.MainTemplateImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getMainTemplate()
     * @generated
     */
    EClass MAIN_TEMPLATE = eINSTANCE.getMainTemplate();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_TEMPLATE__CONTENT = eINSTANCE.getMainTemplate_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.QuoteTemplateImpl <em>Quote Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.QuoteTemplateImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getQuoteTemplate()
     * @generated
     */
    EClass QUOTE_TEMPLATE = eINSTANCE.getQuoteTemplate();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderedListImpl <em>Ordered List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderedListImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderedList()
     * @generated
     */
    EClass ORDERED_LIST = eINSTANCE.getOrderedList();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDERED_LIST__ITEMS = eINSTANCE.getOrderedList_Items();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDERED_LIST__END = eINSTANCE.getOrderedList_End();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderedListImpl <em>Unordered List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderedListImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnorderedList()
     * @generated
     */
    EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNORDERED_LIST__ITEMS = eINSTANCE.getUnorderedList_Items();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNORDERED_LIST__END = eINSTANCE.getUnorderedList_End();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl <em>Unorder List Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnorderListItem()
     * @generated
     */
    EClass UNORDER_LIST_ITEM = eINSTANCE.getUnorderListItem();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNORDER_LIST_ITEM__LEVEL = eINSTANCE.getUnorderListItem_Level();

    /**
     * The meta object literal for the '<em><b>Itemtext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNORDER_LIST_ITEM__ITEMTEXT = eINSTANCE.getUnorderListItem_Itemtext();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemImpl <em>Order List Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.OrderListItemImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getOrderListItem()
     * @generated
     */
    EClass ORDER_LIST_ITEM = eINSTANCE.getOrderListItem();

    /**
     * The meta object literal for the '<em><b>Itemtext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_LIST_ITEM__ITEMTEXT = eINSTANCE.getOrderListItem_Itemtext();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

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
     * The meta object literal for the '<em><b>Alt Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPER_LINK__ALT_TEXT = eINSTANCE.getHyperLink_AltText();

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
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL__LINK = eINSTANCE.getInternal_Link();

    /**
     * The meta object literal for the '<em><b>Anchor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL__ANCHOR = eINSTANCE.getInternal_Anchor();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Paragraph</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAGRAPH__PARAGRAPH = eINSTANCE.getParagraph_Paragraph();

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
