/**
 */
package at.ac.univie.swa.ase.example.playlistDsl.impl;

import at.ac.univie.swa.ase.example.playlistDsl.Item;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem;
import at.ac.univie.swa.ase.example.playlistDsl.Song;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.ItemImpl#getExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item
{
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected PlaylistItem item;

  /**
   * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcluded()
   * @generated
   * @ordered
   */
  protected EList<Song> excluded;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemImpl()
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
    return PlaylistDslPackage.Literals.ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlaylistItem getItem()
  {
    if (item != null && item.eIsProxy())
    {
      InternalEObject oldItem = (InternalEObject)item;
      item = (PlaylistItem)eResolveProxy(oldItem);
      if (item != oldItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaylistDslPackage.ITEM__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlaylistItem basicGetItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItem(PlaylistItem newItem)
  {
    PlaylistItem oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.ITEM__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Song> getExcluded()
  {
    if (excluded == null)
    {
      excluded = new EObjectResolvingEList<Song>(Song.class, this, PlaylistDslPackage.ITEM__EXCLUDED);
    }
    return excluded;
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
      case PlaylistDslPackage.ITEM__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
      case PlaylistDslPackage.ITEM__EXCLUDED:
        return getExcluded();
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
      case PlaylistDslPackage.ITEM__ITEM:
        setItem((PlaylistItem)newValue);
        return;
      case PlaylistDslPackage.ITEM__EXCLUDED:
        getExcluded().clear();
        getExcluded().addAll((Collection<? extends Song>)newValue);
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
      case PlaylistDslPackage.ITEM__ITEM:
        setItem((PlaylistItem)null);
        return;
      case PlaylistDslPackage.ITEM__EXCLUDED:
        getExcluded().clear();
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
      case PlaylistDslPackage.ITEM__ITEM:
        return item != null;
      case PlaylistDslPackage.ITEM__EXCLUDED:
        return excluded != null && !excluded.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ItemImpl
