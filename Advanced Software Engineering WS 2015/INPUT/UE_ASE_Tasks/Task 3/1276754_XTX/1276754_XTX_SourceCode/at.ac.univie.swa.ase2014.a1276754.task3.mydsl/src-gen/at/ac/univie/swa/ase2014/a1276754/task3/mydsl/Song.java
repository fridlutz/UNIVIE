/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getArtist <em>Artist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getDist <em>Dist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getLength <em>Length</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getGenre <em>Genre</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends EObject
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
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Artist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artist</em>' attribute.
   * @see #setArtist(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Artist()
   * @model
   * @generated
   */
  String getArtist();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getArtist <em>Artist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artist</em>' attribute.
   * @see #getArtist()
   * @generated
   */
  void setArtist(String value);

  /**
   * Returns the value of the '<em><b>Dist</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dist</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dist</em>' reference.
   * @see #setDist(Distributor)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Dist()
   * @model
   * @generated
   */
  Distributor getDist();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getDist <em>Dist</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dist</em>' reference.
   * @see #getDist()
   * @generated
   */
  void setDist(Distributor value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(Time)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Length()
   * @model containment="true"
   * @generated
   */
  Time getLength();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(Time value);

  /**
   * Returns the value of the '<em><b>Genre</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Genre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Genre</em>' attribute.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre
   * @see #setGenre(Genre)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Genre()
   * @model
   * @generated
   */
  Genre getGenre();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getGenre <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Genre</em>' attribute.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre
   * @see #getGenre()
   * @generated
   */
  void setGenre(Genre value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getSong_Price()
   * @model
   * @generated
   */
  String getPrice();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(String value);

} // Song
