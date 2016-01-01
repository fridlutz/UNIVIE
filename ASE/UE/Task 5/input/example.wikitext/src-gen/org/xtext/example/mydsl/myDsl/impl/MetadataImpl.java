/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.About;
import org.xtext.example.mydsl.myDsl.ActualInformation;
import org.xtext.example.mydsl.myDsl.Metadata;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MetadataImpl#getAbout <em>About</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MetadataImpl#getActualInfo <em>Actual Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata
{
  /**
   * The cached value of the '{@link #getAbout() <em>About</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbout()
   * @generated
   * @ordered
   */
  protected About about;

  /**
   * The cached value of the '{@link #getActualInfo() <em>Actual Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualInfo()
   * @generated
   * @ordered
   */
  protected ActualInformation actualInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetadataImpl()
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
    return MyDslPackage.Literals.METADATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public About getAbout()
  {
    return about;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbout(About newAbout, NotificationChain msgs)
  {
    About oldAbout = about;
    about = newAbout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METADATA__ABOUT, oldAbout, newAbout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbout(About newAbout)
  {
    if (newAbout != about)
    {
      NotificationChain msgs = null;
      if (about != null)
        msgs = ((InternalEObject)about).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METADATA__ABOUT, null, msgs);
      if (newAbout != null)
        msgs = ((InternalEObject)newAbout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METADATA__ABOUT, null, msgs);
      msgs = basicSetAbout(newAbout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METADATA__ABOUT, newAbout, newAbout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualInformation getActualInfo()
  {
    return actualInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActualInfo(ActualInformation newActualInfo, NotificationChain msgs)
  {
    ActualInformation oldActualInfo = actualInfo;
    actualInfo = newActualInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METADATA__ACTUAL_INFO, oldActualInfo, newActualInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualInfo(ActualInformation newActualInfo)
  {
    if (newActualInfo != actualInfo)
    {
      NotificationChain msgs = null;
      if (actualInfo != null)
        msgs = ((InternalEObject)actualInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METADATA__ACTUAL_INFO, null, msgs);
      if (newActualInfo != null)
        msgs = ((InternalEObject)newActualInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METADATA__ACTUAL_INFO, null, msgs);
      msgs = basicSetActualInfo(newActualInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METADATA__ACTUAL_INFO, newActualInfo, newActualInfo));
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
      case MyDslPackage.METADATA__ABOUT:
        return basicSetAbout(null, msgs);
      case MyDslPackage.METADATA__ACTUAL_INFO:
        return basicSetActualInfo(null, msgs);
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
      case MyDslPackage.METADATA__ABOUT:
        return getAbout();
      case MyDslPackage.METADATA__ACTUAL_INFO:
        return getActualInfo();
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
      case MyDslPackage.METADATA__ABOUT:
        setAbout((About)newValue);
        return;
      case MyDslPackage.METADATA__ACTUAL_INFO:
        setActualInfo((ActualInformation)newValue);
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
      case MyDslPackage.METADATA__ABOUT:
        setAbout((About)null);
        return;
      case MyDslPackage.METADATA__ACTUAL_INFO:
        setActualInfo((ActualInformation)null);
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
      case MyDslPackage.METADATA__ABOUT:
        return about != null;
      case MyDslPackage.METADATA__ACTUAL_INFO:
        return actualInfo != null;
    }
    return super.eIsSet(featureID);
  }

} //MetadataImpl
