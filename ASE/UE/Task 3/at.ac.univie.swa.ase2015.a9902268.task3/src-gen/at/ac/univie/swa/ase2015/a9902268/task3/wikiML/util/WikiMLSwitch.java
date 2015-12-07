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
      case WikiMLPackage.WIKI_PAGE:
      {
        WikiPage wikiPage = (WikiPage)theEObject;
        T result = caseWikiPage(wikiPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.PARAGRAPH_TYPES:
      {
        ParagraphTypes paragraphTypes = (ParagraphTypes)theEObject;
        T result = caseParagraphTypes(paragraphTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.BLOCK_QUOTE:
      {
        BlockQuote blockQuote = (BlockQuote)theEObject;
        T result = caseBlockQuote(blockQuote);
        if (result == null) result = caseParagraphTypes(blockQuote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = caseParagraphTypes(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABOUT_TEMPLATE:
      {
        AboutTemplate aboutTemplate = (AboutTemplate)theEObject;
        T result = caseAboutTemplate(aboutTemplate);
        if (result == null) result = caseTemplate(aboutTemplate);
        if (result == null) result = caseParagraphTypes(aboutTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.MAIN_TEMPLATE:
      {
        MainTemplate mainTemplate = (MainTemplate)theEObject;
        T result = caseMainTemplate(mainTemplate);
        if (result == null) result = caseTemplate(mainTemplate);
        if (result == null) result = caseParagraphTypes(mainTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.QUOTE_TEMPLATE:
      {
        QuoteTemplate quoteTemplate = (QuoteTemplate)theEObject;
        T result = caseQuoteTemplate(quoteTemplate);
        if (result == null) result = caseTemplate(quoteTemplate);
        if (result == null) result = caseParagraphTypes(quoteTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ORDERED_LIST:
      {
        OrderedList orderedList = (OrderedList)theEObject;
        T result = caseOrderedList(orderedList);
        if (result == null) result = caseParagraphTypes(orderedList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.UNORDERED_LIST:
      {
        UnorderedList unorderedList = (UnorderedList)theEObject;
        T result = caseUnorderedList(unorderedList);
        if (result == null) result = caseParagraphTypes(unorderedList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.UNORDER_LIST_ITEM:
      {
        UnorderListItem unorderListItem = (UnorderListItem)theEObject;
        T result = caseUnorderListItem(unorderListItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ORDER_LIST_ITEM:
      {
        OrderListItem orderListItem = (OrderListItem)theEObject;
        T result = caseOrderListItem(orderListItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseParagraphTypes(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseParagraphTypes(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HEADING2:
      {
        Heading2 heading2 = (Heading2)theEObject;
        T result = caseHeading2(heading2);
        if (result == null) result = caseParagraphTypes(heading2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HEADING3:
      {
        Heading3 heading3 = (Heading3)theEObject;
        T result = caseHeading3(heading3);
        if (result == null) result = caseParagraphTypes(heading3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HEADING4:
      {
        Heading4 heading4 = (Heading4)theEObject;
        T result = caseHeading4(heading4);
        if (result == null) result = caseParagraphTypes(heading4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HEADING5:
      {
        Heading5 heading5 = (Heading5)theEObject;
        T result = caseHeading5(heading5);
        if (result == null) result = caseParagraphTypes(heading5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABSTRACT_FORMATTED_INLINE_CONTENT:
      {
        AbstractFormattedInlineContent abstractFormattedInlineContent = (AbstractFormattedInlineContent)theEObject;
        T result = caseAbstractFormattedInlineContent(abstractFormattedInlineContent);
        if (result == null) result = caseAnyText(abstractFormattedInlineContent);
        if (result == null) result = caseParagraphTypes(abstractFormattedInlineContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.BOLD:
      {
        Bold bold = (Bold)theEObject;
        T result = caseBold(bold);
        if (result == null) result = caseAbstractFormattedInlineContent(bold);
        if (result == null) result = caseAnyText(bold);
        if (result == null) result = caseParagraphTypes(bold);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ITALIC:
      {
        Italic italic = (Italic)theEObject;
        T result = caseItalic(italic);
        if (result == null) result = caseAbstractFormattedInlineContent(italic);
        if (result == null) result = caseAnyText(italic);
        if (result == null) result = caseParagraphTypes(italic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ITALIC_BOLD:
      {
        ItalicBold italicBold = (ItalicBold)theEObject;
        T result = caseItalicBold(italicBold);
        if (result == null) result = caseAbstractFormattedInlineContent(italicBold);
        if (result == null) result = caseAnyText(italicBold);
        if (result == null) result = caseParagraphTypes(italicBold);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABSTRACT_UNFORMATTED_INLINE_CONTENT:
      {
        AbstractUnformattedInlineContent abstractUnformattedInlineContent = (AbstractUnformattedInlineContent)theEObject;
        T result = caseAbstractUnformattedInlineContent(abstractUnformattedInlineContent);
        if (result == null) result = caseAnyText(abstractUnformattedInlineContent);
        if (result == null) result = caseParagraphTypes(abstractUnformattedInlineContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseAbstractUnformattedInlineContent(text);
        if (result == null) result = caseAnyText(text);
        if (result == null) result = caseParagraphTypes(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.HYPER_LINK:
      {
        HyperLink hyperLink = (HyperLink)theEObject;
        T result = caseHyperLink(hyperLink);
        if (result == null) result = caseAbstractUnformattedInlineContent(hyperLink);
        if (result == null) result = caseAnyText(hyperLink);
        if (result == null) result = caseParagraphTypes(hyperLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.INTERNAL:
      {
        Internal internal = (Internal)theEObject;
        T result = caseInternal(internal);
        if (result == null) result = caseHyperLink(internal);
        if (result == null) result = caseAbstractUnformattedInlineContent(internal);
        if (result == null) result = caseAnyText(internal);
        if (result == null) result = caseParagraphTypes(internal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.EXTERNAL:
      {
        External external = (External)theEObject;
        T result = caseExternal(external);
        if (result == null) result = caseHyperLink(external);
        if (result == null) result = caseAbstractUnformattedInlineContent(external);
        if (result == null) result = caseAnyText(external);
        if (result == null) result = caseParagraphTypes(external);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ANY_TEXT_SEQUENCE:
      {
        AnyTextSequence anyTextSequence = (AnyTextSequence)theEObject;
        T result = caseAnyTextSequence(anyTextSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ANY_TEXT:
      {
        AnyText anyText = (AnyText)theEObject;
        T result = caseAnyText(anyText);
        if (result == null) result = caseParagraphTypes(anyText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.PARAGRAPH:
      {
        Paragraph paragraph = (Paragraph)theEObject;
        T result = caseParagraph(paragraph);
        if (result == null) result = caseParagraphTypes(paragraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wiki Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wiki Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWikiPage(WikiPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paragraph Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paragraph Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParagraphTypes(ParagraphTypes object)
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
   * Returns the result of interpreting the object as an instance of '<em>About Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>About Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAboutTemplate(AboutTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainTemplate(MainTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quote Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quote Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuoteTemplate(QuoteTemplate object)
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
   * Returns the result of interpreting the object as an instance of '<em>Unorder List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unorder List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnorderListItem(UnorderListItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderListItem(OrderListItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
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
   * Returns the result of interpreting the object as an instance of '<em>Heading5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Heading5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeading5(Heading5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Formatted Inline Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Formatted Inline Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFormattedInlineContent(AbstractFormattedInlineContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBold(Bold object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalic(Italic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic Bold</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic Bold</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalicBold(ItalicBold object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Unformatted Inline Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Unformatted Inline Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractUnformattedInlineContent(AbstractUnformattedInlineContent object)
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
   * Returns the result of interpreting the object as an instance of '<em>Hyper Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hyper Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHyperLink(HyperLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternal(Internal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternal(External object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Text Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Text Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyTextSequence(AnyTextSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyText(AnyText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParagraph(Paragraph object)
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
