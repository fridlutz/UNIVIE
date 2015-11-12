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
      case WikiMLPackage.WIKIPAGE:
      {
        wikipage wikipage = (wikipage)theEObject;
        T result = casewikipage(wikipage);
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
      case WikiMLPackage.SUBSECTION_LEVEL1:
      {
        SubsectionLevel1 subsectionLevel1 = (SubsectionLevel1)theEObject;
        T result = caseSubsectionLevel1(subsectionLevel1);
        if (result == null) result = caseAbstractSection(subsectionLevel1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL2:
      {
        SubsectionLevel2 subsectionLevel2 = (SubsectionLevel2)theEObject;
        T result = caseSubsectionLevel2(subsectionLevel2);
        if (result == null) result = caseAbstractSection(subsectionLevel2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL3:
      {
        SubsectionLevel3 subsectionLevel3 = (SubsectionLevel3)theEObject;
        T result = caseSubsectionLevel3(subsectionLevel3);
        if (result == null) result = caseAbstractSection(subsectionLevel3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL4:
      {
        SubsectionLevel4 subsectionLevel4 = (SubsectionLevel4)theEObject;
        T result = caseSubsectionLevel4(subsectionLevel4);
        if (result == null) result = caseAbstractSection(subsectionLevel4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.INLINE_CONTENT:
      {
        InlineContent inlineContent = (InlineContent)theEObject;
        T result = caseInlineContent(inlineContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.FORMATTED_CONTENT:
      {
        FormattedContent formattedContent = (FormattedContent)theEObject;
        T result = caseFormattedContent(formattedContent);
        if (result == null) result = caseInlineContent(formattedContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ITALIC_CONTENT:
      {
        ItalicContent italicContent = (ItalicContent)theEObject;
        T result = caseItalicContent(italicContent);
        if (result == null) result = caseFormattedContent(italicContent);
        if (result == null) result = caseInlineContent(italicContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.BOLD_CONTENT:
      {
        BoldContent boldContent = (BoldContent)theEObject;
        T result = caseBoldContent(boldContent);
        if (result == null) result = caseFormattedContent(boldContent);
        if (result == null) result = caseInlineContent(boldContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.BOLD_ITALIC_CONTENT:
      {
        BoldItalicContent boldItalicContent = (BoldItalicContent)theEObject;
        T result = caseBoldItalicContent(boldItalicContent);
        if (result == null) result = caseFormattedContent(boldItalicContent);
        if (result == null) result = caseInlineContent(boldItalicContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseItalicContent(text);
        if (result == null) result = caseBoldContent(text);
        if (result == null) result = caseBoldItalicContent(text);
        if (result == null) result = caseFormattedContent(text);
        if (result == null) result = caseInlineContent(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.UN_FORMATTED_TEXT:
      {
        UnFormattedText unFormattedText = (UnFormattedText)theEObject;
        T result = caseUnFormattedText(unFormattedText);
        if (result == null) result = caseText(unFormattedText);
        if (result == null) result = caseItalicContent(unFormattedText);
        if (result == null) result = caseBoldContent(unFormattedText);
        if (result == null) result = caseBoldItalicContent(unFormattedText);
        if (result == null) result = caseFormattedContent(unFormattedText);
        if (result == null) result = caseInlineContent(unFormattedText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HYPERLINK:
      {
        Hyperlink hyperlink = (Hyperlink)theEObject;
        T result = caseHyperlink(hyperlink);
        if (result == null) result = caseText(hyperlink);
        if (result == null) result = caseItalicContent(hyperlink);
        if (result == null) result = caseBoldContent(hyperlink);
        if (result == null) result = caseBoldItalicContent(hyperlink);
        if (result == null) result = caseFormattedContent(hyperlink);
        if (result == null) result = caseInlineContent(hyperlink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.EXTERNAL_LINK:
      {
        ExternalLink externalLink = (ExternalLink)theEObject;
        T result = caseExternalLink(externalLink);
        if (result == null) result = caseHyperlink(externalLink);
        if (result == null) result = caseText(externalLink);
        if (result == null) result = caseItalicContent(externalLink);
        if (result == null) result = caseBoldContent(externalLink);
        if (result == null) result = caseBoldItalicContent(externalLink);
        if (result == null) result = caseFormattedContent(externalLink);
        if (result == null) result = caseInlineContent(externalLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE:
      {
        ExternalLinkAlternative externalLinkAlternative = (ExternalLinkAlternative)theEObject;
        T result = caseExternalLinkAlternative(externalLinkAlternative);
        if (result == null) result = caseHyperlink(externalLinkAlternative);
        if (result == null) result = caseText(externalLinkAlternative);
        if (result == null) result = caseItalicContent(externalLinkAlternative);
        if (result == null) result = caseBoldContent(externalLinkAlternative);
        if (result == null) result = caseBoldItalicContent(externalLinkAlternative);
        if (result == null) result = caseFormattedContent(externalLinkAlternative);
        if (result == null) result = caseInlineContent(externalLinkAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.INTERNAL_LINK:
      {
        InternalLink internalLink = (InternalLink)theEObject;
        T result = caseInternalLink(internalLink);
        if (result == null) result = caseHyperlink(internalLink);
        if (result == null) result = caseText(internalLink);
        if (result == null) result = caseItalicContent(internalLink);
        if (result == null) result = caseBoldContent(internalLink);
        if (result == null) result = caseBoldItalicContent(internalLink);
        if (result == null) result = caseFormattedContent(internalLink);
        if (result == null) result = caseInlineContent(internalLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE:
      {
        InternalLinkAlternative internalLinkAlternative = (InternalLinkAlternative)theEObject;
        T result = caseInternalLinkAlternative(internalLinkAlternative);
        if (result == null) result = caseHyperlink(internalLinkAlternative);
        if (result == null) result = caseText(internalLinkAlternative);
        if (result == null) result = caseItalicContent(internalLinkAlternative);
        if (result == null) result = caseBoldContent(internalLinkAlternative);
        if (result == null) result = caseBoldItalicContent(internalLinkAlternative);
        if (result == null) result = caseFormattedContent(internalLinkAlternative);
        if (result == null) result = caseInlineContent(internalLinkAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>wikipage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>wikipage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewikipage(wikipage object)
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
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel1(SubsectionLevel1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel2(SubsectionLevel2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel3(SubsectionLevel3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel4(SubsectionLevel4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineContent(InlineContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formatted Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formatted Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormattedContent(FormattedContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicContent(ItalicContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoldContent(BoldContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold Italic Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold Italic Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoldItalicContent(BoldItalicContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Un Formatted Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Un Formatted Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnFormattedText(UnFormattedText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hyperlink</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hyperlink</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHyperlink(Hyperlink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalLink(ExternalLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Link Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Link Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalLinkAlternative(ExternalLinkAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalLink(InternalLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Link Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Link Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalLinkAlternative(InternalLinkAlternative object)
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
