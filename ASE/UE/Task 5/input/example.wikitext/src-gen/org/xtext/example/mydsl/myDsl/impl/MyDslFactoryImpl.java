/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
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
      case MyDslPackage.DOCUMENT: return createDocument();
      case MyDslPackage.COMMENT: return createComment();
      case MyDslPackage.UNFORMATTED_TEXT: return createUnformattedText();
      case MyDslPackage.FORMATTED_TEXT: return createFormattedText();
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS: return createFormattedTextWithoutLinks();
      case MyDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case MyDslPackage.TEXT_ELEMENT: return createTextElement();
      case MyDslPackage.HEADING: return createHeading();
      case MyDslPackage.HEADING1: return createHeading1();
      case MyDslPackage.HEADING2: return createHeading2();
      case MyDslPackage.HEADING3: return createHeading3();
      case MyDslPackage.HEADING4: return createHeading4();
      case MyDslPackage.LIST: return createList();
      case MyDslPackage.ORDERED_LIST: return createOrderedList();
      case MyDslPackage.UNORDERED_LIST: return createUnorderedList();
      case MyDslPackage.ORDERED_LIST_ITEM: return createOrderedListItem();
      case MyDslPackage.UNORDERED_LIST_ITEM: return createUnorderedListItem();
      case MyDslPackage.ITALIC_TEXT: return createItalicText();
      case MyDslPackage.BOLD_TEXT: return createBoldText();
      case MyDslPackage.ITALIC_BOLD_TEXT: return createItalicBoldText();
      case MyDslPackage.BLOCK_QUOTE: return createBlockQuote();
      case MyDslPackage.EXTERNAL_LINK: return createExternalLink();
      case MyDslPackage.INTERNAL_LINK: return createInternalLink();
      case MyDslPackage.FILE: return createFile();
      case MyDslPackage.CATEGORY: return createCategory();
      case MyDslPackage.TEMPLATE: return createTemplate();
      case MyDslPackage.TEMPLATE_TYPE: return createTemplateType();
      case MyDslPackage.METADATA: return createMetadata();
      case MyDslPackage.ABOUT: return createAbout();
      case MyDslPackage.ACTUAL_INFORMATION: return createActualInformation();
      case MyDslPackage.MAIN_INFORMATION: return createMainInformation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText createUnformattedText()
  {
    UnformattedTextImpl unformattedText = new UnformattedTextImpl();
    return unformattedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedText createFormattedText()
  {
    FormattedTextImpl formattedText = new FormattedTextImpl();
    return formattedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedTextWithoutLinks createFormattedTextWithoutLinks()
  {
    FormattedTextWithoutLinksImpl formattedTextWithoutLinks = new FormattedTextWithoutLinksImpl();
    return formattedTextWithoutLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextElement createTextElement()
  {
    TextElementImpl textElement = new TextElementImpl();
    return textElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Heading createHeading()
  {
    HeadingImpl heading = new HeadingImpl();
    return heading;
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
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
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
  public OrderedListItem createOrderedListItem()
  {
    OrderedListItemImpl orderedListItem = new OrderedListItemImpl();
    return orderedListItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnorderedListItem createUnorderedListItem()
  {
    UnorderedListItemImpl unorderedListItem = new UnorderedListItemImpl();
    return unorderedListItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicText createItalicText()
  {
    ItalicTextImpl italicText = new ItalicTextImpl();
    return italicText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldText createBoldText()
  {
    BoldTextImpl boldText = new BoldTextImpl();
    return boldText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicBoldText createItalicBoldText()
  {
    ItalicBoldTextImpl italicBoldText = new ItalicBoldTextImpl();
    return italicBoldText;
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
  public ExternalLink createExternalLink()
  {
    ExternalLinkImpl externalLink = new ExternalLinkImpl();
    return externalLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalLink createInternalLink()
  {
    InternalLinkImpl internalLink = new InternalLinkImpl();
    return internalLink;
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
  public TemplateType createTemplateType()
  {
    TemplateTypeImpl templateType = new TemplateTypeImpl();
    return templateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metadata createMetadata()
  {
    MetadataImpl metadata = new MetadataImpl();
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public About createAbout()
  {
    AboutImpl about = new AboutImpl();
    return about;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualInformation createActualInformation()
  {
    ActualInformationImpl actualInformation = new ActualInformationImpl();
    return actualInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainInformation createMainInformation()
  {
    MainInformationImpl mainInformation = new MainInformationImpl();
    return mainInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
