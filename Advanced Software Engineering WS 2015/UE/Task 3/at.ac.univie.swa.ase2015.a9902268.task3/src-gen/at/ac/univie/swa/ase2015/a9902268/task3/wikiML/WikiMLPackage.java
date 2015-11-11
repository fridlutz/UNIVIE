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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getWikiMLPage()
   * @generated
   */
  int WIKI_ML_PAGE = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_ML_PAGE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Section</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_ML_PAGE__SECTION = 1;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKI_ML_PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.PageTitleImpl <em>Page Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.PageTitleImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getPageTitle()
   * @generated
   */
  int PAGE_TITLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_TITLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_TITLE__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Page Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_TITLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl <em>Abstract Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractSectionImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractSection()
   * @generated
   */
  int ABSTRACT_SECTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
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
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSectionImpl <em>Sub Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSectionImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSection()
   * @generated
   */
  int SUB_SECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Sub Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSectionImpl <em>Sub Sub Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSectionImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSubSection()
   * @generated
   */
  int SUB_SUB_SECTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SECTION__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SECTION__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Sub Sub Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSubSectionImpl <em>Sub Sub Sub Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSubSectionImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSubSubSection()
   * @generated
   */
  int SUB_SUB_SUB_SECTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SUB_SECTION__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SUB_SECTION__CONTENT = ABSTRACT_SECTION__CONTENT;

  /**
   * The number of structural features of the '<em>Sub Sub Sub Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SUB_SUB_SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractParagraphImpl <em>Abstract Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractParagraphImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractParagraph()
   * @generated
   */
  int ABSTRACT_PARAGRAPH = 6;

  /**
   * The number of structural features of the '<em>Abstract Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PARAGRAPH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.NormalParagraphImpl <em>Normal Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.NormalParagraphImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getNormalParagraph()
   * @generated
   */
  int NORMAL_PARAGRAPH = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_PARAGRAPH__NAME = ABSTRACT_PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Normal Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_PARAGRAPH_FEATURE_COUNT = ABSTRACT_PARAGRAPH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldParagraphImpl <em>Bold Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldParagraphImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldParagraph()
   * @generated
   */
  int BOLD_PARAGRAPH = 8;

  /**
   * The number of structural features of the '<em>Bold Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_PARAGRAPH_FEATURE_COUNT = ABSTRACT_PARAGRAPH_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicParagraphImpl <em>Italic Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicParagraphImpl
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicParagraph()
   * @generated
   */
  int ITALIC_PARAGRAPH = 9;

  /**
   * The number of structural features of the '<em>Italic Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_PARAGRAPH_FEATURE_COUNT = ABSTRACT_PARAGRAPH_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage
   * @generated
   */
  EClass getWikiMLPage();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Title</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage#getTitle()
   * @see #getWikiMLPage()
   * @generated
   */
  EReference getWikiMLPage_Title();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Section</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage#getSection()
   * @see #getWikiMLPage()
   * @generated
   */
  EReference getWikiMLPage_Section();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle <em>Page Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Title</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle
   * @generated
   */
  EClass getPageTitle();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle#getName()
   * @see #getPageTitle()
   * @generated
   */
  EAttribute getPageTitle_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle#getContent()
   * @see #getPageTitle()
   * @generated
   */
  EReference getPageTitle_Content();

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
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getName()
   * @see #getAbstractSection()
   * @generated
   */
  EAttribute getAbstractSection_Name();

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
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSection <em>Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Section</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSection
   * @generated
   */
  EClass getSubSection();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSection <em>Sub Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Sub Section</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSection
   * @generated
   */
  EClass getSubSubSection();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSubSection <em>Sub Sub Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Sub Sub Section</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSubSection
   * @generated
   */
  EClass getSubSubSubSection();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractParagraph <em>Abstract Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractParagraph
   * @generated
   */
  EClass getAbstractParagraph();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph <em>Normal Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph
   * @generated
   */
  EClass getNormalParagraph();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph#getName()
   * @see #getNormalParagraph()
   * @generated
   */
  EAttribute getNormalParagraph_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldParagraph <em>Bold Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldParagraph
   * @generated
   */
  EClass getBoldParagraph();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicParagraph <em>Italic Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic Paragraph</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicParagraph
   * @generated
   */
  EClass getItalicParagraph();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getWikiMLPage()
     * @generated
     */
    EClass WIKI_ML_PAGE = eINSTANCE.getWikiMLPage();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKI_ML_PAGE__TITLE = eINSTANCE.getWikiMLPage_Title();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKI_ML_PAGE__SECTION = eINSTANCE.getWikiMLPage_Section();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.PageTitleImpl <em>Page Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.PageTitleImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getPageTitle()
     * @generated
     */
    EClass PAGE_TITLE = eINSTANCE.getPageTitle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_TITLE__NAME = eINSTANCE.getPageTitle_Name();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE_TITLE__CONTENT = eINSTANCE.getPageTitle_Content();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SECTION__NAME = eINSTANCE.getAbstractSection_Name();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SECTION__CONTENT = eINSTANCE.getAbstractSection_Content();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSectionImpl <em>Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSectionImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSection()
     * @generated
     */
    EClass SUB_SECTION = eINSTANCE.getSubSection();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSectionImpl <em>Sub Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSectionImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSubSection()
     * @generated
     */
    EClass SUB_SUB_SECTION = eINSTANCE.getSubSubSection();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSubSectionImpl <em>Sub Sub Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.SubSubSubSectionImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getSubSubSubSection()
     * @generated
     */
    EClass SUB_SUB_SUB_SECTION = eINSTANCE.getSubSubSubSection();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractParagraphImpl <em>Abstract Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.AbstractParagraphImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getAbstractParagraph()
     * @generated
     */
    EClass ABSTRACT_PARAGRAPH = eINSTANCE.getAbstractParagraph();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.NormalParagraphImpl <em>Normal Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.NormalParagraphImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getNormalParagraph()
     * @generated
     */
    EClass NORMAL_PARAGRAPH = eINSTANCE.getNormalParagraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_PARAGRAPH__NAME = eINSTANCE.getNormalParagraph_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldParagraphImpl <em>Bold Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.BoldParagraphImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getBoldParagraph()
     * @generated
     */
    EClass BOLD_PARAGRAPH = eINSTANCE.getBoldParagraph();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicParagraphImpl <em>Italic Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ItalicParagraphImpl
     * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPackageImpl#getItalicParagraph()
     * @generated
     */
    EClass ITALIC_PARAGRAPH = eINSTANCE.getItalicParagraph();

  }

} //WikiMLPackage
