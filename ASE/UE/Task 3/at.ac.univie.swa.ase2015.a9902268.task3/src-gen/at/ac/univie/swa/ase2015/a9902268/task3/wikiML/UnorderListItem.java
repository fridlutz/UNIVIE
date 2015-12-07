/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unorder List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getLevel <em>Level</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getItemtext <em>Itemtext</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getUnorderListItem()
 * @model
 * @generated
 */
public interface UnorderListItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(String)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getUnorderListItem_Level()
   * @model
   * @generated
   */
  String getLevel();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(String value);

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
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getUnorderListItem_Itemtext()
   * @model containment="true"
   * @generated
   */
  AnyTextSequence getItemtext();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem#getItemtext <em>Itemtext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Itemtext</em>' containment reference.
   * @see #getItemtext()
   * @generated
   */
  void setItemtext(AnyTextSequence value);

} // UnorderListItem
