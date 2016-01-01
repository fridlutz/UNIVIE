/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Template#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' containment reference.
   * @see #setTemplate(TemplateType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTemplate_Template()
   * @model containment="true"
   * @generated
   */
  TemplateType getTemplate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Template#getTemplate <em>Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' containment reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TemplateType value);

} // Template
