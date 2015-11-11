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
      case WikiMLPackage.WIKI_ML_PAGE: return createWikiMLPage();
      case WikiMLPackage.PAGE_TITLE: return createPageTitle();
      case WikiMLPackage.ABSTRACT_SECTION: return createAbstractSection();
      case WikiMLPackage.SUB_SECTION: return createSubSection();
      case WikiMLPackage.SUB_SUB_SECTION: return createSubSubSection();
      case WikiMLPackage.SUB_SUB_SUB_SECTION: return createSubSubSubSection();
      case WikiMLPackage.ABSTRACT_PARAGRAPH: return createAbstractParagraph();
      case WikiMLPackage.NORMAL_PARAGRAPH: return createNormalParagraph();
      case WikiMLPackage.BOLD_PARAGRAPH: return createBoldParagraph();
      case WikiMLPackage.ITALIC_PARAGRAPH: return createItalicParagraph();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLPage createWikiMLPage()
  {
    WikiMLPageImpl wikiMLPage = new WikiMLPageImpl();
    return wikiMLPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageTitle createPageTitle()
  {
    PageTitleImpl pageTitle = new PageTitleImpl();
    return pageTitle;
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
  public SubSection createSubSection()
  {
    SubSectionImpl subSection = new SubSectionImpl();
    return subSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSubSection createSubSubSection()
  {
    SubSubSectionImpl subSubSection = new SubSubSectionImpl();
    return subSubSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSubSubSection createSubSubSubSection()
  {
    SubSubSubSectionImpl subSubSubSection = new SubSubSubSectionImpl();
    return subSubSubSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParagraph createAbstractParagraph()
  {
    AbstractParagraphImpl abstractParagraph = new AbstractParagraphImpl();
    return abstractParagraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalParagraph createNormalParagraph()
  {
    NormalParagraphImpl normalParagraph = new NormalParagraphImpl();
    return normalParagraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoldParagraph createBoldParagraph()
  {
    BoldParagraphImpl boldParagraph = new BoldParagraphImpl();
    return boldParagraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicParagraph createItalicParagraph()
  {
    ItalicParagraphImpl italicParagraph = new ItalicParagraphImpl();
    return italicParagraph;
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
