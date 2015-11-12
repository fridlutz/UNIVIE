/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink#getPageName <em>Page Name</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getExternalLink()
 * @model
 * @generated
 */
public interface ExternalLink extends Hyperlink
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
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getExternalLink_PageName()
   * @model containment="true"
   * @generated
   */
  UnFormattedText getPageName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLink#getPageName <em>Page Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page Name</em>' containment reference.
   * @see #getPageName()
   * @generated
   */
  void setPageName(UnFormattedText value);

} // ExternalLink
