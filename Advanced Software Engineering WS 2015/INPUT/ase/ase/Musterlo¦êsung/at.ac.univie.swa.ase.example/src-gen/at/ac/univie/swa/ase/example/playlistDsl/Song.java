/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getArtist <em>Artist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getLength <em>Length</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getGenre <em>Genre</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends PlaylistItem
{
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
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong_Artist()
   * @model
   * @generated
   */
  String getArtist();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getArtist <em>Artist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artist</em>' attribute.
   * @see #getArtist()
   * @generated
   */
  void setArtist(String value);

  /**
   * Returns the value of the '<em><b>Distributor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distributor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distributor</em>' reference.
   * @see #setDistributor(Distributor)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong_Distributor()
   * @model
   * @generated
   */
  Distributor getDistributor();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getDistributor <em>Distributor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distributor</em>' reference.
   * @see #getDistributor()
   * @generated
   */
  void setDistributor(Distributor value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(Length)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong_Length()
   * @model containment="true"
   * @generated
   */
  Length getLength();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(Length value);

  /**
   * Returns the value of the '<em><b>Genre</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.swa.ase.example.playlistDsl.Genre}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Genre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Genre</em>' attribute.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Genre
   * @see #setGenre(Genre)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong_Genre()
   * @model
   * @generated
   */
  Genre getGenre();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getGenre <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Genre</em>' attribute.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Genre
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
   * @see #setPrice(double)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getSong_Price()
   * @model
   * @generated
   */
  double getPrice();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(double value);

} // Song
