/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

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
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslFactory
 * @model kind="package"
 * @generated
 */
public interface MydslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mydsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/univie/swa/ase2014/a1276754/task3/Mydsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mydsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MydslPackage eINSTANCE = at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getModel()
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
   * The feature id for the '<em><b>Songs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SONGS = 1;

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
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl <em>Distributor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getDistributor()
   * @generated
   */
  int DISTRIBUTOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Adresse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__ADRESSE = 1;

  /**
   * The feature id for the '<em><b>Acc info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR__ACC_INFO = 2;

  /**
   * The number of structural features of the '<em>Distributor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl <em>Account Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getAccount_Information()
   * @generated
   */
  int ACCOUNT_INFORMATION = 2;

  /**
   * The feature id for the '<em><b>Iban</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_INFORMATION__IBAN = 0;

  /**
   * The feature id for the '<em><b>Bic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_INFORMATION__BIC = 1;

  /**
   * The number of structural features of the '<em>Account Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_INFORMATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl <em>Song</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getSong()
   * @generated
   */
  int SONG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__NAME = 0;

  /**
   * The feature id for the '<em><b>Artist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__ARTIST = 1;

  /**
   * The feature id for the '<em><b>Dist</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__DIST = 2;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__LENGTH = 3;

  /**
   * The feature id for the '<em><b>Genre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__GENRE = 4;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG__PRICE = 5;

  /**
   * The number of structural features of the '<em>Song</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SONG_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.TimeImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getTime()
   * @generated
   */
  int TIME = 4;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__MIN = 0;

  /**
   * The feature id for the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__SEC = 1;

  /**
   * The number of structural features of the '<em>Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl <em>Playlist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getPlaylist()
   * @generated
   */
  int PLAYLIST = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__NAME = 0;

  /**
   * The feature id for the '<em><b>Songs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__SONGS = 1;

  /**
   * The feature id for the '<em><b>Incl</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__INCL = 2;

  /**
   * The feature id for the '<em><b>Excl</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST__EXCL = 3;

  /**
   * The number of structural features of the '<em>Playlist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYLIST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre <em>Genre</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getGenre()
   * @generated
   */
  int GENRE = 6;


  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getDistributors <em>Distributors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Distributors</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getDistributors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Distributors();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getSongs <em>Songs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Songs</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getSongs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Songs();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getPlaylists <em>Playlists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Playlists</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model#getPlaylists()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Playlists();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor <em>Distributor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distributor</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor
   * @generated
   */
  EClass getDistributor();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getName()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAdresse <em>Adresse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adresse</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAdresse()
   * @see #getDistributor()
   * @generated
   */
  EAttribute getDistributor_Adresse();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAcc_info <em>Acc info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acc info</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAcc_info()
   * @see #getDistributor()
   * @generated
   */
  EReference getDistributor_Acc_info();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information <em>Account Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Information</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information
   * @generated
   */
  EClass getAccount_Information();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getIban <em>Iban</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iban</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getIban()
   * @see #getAccount_Information()
   * @generated
   */
  EAttribute getAccount_Information_Iban();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getBic <em>Bic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bic</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getBic()
   * @see #getAccount_Information()
   * @generated
   */
  EAttribute getAccount_Information_Bic();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Song</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song
   * @generated
   */
  EClass getSong();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getName()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getArtist <em>Artist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artist</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getArtist()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Artist();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getDist <em>Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dist</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getDist()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Dist();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getLength()
   * @see #getSong()
   * @generated
   */
  EReference getSong_Length();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getGenre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Genre</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getGenre()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Genre();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song#getPrice()
   * @see #getSong()
   * @generated
   */
  EAttribute getSong_Price();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getMin()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Min();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getSec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getSec()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Sec();

  /**
   * Returns the meta object for class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist <em>Playlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Playlist</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist
   * @generated
   */
  EClass getPlaylist();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getName()
   * @see #getPlaylist()
   * @generated
   */
  EAttribute getPlaylist_Name();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getSongs <em>Songs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Songs</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getSongs()
   * @see #getPlaylist()
   * @generated
   */
  EReference getPlaylist_Songs();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getIncl <em>Incl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incl</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getIncl()
   * @see #getPlaylist()
   * @generated
   */
  EReference getPlaylist_Incl();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getExcl <em>Excl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Excl</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist#getExcl()
   * @see #getPlaylist()
   * @generated
   */
  EReference getPlaylist_Excl();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Genre</em>'.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre
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
  MydslFactory getMydslFactory();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Songs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SONGS = eINSTANCE.getModel_Songs();

    /**
     * The meta object literal for the '<em><b>Playlists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLAYLISTS = eINSTANCE.getModel_Playlists();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl <em>Distributor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getDistributor()
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
     * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTOR__ADRESSE = eINSTANCE.getDistributor_Adresse();

    /**
     * The meta object literal for the '<em><b>Acc info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTOR__ACC_INFO = eINSTANCE.getDistributor_Acc_info();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl <em>Account Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getAccount_Information()
     * @generated
     */
    EClass ACCOUNT_INFORMATION = eINSTANCE.getAccount_Information();

    /**
     * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCOUNT_INFORMATION__IBAN = eINSTANCE.getAccount_Information_Iban();

    /**
     * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCOUNT_INFORMATION__BIC = eINSTANCE.getAccount_Information_Bic();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl <em>Song</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getSong()
     * @generated
     */
    EClass SONG = eINSTANCE.getSong();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__NAME = eINSTANCE.getSong_Name();

    /**
     * The meta object literal for the '<em><b>Artist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SONG__ARTIST = eINSTANCE.getSong_Artist();

    /**
     * The meta object literal for the '<em><b>Dist</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SONG__DIST = eINSTANCE.getSong_Dist();

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
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.TimeImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getTime()
     * @generated
     */
    EClass TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__MIN = eINSTANCE.getTime_Min();

    /**
     * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__SEC = eINSTANCE.getTime_Sec();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl <em>Playlist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getPlaylist()
     * @generated
     */
    EClass PLAYLIST = eINSTANCE.getPlaylist();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

    /**
     * The meta object literal for the '<em><b>Songs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYLIST__SONGS = eINSTANCE.getPlaylist_Songs();

    /**
     * The meta object literal for the '<em><b>Incl</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYLIST__INCL = eINSTANCE.getPlaylist_Incl();

    /**
     * The meta object literal for the '<em><b>Excl</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYLIST__EXCL = eINSTANCE.getPlaylist_Excl();

    /**
     * The meta object literal for the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre <em>Genre</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre
     * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.MydslPackageImpl#getGenre()
     * @generated
     */
    EEnum GENRE = eINSTANCE.getGenre();

  }

} //MydslPackage
