/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.File;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLFactory;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wiki;

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
  private EClass wikiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockQuoteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unOrderListItemLevel2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unOrderListItemLevel1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderListItemLevel1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heading5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractFormattedInlineContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicBoldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractUnformattedInlineContentEClass = null;

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
  private EClass hyperLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalAltEClass = null;

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
  public EClass getwiki()
  {
    return wikiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraphTypes()
  {
    return paragraphTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockQuote()
  {
    return blockQuoteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockQuote_Content()
  {
    return (EReference)blockQuoteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplate()
  {
    return templateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_Name()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_Content()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnOrderListItemLevel2()
  {
    return unOrderListItemLevel2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnOrderListItemLevel2_Name()
  {
    return (EReference)unOrderListItemLevel2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnOrderListItemLevel2_List()
  {
    return (EReference)unOrderListItemLevel2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnOrderListItemLevel1()
  {
    return unOrderListItemLevel1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnOrderListItemLevel1_Name()
  {
    return (EReference)unOrderListItemLevel1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnOrderListItemLevel1_List()
  {
    return (EReference)unOrderListItemLevel1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderListItemLevel1()
  {
    return orderListItemLevel1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderListItemLevel1_Name()
  {
    return (EReference)orderListItemLevel1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderListItemLevel1_List()
  {
    return (EReference)orderListItemLevel1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Name()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Caption()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory()
  {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Name()
  {
    return (EReference)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading1()
  {
    return heading1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeading1_Elements()
  {
    return (EReference)heading1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading2()
  {
    return heading2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading3()
  {
    return heading3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading4()
  {
    return heading4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeading5()
  {
    return heading5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractFormattedInlineContent()
  {
    return abstractFormattedInlineContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBold()
  {
    return boldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalic()
  {
    return italicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalicBold()
  {
    return italicBoldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractUnformattedInlineContent()
  {
    return abstractUnformattedInlineContentEClass;
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
  public EAttribute getText_Name()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHyperLink()
  {
    return hyperLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternal()
  {
    return internalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternal_Name()
  {
    return (EReference)internalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalAlt()
  {
    return internalAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternalAlt_Name()
  {
    return (EReference)internalAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternalAlt_AltText()
  {
    return (EReference)internalAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternal()
  {
    return externalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternal_Name()
  {
    return (EAttribute)externalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalAlt()
  {
    return externalAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalAlt_Name()
  {
    return (EAttribute)externalAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalAlt_AltText()
  {
    return (EReference)externalAltEClass.getEStructuralFeatures().get(1);
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
    wikiEClass = createEClass(WIKI);

    paragraphTypesEClass = createEClass(PARAGRAPH_TYPES);

    blockQuoteEClass = createEClass(BLOCK_QUOTE);
    createEReference(blockQuoteEClass, BLOCK_QUOTE__CONTENT);

    templateEClass = createEClass(TEMPLATE);
    createEReference(templateEClass, TEMPLATE__NAME);
    createEReference(templateEClass, TEMPLATE__CONTENT);

    unOrderListItemLevel2EClass = createEClass(UN_ORDER_LIST_ITEM_LEVEL2);
    createEReference(unOrderListItemLevel2EClass, UN_ORDER_LIST_ITEM_LEVEL2__NAME);
    createEReference(unOrderListItemLevel2EClass, UN_ORDER_LIST_ITEM_LEVEL2__LIST);

    unOrderListItemLevel1EClass = createEClass(UN_ORDER_LIST_ITEM_LEVEL1);
    createEReference(unOrderListItemLevel1EClass, UN_ORDER_LIST_ITEM_LEVEL1__NAME);
    createEReference(unOrderListItemLevel1EClass, UN_ORDER_LIST_ITEM_LEVEL1__LIST);

    orderListItemLevel1EClass = createEClass(ORDER_LIST_ITEM_LEVEL1);
    createEReference(orderListItemLevel1EClass, ORDER_LIST_ITEM_LEVEL1__NAME);
    createEReference(orderListItemLevel1EClass, ORDER_LIST_ITEM_LEVEL1__LIST);

    fileEClass = createEClass(FILE);
    createEReference(fileEClass, FILE__NAME);
    createEReference(fileEClass, FILE__CAPTION);

    categoryEClass = createEClass(CATEGORY);
    createEReference(categoryEClass, CATEGORY__NAME);

    heading1EClass = createEClass(HEADING1);
    createEReference(heading1EClass, HEADING1__ELEMENTS);

    heading2EClass = createEClass(HEADING2);

    heading3EClass = createEClass(HEADING3);

    heading4EClass = createEClass(HEADING4);

    heading5EClass = createEClass(HEADING5);

    abstractFormattedInlineContentEClass = createEClass(ABSTRACT_FORMATTED_INLINE_CONTENT);

    boldEClass = createEClass(BOLD);

    italicEClass = createEClass(ITALIC);

    italicBoldEClass = createEClass(ITALIC_BOLD);

    abstractUnformattedInlineContentEClass = createEClass(ABSTRACT_UNFORMATTED_INLINE_CONTENT);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__NAME);

    hyperLinkEClass = createEClass(HYPER_LINK);

    internalEClass = createEClass(INTERNAL);
    createEReference(internalEClass, INTERNAL__NAME);

    internalAltEClass = createEClass(INTERNAL_ALT);
    createEReference(internalAltEClass, INTERNAL_ALT__NAME);
    createEReference(internalAltEClass, INTERNAL_ALT__ALT_TEXT);

    externalEClass = createEClass(EXTERNAL);
    createEAttribute(externalEClass, EXTERNAL__NAME);

    externalAltEClass = createEClass(EXTERNAL_ALT);
    createEAttribute(externalAltEClass, EXTERNAL_ALT__NAME);
    createEReference(externalAltEClass, EXTERNAL_ALT__ALT_TEXT);
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
    blockQuoteEClass.getESuperTypes().add(this.getParagraphTypes());
    templateEClass.getESuperTypes().add(this.getParagraphTypes());
    unOrderListItemLevel2EClass.getESuperTypes().add(this.getParagraphTypes());
    unOrderListItemLevel1EClass.getESuperTypes().add(this.getParagraphTypes());
    orderListItemLevel1EClass.getESuperTypes().add(this.getParagraphTypes());
    fileEClass.getESuperTypes().add(this.getParagraphTypes());
    categoryEClass.getESuperTypes().add(this.getParagraphTypes());
    heading1EClass.getESuperTypes().add(this.getwiki());
    heading1EClass.getESuperTypes().add(this.getParagraphTypes());
    heading2EClass.getESuperTypes().add(this.getParagraphTypes());
    heading3EClass.getESuperTypes().add(this.getParagraphTypes());
    heading4EClass.getESuperTypes().add(this.getParagraphTypes());
    heading5EClass.getESuperTypes().add(this.getParagraphTypes());
    abstractFormattedInlineContentEClass.getESuperTypes().add(this.getParagraphTypes());
    boldEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    italicEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    italicBoldEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getParagraphTypes());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getHeading2());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getHeading3());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getHeading4());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getHeading5());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getBold());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getItalic());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getItalicBold());
    textEClass.getESuperTypes().add(this.getHeading1());
    textEClass.getESuperTypes().add(this.getAbstractUnformattedInlineContent());
    hyperLinkEClass.getESuperTypes().add(this.getAbstractUnformattedInlineContent());
    internalEClass.getESuperTypes().add(this.getHyperLink());
    internalAltEClass.getESuperTypes().add(this.getHyperLink());
    externalEClass.getESuperTypes().add(this.getHyperLink());
    externalAltEClass.getESuperTypes().add(this.getHyperLink());

    // Initialize classes and features; add operations and parameters
    initEClass(wikiEClass, wiki.class, "wiki", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paragraphTypesEClass, ParagraphTypes.class, "ParagraphTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockQuoteEClass, BlockQuote.class, "BlockQuote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockQuote_Content(), this.getAbstractFormattedInlineContent(), null, "content", null, 0, -1, BlockQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplate_Name(), this.getText(), null, "name", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_Content(), this.getText(), null, "content", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unOrderListItemLevel2EClass, UnOrderListItemLevel2.class, "UnOrderListItemLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnOrderListItemLevel2_Name(), this.getAbstractFormattedInlineContent(), null, "name", null, 0, 1, UnOrderListItemLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnOrderListItemLevel2_List(), this.getAbstractFormattedInlineContent(), null, "list", null, 0, -1, UnOrderListItemLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unOrderListItemLevel1EClass, UnOrderListItemLevel1.class, "UnOrderListItemLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnOrderListItemLevel1_Name(), this.getAbstractFormattedInlineContent(), null, "name", null, 0, 1, UnOrderListItemLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnOrderListItemLevel1_List(), this.getAbstractFormattedInlineContent(), null, "list", null, 0, -1, UnOrderListItemLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderListItemLevel1EClass, OrderListItemLevel1.class, "OrderListItemLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderListItemLevel1_Name(), this.getAbstractFormattedInlineContent(), null, "name", null, 0, 1, OrderListItemLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrderListItemLevel1_List(), this.getAbstractFormattedInlineContent(), null, "list", null, 0, -1, OrderListItemLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFile_Name(), this.getAbstractUnformattedInlineContent(), null, "name", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFile_Caption(), this.getAbstractFormattedInlineContent(), null, "caption", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategory_Name(), this.getAbstractUnformattedInlineContent(), null, "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading1EClass, Heading1.class, "Heading1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading1_Elements(), this.getParagraphTypes(), null, "elements", null, 0, -1, Heading1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading2EClass, Heading2.class, "Heading2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(heading3EClass, Heading3.class, "Heading3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(heading4EClass, Heading4.class, "Heading4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(heading5EClass, Heading5.class, "Heading5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractFormattedInlineContentEClass, AbstractFormattedInlineContent.class, "AbstractFormattedInlineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boldEClass, Bold.class, "Bold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicEClass, Italic.class, "Italic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicBoldEClass, ItalicBold.class, "ItalicBold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractUnformattedInlineContentEClass, AbstractUnformattedInlineContent.class, "AbstractUnformattedInlineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Name(), ecorePackage.getEString(), "name", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperLinkEClass, HyperLink.class, "HyperLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(internalEClass, Internal.class, "Internal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInternal_Name(), this.getText(), null, "name", null, 0, 1, Internal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalAltEClass, InternalAlt.class, "InternalAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInternalAlt_Name(), this.getText(), null, "name", null, 0, 1, InternalAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInternalAlt_AltText(), this.getAbstractFormattedInlineContent(), null, "altText", null, 0, 1, InternalAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternal_Name(), ecorePackage.getEString(), "name", null, 0, 1, External.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalAltEClass, ExternalAlt.class, "ExternalAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalAlt_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalAlt_AltText(), this.getAbstractFormattedInlineContent(), null, "altText", null, 0, 1, ExternalAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WikiMLPackageImpl
