/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Model;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song;

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
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl#getDistributors <em>Distributors</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl#getSongs <em>Songs</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.ModelImpl#getPlaylists <em>Playlists</em>}</li>
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
   * The cached value of the '{@link #getSongs() <em>Songs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSongs()
   * @generated
   * @ordered
   */
  protected EList<Song> songs;

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
    return MydslPackage.Literals.MODEL;
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
      distributors = new EObjectContainmentEList<Distributor>(Distributor.class, this, MydslPackage.MODEL__DISTRIBUTORS);
    }
    return distributors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Song> getSongs()
  {
    if (songs == null)
    {
      songs = new EObjectContainmentEList<Song>(Song.class, this, MydslPackage.MODEL__SONGS);
    }
    return songs;
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
      playlists = new EObjectContainmentEList<Playlist>(Playlist.class, this, MydslPackage.MODEL__PLAYLISTS);
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
      case MydslPackage.MODEL__DISTRIBUTORS:
        return ((InternalEList<?>)getDistributors()).basicRemove(otherEnd, msgs);
      case MydslPackage.MODEL__SONGS:
        return ((InternalEList<?>)getSongs()).basicRemove(otherEnd, msgs);
      case MydslPackage.MODEL__PLAYLISTS:
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
      case MydslPackage.MODEL__DISTRIBUTORS:
        return getDistributors();
      case MydslPackage.MODEL__SONGS:
        return getSongs();
      case MydslPackage.MODEL__PLAYLISTS:
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
      case MydslPackage.MODEL__DISTRIBUTORS:
        getDistributors().clear();
        getDistributors().addAll((Collection<? extends Distributor>)newValue);
        return;
      case MydslPackage.MODEL__SONGS:
        getSongs().clear();
        getSongs().addAll((Collection<? extends Song>)newValue);
        return;
      case MydslPackage.MODEL__PLAYLISTS:
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
      case MydslPackage.MODEL__DISTRIBUTORS:
        getDistributors().clear();
        return;
      case MydslPackage.MODEL__SONGS:
        getSongs().clear();
        return;
      case MydslPackage.MODEL__PLAYLISTS:
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
      case MydslPackage.MODEL__DISTRIBUTORS:
        return distributors != null && !distributors.isEmpty();
      case MydslPackage.MODEL__SONGS:
        return songs != null && !songs.isEmpty();
      case MydslPackage.MODEL__PLAYLISTS:
        return playlists != null && !playlists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
