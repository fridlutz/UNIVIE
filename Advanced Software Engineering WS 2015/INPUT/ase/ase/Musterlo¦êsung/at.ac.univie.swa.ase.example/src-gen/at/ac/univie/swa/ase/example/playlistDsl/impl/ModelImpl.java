/**
 */
package at.ac.univie.swa.ase.example.playlistDsl.impl;

import at.ac.univie.swa.ase.example.playlistDsl.Distributor;
import at.ac.univie.swa.ase.example.playlistDsl.Library;
import at.ac.univie.swa.ase.example.playlistDsl.Model;
import at.ac.univie.swa.ase.example.playlistDsl.Playlist;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl#getDistributors <em>Distributors</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl#getSongLibrary <em>Song Library</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ModelImpl#getPlaylists <em>Playlists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDistributors() <em>Distributors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistributors()
   * @generated
   * @ordered
   */
  protected EList<Distributor> distributors;

  /**
   * The cached value of the '{@link #getSongLibrary() <em>Song Library</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSongLibrary()
   * @generated
   * @ordered
   */
  protected EList<Library> songLibrary;

  /**
   * The cached value of the '{@link #getPlaylists() <em>Playlists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaylists()
   * @generated
   * @ordered
   */
  protected EList<Playlist> playlists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlaylistDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Distributor> getDistributors()
  {
    if (distributors == null)
    {
      distributors = new EObjectContainmentEList<Distributor>(Distributor.class, this, PlaylistDslPackage.MODEL__DISTRIBUTORS);
    }
    return distributors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Library> getSongLibrary()
  {
    if (songLibrary == null)
    {
      songLibrary = new EObjectContainmentEList<Library>(Library.class, this, PlaylistDslPackage.MODEL__SONG_LIBRARY);
    }
    return songLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Playlist> getPlaylists()
  {
    if (playlists == null)
    {
      playlists = new EObjectContainmentEList<Playlist>(Playlist.class, this, PlaylistDslPackage.MODEL__PLAYLISTS);
    }
    return playlists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlaylistDslPackage.MODEL__DISTRIBUTORS:
        return ((InternalEList<?>)getDistributors()).basicRemove(otherEnd, msgs);
      case PlaylistDslPackage.MODEL__SONG_LIBRARY:
        return ((InternalEList<?>)getSongLibrary()).basicRemove(otherEnd, msgs);
      case PlaylistDslPackage.MODEL__PLAYLISTS:
        return ((InternalEList<?>)getPlaylists()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlaylistDslPackage.MODEL__DISTRIBUTORS:
        return getDistributors();
      case PlaylistDslPackage.MODEL__SONG_LIBRARY:
        return getSongLibrary();
      case PlaylistDslPackage.MODEL__PLAYLISTS:
        return getPlaylists();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlaylistDslPackage.MODEL__DISTRIBUTORS:
        getDistributors().clear();
        getDistributors().addAll((Collection<? extends Distributor>)newValue);
        return;
      case PlaylistDslPackage.MODEL__SONG_LIBRARY:
        getSongLibrary().clear();
        getSongLibrary().addAll((Collection<? extends Library>)newValue);
        return;
      case PlaylistDslPackage.MODEL__PLAYLISTS:
        getPlaylists().clear();
        getPlaylists().addAll((Collection<? extends Playlist>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlaylistDslPackage.MODEL__DISTRIBUTORS:
        getDistributors().clear();
        return;
      case PlaylistDslPackage.MODEL__SONG_LIBRARY:
        getSongLibrary().clear();
        return;
      case PlaylistDslPackage.MODEL__PLAYLISTS:
        getPlaylists().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlaylistDslPackage.MODEL__DISTRIBUTORS:
        return distributors != null && !distributors.isEmpty();
      case PlaylistDslPackage.MODEL__SONG_LIBRARY:
        return songLibrary != null && !songLibrary.isEmpty();
      case PlaylistDslPackage.MODEL__PLAYLISTS:
        return playlists != null && !playlists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
