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
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  WikiMLPage createWikiMLPage();

  /**
   * Returns a new object of class '<em>Page Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page Title</em>'.
   * @generated
   */
  PageTitle createPageTitle();

  /**
   * Returns a new object of class '<em>Abstract Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Section</em>'.
   * @generated
   */
  AbstractSection createAbstractSection();

  /**
   * Returns a new object of class '<em>Sub Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Section</em>'.
   * @generated
   */
  SubSection createSubSection();

  /**
   * Returns a new object of class '<em>Sub Sub Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Sub Section</em>'.
   * @generated
   */
  SubSubSection createSubSubSection();

  /**
   * Returns a new object of class '<em>Sub Sub Sub Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Sub Sub Section</em>'.
   * @generated
   */
  SubSubSubSection createSubSubSubSection();

  /**
   * Returns a new object of class '<em>Abstract Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Paragraph</em>'.
   * @generated
   */
  AbstractParagraph createAbstractParagraph();

  /**
   * Returns a new object of class '<em>Normal Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Paragraph</em>'.
   * @generated
   */
  NormalParagraph createNormalParagraph();

  /**
   * Returns a new object of class '<em>Bold Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold Paragraph</em>'.
   * @generated
   */
  BoldParagraph createBoldParagraph();

  /**
   * Returns a new object of class '<em>Italic Paragraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic Paragraph</em>'.
   * @generated
   */
  ItalicParagraph createItalicParagraph();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WikiMLPackage getWikiMLPackage();

} //WikiMLFactory
