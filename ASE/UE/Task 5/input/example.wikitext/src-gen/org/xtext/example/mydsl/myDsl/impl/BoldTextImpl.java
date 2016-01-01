/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.BoldText;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bold Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BoldTextImpl#getBoldText <em>Bold Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoldTextImpl extends MinimalEObjectImpl.Container implements BoldText
{
  /**
   * The cached value of the '{@link #getBoldText() <em>Bold Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoldText()
   * @generated
   * @ordered
   */
  protected EObject boldText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoldTextImpl()
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
    return MyDslPackage.Literals.BOLD_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getBoldText()
  {
    return boldText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoldText(EObject newBoldText, NotificationChain msgs)
  {
    EObject oldBoldText = boldText;
    boldText = newBoldText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.BOLD_TEXT__BOLD_TEXT, oldBoldText, newBoldText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoldText(EObject newBoldText)
  {
    if (newBoldText != boldText)
    {
      NotificationChain msgs = null;
      if (boldText != null)
        msgs = ((InternalEObject)boldText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BOLD_TEXT__BOLD_TEXT, null, msgs);
      if (newBoldText != null)
        msgs = ((InternalEObject)newBoldText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BOLD_TEXT__BOLD_TEXT, null, msgs);
      msgs = basicSetBoldText(newBoldText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BOLD_TEXT__BOLD_TEXT, newBoldText, newBoldText));
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
      case MyDslPackage.BOLD_TEXT__BOLD_TEXT:
        return basicSetBoldText(null, msgs);
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
      case MyDslPackage.BOLD_TEXT__BOLD_TEXT:
        return getBoldText();
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
      case MyDslPackage.BOLD_TEXT__BOLD_TEXT:
        setBoldText((EObject)newValue);
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
      case MyDslPackage.BOLD_TEXT__BOLD_TEXT:
        setBoldText((EObject)null);
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
      case MyDslPackage.BOLD_TEXT__BOLD_TEXT:
        return boldText != null;
    }
    return super.eIsSet(featureID);
  }

} //BoldTextImpl
