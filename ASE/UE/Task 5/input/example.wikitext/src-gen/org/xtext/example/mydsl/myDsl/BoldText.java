/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bold Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BoldText#getBoldText <em>Bold Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBoldText()
 * @model
 * @generated
 */
public interface BoldText extends EObject
{
  /**
   * Returns the value of the '<em><b>Bold Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bold Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bold Text</em>' containment reference.
   * @see #setBoldText(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBoldText_BoldText()
   * @model containment="true"
   * @generated
   */
  EObject getBoldText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BoldText#getBoldText <em>Bold Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bold Text</em>' containment reference.
   * @see #getBoldText()
   * @generated
   */
  void setBoldText(EObject value);

} // BoldText
