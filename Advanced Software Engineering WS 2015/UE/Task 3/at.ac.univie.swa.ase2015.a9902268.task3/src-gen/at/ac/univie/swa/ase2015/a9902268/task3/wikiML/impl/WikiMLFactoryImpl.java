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
      case WikiMLPackage.WIKIPAGE: return createwikipage();
      case WikiMLPackage.ABSTRACT_SECTION: return createAbstractSection();
      case WikiMLPackage.SUBSECTION_LEVEL1: return createSubsectionLevel1();
      case WikiMLPackage.SUBSECTION_LEVEL2: return createSubsectionLevel2();
      case WikiMLPackage.SUBSECTION_LEVEL3: return createSubsectionLevel3();
      case WikiMLPackage.SUBSECTION_LEVEL4: return createSubsectionLevel4();
      case WikiMLPackage.INLINE_CONTENT: return createInlineContent();
      case WikiMLPackage.FORMATTED_CONTENT: return createFormattedContent();
      case WikiMLPackage.ITALIC_CONTENT: return createItalicContent();
      case WikiMLPackage.BOLD_CONTENT: return createBoldContent();
      case WikiMLPackage.BOLD_ITALIC_CONTENT: return createBoldItalicContent();
      case WikiMLPackage.TEXT: return createText();
      case WikiMLPackage.UN_FORMATTED_TEXT: return createUnFormattedText();
      case WikiMLPackage.HYPERLINK: return createHyperlink();
      case WikiMLPackage.EXTERNAL_LINK: return createExternalLink();
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE: return createExternalLinkAlternative();
      case WikiMLPackage.INTERNAL_LINK: return createInternalLink();
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE: return createInternalLinkAlternative();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public wikipage createwikipage()
  {
    wikipageImpl wikipage = new wikipageImpl();
    return wikipage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractSection createAbstractSection()
  {
    AbstractSectionImpl abstractSection = new AbstractSectionImpl();
    return abstractSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsectionLevel1 createSubsectionLevel1()
  {
    SubsectionLevel1Impl subsectionLevel1 = new SubsectionLevel1Impl();
    return subsectionLevel1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsectionLevel2 createSubsectionLevel2()
  {
    SubsectionLevel2Impl subsectionLevel2 = new SubsectionLevel2Impl();
    return subsectionLevel2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsectionLevel3 createSubsectionLevel3()
  {
    SubsectionLevel3Impl subsectionLevel3 = new SubsectionLevel3Impl();
    return subsectionLevel3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsectionLevel4 createSubsectionLevel4()
  {
    SubsectionLevel4Impl subsectionLevel4 = new SubsectionLevel4Impl();
    return subsectionLevel4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineContent createInlineContent()
  {
    InlineContentImpl inlineContent = new InlineContentImpl();
    return inlineContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedContent createFormattedContent()
  {
    FormattedContentImpl formattedContent = new FormattedContentImpl();
    return formattedContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicContent createItalicContent()
  {
    ItalicContentImpl italicContent = new ItalicContentImpl();
    return italicContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldContent createBoldContent()
  {
    BoldContentImpl boldContent = new BoldContentImpl();
    return boldContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldItalicContent createBoldItalicContent()
  {
    BoldItalicContentImpl boldItalicContent = new BoldItalicContentImpl();
    return boldItalicContent;
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
  public UnFormattedText createUnFormattedText()
  {
    UnFormattedTextImpl unFormattedText = new UnFormattedTextImpl();
    return unFormattedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hyperlink createHyperlink()
  {
    HyperlinkImpl hyperlink = new HyperlinkImpl();
    return hyperlink;
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
  public ExternalLinkAlternative createExternalLinkAlternative()
  {
    ExternalLinkAlternativeImpl externalLinkAlternative = new ExternalLinkAlternativeImpl();
    return externalLinkAlternative;
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
  public InternalLinkAlternative createInternalLinkAlternative()
  {
    InternalLinkAlternativeImpl internalLinkAlternative = new InternalLinkAlternativeImpl();
    return internalLinkAlternative;
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
