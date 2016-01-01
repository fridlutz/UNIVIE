/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Italic Bold Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ItalicBoldText#getItalicBoldText <em>Italic Bold Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getItalicBoldText()
 * @model
 * @generated
 */
public interface ItalicBoldText extends EObject
{
  /**
   * Returns the value of the '<em><b>Italic Bold Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Italic Bold Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Italic Bold Text</em>' containment reference.
   * @see #setItalicBoldText(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getItalicBoldText_ItalicBoldText()
   * @model containment="true"
   * @generated
   */
  EObject getItalicBoldText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ItalicBoldText#getItalicBoldText <em>Italic Bold Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Italic Bold Text</em>' containment reference.
   * @see #getItalicBoldText()
   * @generated
   */
  void setItalicBoldText(EObject value);

} // ItalicBoldText
