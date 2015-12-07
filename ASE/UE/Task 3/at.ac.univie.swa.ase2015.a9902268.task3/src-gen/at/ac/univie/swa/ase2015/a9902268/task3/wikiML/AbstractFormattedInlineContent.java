/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Formatted Inline Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getAbstractFormattedInlineContent()
 * @model
 * @generated
 */
public interface AbstractFormattedInlineContent extends AnyText
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(AbstractUnformattedInlineContent)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getAbstractFormattedInlineContent_Name()
   * @model containment="true"
   * @generated
   */
  AbstractUnformattedInlineContent getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(AbstractUnformattedInlineContent value);

} // AbstractFormattedInlineContent
