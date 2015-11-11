/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractParagraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldParagraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicParagraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSubSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLFactory;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage;

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
  private EClass wikiMLPageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageTitleEClass = null;

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
  private EClass subSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSubSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subSubSubSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractParagraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalParagraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldParagraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicParagraphEClass = null;

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
  public EClass getWikiMLPage()
  {
    return wikiMLPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWikiMLPage_Title()
  {
    return (EReference)wikiMLPageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWikiMLPage_Section()
  {
    return (EReference)wikiMLPageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageTitle()
  {
    return pageTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageTitle_Name()
  {
    return (EAttribute)pageTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageTitle_Content()
  {
    return (EReference)pageTitleEClass.getEStructuralFeatures().get(1);
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
  public EReference getAbstractSection_Content()
  {
    return (EReference)abstractSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSection()
  {
    return subSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSubSection()
  {
    return subSubSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubSubSubSection()
  {
    return subSubSubSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractParagraph()
  {
    return abstractParagraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalParagraph()
  {
    return normalParagraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNormalParagraph_Name()
  {
    return (EAttribute)normalParagraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoldParagraph()
  {
    return boldParagraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalicParagraph()
  {
    return italicParagraphEClass;
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
    wikiMLPageEClass = createEClass(WIKI_ML_PAGE);
    createEReference(wikiMLPageEClass, WIKI_ML_PAGE__TITLE);
    createEReference(wikiMLPageEClass, WIKI_ML_PAGE__SECTION);

    pageTitleEClass = createEClass(PAGE_TITLE);
    createEAttribute(pageTitleEClass, PAGE_TITLE__NAME);
    createEReference(pageTitleEClass, PAGE_TITLE__CONTENT);

    abstractSectionEClass = createEClass(ABSTRACT_SECTION);
    createEAttribute(abstractSectionEClass, ABSTRACT_SECTION__NAME);
    createEReference(abstractSectionEClass, ABSTRACT_SECTION__CONTENT);

    subSectionEClass = createEClass(SUB_SECTION);

    subSubSectionEClass = createEClass(SUB_SUB_SECTION);

    subSubSubSectionEClass = createEClass(SUB_SUB_SUB_SECTION);

    abstractParagraphEClass = createEClass(ABSTRACT_PARAGRAPH);

    normalParagraphEClass = createEClass(NORMAL_PARAGRAPH);
    createEAttribute(normalParagraphEClass, NORMAL_PARAGRAPH__NAME);

    boldParagraphEClass = createEClass(BOLD_PARAGRAPH);

    italicParagraphEClass = createEClass(ITALIC_PARAGRAPH);
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
    subSectionEClass.getESuperTypes().add(this.getAbstractSection());
    subSubSectionEClass.getESuperTypes().add(this.getAbstractSection());
    subSubSubSectionEClass.getESuperTypes().add(this.getAbstractSection());
    normalParagraphEClass.getESuperTypes().add(this.getAbstractParagraph());
    normalParagraphEClass.getESuperTypes().add(this.getBoldParagraph());
    normalParagraphEClass.getESuperTypes().add(this.getItalicParagraph());
    boldParagraphEClass.getESuperTypes().add(this.getAbstractParagraph());
    italicParagraphEClass.getESuperTypes().add(this.getAbstractParagraph());

    // Initialize classes and features; add operations and parameters
    initEClass(wikiMLPageEClass, WikiMLPage.class, "WikiMLPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWikiMLPage_Title(), this.getPageTitle(), null, "title", null, 0, -1, WikiMLPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWikiMLPage_Section(), this.getAbstractSection(), null, "section", null, 0, -1, WikiMLPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageTitleEClass, PageTitle.class, "PageTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPageTitle_Name(), ecorePackage.getEString(), "name", null, 0, 1, PageTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPageTitle_Content(), this.getAbstractParagraph(), null, "content", null, 0, -1, PageTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractSectionEClass, AbstractSection.class, "AbstractSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractSection_Content(), this.getAbstractParagraph(), null, "content", null, 0, -1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subSectionEClass, SubSection.class, "SubSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subSubSectionEClass, SubSubSection.class, "SubSubSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subSubSubSectionEClass, SubSubSubSection.class, "SubSubSubSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractParagraphEClass, AbstractParagraph.class, "AbstractParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(normalParagraphEClass, NormalParagraph.class, "NormalParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNormalParagraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, NormalParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boldParagraphEClass, BoldParagraph.class, "BoldParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicParagraphEClass, ItalicParagraph.class, "ItalicParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //WikiMLPackageImpl
