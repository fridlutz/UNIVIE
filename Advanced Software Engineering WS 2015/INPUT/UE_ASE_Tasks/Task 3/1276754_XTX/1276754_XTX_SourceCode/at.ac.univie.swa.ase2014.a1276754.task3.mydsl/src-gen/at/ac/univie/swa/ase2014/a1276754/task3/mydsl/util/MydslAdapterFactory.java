/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.util;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage
 * @generated
 */
public class MydslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MydslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MydslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MydslPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected MydslSwitch<Adapter> modelSwitch =
    new MydslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDistributor(Distributor object)
      {
        return createDistributorAdapter();
      }
      @Override
      public Adapter caseAccount_Information(Account_Information object)
      {
        return createAccount_InformationAdapter();
      }
      @Override
      public Adapter caseSong(Song object)
      {
        return createSongAdapter();
      }
      @Override
      public Adapter caseTime(Time object)
      {
        return createTimeAdapter();
      }
      @Override
      public Adapter casePlaylist(Playlist object)
      {
        return createPlaylistAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor <em>Distributor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor
   * @generated
   */
  public Adapter createDistributorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information <em>Account Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information
   * @generated
   */
  public Adapter createAccount_InformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song <em>Song</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song
   * @generated
   */
  public Adapter createSongAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time
   * @generated
   */
  public Adapter createTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist <em>Playlist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist
   * @generated
   */
  public Adapter createPlaylistAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MydslAdapterFactory