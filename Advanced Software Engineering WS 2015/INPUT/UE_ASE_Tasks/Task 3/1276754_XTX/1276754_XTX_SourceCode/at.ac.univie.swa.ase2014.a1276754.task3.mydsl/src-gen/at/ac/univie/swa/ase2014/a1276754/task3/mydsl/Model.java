/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getDistributors <em>Distributors</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getSongs <em>Songs</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getPlaylists <em>Playlists</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Distributors</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distributors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distributors</em>' containment reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getModel_Distributors()
   * @model containment="true"
   * @generated
   */
  EList<Distributor> getDistributors();

  /**
   * Returns the value of the '<em><b>Songs</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Songs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Songs</em>' containment reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getModel_Songs()
   * @model containment="true"
   * @generated
   */
  EList<Song> getSongs();

  /**
   * Returns the value of the '<em><b>Playlists</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Playlists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Playlists</em>' containment reference list.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getModel_Playlists()
   * @model containment="true"
   * @generated
   */
  EList<Playlist> getPlaylists();

} // Model
