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
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.UnformattedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>About</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AboutImpl#getAboutText <em>About Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AboutImpl extends MinimalEObjectImpl.Container implements About
{
  /**
   * The cached value of the '{@link #getAboutText() <em>About Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAboutText()
   * @generated
   * @ordered
   */
  protected UnformattedText aboutText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AboutImpl()
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
    return MyDslPackage.Literals.ABOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getAboutText()
  {
    return aboutText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAboutText(UnformattedText newAboutText, NotificationChain msgs)
  {
    UnformattedText oldAboutText = aboutText;
    aboutText = newAboutText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ABOUT__ABOUT_TEXT, oldAboutText, newAboutText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAboutText(UnformattedText newAboutText)
  {
    if (newAboutText != aboutText)
    {
      NotificationChain msgs = null;
      if (aboutText != null)
        msgs = ((InternalEObject)aboutText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABOUT__ABOUT_TEXT, null, msgs);
      if (newAboutText != null)
        msgs = ((InternalEObject)newAboutText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ABOUT__ABOUT_TEXT, null, msgs);
      msgs = basicSetAboutText(newAboutText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ABOUT__ABOUT_TEXT, newAboutText, newAboutText));
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
      case MyDslPackage.ABOUT__ABOUT_TEXT:
        return basicSetAboutText(null, msgs);
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
      case MyDslPackage.ABOUT__ABOUT_TEXT:
        return getAboutText();
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
      case MyDslPackage.ABOUT__ABOUT_TEXT:
        setAboutText((UnformattedText)newValue);
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
      case MyDslPackage.ABOUT__ABOUT_TEXT:
        setAboutText((UnformattedText)null);
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
      case MyDslPackage.ABOUT__ABOUT_TEXT:
        return aboutText != null;
    }
    return super.eIsSet(featureID);
  }

} //AboutImpl
