/**
 */
package aSE_Task2.impl;

import aSE_Task2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASE_Task2FactoryImpl extends EFactoryImpl implements ASE_Task2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASE_Task2Factory init() {
		try {
			ASE_Task2Factory theASE_Task2Factory = (ASE_Task2Factory)EPackage.Registry.INSTANCE.getEFactory(ASE_Task2Package.eNS_URI);
			if (theASE_Task2Factory != null) {
				return theASE_Task2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASE_Task2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASE_Task2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ASE_Task2Package.ACCOUNT: return createAccount();
			case ASE_Task2Package.PROFILE: return createProfile();
			case ASE_Task2Package.REVIEW: return createReview();
			case ASE_Task2Package.DISTRIBUTOR: return createDistributor();
			case ASE_Task2Package.MOVIE: return createMovie();
			case ASE_Task2Package.MUSIC: return createMusic();
			case ASE_Task2Package.TV_SERIES: return createTV_Series();
			case ASE_Task2Package.RENTAL_MOVIE: return createRentalMovie();
			case ASE_Task2Package.RENTAL_MUSIC: return createRentalMusic();
			case ASE_Task2Package.RENTAL_TV_SERIES: return createRentalTV_Series();
			case ASE_Task2Package.LIBRARY: return createLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Review createReview() {
		ReviewImpl review = new ReviewImpl();
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distributor createDistributor() {
		DistributorImpl distributor = new DistributorImpl();
		return distributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie createMovie() {
		MovieImpl movie = new MovieImpl();
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Music createMusic() {
		MusicImpl music = new MusicImpl();
		return music;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TV_Series createTV_Series() {
		TV_SeriesImpl tV_Series = new TV_SeriesImpl();
		return tV_Series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalMovie createRentalMovie() {
		RentalMovieImpl rentalMovie = new RentalMovieImpl();
		return rentalMovie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalMusic createRentalMusic() {
		RentalMusicImpl rentalMusic = new RentalMusicImpl();
		return rentalMusic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalTV_Series createRentalTV_Series() {
		RentalTV_SeriesImpl rentalTV_Series = new RentalTV_SeriesImpl();
		return rentalTV_Series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASE_Task2Package getASE_Task2Package() {
		return (ASE_Task2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASE_Task2Package getPackage() {
		return ASE_Task2Package.eINSTANCE;
	}

} //ASE_Task2FactoryImpl
