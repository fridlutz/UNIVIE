/**
 */
package aSE_Task2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aSE_Task2.ASE_Task2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ASE_Task2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aSE_Task2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/aSE_Task2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aSE_Task2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASE_Task2Package eINSTANCE = aSE_Task2.impl.ASE_Task2PackageImpl.init();

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.AccountImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORT = 2;

	/**
	 * The feature id for the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LAND = 3;

	/**
	 * The feature id for the '<em><b>Abo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ABO = 4;

	/**
	 * The feature id for the '<em><b>Beinhaltet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BEINHALTET = 5;

	/**
	 * The feature id for the '<em><b>Leiht</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LEIHT = 6;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.MediaImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__ID = 0;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TITEL = 1;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.StreamingMediaImpl <em>Streaming Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.StreamingMediaImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getStreamingMedia()
	 * @generated
	 */
	int STREAMING_MEDIA = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_MEDIA__ID = MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_MEDIA__TITEL = MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_MEDIA__GROESSE = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Streaming Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_MEDIA_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Streaming Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_MEDIA_OPERATION_COUNT = MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.RentalMediaImpl <em>Rental Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.RentalMediaImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMedia()
	 * @generated
	 */
	int RENTAL_MEDIA = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MEDIA__ID = MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MEDIA__TITEL = MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MEDIA__ANZAHL = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rental Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MEDIA_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rental Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MEDIA_OPERATION_COUNT = MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.ProfileImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PASSWORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ID = 2;

	/**
	 * The feature id for the '<em><b>Writes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__WRITES = 3;

	/**
	 * The feature id for the '<em><b>Friend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__FRIEND = 4;

	/**
	 * The feature id for the '<em><b>Streamt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__STREAMT = 5;

	/**
	 * The feature id for the '<em><b>Media Qeue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MEDIA_QEUE = 6;

	/**
	 * The feature id for the '<em><b>Recommandation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__RECOMMANDATION = 7;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.ReviewImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__TEXT = 0;

	/**
	 * The feature id for the '<em><b>About</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__ABOUT = 1;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.DistributorImpl <em>Distributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.DistributorImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getDistributor()
	 * @generated
	 */
	int DISTRIBUTOR = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Hat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__HAT = 2;

	/**
	 * The number of structural features of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.MovieImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__ID = STREAMING_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TITEL = STREAMING_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__GROESSE = STREAMING_MEDIA__GROESSE;

	/**
	 * The feature id for the '<em><b>Regisseur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__REGISSEUR = STREAMING_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = STREAMING_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = STREAMING_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.MusicImpl <em>Music</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.MusicImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMusic()
	 * @generated
	 */
	int MUSIC = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__ID = STREAMING_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__TITEL = STREAMING_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__GROESSE = STREAMING_MEDIA__GROESSE;

	/**
	 * The feature id for the '<em><b>Kuenstler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC__KUENSTLER = STREAMING_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_FEATURE_COUNT = STREAMING_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_OPERATION_COUNT = STREAMING_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.TV_SeriesImpl <em>TV Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.TV_SeriesImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getTV_Series()
	 * @generated
	 */
	int TV_SERIES = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__ID = STREAMING_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__TITEL = STREAMING_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__GROESSE = STREAMING_MEDIA__GROESSE;

	/**
	 * The feature id for the '<em><b>Epsioden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__EPSIODEN = STREAMING_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TV Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES_FEATURE_COUNT = STREAMING_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TV Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES_OPERATION_COUNT = STREAMING_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.RentalMovieImpl <em>Rental Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.RentalMovieImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMovie()
	 * @generated
	 */
	int RENTAL_MOVIE = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE__ID = RENTAL_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE__TITEL = RENTAL_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE__ANZAHL = RENTAL_MEDIA__ANZAHL;

	/**
	 * The feature id for the '<em><b>Regisseur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE__REGISSEUR = RENTAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rental Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE_FEATURE_COUNT = RENTAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rental Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MOVIE_OPERATION_COUNT = RENTAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.RentalMusicImpl <em>Rental Music</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.RentalMusicImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMusic()
	 * @generated
	 */
	int RENTAL_MUSIC = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC__ID = RENTAL_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC__TITEL = RENTAL_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC__ANZAHL = RENTAL_MEDIA__ANZAHL;

	/**
	 * The feature id for the '<em><b>Kuenstler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC__KUENSTLER = RENTAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Epsioden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC__EPSIODEN = RENTAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rental Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC_FEATURE_COUNT = RENTAL_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rental Music</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_MUSIC_OPERATION_COUNT = RENTAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.RentalTV_SeriesImpl <em>Rental TV Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.RentalTV_SeriesImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalTV_Series()
	 * @generated
	 */
	int RENTAL_TV_SERIES = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES__ID = RENTAL_MEDIA__ID;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES__TITEL = RENTAL_MEDIA__TITEL;

	/**
	 * The feature id for the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES__ANZAHL = RENTAL_MEDIA__ANZAHL;

	/**
	 * The feature id for the '<em><b>Epsioden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES__EPSIODEN = RENTAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rental TV Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES_FEATURE_COUNT = RENTAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rental TV Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_TV_SERIES_OPERATION_COUNT = RENTAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSE_Task2.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSE_Task2.impl.LibraryImpl
	 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 13;

	/**
	 * The feature id for the '<em><b>New Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NEW_MEDIA = 0;

	/**
	 * The feature id for the '<em><b>New Account</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NEW_ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link aSE_Task2.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see aSE_Task2.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Account#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see aSE_Task2.Account#getID()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_ID();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSE_Task2.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Account#getPasswort <em>Passwort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwort</em>'.
	 * @see aSE_Task2.Account#getPasswort()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Passwort();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Account#getLand <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Land</em>'.
	 * @see aSE_Task2.Account#getLand()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Land();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Account#getAbo <em>Abo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abo</em>'.
	 * @see aSE_Task2.Account#getAbo()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Abo();

	/**
	 * Returns the meta object for the containment reference list '{@link aSE_Task2.Account#getBeinhaltet <em>Beinhaltet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beinhaltet</em>'.
	 * @see aSE_Task2.Account#getBeinhaltet()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Beinhaltet();

	/**
	 * Returns the meta object for the reference list '{@link aSE_Task2.Account#getLeiht <em>Leiht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leiht</em>'.
	 * @see aSE_Task2.Account#getLeiht()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Leiht();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see aSE_Task2.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Media#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see aSE_Task2.Media#getID()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_ID();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Media#getTitel <em>Titel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel</em>'.
	 * @see aSE_Task2.Media#getTitel()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Titel();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.StreamingMedia <em>Streaming Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streaming Media</em>'.
	 * @see aSE_Task2.StreamingMedia
	 * @generated
	 */
	EClass getStreamingMedia();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.StreamingMedia#getGroesse <em>Groesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groesse</em>'.
	 * @see aSE_Task2.StreamingMedia#getGroesse()
	 * @see #getStreamingMedia()
	 * @generated
	 */
	EAttribute getStreamingMedia_Groesse();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.RentalMedia <em>Rental Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Media</em>'.
	 * @see aSE_Task2.RentalMedia
	 * @generated
	 */
	EClass getRentalMedia();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.RentalMedia#getAnzahl <em>Anzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl</em>'.
	 * @see aSE_Task2.RentalMedia#getAnzahl()
	 * @see #getRentalMedia()
	 * @generated
	 */
	EAttribute getRentalMedia_Anzahl();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see aSE_Task2.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Profile#getPasswort <em>Passwort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwort</em>'.
	 * @see aSE_Task2.Profile#getPasswort()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Passwort();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Profile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSE_Task2.Profile#getName()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Name();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Profile#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see aSE_Task2.Profile#getID()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link aSE_Task2.Profile#getWrites <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Writes</em>'.
	 * @see aSE_Task2.Profile#getWrites()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Writes();

	/**
	 * Returns the meta object for the reference list '{@link aSE_Task2.Profile#getFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friend</em>'.
	 * @see aSE_Task2.Profile#getFriend()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Friend();

	/**
	 * Returns the meta object for the reference list '{@link aSE_Task2.Profile#getStreamt <em>Streamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streamt</em>'.
	 * @see aSE_Task2.Profile#getStreamt()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Streamt();

	/**
	 * Returns the meta object for the reference list '{@link aSE_Task2.Profile#getMediaQeue <em>Media Qeue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media Qeue</em>'.
	 * @see aSE_Task2.Profile#getMediaQeue()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_MediaQeue();

	/**
	 * Returns the meta object for the reference list '{@link aSE_Task2.Profile#getRecommandation <em>Recommandation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommandation</em>'.
	 * @see aSE_Task2.Profile#getRecommandation()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Recommandation();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see aSE_Task2.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Review#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see aSE_Task2.Review#getText()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Text();

	/**
	 * Returns the meta object for the containment reference '{@link aSE_Task2.Review#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>About</em>'.
	 * @see aSE_Task2.Review#getAbout()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_About();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributor</em>'.
	 * @see aSE_Task2.Distributor
	 * @generated
	 */
	EClass getDistributor();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Distributor#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see aSE_Task2.Distributor#getID()
	 * @see #getDistributor()
	 * @generated
	 */
	EAttribute getDistributor_ID();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Distributor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSE_Task2.Distributor#getName()
	 * @see #getDistributor()
	 * @generated
	 */
	EAttribute getDistributor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link aSE_Task2.Distributor#getHat <em>Hat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hat</em>'.
	 * @see aSE_Task2.Distributor#getHat()
	 * @see #getDistributor()
	 * @generated
	 */
	EReference getDistributor_Hat();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see aSE_Task2.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Movie#getRegisseur <em>Regisseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regisseur</em>'.
	 * @see aSE_Task2.Movie#getRegisseur()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Regisseur();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music</em>'.
	 * @see aSE_Task2.Music
	 * @generated
	 */
	EClass getMusic();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Music#getKuenstler <em>Kuenstler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kuenstler</em>'.
	 * @see aSE_Task2.Music#getKuenstler()
	 * @see #getMusic()
	 * @generated
	 */
	EAttribute getMusic_Kuenstler();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.TV_Series <em>TV Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TV Series</em>'.
	 * @see aSE_Task2.TV_Series
	 * @generated
	 */
	EClass getTV_Series();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.TV_Series#getEpsioden <em>Epsioden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epsioden</em>'.
	 * @see aSE_Task2.TV_Series#getEpsioden()
	 * @see #getTV_Series()
	 * @generated
	 */
	EAttribute getTV_Series_Epsioden();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.RentalMovie <em>Rental Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Movie</em>'.
	 * @see aSE_Task2.RentalMovie
	 * @generated
	 */
	EClass getRentalMovie();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.RentalMovie#getRegisseur <em>Regisseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regisseur</em>'.
	 * @see aSE_Task2.RentalMovie#getRegisseur()
	 * @see #getRentalMovie()
	 * @generated
	 */
	EAttribute getRentalMovie_Regisseur();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.RentalMusic <em>Rental Music</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental Music</em>'.
	 * @see aSE_Task2.RentalMusic
	 * @generated
	 */
	EClass getRentalMusic();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.RentalMusic#getKuenstler <em>Kuenstler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kuenstler</em>'.
	 * @see aSE_Task2.RentalMusic#getKuenstler()
	 * @see #getRentalMusic()
	 * @generated
	 */
	EAttribute getRentalMusic_Kuenstler();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.RentalMusic#getEpsioden <em>Epsioden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epsioden</em>'.
	 * @see aSE_Task2.RentalMusic#getEpsioden()
	 * @see #getRentalMusic()
	 * @generated
	 */
	EAttribute getRentalMusic_Epsioden();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.RentalTV_Series <em>Rental TV Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental TV Series</em>'.
	 * @see aSE_Task2.RentalTV_Series
	 * @generated
	 */
	EClass getRentalTV_Series();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.RentalTV_Series#getEpsioden <em>Epsioden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epsioden</em>'.
	 * @see aSE_Task2.RentalTV_Series#getEpsioden()
	 * @see #getRentalTV_Series()
	 * @generated
	 */
	EAttribute getRentalTV_Series_Epsioden();

	/**
	 * Returns the meta object for class '{@link aSE_Task2.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see aSE_Task2.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link aSE_Task2.Library#getNewMedia <em>New Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Media</em>'.
	 * @see aSE_Task2.Library#getNewMedia()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_NewMedia();

	/**
	 * Returns the meta object for the containment reference list '{@link aSE_Task2.Library#getNewAccount <em>New Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Account</em>'.
	 * @see aSE_Task2.Library#getNewAccount()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_NewAccount();

	/**
	 * Returns the meta object for the attribute '{@link aSE_Task2.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSE_Task2.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASE_Task2Factory getASE_Task2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.AccountImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ID = eINSTANCE.getAccount_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Passwort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORT = eINSTANCE.getAccount_Passwort();

		/**
		 * The meta object literal for the '<em><b>Land</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__LAND = eINSTANCE.getAccount_Land();

		/**
		 * The meta object literal for the '<em><b>Abo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ABO = eINSTANCE.getAccount_Abo();

		/**
		 * The meta object literal for the '<em><b>Beinhaltet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__BEINHALTET = eINSTANCE.getAccount_Beinhaltet();

		/**
		 * The meta object literal for the '<em><b>Leiht</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__LEIHT = eINSTANCE.getAccount_Leiht();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.MediaImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__ID = eINSTANCE.getMedia_ID();

		/**
		 * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TITEL = eINSTANCE.getMedia_Titel();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.StreamingMediaImpl <em>Streaming Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.StreamingMediaImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getStreamingMedia()
		 * @generated
		 */
		EClass STREAMING_MEDIA = eINSTANCE.getStreamingMedia();

		/**
		 * The meta object literal for the '<em><b>Groesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAMING_MEDIA__GROESSE = eINSTANCE.getStreamingMedia_Groesse();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.RentalMediaImpl <em>Rental Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.RentalMediaImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMedia()
		 * @generated
		 */
		EClass RENTAL_MEDIA = eINSTANCE.getRentalMedia();

		/**
		 * The meta object literal for the '<em><b>Anzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_MEDIA__ANZAHL = eINSTANCE.getRentalMedia_Anzahl();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.ProfileImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Passwort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__PASSWORT = eINSTANCE.getProfile_Passwort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__NAME = eINSTANCE.getProfile_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__ID = eINSTANCE.getProfile_ID();

		/**
		 * The meta object literal for the '<em><b>Writes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__WRITES = eINSTANCE.getProfile_Writes();

		/**
		 * The meta object literal for the '<em><b>Friend</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__FRIEND = eINSTANCE.getProfile_Friend();

		/**
		 * The meta object literal for the '<em><b>Streamt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__STREAMT = eINSTANCE.getProfile_Streamt();

		/**
		 * The meta object literal for the '<em><b>Media Qeue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__MEDIA_QEUE = eINSTANCE.getProfile_MediaQeue();

		/**
		 * The meta object literal for the '<em><b>Recommandation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__RECOMMANDATION = eINSTANCE.getProfile_Recommandation();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.ReviewImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__TEXT = eINSTANCE.getReview_Text();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__ABOUT = eINSTANCE.getReview_About();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.DistributorImpl <em>Distributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.DistributorImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getDistributor()
		 * @generated
		 */
		EClass DISTRIBUTOR = eINSTANCE.getDistributor();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTOR__ID = eINSTANCE.getDistributor_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTOR__NAME = eINSTANCE.getDistributor_Name();

		/**
		 * The meta object literal for the '<em><b>Hat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTOR__HAT = eINSTANCE.getDistributor_Hat();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.MovieImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Regisseur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__REGISSEUR = eINSTANCE.getMovie_Regisseur();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.MusicImpl <em>Music</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.MusicImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getMusic()
		 * @generated
		 */
		EClass MUSIC = eINSTANCE.getMusic();

		/**
		 * The meta object literal for the '<em><b>Kuenstler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC__KUENSTLER = eINSTANCE.getMusic_Kuenstler();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.TV_SeriesImpl <em>TV Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.TV_SeriesImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getTV_Series()
		 * @generated
		 */
		EClass TV_SERIES = eINSTANCE.getTV_Series();

		/**
		 * The meta object literal for the '<em><b>Epsioden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TV_SERIES__EPSIODEN = eINSTANCE.getTV_Series_Epsioden();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.RentalMovieImpl <em>Rental Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.RentalMovieImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMovie()
		 * @generated
		 */
		EClass RENTAL_MOVIE = eINSTANCE.getRentalMovie();

		/**
		 * The meta object literal for the '<em><b>Regisseur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_MOVIE__REGISSEUR = eINSTANCE.getRentalMovie_Regisseur();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.RentalMusicImpl <em>Rental Music</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.RentalMusicImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalMusic()
		 * @generated
		 */
		EClass RENTAL_MUSIC = eINSTANCE.getRentalMusic();

		/**
		 * The meta object literal for the '<em><b>Kuenstler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_MUSIC__KUENSTLER = eINSTANCE.getRentalMusic_Kuenstler();

		/**
		 * The meta object literal for the '<em><b>Epsioden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_MUSIC__EPSIODEN = eINSTANCE.getRentalMusic_Epsioden();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.RentalTV_SeriesImpl <em>Rental TV Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.RentalTV_SeriesImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getRentalTV_Series()
		 * @generated
		 */
		EClass RENTAL_TV_SERIES = eINSTANCE.getRentalTV_Series();

		/**
		 * The meta object literal for the '<em><b>Epsioden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL_TV_SERIES__EPSIODEN = eINSTANCE.getRentalTV_Series_Epsioden();

		/**
		 * The meta object literal for the '{@link aSE_Task2.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSE_Task2.impl.LibraryImpl
		 * @see aSE_Task2.impl.ASE_Task2PackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>New Media</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__NEW_MEDIA = eINSTANCE.getLibrary_NewMedia();

		/**
		 * The meta object literal for the '<em><b>New Account</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__NEW_ACCOUNT = eINSTANCE.getLibrary_NewAccount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

	}

} //ASE_Task2Package
