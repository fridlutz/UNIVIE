/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem#getItemtext <em>Itemtext</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getOrderListItem()
 * @model
 * @generated
 */
public interface OrderListItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Itemtext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Itemtext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Itemtext</em>' containment reference.
   * @see #setItemtext(AnyTextSequence)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getOrderListItem_Itemtext()
   * @model containment="true"
   * @generated
   */
  AnyTextSequence getItemtext();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem#getItemtext <em>Itemtext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Itemtext</em>' containment reference.
   * @see #getItemtext()
   * @generated
   */
  void setItemtext(AnyTextSequence value);

} // OrderListItem
