/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink#getAltText <em>Alt Text</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getHyperLink()
 * @model
 * @generated
 */
public interface HyperLink extends AbstractUnformattedInlineContent
{
  /**
   * Returns the value of the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt Text</em>' containment reference.
   * @see #setAltText(AnyText)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getHyperLink_AltText()
   * @model containment="true"
   * @generated
   */
  AnyText getAltText();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink#getAltText <em>Alt Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt Text</em>' containment reference.
   * @see #getAltText()
   * @generated
   */
  void setAltText(AnyText value);

} // HyperLink
