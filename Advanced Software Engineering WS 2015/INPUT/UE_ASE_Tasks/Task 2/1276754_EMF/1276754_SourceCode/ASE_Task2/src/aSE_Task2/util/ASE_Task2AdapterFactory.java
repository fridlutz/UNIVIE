/**
 */
package aSE_Task2.util;

import aSE_Task2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aSE_Task2.ASE_Task2Package
 * @generated
 */
public class ASE_Task2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASE_Task2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASE_Task2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ASE_Task2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASE_Task2Switch<Adapter> modelSwitch =
		new ASE_Task2Switch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseStreamingMedia(StreamingMedia object) {
				return createStreamingMediaAdapter();
			}
			@Override
			public Adapter caseRentalMedia(RentalMedia object) {
				return createRentalMediaAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseReview(Review object) {
				return createReviewAdapter();
			}
			@Override
			public Adapter caseDistributor(Distributor object) {
				return createDistributorAdapter();
			}
			@Override
			public Adapter caseMovie(Movie object) {
				return createMovieAdapter();
			}
			@Override
			public Adapter caseMusic(Music object) {
				return createMusicAdapter();
			}
			@Override
			public Adapter caseTV_Series(TV_Series object) {
				return createTV_SeriesAdapter();
			}
			@Override
			public Adapter caseRentalMovie(RentalMovie object) {
				return createRentalMovieAdapter();
			}
			@Override
			public Adapter caseRentalMusic(RentalMusic object) {
				return createRentalMusicAdapter();
			}
			@Override
			public Adapter caseRentalTV_Series(RentalTV_Series object) {
				return createRentalTV_SeriesAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.StreamingMedia <em>Streaming Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.StreamingMedia
	 * @generated
	 */
	public Adapter createStreamingMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.RentalMedia <em>Rental Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.RentalMedia
	 * @generated
	 */
	public Adapter createRentalMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Review
	 * @generated
	 */
	public Adapter createReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Distributor
	 * @generated
	 */
	public Adapter createDistributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Movie
	 * @generated
	 */
	public Adapter createMovieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Music <em>Music</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Music
	 * @generated
	 */
	public Adapter createMusicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.TV_Series <em>TV Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.TV_Series
	 * @generated
	 */
	public Adapter createTV_SeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.RentalMovie <em>Rental Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.RentalMovie
	 * @generated
	 */
	public Adapter createRentalMovieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.RentalMusic <em>Rental Music</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.RentalMusic
	 * @generated
	 */
	public Adapter createRentalMusicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.RentalTV_Series <em>Rental TV Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.RentalTV_Series
	 * @generated
	 */
	public Adapter createRentalTV_SeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSE_Task2.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSE_Task2.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ASE_Task2AdapterFactory
