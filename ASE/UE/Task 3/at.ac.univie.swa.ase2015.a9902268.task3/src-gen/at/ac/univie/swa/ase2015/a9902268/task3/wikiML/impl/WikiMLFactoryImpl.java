/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case WikiMLPackage.WIKI_PAGE: return createWikiPage();
      case WikiMLPackage.PARAGRAPH_TYPES: return createParagraphTypes();
      case WikiMLPackage.BLOCK_QUOTE: return createBlockQuote();
      case WikiMLPackage.TEMPLATE: return createTemplate();
      case WikiMLPackage.ABOUT_TEMPLATE: return createAboutTemplate();
      case WikiMLPackage.MAIN_TEMPLATE: return createMainTemplate();
      case WikiMLPackage.QUOTE_TEMPLATE: return createQuoteTemplate();
      case WikiMLPackage.ORDERED_LIST: return createOrderedList();
      case WikiMLPackage.UNORDERED_LIST: return createUnorderedList();
      case WikiMLPackage.UNORDER_LIST_ITEM: return createUnorderListItem();
      case WikiMLPackage.ORDER_LIST_ITEM: return createOrderListItem();
      case WikiMLPackage.IMAGE: return createImage();
      case WikiMLPackage.CATEGORY: return createCategory();
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
      case WikiMLPackage.EXTERNAL: return createExternal();
      case WikiMLPackage.ANY_TEXT_SEQUENCE: return createAnyTextSequence();
      case WikiMLPackage.ANY_TEXT: return createAnyText();
      case WikiMLPackage.PARAGRAPH: return createParagraph();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WikiMLPackage.VIEW_TYPE:
        return createViewTypeFromString(eDataType, initialValue);
      case WikiMLPackage.HORIZONTAL_ALIGN:
        return createHorizontalAlignFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WikiMLPackage.VIEW_TYPE:
        return convertViewTypeToString(eDataType, instanceValue);
      case WikiMLPackage.HORIZONTAL_ALIGN:
        return convertHorizontalAlignToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiPage createWikiPage()
  {
    WikiPageImpl wikiPage = new WikiPageImpl();
    return wikiPage;
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
  public AboutTemplate createAboutTemplate()
  {
    AboutTemplateImpl aboutTemplate = new AboutTemplateImpl();
    return aboutTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainTemplate createMainTemplate()
  {
    MainTemplateImpl mainTemplate = new MainTemplateImpl();
    return mainTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuoteTemplate createQuoteTemplate()
  {
    QuoteTemplateImpl quoteTemplate = new QuoteTemplateImpl();
    return quoteTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedList createOrderedList()
  {
    OrderedListImpl orderedList = new OrderedListImpl();
    return orderedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnorderedList createUnorderedList()
  {
    UnorderedListImpl unorderedList = new UnorderedListImpl();
    return unorderedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnorderListItem createUnorderListItem()
  {
    UnorderListItemImpl unorderListItem = new UnorderListItemImpl();
    return unorderListItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderListItem createOrderListItem()
  {
    OrderListItemImpl orderListItem = new OrderListItemImpl();
    return orderListItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
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
  public AnyTextSequence createAnyTextSequence()
  {
    AnyTextSequenceImpl anyTextSequence = new AnyTextSequenceImpl();
    return anyTextSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyText createAnyText()
  {
    AnyTextImpl anyText = new AnyTextImpl();
    return anyText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paragraph createParagraph()
  {
    ParagraphImpl paragraph = new ParagraphImpl();
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType createViewTypeFromString(EDataType eDataType, String initialValue)
  {
    ViewType result = ViewType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertViewTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalAlign createHorizontalAlignFromString(EDataType eDataType, String initialValue)
  {
    HorizontalAlign result = HorizontalAlign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHorizontalAlignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
