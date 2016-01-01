/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Unformatted Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unformatted Text</em>'.
   * @generated
   */
  UnformattedText createUnformattedText();

  /**
   * Returns a new object of class '<em>Formatted Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formatted Text</em>'.
   * @generated
   */
  FormattedText createFormattedText();

  /**
   * Returns a new object of class '<em>Formatted Text Without Links</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formatted Text Without Links</em>'.
   * @generated
   */
  FormattedTextWithoutLinks createFormattedTextWithoutLinks();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Text Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Element</em>'.
   * @generated
   */
  TextElement createTextElement();

  /**
   * Returns a new object of class '<em>Heading</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading</em>'.
   * @generated
   */
  Heading createHeading();

  /**
   * Returns a new object of class '<em>Heading1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading1</em>'.
   * @generated
   */
  Heading1 createHeading1();

  /**
   * Returns a new object of class '<em>Heading2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading2</em>'.
   * @generated
   */
  Heading2 createHeading2();

  /**
   * Returns a new object of class '<em>Heading3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading3</em>'.
   * @generated
   */
  Heading3 createHeading3();

  /**
   * Returns a new object of class '<em>Heading4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading4</em>'.
   * @generated
   */
  Heading4 createHeading4();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Ordered List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered List</em>'.
   * @generated
   */
  OrderedList createOrderedList();

  /**
   * Returns a new object of class '<em>Unordered List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unordered List</em>'.
   * @generated
   */
  UnorderedList createUnorderedList();

  /**
   * Returns a new object of class '<em>Ordered List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered List Item</em>'.
   * @generated
   */
  OrderedListItem createOrderedListItem();

  /**
   * Returns a new object of class '<em>Unordered List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unordered List Item</em>'.
   * @generated
   */
  UnorderedListItem createUnorderedListItem();

  /**
   * Returns a new object of class '<em>Italic Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic Text</em>'.
   * @generated
   */
  ItalicText createItalicText();

  /**
   * Returns a new object of class '<em>Bold Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold Text</em>'.
   * @generated
   */
  BoldText createBoldText();

  /**
   * Returns a new object of class '<em>Italic Bold Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic Bold Text</em>'.
   * @generated
   */
  ItalicBoldText createItalicBoldText();

  /**
   * Returns a new object of class '<em>Block Quote</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Quote</em>'.
   * @generated
   */
  BlockQuote createBlockQuote();

  /**
   * Returns a new object of class '<em>External Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Link</em>'.
   * @generated
   */
  ExternalLink createExternalLink();

  /**
   * Returns a new object of class '<em>Internal Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Link</em>'.
   * @generated
   */
  InternalLink createInternalLink();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
  Category createCategory();

  /**
   * Returns a new object of class '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template</em>'.
   * @generated
   */
  Template createTemplate();

  /**
   * Returns a new object of class '<em>Template Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Type</em>'.
   * @generated
   */
  TemplateType createTemplateType();

  /**
   * Returns a new object of class '<em>Metadata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata</em>'.
   * @generated
   */
  Metadata createMetadata();

  /**
   * Returns a new object of class '<em>About</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>About</em>'.
   * @generated
   */
  About createAbout();

  /**
   * Returns a new object of class '<em>Actual Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Information</em>'.
   * @generated
   */
  ActualInformation createActualInformation();

  /**
   * Returns a new object of class '<em>Main Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Information</em>'.
   * @generated
   */
  MainInformation createMainInformation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
