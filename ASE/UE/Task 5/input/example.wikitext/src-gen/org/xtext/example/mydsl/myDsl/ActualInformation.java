/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActualInformation#getInformationOnWhat <em>Information On What</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActualInformation#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActualInformation#getAdditionalLinks <em>Additional Links</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActualInformation()
 * @model
 * @generated
 */
public interface ActualInformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Information On What</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Information On What</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Information On What</em>' containment reference.
   * @see #setInformationOnWhat(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActualInformation_InformationOnWhat()
   * @model containment="true"
   * @generated
   */
  UnformattedText getInformationOnWhat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ActualInformation#getInformationOnWhat <em>Information On What</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Information On What</em>' containment reference.
   * @see #getInformationOnWhat()
   * @generated
   */
  void setInformationOnWhat(UnformattedText value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference.
   * @see #setLink(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActualInformation_Link()
   * @model containment="true"
   * @generated
   */
  UnformattedText getLink();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ActualInformation#getLink <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' containment reference.
   * @see #getLink()
   * @generated
   */
  void setLink(UnformattedText value);

  /**
   * Returns the value of the '<em><b>Additional Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.UnformattedText}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional Links</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActualInformation_AdditionalLinks()
   * @model containment="true"
   * @generated
   */
  EList<UnformattedText> getAdditionalLinks();

} // ActualInformation
