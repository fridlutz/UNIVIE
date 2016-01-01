/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Category#getCategoryLink <em>Category Link</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject
{
  /**
   * Returns the value of the '<em><b>Category Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Link</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Link</em>' containment reference.
   * @see #setCategoryLink(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCategory_CategoryLink()
   * @model containment="true"
   * @generated
   */
  UnformattedText getCategoryLink();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Category#getCategoryLink <em>Category Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Link</em>' containment reference.
   * @see #getCategoryLink()
   * @generated
   */
  void setCategoryLink(UnformattedText value);

} // Category
