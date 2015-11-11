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
      public Adapter caseWikiMLPage(WikiMLPage object)
      {
        return createWikiMLPageAdapter();
      }
      @Override
      public Adapter casePageTitle(PageTitle object)
      {
        return createPageTitleAdapter();
      }
      @Override
      public Adapter caseAbstractSection(AbstractSection object)
      {
        return createAbstractSectionAdapter();
      }
      @Override
      public Adapter caseSubSection(SubSection object)
      {
        return createSubSectionAdapter();
      }
      @Override
      public Adapter caseSubSubSection(SubSubSection object)
      {
        return createSubSubSectionAdapter();
      }
      @Override
      public Adapter caseSubSubSubSection(SubSubSubSection object)
      {
        return createSubSubSubSectionAdapter();
      }
      @Override
      public Adapter caseAbstractParagraph(AbstractParagraph object)
      {
        return createAbstractParagraphAdapter();
      }
      @Override
      public Adapter caseNormalParagraph(NormalParagraph object)
      {
        return createNormalParagraphAdapter();
      }
      @Override
      public Adapter caseBoldParagraph(BoldParagraph object)
      {
        return createBoldParagraphAdapter();
      }
      @Override
      public Adapter caseItalicParagraph(ItalicParagraph object)
      {
        return createItalicParagraphAdapter();
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
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage
   * @generated
   */
  public Adapter createWikiMLPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle <em>Page Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle
   * @generated
   */
  public Adapter createPageTitleAdapter()
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
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSection <em>Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSection
   * @generated
   */
  public Adapter createSubSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSection <em>Sub Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSection
   * @generated
   */
  public Adapter createSubSubSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSubSection <em>Sub Sub Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.SubSubSubSection
   * @generated
   */
  public Adapter createSubSubSubSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractParagraph <em>Abstract Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractParagraph
   * @generated
   */
  public Adapter createAbstractParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph <em>Normal Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.NormalParagraph
   * @generated
   */
  public Adapter createNormalParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldParagraph <em>Bold Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BoldParagraph
   * @generated
   */
  public Adapter createBoldParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicParagraph <em>Italic Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicParagraph
   * @generated
   */
  public Adapter createItalicParagraphAdapter()
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
