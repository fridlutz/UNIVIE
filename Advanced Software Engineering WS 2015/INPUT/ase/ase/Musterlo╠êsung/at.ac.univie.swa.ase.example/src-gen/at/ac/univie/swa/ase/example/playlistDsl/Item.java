/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Item#getItem <em>Item</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Item#getExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(PlaylistItem)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getItem_Item()
   * @model
   * @generated
   */
  PlaylistItem getItem();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Item#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(PlaylistItem value);

  /**
   * Returns the value of the '<em><b>Excluded</b></em>' reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase.example.playlistDsl.Song}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excluded</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excluded</em>' reference list.
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getItem_Excluded()
   * @model
   * @generated
   */
  EList<Song> getExcluded();

} // Item
