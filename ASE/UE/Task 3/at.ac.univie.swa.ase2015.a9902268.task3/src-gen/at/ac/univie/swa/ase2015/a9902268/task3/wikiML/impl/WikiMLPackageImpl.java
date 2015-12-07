/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.QuoteTemplate;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLFactory;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass wikiPageEClass = null;

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
  private EClass aboutTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quoteTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unorderedListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unorderListItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderListItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

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
  private EClass externalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyTextSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum viewTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum horizontalAlignEEnum = null;

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
  public EClass getWikiPage()
  {
    return wikiPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWikiPage_Name()
  {
    return (EAttribute)wikiPageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWikiPage_Elements()
  {
    return (EReference)wikiPageEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getTemplate_Type()
  {
    return (EAttribute)templateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAboutTemplate()
  {
    return aboutTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAboutTemplate_Content()
  {
    return (EReference)aboutTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainTemplate()
  {
    return mainTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainTemplate_Content()
  {
    return (EReference)mainTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuoteTemplate()
  {
    return quoteTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedList()
  {
    return orderedListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedList_Items()
  {
    return (EReference)orderedListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedList_End()
  {
    return (EReference)orderedListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnorderedList()
  {
    return unorderedListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnorderedList_Items()
  {
    return (EReference)unorderedListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnorderedList_End()
  {
    return (EReference)unorderedListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnorderListItem()
  {
    return unorderListItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnorderListItem_Level()
  {
    return (EAttribute)unorderListItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnorderListItem_Itemtext()
  {
    return (EReference)unorderListItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderListItem()
  {
    return orderListItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderListItem_Itemtext()
  {
    return (EReference)orderListItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Name()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Type()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_HAlign()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_AltText()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Caption()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getCategory_Value()
  {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
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
  public EReference getHeading2_HeadingValue2()
  {
    return (EReference)heading2EClass.getEStructuralFeatures().get(0);
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
  public EReference getHeading3_HeadingValue3()
  {
    return (EReference)heading3EClass.getEStructuralFeatures().get(0);
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
  public EReference getHeading4_HeadingValue4()
  {
    return (EReference)heading4EClass.getEStructuralFeatures().get(0);
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
  public EReference getHeading5_HeadingValue5()
  {
    return (EReference)heading5EClass.getEStructuralFeatures().get(0);
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
  public EReference getAbstractFormattedInlineContent_Name()
  {
    return (EReference)abstractFormattedInlineContentEClass.getEStructuralFeatures().get(0);
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
  public EReference getHyperLink_AltText()
  {
    return (EReference)hyperLinkEClass.getEStructuralFeatures().get(0);
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
  public EReference getInternal_Link()
  {
    return (EReference)internalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInternal_Anchor()
  {
    return (EReference)internalEClass.getEStructuralFeatures().get(1);
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
  public EClass getAnyTextSequence()
  {
    return anyTextSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnyTextSequence_Content()
  {
    return (EReference)anyTextSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyText()
  {
    return anyTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParagraph()
  {
    return paragraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParagraph_Paragraph()
  {
    return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getViewType()
  {
    return viewTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHorizontalAlign()
  {
    return horizontalAlignEEnum;
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
    wikiPageEClass = createEClass(WIKI_PAGE);
    createEAttribute(wikiPageEClass, WIKI_PAGE__NAME);
    createEReference(wikiPageEClass, WIKI_PAGE__ELEMENTS);

    paragraphTypesEClass = createEClass(PARAGRAPH_TYPES);

    blockQuoteEClass = createEClass(BLOCK_QUOTE);
    createEReference(blockQuoteEClass, BLOCK_QUOTE__CONTENT);

    templateEClass = createEClass(TEMPLATE);
    createEAttribute(templateEClass, TEMPLATE__TYPE);

    aboutTemplateEClass = createEClass(ABOUT_TEMPLATE);
    createEReference(aboutTemplateEClass, ABOUT_TEMPLATE__CONTENT);

    mainTemplateEClass = createEClass(MAIN_TEMPLATE);
    createEReference(mainTemplateEClass, MAIN_TEMPLATE__CONTENT);

    quoteTemplateEClass = createEClass(QUOTE_TEMPLATE);

    orderedListEClass = createEClass(ORDERED_LIST);
    createEReference(orderedListEClass, ORDERED_LIST__ITEMS);
    createEReference(orderedListEClass, ORDERED_LIST__END);

    unorderedListEClass = createEClass(UNORDERED_LIST);
    createEReference(unorderedListEClass, UNORDERED_LIST__ITEMS);
    createEReference(unorderedListEClass, UNORDERED_LIST__END);

    unorderListItemEClass = createEClass(UNORDER_LIST_ITEM);
    createEAttribute(unorderListItemEClass, UNORDER_LIST_ITEM__LEVEL);
    createEReference(unorderListItemEClass, UNORDER_LIST_ITEM__ITEMTEXT);

    orderListItemEClass = createEClass(ORDER_LIST_ITEM);
    createEReference(orderListItemEClass, ORDER_LIST_ITEM__ITEMTEXT);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__NAME);
    createEAttribute(imageEClass, IMAGE__TYPE);
    createEAttribute(imageEClass, IMAGE__HALIGN);
    createEReference(imageEClass, IMAGE__ALT_TEXT);
    createEReference(imageEClass, IMAGE__CAPTION);

    categoryEClass = createEClass(CATEGORY);
    createEReference(categoryEClass, CATEGORY__NAME);
    createEAttribute(categoryEClass, CATEGORY__VALUE);

    heading2EClass = createEClass(HEADING2);
    createEReference(heading2EClass, HEADING2__HEADING_VALUE2);

    heading3EClass = createEClass(HEADING3);
    createEReference(heading3EClass, HEADING3__HEADING_VALUE3);

    heading4EClass = createEClass(HEADING4);
    createEReference(heading4EClass, HEADING4__HEADING_VALUE4);

    heading5EClass = createEClass(HEADING5);
    createEReference(heading5EClass, HEADING5__HEADING_VALUE5);

    abstractFormattedInlineContentEClass = createEClass(ABSTRACT_FORMATTED_INLINE_CONTENT);
    createEReference(abstractFormattedInlineContentEClass, ABSTRACT_FORMATTED_INLINE_CONTENT__NAME);

    boldEClass = createEClass(BOLD);

    italicEClass = createEClass(ITALIC);

    italicBoldEClass = createEClass(ITALIC_BOLD);

    abstractUnformattedInlineContentEClass = createEClass(ABSTRACT_UNFORMATTED_INLINE_CONTENT);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__NAME);

    hyperLinkEClass = createEClass(HYPER_LINK);
    createEReference(hyperLinkEClass, HYPER_LINK__ALT_TEXT);

    internalEClass = createEClass(INTERNAL);
    createEReference(internalEClass, INTERNAL__LINK);
    createEReference(internalEClass, INTERNAL__ANCHOR);

    externalEClass = createEClass(EXTERNAL);
    createEAttribute(externalEClass, EXTERNAL__NAME);

    anyTextSequenceEClass = createEClass(ANY_TEXT_SEQUENCE);
    createEReference(anyTextSequenceEClass, ANY_TEXT_SEQUENCE__CONTENT);

    anyTextEClass = createEClass(ANY_TEXT);

    paragraphEClass = createEClass(PARAGRAPH);
    createEAttribute(paragraphEClass, PARAGRAPH__PARAGRAPH);

    // Create enums
    viewTypeEEnum = createEEnum(VIEW_TYPE);
    horizontalAlignEEnum = createEEnum(HORIZONTAL_ALIGN);
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
    aboutTemplateEClass.getESuperTypes().add(this.getTemplate());
    mainTemplateEClass.getESuperTypes().add(this.getTemplate());
    quoteTemplateEClass.getESuperTypes().add(this.getTemplate());
    orderedListEClass.getESuperTypes().add(this.getParagraphTypes());
    unorderedListEClass.getESuperTypes().add(this.getParagraphTypes());
    imageEClass.getESuperTypes().add(this.getParagraphTypes());
    categoryEClass.getESuperTypes().add(this.getParagraphTypes());
    heading2EClass.getESuperTypes().add(this.getParagraphTypes());
    heading3EClass.getESuperTypes().add(this.getParagraphTypes());
    heading4EClass.getESuperTypes().add(this.getParagraphTypes());
    heading5EClass.getESuperTypes().add(this.getParagraphTypes());
    abstractFormattedInlineContentEClass.getESuperTypes().add(this.getAnyText());
    boldEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    italicEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    italicBoldEClass.getESuperTypes().add(this.getAbstractFormattedInlineContent());
    abstractUnformattedInlineContentEClass.getESuperTypes().add(this.getAnyText());
    textEClass.getESuperTypes().add(this.getAbstractUnformattedInlineContent());
    hyperLinkEClass.getESuperTypes().add(this.getAbstractUnformattedInlineContent());
    internalEClass.getESuperTypes().add(this.getHyperLink());
    externalEClass.getESuperTypes().add(this.getHyperLink());
    anyTextEClass.getESuperTypes().add(this.getParagraphTypes());
    paragraphEClass.getESuperTypes().add(this.getParagraphTypes());

    // Initialize classes and features; add operations and parameters
    initEClass(wikiPageEClass, WikiPage.class, "WikiPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWikiPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, WikiPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWikiPage_Elements(), this.getParagraphTypes(), null, "elements", null, 0, -1, WikiPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paragraphTypesEClass, ParagraphTypes.class, "ParagraphTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockQuoteEClass, BlockQuote.class, "BlockQuote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockQuote_Content(), this.getAnyTextSequence(), null, "content", null, 0, 1, BlockQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplate_Type(), ecorePackage.getEString(), "type", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aboutTemplateEClass, AboutTemplate.class, "AboutTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAboutTemplate_Content(), this.getAnyTextSequence(), null, "content", null, 0, -1, AboutTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainTemplateEClass, MainTemplate.class, "MainTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMainTemplate_Content(), this.getAnyTextSequence(), null, "content", null, 0, -1, MainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quoteTemplateEClass, QuoteTemplate.class, "QuoteTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orderedListEClass, OrderedList.class, "OrderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderedList_Items(), this.getOrderListItem(), null, "items", null, 0, -1, OrderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrderedList_End(), this.getParagraph(), null, "end", null, 0, 1, OrderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unorderedListEClass, UnorderedList.class, "UnorderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnorderedList_Items(), this.getUnorderListItem(), null, "items", null, 0, -1, UnorderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnorderedList_End(), this.getParagraph(), null, "end", null, 0, 1, UnorderedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unorderListItemEClass, UnorderListItem.class, "UnorderListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnorderListItem_Level(), ecorePackage.getEString(), "level", null, 0, 1, UnorderListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnorderListItem_Itemtext(), this.getAnyTextSequence(), null, "itemtext", null, 0, 1, UnorderListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderListItemEClass, OrderListItem.class, "OrderListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderListItem_Itemtext(), this.getAnyTextSequence(), null, "itemtext", null, 0, 1, OrderListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Type(), this.getViewType(), "type", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_HAlign(), this.getHorizontalAlign(), "hAlign", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImage_AltText(), this.getAbstractUnformattedInlineContent(), null, "altText", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImage_Caption(), this.getAnyTextSequence(), null, "caption", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategory_Name(), this.getText(), null, "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCategory_Value(), ecorePackage.getEString(), "value", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading2EClass, Heading2.class, "Heading2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading2_HeadingValue2(), this.getAbstractUnformattedInlineContent(), null, "headingValue2", null, 0, 1, Heading2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading3EClass, Heading3.class, "Heading3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading3_HeadingValue3(), this.getAbstractUnformattedInlineContent(), null, "headingValue3", null, 0, 1, Heading3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading4EClass, Heading4.class, "Heading4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading4_HeadingValue4(), this.getAbstractUnformattedInlineContent(), null, "headingValue4", null, 0, 1, Heading4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(heading5EClass, Heading5.class, "Heading5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeading5_HeadingValue5(), this.getAbstractUnformattedInlineContent(), null, "headingValue5", null, 0, 1, Heading5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractFormattedInlineContentEClass, AbstractFormattedInlineContent.class, "AbstractFormattedInlineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractFormattedInlineContent_Name(), this.getAbstractUnformattedInlineContent(), null, "name", null, 0, 1, AbstractFormattedInlineContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boldEClass, Bold.class, "Bold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicEClass, Italic.class, "Italic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicBoldEClass, ItalicBold.class, "ItalicBold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractUnformattedInlineContentEClass, AbstractUnformattedInlineContent.class, "AbstractUnformattedInlineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Name(), ecorePackage.getEString(), "name", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hyperLinkEClass, HyperLink.class, "HyperLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHyperLink_AltText(), this.getAnyText(), null, "altText", null, 0, 1, HyperLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalEClass, Internal.class, "Internal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInternal_Link(), this.getWikiPage(), null, "link", null, 0, 1, Internal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInternal_Anchor(), this.getText(), null, "anchor", null, 0, 1, Internal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternal_Name(), ecorePackage.getEString(), "name", null, 0, 1, External.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyTextSequenceEClass, AnyTextSequence.class, "AnyTextSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnyTextSequence_Content(), this.getAnyText(), null, "content", null, 0, -1, AnyTextSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyTextEClass, AnyText.class, "AnyText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParagraph_Paragraph(), ecorePackage.getEString(), "paragraph", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(viewTypeEEnum, ViewType.class, "ViewType");
    addEEnumLiteral(viewTypeEEnum, ViewType.THUMB);

    initEEnum(horizontalAlignEEnum, HorizontalAlign.class, "HorizontalAlign");
    addEEnumLiteral(horizontalAlignEEnum, HorizontalAlign.RIGHT);

    // Create resource
    createResource(eNS_URI);
  }

} //WikiMLPackageImpl
