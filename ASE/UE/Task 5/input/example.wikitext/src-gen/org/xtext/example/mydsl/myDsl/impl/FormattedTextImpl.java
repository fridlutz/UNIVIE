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

import org.xtext.example.mydsl.myDsl.FormattedText;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formatted Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextImpl#getFormattedText <em>Formatted Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormattedTextImpl extends MinimalEObjectImpl.Container implements FormattedText
{
  /**
   * The cached value of the '{@link #getFormattedText() <em>Formatted Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormattedText()
   * @generated
   * @ordered
   */
  protected EObject formattedText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormattedTextImpl()
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
    return MyDslPackage.Literals.FORMATTED_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFormattedText()
  {
    return formattedText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormattedText(EObject newFormattedText, NotificationChain msgs)
  {
    EObject oldFormattedText = formattedText;
    formattedText = newFormattedText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT, oldFormattedText, newFormattedText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormattedText(EObject newFormattedText)
  {
    if (newFormattedText != formattedText)
    {
      NotificationChain msgs = null;
      if (formattedText != null)
        msgs = ((InternalEObject)formattedText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT, null, msgs);
      if (newFormattedText != null)
        msgs = ((InternalEObject)newFormattedText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT, null, msgs);
      msgs = basicSetFormattedText(newFormattedText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT, newFormattedText, newFormattedText));
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
      case MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT:
        return basicSetFormattedText(null, msgs);
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
      case MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT:
        return getFormattedText();
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
      case MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT:
        setFormattedText((EObject)newValue);
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
      case MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT:
        setFormattedText((EObject)null);
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
      case MyDslPackage.FORMATTED_TEXT__FORMATTED_TEXT:
        return formattedText != null;
    }
    return super.eIsSet(featureID);
  }

} //FormattedTextImpl
