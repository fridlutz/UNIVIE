/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
      case MyDslPackage.DOCUMENT:
      {
        Document document = (Document)theEObject;
        T result = caseDocument(document);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNFORMATTED_TEXT:
      {
        UnformattedText unformattedText = (UnformattedText)theEObject;
        T result = caseUnformattedText(unformattedText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FORMATTED_TEXT:
      {
        FormattedText formattedText = (FormattedText)theEObject;
        T result = caseFormattedText(formattedText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS:
      {
        FormattedTextWithoutLinks formattedTextWithoutLinks = (FormattedTextWithoutLinks)theEObject;
        T result = caseFormattedTextWithoutLinks(formattedTextWithoutLinks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEXT_ELEMENT:
      {
        TextElement textElement = (TextElement)theEObject;
        T result = caseTextElement(textElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HEADING:
      {
        Heading heading = (Heading)theEObject;
        T result = caseHeading(heading);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HEADING1:
      {
        Heading1 heading1 = (Heading1)theEObject;
        T result = caseHeading1(heading1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HEADING2:
      {
        Heading2 heading2 = (Heading2)theEObject;
        T result = caseHeading2(heading2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HEADING3:
      {
        Heading3 heading3 = (Heading3)theEObject;
        T result = caseHeading3(heading3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HEADING4:
      {
        Heading4 heading4 = (Heading4)theEObject;
        T result = caseHeading4(heading4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ORDERED_LIST:
      {
        OrderedList orderedList = (OrderedList)theEObject;
        T result = caseOrderedList(orderedList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNORDERED_LIST:
      {
        UnorderedList unorderedList = (UnorderedList)theEObject;
        T result = caseUnorderedList(unorderedList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ORDERED_LIST_ITEM:
      {
        OrderedListItem orderedListItem = (OrderedListItem)theEObject;
        T result = caseOrderedListItem(orderedListItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNORDERED_LIST_ITEM:
      {
        UnorderedListItem unorderedListItem = (UnorderedListItem)theEObject;
        T result = caseUnorderedListItem(unorderedListItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ITALIC_TEXT:
      {
        ItalicText italicText = (ItalicText)theEObject;
        T result = caseItalicText(italicText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BOLD_TEXT:
      {
        BoldText boldText = (BoldText)theEObject;
        T result = caseBoldText(boldText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ITALIC_BOLD_TEXT:
      {
        ItalicBoldText italicBoldText = (ItalicBoldText)theEObject;
        T result = caseItalicBoldText(italicBoldText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BLOCK_QUOTE:
      {
        BlockQuote blockQuote = (BlockQuote)theEObject;
        T result = caseBlockQuote(blockQuote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXTERNAL_LINK:
      {
        ExternalLink externalLink = (ExternalLink)theEObject;
        T result = caseExternalLink(externalLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERNAL_LINK:
      {
        InternalLink internalLink = (InternalLink)theEObject;
        T result = caseInternalLink(internalLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FILE:
      {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEMPLATE_TYPE:
      {
        TemplateType templateType = (TemplateType)theEObject;
        T result = caseTemplateType(templateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.METADATA:
      {
        Metadata metadata = (Metadata)theEObject;
        T result = caseMetadata(metadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ABOUT:
      {
        About about = (About)theEObject;
        T result = caseAbout(about);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTUAL_INFORMATION:
      {
        ActualInformation actualInformation = (ActualInformation)theEObject;
        T result = caseActualInformation(actualInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MAIN_INFORMATION:
      {
        MainInformation mainInformation = (MainInformation)theEObject;
        T result = caseMainInformation(mainInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocument(Document object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unformatted Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unformatted Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnformattedText(UnformattedText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormattedText(FormattedText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formatted Text Without Links</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formatted Text Without Links</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormattedTextWithoutLinks(FormattedTextWithoutLinks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextElement(TextElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading(Heading object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading1(Heading1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading2(Heading2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading3(Heading3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Heading4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading4(Heading4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderedList(OrderedList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unordered List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unordered List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnorderedList(UnorderedList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderedListItem(OrderedListItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unordered List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unordered List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnorderedListItem(UnorderedListItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicText(ItalicText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoldText(BoldText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic Bold Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic Bold Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicBoldText(ItalicBoldText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Quote</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Quote</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockQuote(BlockQuote object)
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
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateType(TemplateType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadata(Metadata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>About</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>About</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbout(About object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualInformation(ActualInformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainInformation(MainInformation object)
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

} //MyDslSwitch
