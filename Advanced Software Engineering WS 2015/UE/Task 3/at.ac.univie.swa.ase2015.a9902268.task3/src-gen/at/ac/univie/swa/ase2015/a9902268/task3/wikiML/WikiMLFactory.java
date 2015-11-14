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
   * Returns a new object of class '<em>Un Order List Item Level2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Order List Item Level2</em>'.
   * @generated
   */
  UnOrderListItemLevel2 createUnOrderListItemLevel2();

  /**
   * Returns a new object of class '<em>Un Order List Item Level1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Order List Item Level1</em>'.
   * @generated
   */
  UnOrderListItemLevel1 createUnOrderListItemLevel1();

  /**
   * Returns a new object of class '<em>Order List Item Level1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order List Item Level1</em>'.
   * @generated
   */
  OrderListItemLevel1 createOrderListItemLevel1();

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
   * Returns a new object of class '<em>Internal Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Alt</em>'.
   * @generated
   */
  InternalAlt createInternalAlt();

  /**
   * Returns a new object of class '<em>External</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External</em>'.
   * @generated
   */
  External createExternal();

  /**
   * Returns a new object of class '<em>External Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Alt</em>'.
   * @generated
   */
  ExternalAlt createExternalAlt();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WikiMLPackage getWikiMLPackage();

} //WikiMLFactory
