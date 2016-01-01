/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>About</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.About#getAboutText <em>About Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAbout()
 * @model
 * @generated
 */
public interface About extends EObject
{
  /**
   * Returns the value of the '<em><b>About Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>About Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>About Text</em>' containment reference.
   * @see #setAboutText(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAbout_AboutText()
   * @model containment="true"
   * @generated
   */
  UnformattedText getAboutText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.About#getAboutText <em>About Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>About Text</em>' containment reference.
   * @see #getAboutText()
   * @generated
   */
  void setAboutText(UnformattedText value);

} // About
