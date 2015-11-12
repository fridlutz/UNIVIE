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
      public Adapter casewikipage(wikipage object)
      {
        return createwikipageAdapter();
      }
      @Override
      public Adapter caseAbstractSection(AbstractSection object)
      {
        return createAbstractSectionAdapter();
      }
      @Override
      public Adapter caseSubsectionLevel1(SubsectionLevel1 object)
      {
        return createSubsectionLevel1Adapter();
      }
      @Override
      public Adapter caseSubsectionLevel2(SubsectionLevel2 object)
      {
        return createSubsectionLevel2Adapter();
      }
      @Override
      public Adapter caseSubsectionLevel3(SubsectionLevel3 object)
      {
        return createSubsectionLevel3Adapter();
      }
      @Override
      public Adapter caseSubsectionLevel4(SubsectionLevel4 object)
      {
        return createSubsectionLevel4Adapter();
      }
      @Override
      public Adapter caseInlineContent(InlineContent object)
      {
        return createInlineContentAdapter();
      }
      @Override
      public Adapter caseFormattedContent(FormattedContent object)
      {
        return createFormattedContentAdapter();
      }
      @Override
      public Adapter caseItalicContent(ItalicContent object)
      {
        return createItalicContentAdapter();
      }
      @Override
      public Adapter caseBoldContent(BoldContent object)
      {
        return createBoldContentAdapter();
      }
      @Override
      public Adapter caseBoldItalicContent(BoldItalicContent object)
      {
        return createBoldItalicContentAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseUnFormattedText(UnFormattedText object)
      {
        return createUnFormattedTextAdapter();
      }
      @Override
      public Adapter caseHyperlink(Hyperlink object)
      {
        return createHyperlinkAdapter();
      }
      @Override
      public Adapter caseExternalLink(ExternalLink object)
      {
        return createExternalLinkAdapter();
      }
      @Override
      public Adapter caseExternalLinkAlternative(ExternalLinkAlternative object)
      {
        return createExternalLinkAlternativeAdapter();
      }
      @Override
      public Adapter caseInternalLink(InternalLink object)
      {
        return createInternalLinkAdapter();
      }
      @Override
      public Adapter caseInternalLinkAlternative(InternalLinkAlternative object)
      {
        return createInternalLinkAlternativeAdapter();
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
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage <em>wikipage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage
   * @generated
   */
  public Adapter createwikipageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection <em>Abstract Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection
   * @generated
   */
  public Adapter createAbstractSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1 <em>Subsection Level1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel1
   * @generated
   */
  public Adapter createSubsectionLevel1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2 <em>Subsection Level2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel2
   * @generated
   */
  public Adapter createSubsectionLevel2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3 <em>Subsection Level3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel3
   * @generated
   */
  public Adapter createSubsectionLevel3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4 <em>Subsection Level4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubsectionLevel4
   * @generated
   */
  public Adapter createSubsectionLevel4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent <em>Inline Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent
   * @generated
   */
  public Adapter createInlineContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.FormattedContent <em>Formatted Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.FormattedContent
   * @generated
   */
  public Adapter createFormattedContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicContent <em>Italic Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicContent
   * @generated
   */
  public Adapter createItalicContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldContent <em>Bold Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldContent
   * @generated
   */
  public Adapter createBoldContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldItalicContent <em>Bold Italic Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldItalicContent
   * @generated
   */
  public Adapter createBoldItalicContentAdapter()
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
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText <em>Un Formatted Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText
   * @generated
   */
  public Adapter createUnFormattedTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Hyperlink <em>Hyperlink</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Hyperlink
   * @generated
   */
  public Adapter createHyperlinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink <em>External Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink
   * @generated
   */
  public Adapter createExternalLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative <em>External Link Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative
   * @generated
   */
  public Adapter createExternalLinkAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink <em>Internal Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink
   * @generated
   */
  public Adapter createInternalLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative <em>Internal Link Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative
   * @generated
   */
  public Adapter createInternalLinkAlternativeAdapter()
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
