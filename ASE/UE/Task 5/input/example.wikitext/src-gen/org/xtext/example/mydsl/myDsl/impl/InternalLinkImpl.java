/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks;
import org.xtext.example.mydsl.myDsl.InternalLink;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.UnformattedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InternalLinkImpl#getRenamedLink <em>Renamed Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLinkImpl extends MinimalEObjectImpl.Container implements InternalLink
{
  /**
   * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkName()
   * @generated
   * @ordered
   */
  protected UnformattedText linkName;

  /**
   * The cached value of the '{@link #getRenamedLink() <em>Renamed Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamedLink()
   * @generated
   * @ordered
   */
  protected FormattedTextWithoutLinks renamedLink;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternalLinkImpl()
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
    return MyDslPackage.Literals.INTERNAL_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getLinkName()
  {
    return linkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkName(UnformattedText newLinkName, NotificationChain msgs)
  {
    UnformattedText oldLinkName = linkName;
    linkName = newLinkName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERNAL_LINK__LINK_NAME, oldLinkName, newLinkName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkName(UnformattedText newLinkName)
  {
    if (newLinkName != linkName)
    {
      NotificationChain msgs = null;
      if (linkName != null)
        msgs = ((InternalEObject)linkName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERNAL_LINK__LINK_NAME, null, msgs);
      if (newLinkName != null)
        msgs = ((InternalEObject)newLinkName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERNAL_LINK__LINK_NAME, null, msgs);
      msgs = basicSetLinkName(newLinkName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERNAL_LINK__LINK_NAME, newLinkName, newLinkName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedTextWithoutLinks getRenamedLink()
  {
    return renamedLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRenamedLink(FormattedTextWithoutLinks newRenamedLink, NotificationChain msgs)
  {
    FormattedTextWithoutLinks oldRenamedLink = renamedLink;
    renamedLink = newRenamedLink;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERNAL_LINK__RENAMED_LINK, oldRenamedLink, newRenamedLink);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRenamedLink(FormattedTextWithoutLinks newRenamedLink)
  {
    if (newRenamedLink != renamedLink)
    {
      NotificationChain msgs = null;
      if (renamedLink != null)
        msgs = ((InternalEObject)renamedLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERNAL_LINK__RENAMED_LINK, null, msgs);
      if (newRenamedLink != null)
        msgs = ((InternalEObject)newRenamedLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERNAL_LINK__RENAMED_LINK, null, msgs);
      msgs = basicSetRenamedLink(newRenamedLink, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERNAL_LINK__RENAMED_LINK, newRenamedLink, newRenamedLink));
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
      case MyDslPackage.INTERNAL_LINK__LINK_NAME:
        return basicSetLinkName(null, msgs);
      case MyDslPackage.INTERNAL_LINK__RENAMED_LINK:
        return basicSetRenamedLink(null, msgs);
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
      case MyDslPackage.INTERNAL_LINK__LINK_NAME:
        return getLinkName();
      case MyDslPackage.INTERNAL_LINK__RENAMED_LINK:
        return getRenamedLink();
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
      case MyDslPackage.INTERNAL_LINK__LINK_NAME:
        setLinkName((UnformattedText)newValue);
        return;
      case MyDslPackage.INTERNAL_LINK__RENAMED_LINK:
        setRenamedLink((FormattedTextWithoutLinks)newValue);
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
      case MyDslPackage.INTERNAL_LINK__LINK_NAME:
        setLinkName((UnformattedText)null);
        return;
      case MyDslPackage.INTERNAL_LINK__RENAMED_LINK:
        setRenamedLink((FormattedTextWithoutLinks)null);
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
      case MyDslPackage.INTERNAL_LINK__LINK_NAME:
        return linkName != null;
      case MyDslPackage.INTERNAL_LINK__RENAMED_LINK:
        return renamedLink != null;
    }
    return super.eIsSet(featureID);
  }

} //InternalLinkImpl
