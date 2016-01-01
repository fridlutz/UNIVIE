/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.BlockQuote;
import org.xtext.example.mydsl.myDsl.FormattedText;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl#getBlockQuoteText <em>Block Quote Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BlockQuoteImpl#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockQuoteImpl extends MinimalEObjectImpl.Container implements BlockQuote
{
  /**
   * The cached value of the '{@link #getBlockQuoteText() <em>Block Quote Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockQuoteText()
   * @generated
   * @ordered
   */
  protected FormattedText blockQuoteText;

  /**
   * The cached value of the '{@link #getAdditional() <em>Additional</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditional()
   * @generated
   * @ordered
   */
  protected EList<FormattedText> additional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockQuoteImpl()
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
    return MyDslPackage.Literals.BLOCK_QUOTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedText getBlockQuoteText()
  {
    return blockQuoteText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlockQuoteText(FormattedText newBlockQuoteText, NotificationChain msgs)
  {
    FormattedText oldBlockQuoteText = blockQuoteText;
    blockQuoteText = newBlockQuoteText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT, oldBlockQuoteText, newBlockQuoteText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockQuoteText(FormattedText newBlockQuoteText)
  {
    if (newBlockQuoteText != blockQuoteText)
    {
      NotificationChain msgs = null;
      if (blockQuoteText != null)
        msgs = ((InternalEObject)blockQuoteText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT, null, msgs);
      if (newBlockQuoteText != null)
        msgs = ((InternalEObject)newBlockQuoteText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT, null, msgs);
      msgs = basicSetBlockQuoteText(newBlockQuoteText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT, newBlockQuoteText, newBlockQuoteText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormattedText> getAdditional()
  {
    if (additional == null)
    {
      additional = new EObjectContainmentEList<FormattedText>(FormattedText.class, this, MyDslPackage.BLOCK_QUOTE__ADDITIONAL);
    }
    return additional;
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
      case MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT:
        return basicSetBlockQuoteText(null, msgs);
      case MyDslPackage.BLOCK_QUOTE__ADDITIONAL:
        return ((InternalEList<?>)getAdditional()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT:
        return getBlockQuoteText();
      case MyDslPackage.BLOCK_QUOTE__ADDITIONAL:
        return getAdditional();
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
      case MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT:
        setBlockQuoteText((FormattedText)newValue);
        return;
      case MyDslPackage.BLOCK_QUOTE__ADDITIONAL:
        getAdditional().clear();
        getAdditional().addAll((Collection<? extends FormattedText>)newValue);
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
      case MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT:
        setBlockQuoteText((FormattedText)null);
        return;
      case MyDslPackage.BLOCK_QUOTE__ADDITIONAL:
        getAdditional().clear();
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
      case MyDslPackage.BLOCK_QUOTE__BLOCK_QUOTE_TEXT:
        return blockQuoteText != null;
      case MyDslPackage.BLOCK_QUOTE__ADDITIONAL:
        return additional != null && !additional.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BlockQuoteImpl
