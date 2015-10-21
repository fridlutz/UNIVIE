/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Playlist#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends PlaylistItem
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase.example.playlistDsl.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getPlaylist_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

} // Playlist
