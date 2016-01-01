/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formatted Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FormattedText#getFormattedText <em>Formatted Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFormattedText()
 * @model
 * @generated
 */
public interface FormattedText extends EObject
{
  /**
   * Returns the value of the '<em><b>Formatted Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formatted Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formatted Text</em>' containment reference.
   * @see #setFormattedText(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFormattedText_FormattedText()
   * @model containment="true"
   * @generated
   */
  EObject getFormattedText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FormattedText#getFormattedText <em>Formatted Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formatted Text</em>' containment reference.
   * @see #getFormattedText()
   * @generated
   */
  void setFormattedText(EObject value);

} // FormattedText
