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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute list.
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
   * The feature id for the '<em><b>Abstract Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE__ABSTRACT_SECTIONS = 3;

  /**
   * The number of structural features of the '<em>wikipage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIKIPAGE_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL1__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL2__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL3__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSECTION_LEVEL4__NAME = ABSTRACT_SECTION__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
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
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage <em>wikipage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>wikipage</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage
   * @generated
   */
  EClass getwikipage();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getName()
   * @see #getwikipage()
   * @generated
   */
  EAttribute getwikipage_Name();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getContent()
   * @see #getwikipage()
   * @generated
   */
  EAttribute getwikipage_Content();

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
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getAbstractSections <em>Abstract Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstract Sections</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getAbstractSections()
   * @see #getwikipage()
   * @generated
   */
  EReference getwikipage_AbstractSections();

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
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection#getContent()
   * @see #getAbstractSection()
   * @generated
   */
  EAttribute getAbstractSection_Content();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIKIPAGE__NAME = eINSTANCE.getwikipage_Name();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIKIPAGE__CONTENT = eINSTANCE.getwikipage_Content();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKIPAGE__SECTIONS = eINSTANCE.getwikipage_Sections();

    /**
     * The meta object literal for the '<em><b>Abstract Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIKIPAGE__ABSTRACT_SECTIONS = eINSTANCE.getwikipage_AbstractSections();

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
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SECTION__CONTENT = eINSTANCE.getAbstractSection_Content();

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

  }

} //WikiMLPackage
