/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Library#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Library#getSongs <em>Songs</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Library#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Songs</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase.example.playlistDsl.Song}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Songs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Songs</em>' containment reference list.
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLibrary_Songs()
   * @model containment="true"
   * @generated
   */
  EList<Song> getSongs();

} // Library
