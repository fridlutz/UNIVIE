/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DocumentImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__TITLE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__CATEGORIES = 2;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommentImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnformattedTextImpl <em>Unformatted Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnformattedTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnformattedText()
   * @generated
   */
  int UNFORMATTED_TEXT = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNFORMATTED_TEXT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Unformatted Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNFORMATTED_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FormattedTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFormattedText()
   * @generated
   */
  int FORMATTED_TEXT = 3;

  /**
   * The feature id for the '<em><b>Formatted Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTED_TEXT__FORMATTED_TEXT = 0;

  /**
   * The number of structural features of the '<em>Formatted Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTED_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextWithoutLinksImpl <em>Formatted Text Without Links</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FormattedTextWithoutLinksImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFormattedTextWithoutLinks()
   * @generated
   */
  int FORMATTED_TEXT_WITHOUT_LINKS = 4;

  /**
   * The feature id for the '<em><b>Formatted Text Without Links</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS = 0;

  /**
   * The number of structural features of the '<em>Formatted Text Without Links</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTED_TEXT_WITHOUT_LINKS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TextElementImpl <em>Text Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TextElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTextElement()
   * @generated
   */
  int TEXT_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ELEMENT__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Text Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HeadingImpl <em>Heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HeadingImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading()
   * @generated
   */
  int HEADING = 7;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING__HEADING = 0;

  /**
   * The number of structural features of the '<em>Heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading1Impl <em>Heading1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Heading1Impl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading1()
   * @generated
   */
  int HEADING1 = 8;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1__HEADING = 0;

  /**
   * The number of structural features of the '<em>Heading1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING1_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading2Impl <em>Heading2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Heading2Impl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading2()
   * @generated
   */
  int HEADING2 = 9;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2__HEADING = 0;

  /**
   * The number of structural features of the '<em>Heading2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading3Impl <em>Heading3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Heading3Impl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading3()
   * @generated
   */
  int HEADING3 = 10;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3__HEADING = 0;

  /**
   * The number of structural features of the '<em>Heading3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING3_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading4Impl <em>Heading4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Heading4Impl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading4()
   * @generated
   */
  int HEADING4 = 11;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING4__HEADING = 0;

  /**
   * The number of structural features of the '<em>Heading4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADING4_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getList()
   * @generated
   */
  int LIST = 12;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OrderedListImpl <em>Ordered List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OrderedListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrderedList()
   * @generated
   */
  int ORDERED_LIST = 13;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Ordered List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnorderedListImpl <em>Unordered List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnorderedListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnorderedList()
   * @generated
   */
  int UNORDERED_LIST = 14;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Unordered List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OrderedListItemImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrderedListItem()
   * @generated
   */
  int ORDERED_LIST_ITEM = 15;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST_ITEM__ITEM = 0;

  /**
   * The number of structural features of the '<em>Ordered List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_LIST_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnorderedListItemImpl <em>Unordered List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnorderedListItemImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnorderedListItem()
   * @generated
   */
  int UNORDERED_LIST_ITEM = 16;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST_ITEM__ITEM = 0;

  /**
   * The number of structural features of the '<em>Unordered List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNORDERED_LIST_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ItalicTextImpl <em>Italic Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ItalicTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getItalicText()
   * @generated
   */
  int ITALIC_TEXT = 17;

  /**
   * The feature id for the '<em><b>Italic Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_TEXT__ITALIC_TEXT = 0;

  /**
   * The number of structural features of the '<em>Italic Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BoldTextImpl <em>Bold Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BoldTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoldText()
   * @generated
   */
  int BOLD_TEXT = 18;

  /**
   * The feature id for the '<em><b>Bold Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_TEXT__BOLD_TEXT = 0;

  /**
   * The number of structural features of the '<em>Bold Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ItalicBoldTextImpl <em>Italic Bold Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ItalicBoldTextImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getItalicBoldText()
   * @generated
   */
  int ITALIC_BOLD_TEXT = 19;

  /**
   * The feature id for the '<em><b>Italic Bold Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT = 0;

  /**
   * The number of structural features of the '<em>Italic Bold Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_BOLD_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBlockQuote()
   * @generated
   */
  int BLOCK_QUOTE = 20;

  /**
   * The feature id for the '<em><b>Block Quote Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_QUOTE__BLOCK_QUOTE_TEXT = 0;

  /**
   * The feature id for the '<em><b>Additional</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_QUOTE__ADDITIONAL = 1;

  /**
   * The number of structural features of the '<em>Block Quote</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_QUOTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExternalLinkImpl <em>External Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExternalLinkImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExternalLink()
   * @generated
   */
  int EXTERNAL_LINK = 21;

  /**
   * The feature id for the '<em><b>Link Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK__LINK_NAME = 0;

  /**
   * The feature id for the '<em><b>Renamed Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK__RENAMED_LINK = 1;

  /**
   * The number of structural features of the '<em>External Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl <em>Internal Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInternalLink()
   * @generated
   */
  int INTERNAL_LINK = 22;

  /**
   * The feature id for the '<em><b>Link Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK__LINK_NAME = 0;

  /**
   * The feature id for the '<em><b>Renamed Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK__RENAMED_LINK = 1;

  /**
   * The number of structural features of the '<em>Internal Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FileImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFile()
   * @generated
   */
  int FILE = 23;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__FILE_NAME = 0;

  /**
   * The feature id for the '<em><b>View Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__VIEW_TYPE = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__TEXT = 2;

  /**
   * The feature id for the '<em><b>Additional</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__ADDITIONAL = 3;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CategoryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 24;

  /**
   * The feature id for the '<em><b>Category Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__CATEGORY_LINK = 0;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TemplateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 25;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__TEMPLATE = 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TemplateTypeImpl <em>Template Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TemplateTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTemplateType()
   * @generated
   */
  int TEMPLATE_TYPE = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Template Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MetadataImpl <em>Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MetadataImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMetadata()
   * @generated
   */
  int METADATA = 27;

  /**
   * The feature id for the '<em><b>About</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__ABOUT = 0;

  /**
   * The feature id for the '<em><b>Actual Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA__ACTUAL_INFO = 1;

  /**
   * The number of structural features of the '<em>Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AboutImpl <em>About</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AboutImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbout()
   * @generated
   */
  int ABOUT = 28;

  /**
   * The feature id for the '<em><b>About Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOUT__ABOUT_TEXT = 0;

  /**
   * The number of structural features of the '<em>About</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABOUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl <em>Actual Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActualInformation()
   * @generated
   */
  int ACTUAL_INFORMATION = 29;

  /**
   * The feature id for the '<em><b>Information On What</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_INFORMATION__INFORMATION_ON_WHAT = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_INFORMATION__LINK = 1;

  /**
   * The feature id for the '<em><b>Additional Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_INFORMATION__ADDITIONAL_LINKS = 2;

  /**
   * The number of structural features of the '<em>Actual Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_INFORMATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MainInformationImpl <em>Main Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MainInformationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMainInformation()
   * @generated
   */
  int MAIN_INFORMATION = 30;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_INFORMATION__LINK = 0;

  /**
   * The number of structural features of the '<em>Main Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_INFORMATION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.example.mydsl.myDsl.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Document#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.Document#getTitle()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Document#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Document#getElements()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Document#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Categories</em>'.
   * @see org.xtext.example.mydsl.myDsl.Document#getCategories()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Categories();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.UnformattedText <em>Unformatted Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unformatted Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnformattedText
   * @generated
   */
  EClass getUnformattedText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.UnformattedText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnformattedText#getText()
   * @see #getUnformattedText()
   * @generated
   */
  EAttribute getUnformattedText_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FormattedText <em>Formatted Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formatted Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.FormattedText
   * @generated
   */
  EClass getFormattedText();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FormattedText#getFormattedText <em>Formatted Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formatted Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.FormattedText#getFormattedText()
   * @see #getFormattedText()
   * @generated
   */
  EReference getFormattedText_FormattedText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks <em>Formatted Text Without Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formatted Text Without Links</em>'.
   * @see org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks
   * @generated
   */
  EClass getFormattedTextWithoutLinks();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks#getFormattedTextWithoutLinks <em>Formatted Text Without Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formatted Text Without Links</em>'.
   * @see org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks#getFormattedTextWithoutLinks()
   * @see #getFormattedTextWithoutLinks()
   * @generated
   */
  EReference getFormattedTextWithoutLinks_FormattedTextWithoutLinks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AbstractElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.AbstractElement#getElement()
   * @see #getAbstractElement()
   * @generated
   */
  EReference getAbstractElement_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TextElement <em>Text Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.TextElement
   * @generated
   */
  EClass getTextElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.TextElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.TextElement#getElement()
   * @see #getTextElement()
   * @generated
   */
  EReference getTextElement_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Heading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading
   * @generated
   */
  EClass getHeading();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Heading#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading#getHeading()
   * @see #getHeading()
   * @generated
   */
  EReference getHeading_Heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading1
   * @generated
   */
  EClass getHeading1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Heading1#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading1#getHeading()
   * @see #getHeading1()
   * @generated
   */
  EReference getHeading1_Heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading2
   * @generated
   */
  EClass getHeading2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Heading2#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading2#getHeading()
   * @see #getHeading2()
   * @generated
   */
  EReference getHeading2_Heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Heading3 <em>Heading3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading3
   * @generated
   */
  EClass getHeading3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Heading3#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading3#getHeading()
   * @see #getHeading3()
   * @generated
   */
  EReference getHeading3_Heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Heading4 <em>Heading4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Heading4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading4
   * @generated
   */
  EClass getHeading4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Heading4#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see org.xtext.example.mydsl.myDsl.Heading4#getHeading()
   * @see #getHeading4()
   * @generated
   */
  EReference getHeading4_Heading();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.xtext.example.mydsl.myDsl.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.List#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see org.xtext.example.mydsl.myDsl.List#getList()
   * @see #getList()
   * @generated
   */
  EReference getList_List();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OrderedList <em>Ordered List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordered List</em>'.
   * @see org.xtext.example.mydsl.myDsl.OrderedList
   * @generated
   */
  EClass getOrderedList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.OrderedList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.xtext.example.mydsl.myDsl.OrderedList#getItems()
   * @see #getOrderedList()
   * @generated
   */
  EReference getOrderedList_Items();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.UnorderedList <em>Unordered List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unordered List</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnorderedList
   * @generated
   */
  EClass getUnorderedList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.UnorderedList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnorderedList#getItems()
   * @see #getUnorderedList()
   * @generated
   */
  EReference getUnorderedList_Items();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OrderedListItem <em>Ordered List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordered List Item</em>'.
   * @see org.xtext.example.mydsl.myDsl.OrderedListItem
   * @generated
   */
  EClass getOrderedListItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.OrderedListItem#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see org.xtext.example.mydsl.myDsl.OrderedListItem#getItem()
   * @see #getOrderedListItem()
   * @generated
   */
  EReference getOrderedListItem_Item();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.UnorderedListItem <em>Unordered List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unordered List Item</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnorderedListItem
   * @generated
   */
  EClass getUnorderedListItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.UnorderedListItem#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnorderedListItem#getItem()
   * @see #getUnorderedListItem()
   * @generated
   */
  EReference getUnorderedListItem_Item();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ItalicText <em>Italic Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.ItalicText
   * @generated
   */
  EClass getItalicText();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ItalicText#getItalicText <em>Italic Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Italic Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.ItalicText#getItalicText()
   * @see #getItalicText()
   * @generated
   */
  EReference getItalicText_ItalicText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BoldText <em>Bold Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.BoldText
   * @generated
   */
  EClass getBoldText();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.BoldText#getBoldText <em>Bold Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bold Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.BoldText#getBoldText()
   * @see #getBoldText()
   * @generated
   */
  EReference getBoldText_BoldText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ItalicBoldText <em>Italic Bold Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic Bold Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.ItalicBoldText
   * @generated
   */
  EClass getItalicBoldText();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ItalicBoldText#getItalicBoldText <em>Italic Bold Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Italic Bold Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.ItalicBoldText#getItalicBoldText()
   * @see #getItalicBoldText()
   * @generated
   */
  EReference getItalicBoldText_ItalicBoldText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BlockQuote <em>Block Quote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Quote</em>'.
   * @see org.xtext.example.mydsl.myDsl.BlockQuote
   * @generated
   */
  EClass getBlockQuote();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.BlockQuote#getBlockQuoteText <em>Block Quote Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block Quote Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.BlockQuote#getBlockQuoteText()
   * @see #getBlockQuote()
   * @generated
   */
  EReference getBlockQuote_BlockQuoteText();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.BlockQuote#getAdditional <em>Additional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional</em>'.
   * @see org.xtext.example.mydsl.myDsl.BlockQuote#getAdditional()
   * @see #getBlockQuote()
   * @generated
   */
  EReference getBlockQuote_Additional();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExternalLink <em>External Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExternalLink
   * @generated
   */
  EClass getExternalLink();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExternalLink#getLinkName <em>Link Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExternalLink#getLinkName()
   * @see #getExternalLink()
   * @generated
   */
  EReference getExternalLink_LinkName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExternalLink#getRenamedLink <em>Renamed Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Renamed Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExternalLink#getRenamedLink()
   * @see #getExternalLink()
   * @generated
   */
  EReference getExternalLink_RenamedLink();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InternalLink <em>Internal Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.InternalLink
   * @generated
   */
  EClass getInternalLink();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InternalLink#getLinkName <em>Link Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.InternalLink#getLinkName()
   * @see #getInternalLink()
   * @generated
   */
  EReference getInternalLink_LinkName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.InternalLink#getRenamedLink <em>Renamed Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Renamed Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.InternalLink#getRenamedLink()
   * @see #getInternalLink()
   * @generated
   */
  EReference getInternalLink_RenamedLink();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.example.mydsl.myDsl.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.File#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.File#getFileName()
   * @see #getFile()
   * @generated
   */
  EReference getFile_FileName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.File#getViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.File#getViewType()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_ViewType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.File#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.File#getText()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.File#getAdditional <em>Additional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional</em>'.
   * @see org.xtext.example.mydsl.myDsl.File#getAdditional()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Additional();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see org.xtext.example.mydsl.myDsl.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Category#getCategoryLink <em>Category Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Category Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.Category#getCategoryLink()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_CategoryLink();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.xtext.example.mydsl.myDsl.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Template#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template</em>'.
   * @see org.xtext.example.mydsl.myDsl.Template#getTemplate()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Template();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TemplateType <em>Template Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.TemplateType
   * @generated
   */
  EClass getTemplateType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.TemplateType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.TemplateType#getType()
   * @see #getTemplateType()
   * @generated
   */
  EReference getTemplateType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Metadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata</em>'.
   * @see org.xtext.example.mydsl.myDsl.Metadata
   * @generated
   */
  EClass getMetadata();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Metadata#getAbout <em>About</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>About</em>'.
   * @see org.xtext.example.mydsl.myDsl.Metadata#getAbout()
   * @see #getMetadata()
   * @generated
   */
  EReference getMetadata_About();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Metadata#getActualInfo <em>Actual Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual Info</em>'.
   * @see org.xtext.example.mydsl.myDsl.Metadata#getActualInfo()
   * @see #getMetadata()
   * @generated
   */
  EReference getMetadata_ActualInfo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.About <em>About</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>About</em>'.
   * @see org.xtext.example.mydsl.myDsl.About
   * @generated
   */
  EClass getAbout();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.About#getAboutText <em>About Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>About Text</em>'.
   * @see org.xtext.example.mydsl.myDsl.About#getAboutText()
   * @see #getAbout()
   * @generated
   */
  EReference getAbout_AboutText();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ActualInformation <em>Actual Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Information</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActualInformation
   * @generated
   */
  EClass getActualInformation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ActualInformation#getInformationOnWhat <em>Information On What</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Information On What</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActualInformation#getInformationOnWhat()
   * @see #getActualInformation()
   * @generated
   */
  EReference getActualInformation_InformationOnWhat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ActualInformation#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActualInformation#getLink()
   * @see #getActualInformation()
   * @generated
   */
  EReference getActualInformation_Link();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ActualInformation#getAdditionalLinks <em>Additional Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional Links</em>'.
   * @see org.xtext.example.mydsl.myDsl.ActualInformation#getAdditionalLinks()
   * @see #getActualInformation()
   * @generated
   */
  EReference getActualInformation_AdditionalLinks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MainInformation <em>Main Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Information</em>'.
   * @see org.xtext.example.mydsl.myDsl.MainInformation
   * @generated
   */
  EClass getMainInformation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.MainInformation#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see org.xtext.example.mydsl.myDsl.MainInformation#getLink()
   * @see #getMainInformation()
   * @generated
   */
  EReference getMainInformation_Link();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DocumentImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__ELEMENTS = eINSTANCE.getDocument_Elements();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__CATEGORIES = eINSTANCE.getDocument_Categories();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommentImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UnformattedTextImpl <em>Unformatted Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UnformattedTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnformattedText()
     * @generated
     */
    EClass UNFORMATTED_TEXT = eINSTANCE.getUnformattedText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNFORMATTED_TEXT__TEXT = eINSTANCE.getUnformattedText_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FormattedTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFormattedText()
     * @generated
     */
    EClass FORMATTED_TEXT = eINSTANCE.getFormattedText();

    /**
     * The meta object literal for the '<em><b>Formatted Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMATTED_TEXT__FORMATTED_TEXT = eINSTANCE.getFormattedText_FormattedText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextWithoutLinksImpl <em>Formatted Text Without Links</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FormattedTextWithoutLinksImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFormattedTextWithoutLinks()
     * @generated
     */
    EClass FORMATTED_TEXT_WITHOUT_LINKS = eINSTANCE.getFormattedTextWithoutLinks();

    /**
     * The meta object literal for the '<em><b>Formatted Text Without Links</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS = eINSTANCE.getFormattedTextWithoutLinks_FormattedTextWithoutLinks();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AbstractElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ELEMENT__ELEMENT = eINSTANCE.getAbstractElement_Element();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TextElementImpl <em>Text Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TextElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTextElement()
     * @generated
     */
    EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_ELEMENT__ELEMENT = eINSTANCE.getTextElement_Element();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HeadingImpl <em>Heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HeadingImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading()
     * @generated
     */
    EClass HEADING = eINSTANCE.getHeading();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING__HEADING = eINSTANCE.getHeading_Heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading1Impl <em>Heading1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Heading1Impl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading1()
     * @generated
     */
    EClass HEADING1 = eINSTANCE.getHeading1();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING1__HEADING = eINSTANCE.getHeading1_Heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading2Impl <em>Heading2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Heading2Impl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading2()
     * @generated
     */
    EClass HEADING2 = eINSTANCE.getHeading2();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING2__HEADING = eINSTANCE.getHeading2_Heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading3Impl <em>Heading3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Heading3Impl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading3()
     * @generated
     */
    EClass HEADING3 = eINSTANCE.getHeading3();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING3__HEADING = eINSTANCE.getHeading3_Heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Heading4Impl <em>Heading4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Heading4Impl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHeading4()
     * @generated
     */
    EClass HEADING4 = eINSTANCE.getHeading4();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADING4__HEADING = eINSTANCE.getHeading4_Heading();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__LIST = eINSTANCE.getList_List();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OrderedListImpl <em>Ordered List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OrderedListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrderedList()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UnorderedListImpl <em>Unordered List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UnorderedListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnorderedList()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OrderedListItemImpl <em>Ordered List Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OrderedListItemImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOrderedListItem()
     * @generated
     */
    EClass ORDERED_LIST_ITEM = eINSTANCE.getOrderedListItem();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDERED_LIST_ITEM__ITEM = eINSTANCE.getOrderedListItem_Item();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UnorderedListItemImpl <em>Unordered List Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UnorderedListItemImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnorderedListItem()
     * @generated
     */
    EClass UNORDERED_LIST_ITEM = eINSTANCE.getUnorderedListItem();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNORDERED_LIST_ITEM__ITEM = eINSTANCE.getUnorderedListItem_Item();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ItalicTextImpl <em>Italic Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ItalicTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getItalicText()
     * @generated
     */
    EClass ITALIC_TEXT = eINSTANCE.getItalicText();

    /**
     * The meta object literal for the '<em><b>Italic Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITALIC_TEXT__ITALIC_TEXT = eINSTANCE.getItalicText_ItalicText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BoldTextImpl <em>Bold Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BoldTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoldText()
     * @generated
     */
    EClass BOLD_TEXT = eINSTANCE.getBoldText();

    /**
     * The meta object literal for the '<em><b>Bold Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOLD_TEXT__BOLD_TEXT = eINSTANCE.getBoldText_BoldText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ItalicBoldTextImpl <em>Italic Bold Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ItalicBoldTextImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getItalicBoldText()
     * @generated
     */
    EClass ITALIC_BOLD_TEXT = eINSTANCE.getItalicBoldText();

    /**
     * The meta object literal for the '<em><b>Italic Bold Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT = eINSTANCE.getItalicBoldText_ItalicBoldText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBlockQuote()
     * @generated
     */
    EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

    /**
     * The meta object literal for the '<em><b>Block Quote Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_QUOTE__BLOCK_QUOTE_TEXT = eINSTANCE.getBlockQuote_BlockQuoteText();

    /**
     * The meta object literal for the '<em><b>Additional</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_QUOTE__ADDITIONAL = eINSTANCE.getBlockQuote_Additional();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExternalLinkImpl <em>External Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExternalLinkImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExternalLink()
     * @generated
     */
    EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

    /**
     * The meta object literal for the '<em><b>Link Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LINK__LINK_NAME = eINSTANCE.getExternalLink_LinkName();

    /**
     * The meta object literal for the '<em><b>Renamed Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LINK__RENAMED_LINK = eINSTANCE.getExternalLink_RenamedLink();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl <em>Internal Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInternalLink()
     * @generated
     */
    EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

    /**
     * The meta object literal for the '<em><b>Link Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_LINK__LINK_NAME = eINSTANCE.getInternalLink_LinkName();

    /**
     * The meta object literal for the '<em><b>Renamed Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_LINK__RENAMED_LINK = eINSTANCE.getInternalLink_RenamedLink();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FileImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__FILE_NAME = eINSTANCE.getFile_FileName();

    /**
     * The meta object literal for the '<em><b>View Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__VIEW_TYPE = eINSTANCE.getFile_ViewType();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__TEXT = eINSTANCE.getFile_Text();

    /**
     * The meta object literal for the '<em><b>Additional</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__ADDITIONAL = eINSTANCE.getFile_Additional();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CategoryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Category Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__CATEGORY_LINK = eINSTANCE.getCategory_CategoryLink();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TemplateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__TEMPLATE = eINSTANCE.getTemplate_Template();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TemplateTypeImpl <em>Template Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TemplateTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTemplateType()
     * @generated
     */
    EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_TYPE__TYPE = eINSTANCE.getTemplateType_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MetadataImpl <em>Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MetadataImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMetadata()
     * @generated
     */
    EClass METADATA = eINSTANCE.getMetadata();

    /**
     * The meta object literal for the '<em><b>About</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA__ABOUT = eINSTANCE.getMetadata_About();

    /**
     * The meta object literal for the '<em><b>Actual Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA__ACTUAL_INFO = eINSTANCE.getMetadata_ActualInfo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AboutImpl <em>About</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AboutImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAbout()
     * @generated
     */
    EClass ABOUT = eINSTANCE.getAbout();

    /**
     * The meta object literal for the '<em><b>About Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABOUT__ABOUT_TEXT = eINSTANCE.getAbout_AboutText();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl <em>Actual Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActualInformation()
     * @generated
     */
    EClass ACTUAL_INFORMATION = eINSTANCE.getActualInformation();

    /**
     * The meta object literal for the '<em><b>Information On What</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_INFORMATION__INFORMATION_ON_WHAT = eINSTANCE.getActualInformation_InformationOnWhat();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_INFORMATION__LINK = eINSTANCE.getActualInformation_Link();

    /**
     * The meta object literal for the '<em><b>Additional Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_INFORMATION__ADDITIONAL_LINKS = eINSTANCE.getActualInformation_AdditionalLinks();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MainInformationImpl <em>Main Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MainInformationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMainInformation()
     * @generated
     */
    EClass MAIN_INFORMATION = eINSTANCE.getMainInformation();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_INFORMATION__LINK = eINSTANCE.getMainInformation_Link();

  }

} //MyDslPackage
