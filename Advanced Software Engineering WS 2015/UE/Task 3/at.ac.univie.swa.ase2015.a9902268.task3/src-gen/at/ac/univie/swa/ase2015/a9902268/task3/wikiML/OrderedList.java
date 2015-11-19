/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getItems <em>Items</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getOrderedList()
 * @model
 * @generated
 */
public interface OrderedList extends ParagraphTypes
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getOrderedList_Items()
   * @model containment="true"
   * @generated
   */
  EList<OrderListItem> getItems();

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Paragraph)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getOrderedList_End()
   * @model containment="true"
   * @generated
   */
  Paragraph getEnd();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Paragraph value);

} // OrderedList
