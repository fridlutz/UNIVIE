/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl <em>wikipage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getwikipage()
   * @generated
   */
  int WIKIPAGE = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE__CONTENT = 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE__SECTIONS = 2;

  /**
   * The number of structural features of the '<em>wikipage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl <em>Abstract Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractSection()
   * @generated
   */
  int ABSTRACT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SECTION__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel1Impl <em>Subsection Level1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel1Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel1()
   * @generated
   */
  int SUBSECTION_LEVEL1 = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL1__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL1__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Subsection Level1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL1_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel2Impl <em>Subsection Level2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel2Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel2()
   * @generated
   */
  int SUBSECTION_LEVEL2 = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL2__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL2__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Subsection Level2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL2_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel3Impl <em>Subsection Level3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel3Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel3()
   * @generated
   */
  int SUBSECTION_LEVEL3 = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL3__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL3__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Subsection Level3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL3_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel4Impl <em>Subsection Level4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel4Impl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel4()
   * @generated
   */
  int SUBSECTION_LEVEL4 = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL4__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL4__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Subsection Level4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL4_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InlineContentImpl <em>Inline Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InlineContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInlineContent()
   * @generated
   */
  int INLINE_CONTENT = 6;

  /**
   * The number of structural features of the '<em>Inline Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.FormattedContentImpl <em>Formatted Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.FormattedContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getFormattedContent()
   * @generated
   */
  int FORMATTED_CONTENT = 7;

  /**
   * The number of structural features of the '<em>Formatted Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATTED_CONTENT_FEATURE_COUNT = INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicContentImpl <em>Italic Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicContent()
   * @generated
   */
  int ITALIC_CONTENT = 8;

  /**
   * The number of structural features of the '<em>Italic Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_CONTENT_FEATURE_COUNT = FORMATTED_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldContentImpl <em>Bold Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldContent()
   * @generated
   */
  int BOLD_CONTENT = 9;

  /**
   * The number of structural features of the '<em>Bold Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_CONTENT_FEATURE_COUNT = FORMATTED_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldItalicContentImpl <em>Bold Italic Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldItalicContentImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldItalicContent()
   * @generated
   */
  int BOLD_ITALIC_CONTENT = 10;

  /**
   * The number of structural features of the '<em>Bold Italic Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_ITALIC_CONTENT_FEATURE_COUNT = FORMATTED_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.TextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getText()
   * @generated
   */
  int TEXT = 11;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = INLINE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnFormattedTextImpl <em>Un Formatted Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnFormattedTextImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnFormattedText()
   * @generated
   */
  int UN_FORMATTED_TEXT = 12;

  /**
   * The feature id for the '<em><b>Words</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_FORMATTED_TEXT__WORDS = TEXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Un Formatted Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_FORMATTED_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperlinkImpl <em>Hyperlink</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperlinkImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHyperlink()
   * @generated
   */
  int HYPERLINK = 13;

  /**
   * The number of structural features of the '<em>Hyperlink</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERLINK_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkImpl <em>External Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalLink()
   * @generated
   */
  int EXTERNAL_LINK = 14;

  /**
   * The feature id for the '<em><b>Page Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK__PAGE_NAME = HYPERLINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK_FEATURE_COUNT = HYPERLINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl <em>External Link Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalLinkAlternative()
   * @generated
   */
  int EXTERNAL_LINK_ALTERNATIVE = 15;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK_ALTERNATIVE__URL = HYPERLINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alternative Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT = HYPERLINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Link Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_LINK_ALTERNATIVE_FEATURE_COUNT = HYPERLINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkImpl <em>Internal Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalLink()
   * @generated
   */
  int INTERNAL_LINK = 16;

  /**
   * The feature id for the '<em><b>Page Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK__PAGE_NAME = HYPERLINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Internal Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK_FEATURE_COUNT = HYPERLINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl <em>Internal Link Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalLinkAlternative()
   * @generated
   */
  int INTERNAL_LINK_ALTERNATIVE = 17;

  /**
   * The feature id for the '<em><b>Page Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK_ALTERNATIVE__PAGE_NAME = HYPERLINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alternative Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT = HYPERLINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Internal Link Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_LINK_ALTERNATIVE_FEATURE_COUNT = HYPERLINK_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage <em>wikipage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>wikipage</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage
   * @generated
   */
  EClass getwikipage();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getTitle()
   * @see #getwikipage()
   * @generated
   */
  EAttribute getwikipage_Title();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getContent()
   * @see #getwikipage()
   * @generated
   */
  EReference getwikipage_Content();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getSections()
   * @see #getwikipage()
   * @generated
   */
  EReference getwikipage_Sections();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection <em>Abstract Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Section</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection
   * @generated
   */
  EClass getAbstractSection();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getName()
   * @see #getAbstractSection()
   * @generated
   */
  EReference getAbstractSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getContent()
   * @see #getAbstractSection()
   * @generated
   */
  EReference getAbstractSection_Content();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1 <em>Subsection Level1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsection Level1</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1
   * @generated
   */
  EClass getSubsectionLevel1();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2 <em>Subsection Level2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsection Level2</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2
   * @generated
   */
  EClass getSubsectionLevel2();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3 <em>Subsection Level3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsection Level3</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3
   * @generated
   */
  EClass getSubsectionLevel3();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4 <em>Subsection Level4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsection Level4</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4
   * @generated
   */
  EClass getSubsectionLevel4();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent <em>Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent
   * @generated
   */
  EClass getInlineContent();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.FormattedContent <em>Formatted Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formatted Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.FormattedContent
   * @generated
   */
  EClass getFormattedContent();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicContent <em>Italic Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicContent
   * @generated
   */
  EClass getItalicContent();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldContent <em>Bold Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldContent
   * @generated
   */
  EClass getBoldContent();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldItalicContent <em>Bold Italic Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold Italic Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldItalicContent
   * @generated
   */
  EClass getBoldItalicContent();

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
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText <em>Un Formatted Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Formatted Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText
   * @generated
   */
  EClass getUnFormattedText();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText#getWords <em>Words</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Words</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText#getWords()
   * @see #getUnFormattedText()
   * @generated
   */
  EAttribute getUnFormattedText_Words();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Hyperlink <em>Hyperlink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hyperlink</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Hyperlink
   * @generated
   */
  EClass getHyperlink();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink <em>External Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Link</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink
   * @generated
   */
  EClass getExternalLink();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink#getPageName <em>Page Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Page Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink#getPageName()
   * @see #getExternalLink()
   * @generated
   */
  EReference getExternalLink_PageName();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative <em>External Link Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Link Alternative</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative
   * @generated
   */
  EClass getExternalLinkAlternative();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getUrl()
   * @see #getExternalLinkAlternative()
   * @generated
   */
  EReference getExternalLinkAlternative_Url();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getAlternativeText()
   * @see #getExternalLinkAlternative()
   * @generated
   */
  EReference getExternalLinkAlternative_AlternativeText();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink <em>Internal Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Link</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink
   * @generated
   */
  EClass getInternalLink();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink#getPageName <em>Page Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Page Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink#getPageName()
   * @see #getInternalLink()
   * @generated
   */
  EReference getInternalLink_PageName();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative <em>Internal Link Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Link Alternative</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative
   * @generated
   */
  EClass getInternalLinkAlternative();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getPageName <em>Page Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Page Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getPageName()
   * @see #getInternalLinkAlternative()
   * @generated
   */
  EReference getInternalLinkAlternative_PageName();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative Text</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getAlternativeText()
   * @see #getInternalLinkAlternative()
   * @generated
   */
  EReference getInternalLinkAlternative_AlternativeText();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl <em>wikipage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getwikipage()
     * @generated
     */
    EClass WIKIPAGE = eINSTANCE.getwikipage();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIKIPAGE__TITLE = eINSTANCE.getwikipage_Title();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKIPAGE__CONTENT = eINSTANCE.getwikipage_Content();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKIPAGE__SECTIONS = eINSTANCE.getwikipage_Sections();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl <em>Abstract Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractSection()
     * @generated
     */
    EClass ABSTRACT_SECTION = eINSTANCE.getAbstractSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SECTION__NAME = eINSTANCE.getAbstractSection_Name();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SECTION__CONTENT = eINSTANCE.getAbstractSection_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel1Impl <em>Subsection Level1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel1Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel1()
     * @generated
     */
    EClass SUBSECTION_LEVEL1 = eINSTANCE.getSubsectionLevel1();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel2Impl <em>Subsection Level2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel2Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel2()
     * @generated
     */
    EClass SUBSECTION_LEVEL2 = eINSTANCE.getSubsectionLevel2();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel3Impl <em>Subsection Level3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel3Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel3()
     * @generated
     */
    EClass SUBSECTION_LEVEL3 = eINSTANCE.getSubsectionLevel3();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel4Impl <em>Subsection Level4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubsectionLevel4Impl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubsectionLevel4()
     * @generated
     */
    EClass SUBSECTION_LEVEL4 = eINSTANCE.getSubsectionLevel4();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InlineContentImpl <em>Inline Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InlineContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInlineContent()
     * @generated
     */
    EClass INLINE_CONTENT = eINSTANCE.getInlineContent();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.FormattedContentImpl <em>Formatted Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.FormattedContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getFormattedContent()
     * @generated
     */
    EClass FORMATTED_CONTENT = eINSTANCE.getFormattedContent();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicContentImpl <em>Italic Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicContent()
     * @generated
     */
    EClass ITALIC_CONTENT = eINSTANCE.getItalicContent();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldContentImpl <em>Bold Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldContent()
     * @generated
     */
    EClass BOLD_CONTENT = eINSTANCE.getBoldContent();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldItalicContentImpl <em>Bold Italic Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldItalicContentImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldItalicContent()
     * @generated
     */
    EClass BOLD_ITALIC_CONTENT = eINSTANCE.getBoldItalicContent();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnFormattedTextImpl <em>Un Formatted Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnFormattedTextImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getUnFormattedText()
     * @generated
     */
    EClass UN_FORMATTED_TEXT = eINSTANCE.getUnFormattedText();

    /**
     * The meta object literal for the '<em><b>Words</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UN_FORMATTED_TEXT__WORDS = eINSTANCE.getUnFormattedText_Words();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperlinkImpl <em>Hyperlink</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperlinkImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getHyperlink()
     * @generated
     */
    EClass HYPERLINK = eINSTANCE.getHyperlink();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkImpl <em>External Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalLink()
     * @generated
     */
    EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

    /**
     * The meta object literal for the '<em><b>Page Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LINK__PAGE_NAME = eINSTANCE.getExternalLink_PageName();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl <em>External Link Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getExternalLinkAlternative()
     * @generated
     */
    EClass EXTERNAL_LINK_ALTERNATIVE = eINSTANCE.getExternalLinkAlternative();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LINK_ALTERNATIVE__URL = eINSTANCE.getExternalLinkAlternative_Url();

    /**
     * The meta object literal for the '<em><b>Alternative Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT = eINSTANCE.getExternalLinkAlternative_AlternativeText();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkImpl <em>Internal Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalLink()
     * @generated
     */
    EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

    /**
     * The meta object literal for the '<em><b>Page Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_LINK__PAGE_NAME = eINSTANCE.getInternalLink_PageName();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl <em>Internal Link Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getInternalLinkAlternative()
     * @generated
     */
    EClass INTERNAL_LINK_ALTERNATIVE = eINSTANCE.getInternalLinkAlternative();

    /**
     * The meta object literal for the '<em><b>Page Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_LINK_ALTERNATIVE__PAGE_NAME = eINSTANCE.getInternalLinkAlternative_PageName();

    /**
     * The meta object literal for the '<em><b>Alternative Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT = eINSTANCE.getInternalLinkAlternative_AlternativeText();

  }

} //WikiMLPackage
