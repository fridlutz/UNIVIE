/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLFactory;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiMLPackageImpl extends EPackageImpl implements WikiMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wikipageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsectionLevel1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsectionLevel2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsectionLevel3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsectionLevel4EClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WikiMLPackageImpl()
  {
    super(eNS_URI, WikiMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WikiMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WikiMLPackage init()
  {
    if (isInited) return (WikiMLPackage)EPackage.Registry.INSTANCE.getEPackage(WikiMLPackage.eNS_URI);

    // Obtain or create and register package
    WikiMLPackageImpl theWikiMLPackage = (WikiMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WikiMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WikiMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWikiMLPackage.createPackageContents();

    // Initialize created meta-data
    theWikiMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWikiMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WikiMLPackage.eNS_URI, theWikiMLPackage);
    return theWikiMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwikipage()
  {
    return wikipageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwikipage_Name()
  {
    return (EAttribute)wikipageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwikipage_Content()
  {
    return (EAttribute)wikipageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwikipage_Sections()
  {
    return (EReference)wikipageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwikipage_AbstractSections()
  {
    return (EReference)wikipageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractSection()
  {
    return abstractSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractSection_Name()
  {
    return (EAttribute)abstractSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractSection_Content()
  {
    return (EAttribute)abstractSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsectionLevel1()
  {
    return subsectionLevel1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsectionLevel2()
  {
    return subsectionLevel2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsectionLevel3()
  {
    return subsectionLevel3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsectionLevel4()
  {
    return subsectionLevel4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLFactory getWikiMLFactory()
  {
    return (WikiMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    wikipageEClass = createEClass(WIKIPAGE);
    createEAttribute(wikipageEClass, WIKIPAGE__NAME);
    createEAttribute(wikipageEClass, WIKIPAGE__CONTENT);
    createEReference(wikipageEClass, WIKIPAGE__SECTIONS);
    createEReference(wikipageEClass, WIKIPAGE__ABSTRACT_SECTIONS);

    abstractSectionEClass = createEClass(ABSTRACT_SECTION);
    createEAttribute(abstractSectionEClass, ABSTRACT_SECTION__NAME);
    createEAttribute(abstractSectionEClass, ABSTRACT_SECTION__CONTENT);

    subsectionLevel1EClass = createEClass(SUBSECTION_LEVEL1);

    subsectionLevel2EClass = createEClass(SUBSECTION_LEVEL2);

    subsectionLevel3EClass = createEClass(SUBSECTION_LEVEL3);

    subsectionLevel4EClass = createEClass(SUBSECTION_LEVEL4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    subsectionLevel1EClass.getESuperTypes().add(this.getAbstractSection());
    subsectionLevel2EClass.getESuperTypes().add(this.getAbstractSection());
    subsectionLevel3EClass.getESuperTypes().add(this.getAbstractSection());
    subsectionLevel4EClass.getESuperTypes().add(this.getAbstractSection());

    // Initialize classes and features; add operations and parameters
    initEClass(wikipageEClass, wikipage.class, "wikipage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getwikipage_Name(), ecorePackage.getEString(), "name", null, 0, 1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwikipage_Content(), ecorePackage.getEString(), "content", null, 0, -1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwikipage_Sections(), this.getAbstractSection(), null, "sections", null, 0, -1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwikipage_AbstractSections(), this.getAbstractSection(), null, "AbstractSections", null, 0, -1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractSectionEClass, AbstractSection.class, "AbstractSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractSection_Content(), ecorePackage.getEString(), "content", null, 0, 1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subsectionLevel1EClass, SubsectionLevel1.class, "SubsectionLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel2EClass, SubsectionLevel2.class, "SubsectionLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel3EClass, SubsectionLevel3.class, "SubsectionLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel4EClass, SubsectionLevel4.class, "SubsectionLevel4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //WikiMLPackageImpl
