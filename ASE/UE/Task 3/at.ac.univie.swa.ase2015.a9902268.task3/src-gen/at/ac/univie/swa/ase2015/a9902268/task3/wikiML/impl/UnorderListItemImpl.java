/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unorder List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.UnorderListItemImpl#getItemtext <em>Itemtext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnorderListItemImpl extends MinimalEObjectImpl.Container implements UnorderListItem
{
  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final String LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected String level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getItemtext() <em>Itemtext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemtext()
   * @generated
   * @ordered
   */
  protected AnyTextSequence itemtext;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnorderListItemImpl()
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
    return WikiMLPackage.Literals.UNORDER_LIST_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(String newLevel)
  {
    String oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.UNORDER_LIST_ITEM__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyTextSequence getItemtext()
  {
    return itemtext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItemtext(AnyTextSequence newItemtext, NotificationChain msgs)
  {
    AnyTextSequence oldItemtext = itemtext;
    itemtext = newItemtext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT, oldItemtext, newItemtext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItemtext(AnyTextSequence newItemtext)
  {
    if (newItemtext != itemtext)
    {
      NotificationChain msgs = null;
      if (itemtext != null)
        msgs = ((InternalEObject)itemtext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT, null, msgs);
      if (newItemtext != null)
        msgs = ((InternalEObject)newItemtext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT, null, msgs);
      msgs = basicSetItemtext(newItemtext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT, newItemtext, newItemtext));
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
      case WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT:
        return basicSetItemtext(null, msgs);
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
      case WikiMLPackage.UNORDER_LIST_ITEM__LEVEL:
        return getLevel();
      case WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT:
        return getItemtext();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WikiMLPackage.UNORDER_LIST_ITEM__LEVEL:
        setLevel((String)newValue);
        return;
      case WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT:
        setItemtext((AnyTextSequence)newValue);
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
      case WikiMLPackage.UNORDER_LIST_ITEM__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT:
        setItemtext((AnyTextSequence)null);
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
      case WikiMLPackage.UNORDER_LIST_ITEM__LEVEL:
        return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
      case WikiMLPackage.UNORDER_LIST_ITEM__ITEMTEXT:
        return itemtext != null;
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
    result.append(" (level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //UnorderListItemImpl
