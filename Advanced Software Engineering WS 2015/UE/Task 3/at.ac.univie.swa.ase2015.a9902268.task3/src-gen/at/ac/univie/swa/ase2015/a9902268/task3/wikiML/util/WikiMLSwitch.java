/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.util;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage
 * @generated
 */
public class WikiMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WikiMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WikiMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WikiMLPackage.WIKI_ML_PAGE:
      {
        WikiMLPage wikiMLPage = (WikiMLPage)theEObject;
        T result = caseWikiMLPage(wikiMLPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.PAGE_TITLE:
      {
        PageTitle pageTitle = (PageTitle)theEObject;
        T result = casePageTitle(pageTitle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABSTRACT_SECTION:
      {
        AbstractSection abstractSection = (AbstractSection)theEObject;
        T result = caseAbstractSection(abstractSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUB_SECTION:
      {
        SubSection subSection = (SubSection)theEObject;
        T result = caseSubSection(subSection);
        if (result == null) result = caseAbstractSection(subSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUB_SUB_SECTION:
      {
        SubSubSection subSubSection = (SubSubSection)theEObject;
        T result = caseSubSubSection(subSubSection);
        if (result == null) result = caseAbstractSection(subSubSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUB_SUB_SUB_SECTION:
      {
        SubSubSubSection subSubSubSection = (SubSubSubSection)theEObject;
        T result = caseSubSubSubSection(subSubSubSection);
        if (result == null) result = caseAbstractSection(subSubSubSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABSTRACT_PARAGRAPH:
      {
        AbstractParagraph abstractParagraph = (AbstractParagraph)theEObject;
        T result = caseAbstractParagraph(abstractParagraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.NORMAL_PARAGRAPH:
      {
        NormalParagraph normalParagraph = (NormalParagraph)theEObject;
        T result = caseNormalParagraph(normalParagraph);
        if (result == null) result = caseBoldParagraph(normalParagraph);
        if (result == null) result = caseItalicParagraph(normalParagraph);
        if (result == null) result = caseAbstractParagraph(normalParagraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.BOLD_PARAGRAPH:
      {
        BoldParagraph boldParagraph = (BoldParagraph)theEObject;
        T result = caseBoldParagraph(boldParagraph);
        if (result == null) result = caseAbstractParagraph(boldParagraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ITALIC_PARAGRAPH:
      {
        ItalicParagraph italicParagraph = (ItalicParagraph)theEObject;
        T result = caseItalicParagraph(italicParagraph);
        if (result == null) result = caseAbstractParagraph(italicParagraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWikiMLPage(WikiMLPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageTitle(PageTitle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSection(AbstractSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubSection(SubSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Sub Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Sub Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubSubSection(SubSubSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Sub Sub Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Sub Sub Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubSubSubSection(SubSubSubSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractParagraph(AbstractParagraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalParagraph(NormalParagraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoldParagraph(BoldParagraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicParagraph(ItalicParagraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WikiMLSwitch
