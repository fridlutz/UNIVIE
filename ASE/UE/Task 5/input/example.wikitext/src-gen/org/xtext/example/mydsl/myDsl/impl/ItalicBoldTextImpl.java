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

import org.xtext.example.mydsl.myDsl.ItalicBoldText;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Italic Bold Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ItalicBoldTextImpl#getItalicBoldText <em>Italic Bold Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItalicBoldTextImpl extends MinimalEObjectImpl.Container implements ItalicBoldText
{
  /**
   * The cached value of the '{@link #getItalicBoldText() <em>Italic Bold Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItalicBoldText()
   * @generated
   * @ordered
   */
  protected EObject italicBoldText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItalicBoldTextImpl()
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
    return MyDslPackage.Literals.ITALIC_BOLD_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getItalicBoldText()
  {
    return italicBoldText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItalicBoldText(EObject newItalicBoldText, NotificationChain msgs)
  {
    EObject oldItalicBoldText = italicBoldText;
    italicBoldText = newItalicBoldText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT, oldItalicBoldText, newItalicBoldText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItalicBoldText(EObject newItalicBoldText)
  {
    if (newItalicBoldText != italicBoldText)
    {
      NotificationChain msgs = null;
      if (italicBoldText != null)
        msgs = ((InternalEObject)italicBoldText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT, null, msgs);
      if (newItalicBoldText != null)
        msgs = ((InternalEObject)newItalicBoldText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT, null, msgs);
      msgs = basicSetItalicBoldText(newItalicBoldText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT, newItalicBoldText, newItalicBoldText));
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
      case MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT:
        return basicSetItalicBoldText(null, msgs);
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
      case MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT:
        return getItalicBoldText();
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
      case MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT:
        setItalicBoldText((EObject)newValue);
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
      case MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT:
        setItalicBoldText((EObject)null);
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
      case MyDslPackage.ITALIC_BOLD_TEXT__ITALIC_BOLD_TEXT:
        return italicBoldText != null;
    }
    return super.eIsSet(featureID);
  }

} //ItalicBoldTextImpl
