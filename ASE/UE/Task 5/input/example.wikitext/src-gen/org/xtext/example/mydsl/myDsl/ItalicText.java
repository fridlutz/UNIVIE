/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Italic Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ItalicText#getItalicText <em>Italic Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getItalicText()
 * @model
 * @generated
 */
public interface ItalicText extends EObject
{
  /**
   * Returns the value of the '<em><b>Italic Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Italic Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Italic Text</em>' containment reference.
   * @see #setItalicText(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getItalicText_ItalicText()
   * @model containment="true"
   * @generated
   */
  EObject getItalicText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ItalicText#getItalicText <em>Italic Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Italic Text</em>' containment reference.
   * @see #getItalicText()
   * @generated
   */
  void setItalicText(EObject value);

} // ItalicText
