/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getPageName <em>Page Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getInternalLinkAlternative()
 * @model
 * @generated
 */
public interface InternalLinkAlternative extends Hyperlink
{
  /**
   * Returns the value of the '<em><b>Page Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page Name</em>' containment reference.
   * @see #setPageName(UnFormattedText)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getInternalLinkAlternative_PageName()
   * @model containment="true"
   * @generated
   */
  UnFormattedText getPageName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getPageName <em>Page Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page Name</em>' containment reference.
   * @see #getPageName()
   * @generated
   */
  void setPageName(UnFormattedText value);

  /**
   * Returns the value of the '<em><b>Alternative Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative Text</em>' containment reference.
   * @see #setAlternativeText(UnFormattedText)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getInternalLinkAlternative_AlternativeText()
   * @model containment="true"
   * @generated
   */
  UnFormattedText getAlternativeText();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative Text</em>' containment reference.
   * @see #getAlternativeText()
   * @generated
   */
  void setAlternativeText(UnFormattedText value);

} // InternalLinkAlternative
