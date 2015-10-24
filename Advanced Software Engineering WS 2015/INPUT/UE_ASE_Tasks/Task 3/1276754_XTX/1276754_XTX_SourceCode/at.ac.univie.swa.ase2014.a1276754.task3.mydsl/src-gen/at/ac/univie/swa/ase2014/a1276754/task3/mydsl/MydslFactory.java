/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage
 * @generated
 */
public interface MydslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MydslFactory eINSTANCE = at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Distributor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distributor</em>'.
   * @generated
   */
  Distributor createDistributor();

  /**
   * Returns a new object of class '<em>Account Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account Information</em>'.
   * @generated
   */
  Account_Information createAccount_Information();

  /**
   * Returns a new object of class '<em>Song</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Song</em>'.
   * @generated
   */
  Song createSong();

  /**
   * Returns a new object of class '<em>Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time</em>'.
   * @generated
   */
  Time createTime();

  /**
   * Returns a new object of class '<em>Playlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Playlist</em>'.
   * @generated
   */
  Playlist createPlaylist();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MydslPackage getMydslPackage();

} //MydslFactory
