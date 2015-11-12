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
   * Returns a new object of class '<em>wikipage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>wikipage</em>'.
   * @generated
   */
  wikipage createwikipage();

  /**
   * Returns a new object of class '<em>Abstract Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Section</em>'.
   * @generated
   */
  AbstractSection createAbstractSection();

  /**
   * Returns a new object of class '<em>Subsection Level1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsection Level1</em>'.
   * @generated
   */
  SubsectionLevel1 createSubsectionLevel1();

  /**
   * Returns a new object of class '<em>Subsection Level2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsection Level2</em>'.
   * @generated
   */
  SubsectionLevel2 createSubsectionLevel2();

  /**
   * Returns a new object of class '<em>Subsection Level3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsection Level3</em>'.
   * @generated
   */
  SubsectionLevel3 createSubsectionLevel3();

  /**
   * Returns a new object of class '<em>Subsection Level4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsection Level4</em>'.
   * @generated
   */
  SubsectionLevel4 createSubsectionLevel4();

  /**
   * Returns a new object of class '<em>Inline Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inline Content</em>'.
   * @generated
   */
  InlineContent createInlineContent();

  /**
   * Returns a new object of class '<em>Formatted Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formatted Content</em>'.
   * @generated
   */
  FormattedContent createFormattedContent();

  /**
   * Returns a new object of class '<em>Italic Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic Content</em>'.
   * @generated
   */
  ItalicContent createItalicContent();

  /**
   * Returns a new object of class '<em>Bold Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold Content</em>'.
   * @generated
   */
  BoldContent createBoldContent();

  /**
   * Returns a new object of class '<em>Bold Italic Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold Italic Content</em>'.
   * @generated
   */
  BoldItalicContent createBoldItalicContent();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Un Formatted Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Formatted Text</em>'.
   * @generated
   */
  UnFormattedText createUnFormattedText();

  /**
   * Returns a new object of class '<em>Hyperlink</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyperlink</em>'.
   * @generated
   */
  Hyperlink createHyperlink();

  /**
   * Returns a new object of class '<em>External Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Link</em>'.
   * @generated
   */
  ExternalLink createExternalLink();

  /**
   * Returns a new object of class '<em>External Link Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Link Alternative</em>'.
   * @generated
   */
  ExternalLinkAlternative createExternalLinkAlternative();

  /**
   * Returns a new object of class '<em>Internal Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Link</em>'.
   * @generated
   */
  InternalLink createInternalLink();

  /**
   * Returns a new object of class '<em>Internal Link Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Link Alternative</em>'.
   * @generated
   */
  InternalLinkAlternative createInternalLinkAlternative();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WikiMLPackage getWikiMLPackage();

} //WikiMLFactory
