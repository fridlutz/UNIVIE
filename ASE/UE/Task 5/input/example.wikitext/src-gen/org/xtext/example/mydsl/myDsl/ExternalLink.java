/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExternalLink#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExternalLink#getRenamedLink <em>Renamed Link</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExternalLink()
 * @model
 * @generated
 */
public interface ExternalLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Link Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Name</em>' containment reference.
   * @see #setLinkName(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExternalLink_LinkName()
   * @model containment="true"
   * @generated
   */
  UnformattedText getLinkName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExternalLink#getLinkName <em>Link Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Name</em>' containment reference.
   * @see #getLinkName()
   * @generated
   */
  void setLinkName(UnformattedText value);

  /**
   * Returns the value of the '<em><b>Renamed Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Renamed Link</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Renamed Link</em>' containment reference.
   * @see #setRenamedLink(FormattedTextWithoutLinks)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExternalLink_RenamedLink()
   * @model containment="true"
   * @generated
   */
  FormattedTextWithoutLinks getRenamedLink();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExternalLink#getRenamedLink <em>Renamed Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Renamed Link</em>' containment reference.
   * @see #getRenamedLink()
   * @generated
   */
  void setRenamedLink(FormattedTextWithoutLinks value);

} // ExternalLink
