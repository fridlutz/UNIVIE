/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslFactory
 * @model kind="package"
 * @generated
 */
public interface PlaylistDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "playlistDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/univie/swa/ase/example/PlaylistDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "playlistDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlaylistDslPackage eINSTANCE = at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Distributors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DISTRIBUTORS = 0;

  /**
   * The feature id for the '<em><b>Song Library</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SONG_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Playlists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLAYLISTS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistItemImpl <em>Playlist Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistItemImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getPlaylistItem()
   * @generated
   */
  int PLAYLIST_ITEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST_ITEM__NAME = 0;

  /**
   * The number of structural features of the '<em>Playlist Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistImpl <em>Playlist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getPlaylist()
   * @generated
   */
  int PLAYLIST = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__NAME = PLAYLIST_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__ITEMS = PLAYLIST_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Playlist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST_FEATURE_COUNT = PLAYLIST_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.LibraryImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = 0;

  /**
   * The feature id for the '<em><b>Songs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__SONGS = 1;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getItem()
   * @generated
   */
  int ITEM = 4;

  /**
   * The feature id for the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ITEM = 0;

  /**
   * The feature id for the '<em><b>Excluded</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__EXCLUDED = 1;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl <em>Song</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getSong()
   * @generated
   */
  int SONG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__NAME = PLAYLIST_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Artist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__ARTIST = PLAYLIST_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Distributor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__DISTRIBUTOR = PLAYLIST_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__LENGTH = PLAYLIST_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Genre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__GENRE = PLAYLIST_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__PRICE = PLAYLIST_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Song</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG_FEATURE_COUNT = PLAYLIST_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl <em>Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getLength()
   * @generated
   */
  int LENGTH = 6;

  /**
   * The feature id for the '<em><b>Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__MINUTES = 0;

  /**
   * The feature id for the '<em><b>Seconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__SECONDS = 1;

  /**
   * The number of structural features of the '<em>Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl <em>Distributor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getDistributor()
   * @generated
   */
  int DISTRIBUTOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Iban</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__IBAN = 2;

  /**
   * The feature id for the '<em><b>Bic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__BIC = 3;

  /**
   * The number of structural features of the '<em>Distributor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase.example.playlistDsl.Genre <em>Genre</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase.example.playlistDsl.Genre
   * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getGenre()
   * @generated
   */
  int GENRE = 8;


  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Model#getDistributors <em>Distributors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Distributors</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Model#getDistributors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Distributors();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Model#getSongLibrary <em>Song Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Song Library</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Model#getSongLibrary()
   * @see #getModel()
   * @generated
   */
  EReference getModel_SongLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Model#getPlaylists <em>Playlists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Playlists</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Model#getPlaylists()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Playlists();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Playlist <em>Playlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Playlist</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Playlist
   * @generated
   */
  EClass getPlaylist();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Playlist#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Playlist#getItems()
   * @see #getPlaylist()
   * @generated
   */
  EReference getPlaylist_Items();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem <em>Playlist Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Playlist Item</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem
   * @generated
   */
  EClass getPlaylistItem();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem#getName()
   * @see #getPlaylistItem()
   * @generated
   */
  EAttribute getPlaylistItem_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Library
   * @generated
   */
  EClass getLibrary();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Library#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Library#getName()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Library#getSongs <em>Songs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Songs</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Library#getSongs()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Songs();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.swa.ase.example.playlistDsl.Item#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Item</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Item#getItem()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Item();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase.example.playlistDsl.Item#getExcluded <em>Excluded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Excluded</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Item#getExcluded()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Excluded();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Song <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Song</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song
   * @generated
   */
  EClass getSong();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getArtist <em>Artist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artist</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song#getArtist()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Artist();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getDistributor <em>Distributor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Distributor</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song#getDistributor()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Distributor();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song#getLength()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Length();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getGenre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Genre</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song#getGenre()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Genre();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Song#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Song#getPrice()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Price();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Length
   * @generated
   */
  EClass getLength();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getMinutes <em>Minutes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minutes</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Length#getMinutes()
   * @see #getLength()
   * @generated
   */
  EAttribute getLength_Minutes();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getSeconds <em>Seconds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seconds</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Length#getSeconds()
   * @see #getLength()
   * @generated
   */
  EAttribute getLength_Seconds();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase.example.playlistDsl.Distributor <em>Distributor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distributor</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Distributor
   * @generated
   */
  EClass getDistributor();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Distributor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Distributor#getName()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Distributor#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Distributor#getAddress()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Address();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Distributor#getIban <em>Iban</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iban</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Distributor#getIban()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Iban();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase.example.playlistDsl.Distributor#getBic <em>Bic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bic</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Distributor#getBic()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Bic();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.swa.ase.example.playlistDsl.Genre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Genre</em>'.
   * @see at.ac.univie.swa.ase.example.playlistDsl.Genre
   * @generated
   */
  EEnum getGenre();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlaylistDslFactory getPlaylistDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Distributors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DISTRIBUTORS = eINSTANCE.getModel_Distributors();

    /**
     * The meta object literal for the '<em><b>Song Library</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SONG_LIBRARY = eINSTANCE.getModel_SongLibrary();

    /**
     * The meta object literal for the '<em><b>Playlists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLAYLISTS = eINSTANCE.getModel_Playlists();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistImpl <em>Playlist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getPlaylist()
     * @generated
     */
    EClass PLAYLIST = eINSTANCE.getPlaylist();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYLIST__ITEMS = eINSTANCE.getPlaylist_Items();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistItemImpl <em>Playlist Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistItemImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getPlaylistItem()
     * @generated
     */
    EClass PLAYLIST_ITEM = eINSTANCE.getPlaylistItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYLIST_ITEM__NAME = eINSTANCE.getPlaylistItem_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.LibraryImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getLibrary()
     * @generated
     */
    EClass LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Songs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__SONGS = eINSTANCE.getLibrary_Songs();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__ITEM = eINSTANCE.getItem_Item();

    /**
     * The meta object literal for the '<em><b>Excluded</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__EXCLUDED = eINSTANCE.getItem_Excluded();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl <em>Song</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getSong()
     * @generated
     */
    EClass SONG = eINSTANCE.getSong();

    /**
     * The meta object literal for the '<em><b>Artist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__ARTIST = eINSTANCE.getSong_Artist();

    /**
     * The meta object literal for the '<em><b>Distributor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONG__DISTRIBUTOR = eINSTANCE.getSong_Distributor();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONG__LENGTH = eINSTANCE.getSong_Length();

    /**
     * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__GENRE = eINSTANCE.getSong_Genre();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__PRICE = eINSTANCE.getSong_Price();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl <em>Length</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getLength()
     * @generated
     */
    EClass LENGTH = eINSTANCE.getLength();

    /**
     * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGTH__MINUTES = eINSTANCE.getLength_Minutes();

    /**
     * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGTH__SECONDS = eINSTANCE.getLength_Seconds();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl <em>Distributor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getDistributor()
     * @generated
     */
    EClass DISTRIBUTOR = eINSTANCE.getDistributor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTOR__NAME = eINSTANCE.getDistributor_Name();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTOR__ADDRESS = eINSTANCE.getDistributor_Address();

    /**
     * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTOR__IBAN = eINSTANCE.getDistributor_Iban();

    /**
     * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTOR__BIC = eINSTANCE.getDistributor_Bic();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase.example.playlistDsl.Genre <em>Genre</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase.example.playlistDsl.Genre
     * @see at.ac.univie.swa.ase.example.playlistDsl.impl.PlaylistDslPackageImpl#getGenre()
     * @generated
     */
    EEnum GENRE = eINSTANCE.getGenre();

  }

} //PlaylistDslPackage
