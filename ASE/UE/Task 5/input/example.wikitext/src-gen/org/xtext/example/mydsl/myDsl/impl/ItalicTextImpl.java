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

import org.xtext.example.mydsl.myDsl.ItalicText;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Italic Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ItalicTextImpl#getItalicText <em>Italic Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItalicTextImpl extends MinimalEObjectImpl.Container implements ItalicText
{
  /**
   * The cached value of the '{@link #getItalicText() <em>Italic Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItalicText()
   * @generated
   * @ordered
   */
  protected EObject italicText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItalicTextImpl()
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
    return MyDslPackage.Literals.ITALIC_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getItalicText()
  {
    return italicText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItalicText(EObject newItalicText, NotificationChain msgs)
  {
    EObject oldItalicText = italicText;
    italicText = newItalicText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITALIC_TEXT__ITALIC_TEXT, oldItalicText, newItalicText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItalicText(EObject newItalicText)
  {
    if (newItalicText != italicText)
    {
      NotificationChain msgs = null;
      if (italicText != null)
        msgs = ((InternalEObject)italicText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITALIC_TEXT__ITALIC_TEXT, null, msgs);
      if (newItalicText != null)
        msgs = ((InternalEObject)newItalicText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITALIC_TEXT__ITALIC_TEXT, null, msgs);
      msgs = basicSetItalicText(newItalicText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITALIC_TEXT__ITALIC_TEXT, newItalicText, newItalicText));
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
      case MyDslPackage.ITALIC_TEXT__ITALIC_TEXT:
        return basicSetItalicText(null, msgs);
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
      case MyDslPackage.ITALIC_TEXT__ITALIC_TEXT:
        return getItalicText();
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
      case MyDslPackage.ITALIC_TEXT__ITALIC_TEXT:
        setItalicText((EObject)newValue);
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
      case MyDslPackage.ITALIC_TEXT__ITALIC_TEXT:
        setItalicText((EObject)null);
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
      case MyDslPackage.ITALIC_TEXT__ITALIC_TEXT:
        return italicText != null;
    }
    return super.eIsSet(featureID);
  }

} //ItalicTextImpl
