/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.util;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage
 * @generated
 */
public class WikiMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WikiMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WikiMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WikiMLSwitch<Adapter> modelSwitch =
    new WikiMLSwitch<Adapter>()
    {
      @Override
      public Adapter casewiki(wiki object)
      {
        return createwikiAdapter();
      }
      @Override
      public Adapter caseParagraphTypes(ParagraphTypes object)
      {
        return createParagraphTypesAdapter();
      }
      @Override
      public Adapter caseBlockQuote(BlockQuote object)
      {
        return createBlockQuoteAdapter();
      }
      @Override
      public Adapter caseTemplate(Template object)
      {
        return createTemplateAdapter();
      }
      @Override
      public Adapter caseUnOrderListItemLevel2(UnOrderListItemLevel2 object)
      {
        return createUnOrderListItemLevel2Adapter();
      }
      @Override
      public Adapter caseUnOrderListItemLevel1(UnOrderListItemLevel1 object)
      {
        return createUnOrderListItemLevel1Adapter();
      }
      @Override
      public Adapter caseOrderListItemLevel1(OrderListItemLevel1 object)
      {
        return createOrderListItemLevel1Adapter();
      }
      @Override
      public Adapter caseFile(File object)
      {
        return createFileAdapter();
      }
      @Override
      public Adapter caseCategory(Category object)
      {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseHeading1(Heading1 object)
      {
        return createHeading1Adapter();
      }
      @Override
      public Adapter caseHeading2(Heading2 object)
      {
        return createHeading2Adapter();
      }
      @Override
      public Adapter caseHeading3(Heading3 object)
      {
        return createHeading3Adapter();
      }
      @Override
      public Adapter caseHeading4(Heading4 object)
      {
        return createHeading4Adapter();
      }
      @Override
      public Adapter caseHeading5(Heading5 object)
      {
        return createHeading5Adapter();
      }
      @Override
      public Adapter caseAbstractFormattedInlineContent(AbstractFormattedInlineContent object)
      {
        return createAbstractFormattedInlineContentAdapter();
      }
      @Override
      public Adapter caseBold(Bold object)
      {
        return createBoldAdapter();
      }
      @Override
      public Adapter caseItalic(Italic object)
      {
        return createItalicAdapter();
      }
      @Override
      public Adapter caseItalicBold(ItalicBold object)
      {
        return createItalicBoldAdapter();
      }
      @Override
      public Adapter caseAbstractUnformattedInlineContent(AbstractUnformattedInlineContent object)
      {
        return createAbstractUnformattedInlineContentAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseHyperLink(HyperLink object)
      {
        return createHyperLinkAdapter();
      }
      @Override
      public Adapter caseInternal(Internal object)
      {
        return createInternalAdapter();
      }
      @Override
      public Adapter caseInternalAlt(InternalAlt object)
      {
        return createInternalAltAdapter();
      }
      @Override
      public Adapter caseExternal(External object)
      {
        return createExternalAdapter();
      }
      @Override
      public Adapter caseExternalAlt(ExternalAlt object)
      {
        return createExternalAltAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wiki <em>wiki</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wiki
   * @generated
   */
  public Adapter createwikiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes <em>Paragraph Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes
   * @generated
   */
  public Adapter createParagraphTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote <em>Block Quote</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote
   * @generated
   */
  public Adapter createBlockQuoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template
   * @generated
   */
  public Adapter createTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2 <em>Un Order List Item Level2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel2
   * @generated
   */
  public Adapter createUnOrderListItemLevel2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1 <em>Un Order List Item Level1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnOrderListItemLevel1
   * @generated
   */
  public Adapter createUnOrderListItemLevel1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1 <em>Order List Item Level1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItemLevel1
   * @generated
   */
  public Adapter createOrderListItemLevel1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.File
   * @generated
   */
  public Adapter createFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category
   * @generated
   */
  public Adapter createCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1 <em>Heading1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1
   * @generated
   */
  public Adapter createHeading1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2 <em>Heading2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2
   * @generated
   */
  public Adapter createHeading2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3 <em>Heading3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3
   * @generated
   */
  public Adapter createHeading3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4 <em>Heading4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4
   * @generated
   */
  public Adapter createHeading4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5 <em>Heading5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5
   * @generated
   */
  public Adapter createHeading5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent <em>Abstract Formatted Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent
   * @generated
   */
  public Adapter createAbstractFormattedInlineContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold
   * @generated
   */
  public Adapter createBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic
   * @generated
   */
  public Adapter createItalicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold <em>Italic Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold
   * @generated
   */
  public Adapter createItalicBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent <em>Abstract Unformatted Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent
   * @generated
   */
  public Adapter createAbstractUnformattedInlineContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink <em>Hyper Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink
   * @generated
   */
  public Adapter createHyperLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal
   * @generated
   */
  public Adapter createInternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt <em>Internal Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalAlt
   * @generated
   */
  public Adapter createInternalAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External
   * @generated
   */
  public Adapter createExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt <em>External Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalAlt
   * @generated
   */
  public Adapter createExternalAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WikiMLAdapterFactory
