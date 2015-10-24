/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl#getSongs <em>Songs</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl#getIncl <em>Incl</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.PlaylistImpl#getExcl <em>Excl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaylistImpl extends MinimalEObjectImpl.Container implements Playlist
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSongs() <em>Songs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSongs()
   * @generated
   * @ordered
   */
  protected EList<Song> songs;

  /**
   * The cached value of the '{@link #getIncl() <em>Incl</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncl()
   * @generated
   * @ordered
   */
  protected EList<Playlist> incl;

  /**
   * The cached value of the '{@link #getExcl() <em>Excl</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcl()
   * @generated
   * @ordered
   */
  protected EList<Song> excl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlaylistImpl()
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
    return MydslPackage.Literals.PLAYLIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.PLAYLIST__NAME, oldName, name));
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
      songs = new EObjectResolvingEList<Song>(Song.class, this, MydslPackage.PLAYLIST__SONGS);
    }
    return songs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Playlist> getIncl()
  {
    if (incl == null)
    {
      incl = new EObjectResolvingEList<Playlist>(Playlist.class, this, MydslPackage.PLAYLIST__INCL);
    }
    return incl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Song> getExcl()
  {
    if (excl == null)
    {
      excl = new EObjectResolvingEList<Song>(Song.class, this, MydslPackage.PLAYLIST__EXCL);
    }
    return excl;
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
      case MydslPackage.PLAYLIST__NAME:
        return getName();
      case MydslPackage.PLAYLIST__SONGS:
        return getSongs();
      case MydslPackage.PLAYLIST__INCL:
        return getIncl();
      case MydslPackage.PLAYLIST__EXCL:
        return getExcl();
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
      case MydslPackage.PLAYLIST__NAME:
        setName((String)newValue);
        return;
      case MydslPackage.PLAYLIST__SONGS:
        getSongs().clear();
        getSongs().addAll((Collection<? extends Song>)newValue);
        return;
      case MydslPackage.PLAYLIST__INCL:
        getIncl().clear();
        getIncl().addAll((Collection<? extends Playlist>)newValue);
        return;
      case MydslPackage.PLAYLIST__EXCL:
        getExcl().clear();
        getExcl().addAll((Collection<? extends Song>)newValue);
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
      case MydslPackage.PLAYLIST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MydslPackage.PLAYLIST__SONGS:
        getSongs().clear();
        return;
      case MydslPackage.PLAYLIST__INCL:
        getIncl().clear();
        return;
      case MydslPackage.PLAYLIST__EXCL:
        getExcl().clear();
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
      case MydslPackage.PLAYLIST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MydslPackage.PLAYLIST__SONGS:
        return songs != null && !songs.isEmpty();
      case MydslPackage.PLAYLIST__INCL:
        return incl != null && !incl.isEmpty();
      case MydslPackage.PLAYLIST__EXCL:
        return excl != null && !excl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PlaylistImpl
