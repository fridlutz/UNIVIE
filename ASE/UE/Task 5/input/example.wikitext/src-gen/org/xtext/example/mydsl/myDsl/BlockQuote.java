/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BlockQuote#getBlockQuoteText <em>Block Quote Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BlockQuote#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBlockQuote()
 * @model
 * @generated
 */
public interface BlockQuote extends EObject
{
  /**
   * Returns the value of the '<em><b>Block Quote Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Quote Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Quote Text</em>' containment reference.
   * @see #setBlockQuoteText(FormattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBlockQuote_BlockQuoteText()
   * @model containment="true"
   * @generated
   */
  FormattedText getBlockQuoteText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BlockQuote#getBlockQuoteText <em>Block Quote Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block Quote Text</em>' containment reference.
   * @see #getBlockQuoteText()
   * @generated
   */
  void setBlockQuoteText(FormattedText value);

  /**
   * Returns the value of the '<em><b>Additional</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.FormattedText}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBlockQuote_Additional()
   * @model containment="true"
   * @generated
   */
  EList<FormattedText> getAdditional();

} // BlockQuote
