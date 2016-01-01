/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unordered List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.UnorderedListItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnorderedListItem()
 * @model
 * @generated
 */
public interface UnorderedListItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnorderedListItem_Item()
   * @model containment="true"
   * @generated
   */
  EObject getItem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.UnorderedListItem#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(EObject value);

} // UnorderedListItem
