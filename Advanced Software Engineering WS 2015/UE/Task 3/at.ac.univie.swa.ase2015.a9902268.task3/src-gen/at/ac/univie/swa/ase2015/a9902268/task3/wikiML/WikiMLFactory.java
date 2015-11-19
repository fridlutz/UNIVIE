/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage
 * @generated
 */
public interface WikiMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WikiMLFactory eINSTANCE = at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Wiki Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wiki Page</em>'.
   * @generated
   */
  WikiPage createWikiPage();

  /**
   * Returns a new object of class '<em>Paragraph Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paragraph Types</em>'.
   * @generated
   */
  ParagraphTypes createParagraphTypes();

  /**
   * Returns a new object of class '<em>Block Quote</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Quote</em>'.
   * @generated
   */
  BlockQuote createBlockQuote();

  /**
   * Returns a new object of class '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template</em>'.
   * @generated
   */
  Template createTemplate();

  /**
   * Returns a new object of class '<em>About Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>About Template</em>'.
   * @generated
   */
  AboutTemplate createAboutTemplate();

  /**
   * Returns a new object of class '<em>Main Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Template</em>'.
   * @generated
   */
  MainTemplate createMainTemplate();

  /**
   * Returns a new object of class '<em>Quote Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quote Template</em>'.
   * @generated
   */
  QuoteTemplate createQuoteTemplate();

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
   * Returns a new object of class '<em>Unorder List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unorder List Item</em>'.
   * @generated
   */
  UnorderListItem createUnorderListItem();

  /**
   * Returns a new object of class '<em>Order List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order List Item</em>'.
   * @generated
   */
  OrderListItem createOrderListItem();

  /**
   * Returns a new object of class '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image</em>'.
   * @generated
   */
  Image createImage();

  /**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
  Category createCategory();

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
   * Returns a new object of class '<em>Heading5</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Heading5</em>'.
   * @generated
   */
  Heading5 createHeading5();

  /**
   * Returns a new object of class '<em>Abstract Formatted Inline Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Formatted Inline Content</em>'.
   * @generated
   */
  AbstractFormattedInlineContent createAbstractFormattedInlineContent();

  /**
   * Returns a new object of class '<em>Bold</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold</em>'.
   * @generated
   */
  Bold createBold();

  /**
   * Returns a new object of class '<em>Italic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic</em>'.
   * @generated
   */
  Italic createItalic();

  /**
   * Returns a new object of class '<em>Italic Bold</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic Bold</em>'.
   * @generated
   */
  ItalicBold createItalicBold();

  /**
   * Returns a new object of class '<em>Abstract Unformatted Inline Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Unformatted Inline Content</em>'.
   * @generated
   */
  AbstractUnformattedInlineContent createAbstractUnformattedInlineContent();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Hyper Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyper Link</em>'.
   * @generated
   */
  HyperLink createHyperLink();

  /**
   * Returns a new object of class '<em>Internal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal</em>'.
   * @generated
   */
  Internal createInternal();

  /**
   * Returns a new object of class '<em>External</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External</em>'.
   * @generated
   */
  External createExternal();

  /**
   * Returns a new object of class '<em>Any Text Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Text Sequence</em>'.
   * @generated
   */
  AnyTextSequence createAnyTextSequence();

  /**
   * Returns a new object of class '<em>Any Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Text</em>'.
   * @generated
   */
  AnyText createAnyText();

  /**
   * Returns a new object of class '<em>Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paragraph</em>'.
   * @generated
   */
  Paragraph createParagraph();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WikiMLPackage getWikiMLPackage();

} //WikiMLFactory
