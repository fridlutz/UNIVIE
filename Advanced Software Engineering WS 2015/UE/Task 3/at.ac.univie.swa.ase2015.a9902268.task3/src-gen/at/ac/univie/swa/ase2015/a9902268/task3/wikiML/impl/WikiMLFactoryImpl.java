/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiMLFactoryImpl extends EFactoryImpl implements WikiMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WikiMLFactory init()
  {
    try
    {
      WikiMLFactory theWikiMLFactory = (WikiMLFactory)EPackage.Registry.INSTANCE.getEFactory(WikiMLPackage.eNS_URI);
      if (theWikiMLFactory != null)
      {
        return theWikiMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WikiMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WikiMLPackage.WIKI: return createwiki();
      case WikiMLPackage.PARAGRAPH_TYPES: return createParagraphTypes();
      case WikiMLPackage.BLOCK_QUOTE: return createBlockQuote();
      case WikiMLPackage.TEMPLATE: return createTemplate();
      case WikiMLPackage.UN_ORDER_LIST_ITEM_LEVEL2: return createUnOrderListItemLevel2();
      case WikiMLPackage.UN_ORDER_LIST_ITEM_LEVEL1: return createUnOrderListItemLevel1();
      case WikiMLPackage.ORDER_LIST_ITEM_LEVEL1: return createOrderListItemLevel1();
      case WikiMLPackage.FILE: return createFile();
      case WikiMLPackage.CATEGORY: return createCategory();
      case WikiMLPackage.HEADING1: return createHeading1();
      case WikiMLPackage.HEADING2: return createHeading2();
      case WikiMLPackage.HEADING3: return createHeading3();
      case WikiMLPackage.HEADING4: return createHeading4();
      case WikiMLPackage.HEADING5: return createHeading5();
      case WikiMLPackage.ABSTRACT_FORMATTED_INLINE_CONTENT: return createAbstractFormattedInlineContent();
      case WikiMLPackage.BOLD: return createBold();
      case WikiMLPackage.ITALIC: return createItalic();
      case WikiMLPackage.ITALIC_BOLD: return createItalicBold();
      case WikiMLPackage.ABSTRACT_UNFORMATTED_INLINE_CONTENT: return createAbstractUnformattedInlineContent();
      case WikiMLPackage.TEXT: return createText();
      case WikiMLPackage.HYPER_LINK: return createHyperLink();
      case WikiMLPackage.INTERNAL: return createInternal();
      case WikiMLPackage.INTERNAL_ALT: return createInternalAlt();
      case WikiMLPackage.EXTERNAL: return createExternal();
      case WikiMLPackage.EXTERNAL_ALT: return createExternalAlt();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public wiki createwiki()
  {
    wikiImpl wiki = new wikiImpl();
    return wiki;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParagraphTypes createParagraphTypes()
  {
    ParagraphTypesImpl paragraphTypes = new ParagraphTypesImpl();
    return paragraphTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockQuote createBlockQuote()
  {
    BlockQuoteImpl blockQuote = new BlockQuoteImpl();
    return blockQuote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnOrderListItemLevel2 createUnOrderListItemLevel2()
  {
    UnOrderListItemLevel2Impl unOrderListItemLevel2 = new UnOrderListItemLevel2Impl();
    return unOrderListItemLevel2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnOrderListItemLevel1 createUnOrderListItemLevel1()
  {
    UnOrderListItemLevel1Impl unOrderListItemLevel1 = new UnOrderListItemLevel1Impl();
    return unOrderListItemLevel1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderListItemLevel1 createOrderListItemLevel1()
  {
    OrderListItemLevel1Impl orderListItemLevel1 = new OrderListItemLevel1Impl();
    return orderListItemLevel1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory()
  {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading1 createHeading1()
  {
    Heading1Impl heading1 = new Heading1Impl();
    return heading1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading2 createHeading2()
  {
    Heading2Impl heading2 = new Heading2Impl();
    return heading2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading3 createHeading3()
  {
    Heading3Impl heading3 = new Heading3Impl();
    return heading3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading4 createHeading4()
  {
    Heading4Impl heading4 = new Heading4Impl();
    return heading4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading5 createHeading5()
  {
    Heading5Impl heading5 = new Heading5Impl();
    return heading5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFormattedInlineContent createAbstractFormattedInlineContent()
  {
    AbstractFormattedInlineContentImpl abstractFormattedInlineContent = new AbstractFormattedInlineContentImpl();
    return abstractFormattedInlineContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bold createBold()
  {
    BoldImpl bold = new BoldImpl();
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Italic createItalic()
  {
    ItalicImpl italic = new ItalicImpl();
    return italic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicBold createItalicBold()
  {
    ItalicBoldImpl italicBold = new ItalicBoldImpl();
    return italicBold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent createAbstractUnformattedInlineContent()
  {
    AbstractUnformattedInlineContentImpl abstractUnformattedInlineContent = new AbstractUnformattedInlineContentImpl();
    return abstractUnformattedInlineContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HyperLink createHyperLink()
  {
    HyperLinkImpl hyperLink = new HyperLinkImpl();
    return hyperLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Internal createInternal()
  {
    InternalImpl internal = new InternalImpl();
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalAlt createInternalAlt()
  {
    InternalAltImpl internalAlt = new InternalAltImpl();
    return internalAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalAlt createExternalAlt()
  {
    ExternalAltImpl externalAlt = new ExternalAltImpl();
    return externalAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLPackage getWikiMLPackage()
  {
    return (WikiMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WikiMLPackage getPackage()
  {
    return WikiMLPackage.eINSTANCE;
  }

} //WikiMLFactoryImpl
