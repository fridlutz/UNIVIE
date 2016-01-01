/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Metadata#getAbout <em>About</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Metadata#getActualInfo <em>Actual Info</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject
{
  /**
   * Returns the value of the '<em><b>About</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>About</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>About</em>' containment reference.
   * @see #setAbout(About)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMetadata_About()
   * @model containment="true"
   * @generated
   */
  About getAbout();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Metadata#getAbout <em>About</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>About</em>' containment reference.
   * @see #getAbout()
   * @generated
   */
  void setAbout(About value);

  /**
   * Returns the value of the '<em><b>Actual Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Info</em>' containment reference.
   * @see #setActualInfo(ActualInformation)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMetadata_ActualInfo()
   * @model containment="true"
   * @generated
   */
  ActualInformation getActualInfo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Metadata#getActualInfo <em>Actual Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Info</em>' containment reference.
   * @see #getActualInfo()
   * @generated
   */
  void setActualInfo(ActualInformation value);

} // Metadata
