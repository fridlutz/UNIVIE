/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Link Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getUrl <em>Url</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getExternalLinkAlternative()
 * @model
 * @generated
 */
public interface ExternalLinkAlternative extends Hyperlink
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(UnFormattedText)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getExternalLinkAlternative_Url()
   * @model containment="true"
   * @generated
   */
  UnFormattedText getUrl();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(UnFormattedText value);

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
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getExternalLinkAlternative_AlternativeText()
   * @model containment="true"
   * @generated
   */
  UnFormattedText getAlternativeText();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative#getAlternativeText <em>Alternative Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative Text</em>' containment reference.
   * @see #getAlternativeText()
   * @generated
   */
  void setAlternativeText(UnFormattedText value);

} // ExternalLinkAlternative
