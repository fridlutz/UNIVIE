/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldItalicContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.FormattedContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Hyperlink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText;
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inlineContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formattedContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldItalicContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unFormattedTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hyperlinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalLinkAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalLinkAlternativeEClass = null;

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
  public EAttribute getwikipage_Title()
  {
    return (EAttribute)wikipageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwikipage_Content()
  {
    return (EReference)wikipageEClass.getEStructuralFeatures().get(1);
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
  public EClass getAbstractSection()
  {
    return abstractSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractSection_Name()
  {
    return (EReference)abstractSectionEClass.getEStructuralFeatures().get(0);
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
  public EClass getInlineContent()
  {
    return inlineContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormattedContent()
  {
    return formattedContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalicContent()
  {
    return italicContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoldContent()
  {
    return boldContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoldItalicContent()
  {
    return boldItalicContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnFormattedText()
  {
    return unFormattedTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnFormattedText_Words()
  {
    return (EAttribute)unFormattedTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHyperlink()
  {
    return hyperlinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalLink()
  {
    return externalLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalLink_PageName()
  {
    return (EReference)externalLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalLinkAlternative()
  {
    return externalLinkAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalLinkAlternative_Url()
  {
    return (EReference)externalLinkAlternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalLinkAlternative_AlternativeText()
  {
    return (EReference)externalLinkAlternativeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalLink()
  {
    return internalLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternalLink_PageName()
  {
    return (EReference)internalLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalLinkAlternative()
  {
    return internalLinkAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternalLinkAlternative_PageName()
  {
    return (EReference)internalLinkAlternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternalLinkAlternative_AlternativeText()
  {
    return (EReference)internalLinkAlternativeEClass.getEStructuralFeatures().get(1);
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
    createEAttribute(wikipageEClass, WIKIPAGE__TITLE);
    createEReference(wikipageEClass, WIKIPAGE__CONTENT);
    createEReference(wikipageEClass, WIKIPAGE__SECTIONS);

    abstractSectionEClass = createEClass(ABSTRACT_SECTION);
    createEReference(abstractSectionEClass, ABSTRACT_SECTION__NAME);
    createEReference(abstractSectionEClass, ABSTRACT_SECTION__CONTENT);

    subsectionLevel1EClass = createEClass(SUBSECTION_LEVEL1);

    subsectionLevel2EClass = createEClass(SUBSECTION_LEVEL2);

    subsectionLevel3EClass = createEClass(SUBSECTION_LEVEL3);

    subsectionLevel4EClass = createEClass(SUBSECTION_LEVEL4);

    inlineContentEClass = createEClass(INLINE_CONTENT);

    formattedContentEClass = createEClass(FORMATTED_CONTENT);

    italicContentEClass = createEClass(ITALIC_CONTENT);

    boldContentEClass = createEClass(BOLD_CONTENT);

    boldItalicContentEClass = createEClass(BOLD_ITALIC_CONTENT);

    textEClass = createEClass(TEXT);

    unFormattedTextEClass = createEClass(UN_FORMATTED_TEXT);
    createEAttribute(unFormattedTextEClass, UN_FORMATTED_TEXT__WORDS);

    hyperlinkEClass = createEClass(HYPERLINK);

    externalLinkEClass = createEClass(EXTERNAL_LINK);
    createEReference(externalLinkEClass, EXTERNAL_LINK__PAGE_NAME);

    externalLinkAlternativeEClass = createEClass(EXTERNAL_LINK_ALTERNATIVE);
    createEReference(externalLinkAlternativeEClass, EXTERNAL_LINK_ALTERNATIVE__URL);
    createEReference(externalLinkAlternativeEClass, EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT);

    internalLinkEClass = createEClass(INTERNAL_LINK);
    createEReference(internalLinkEClass, INTERNAL_LINK__PAGE_NAME);

    internalLinkAlternativeEClass = createEClass(INTERNAL_LINK_ALTERNATIVE);
    createEReference(internalLinkAlternativeEClass, INTERNAL_LINK_ALTERNATIVE__PAGE_NAME);
    createEReference(internalLinkAlternativeEClass, INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT);
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
    formattedContentEClass.getESuperTypes().add(this.getInlineContent());
    italicContentEClass.getESuperTypes().add(this.getFormattedContent());
    boldContentEClass.getESuperTypes().add(this.getFormattedContent());
    boldItalicContentEClass.getESuperTypes().add(this.getFormattedContent());
    textEClass.getESuperTypes().add(this.getInlineContent());
    textEClass.getESuperTypes().add(this.getItalicContent());
    textEClass.getESuperTypes().add(this.getBoldContent());
    textEClass.getESuperTypes().add(this.getBoldItalicContent());
    unFormattedTextEClass.getESuperTypes().add(this.getText());
    hyperlinkEClass.getESuperTypes().add(this.getText());
    externalLinkEClass.getESuperTypes().add(this.getHyperlink());
    externalLinkAlternativeEClass.getESuperTypes().add(this.getHyperlink());
    internalLinkEClass.getESuperTypes().add(this.getHyperlink());
    internalLinkAlternativeEClass.getESuperTypes().add(this.getHyperlink());

    // Initialize classes and features; add operations and parameters
    initEClass(wikipageEClass, wikipage.class, "wikipage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getwikipage_Title(), ecorePackage.getEString(), "title", null, 0, 1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwikipage_Content(), this.getInlineContent(), null, "content", null, 0, -1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwikipage_Sections(), this.getAbstractSection(), null, "sections", null, 0, -1, wikipage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractSectionEClass, AbstractSection.class, "AbstractSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractSection_Name(), this.getText(), null, "name", null, 0, 1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractSection_Content(), this.getInlineContent(), null, "content", null, 0, -1, AbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subsectionLevel1EClass, SubsectionLevel1.class, "SubsectionLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel2EClass, SubsectionLevel2.class, "SubsectionLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel3EClass, SubsectionLevel3.class, "SubsectionLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsectionLevel4EClass, SubsectionLevel4.class, "SubsectionLevel4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inlineContentEClass, InlineContent.class, "InlineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(formattedContentEClass, FormattedContent.class, "FormattedContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicContentEClass, ItalicContent.class, "ItalicContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boldContentEClass, BoldContent.class, "BoldContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boldItalicContentEClass, BoldItalicContent.class, "BoldItalicContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unFormattedTextEClass, UnFormattedText.class, "UnFormattedText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnFormattedText_Words(), ecorePackage.getEString(), "words", null, 0, 1, UnFormattedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperlinkEClass, Hyperlink.class, "Hyperlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalLinkEClass, ExternalLink.class, "ExternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalLink_PageName(), this.getUnFormattedText(), null, "pageName", null, 0, 1, ExternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalLinkAlternativeEClass, ExternalLinkAlternative.class, "ExternalLinkAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalLinkAlternative_Url(), this.getUnFormattedText(), null, "url", null, 0, 1, ExternalLinkAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalLinkAlternative_AlternativeText(), this.getUnFormattedText(), null, "alternativeText", null, 0, 1, ExternalLinkAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalLinkEClass, InternalLink.class, "InternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInternalLink_PageName(), this.getUnFormattedText(), null, "pageName", null, 0, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalLinkAlternativeEClass, InternalLinkAlternative.class, "InternalLinkAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInternalLinkAlternative_PageName(), this.getUnFormattedText(), null, "pageName", null, 0, 1, InternalLinkAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInternalLinkAlternative_AlternativeText(), this.getUnFormattedText(), null, "alternativeText", null, 0, 1, InternalLinkAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WikiMLPackageImpl
