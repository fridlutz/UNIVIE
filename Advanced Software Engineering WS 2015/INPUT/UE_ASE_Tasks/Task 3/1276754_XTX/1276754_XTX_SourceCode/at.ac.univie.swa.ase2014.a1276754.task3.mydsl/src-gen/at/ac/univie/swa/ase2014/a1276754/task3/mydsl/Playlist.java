/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getSongs <em>Songs</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getIncl <em>Incl</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getExcl <em>Excl</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject
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
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getPlaylist_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Songs</b></em>' reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Songs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Songs</em>' reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getPlaylist_Songs()
   * @model
   * @generated
   */
  EList<Song> getSongs();

  /**
   * Returns the value of the '<em><b>Incl</b></em>' reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incl</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incl</em>' reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getPlaylist_Incl()
   * @model
   * @generated
   */
  EList<Playlist> getIncl();

  /**
   * Returns the value of the '<em><b>Excl</b></em>' reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excl</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excl</em>' reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getPlaylist_Excl()
   * @model
   * @generated
   */
  EList<Song> getExcl();

} // Playlist
