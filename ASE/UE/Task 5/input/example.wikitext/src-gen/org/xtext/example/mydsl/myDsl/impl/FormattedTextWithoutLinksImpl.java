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

import org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formatted Text Without Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FormattedTextWithoutLinksImpl#getFormattedTextWithoutLinks <em>Formatted Text Without Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormattedTextWithoutLinksImpl extends MinimalEObjectImpl.Container implements FormattedTextWithoutLinks
{
  /**
   * The cached value of the '{@link #getFormattedTextWithoutLinks() <em>Formatted Text Without Links</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormattedTextWithoutLinks()
   * @generated
   * @ordered
   */
  protected EObject formattedTextWithoutLinks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormattedTextWithoutLinksImpl()
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
    return MyDslPackage.Literals.FORMATTED_TEXT_WITHOUT_LINKS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFormattedTextWithoutLinks()
  {
    return formattedTextWithoutLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormattedTextWithoutLinks(EObject newFormattedTextWithoutLinks, NotificationChain msgs)
  {
    EObject oldFormattedTextWithoutLinks = formattedTextWithoutLinks;
    formattedTextWithoutLinks = newFormattedTextWithoutLinks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS, oldFormattedTextWithoutLinks, newFormattedTextWithoutLinks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormattedTextWithoutLinks(EObject newFormattedTextWithoutLinks)
  {
    if (newFormattedTextWithoutLinks != formattedTextWithoutLinks)
    {
      NotificationChain msgs = null;
      if (formattedTextWithoutLinks != null)
        msgs = ((InternalEObject)formattedTextWithoutLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS, null, msgs);
      if (newFormattedTextWithoutLinks != null)
        msgs = ((InternalEObject)newFormattedTextWithoutLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS, null, msgs);
      msgs = basicSetFormattedTextWithoutLinks(newFormattedTextWithoutLinks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS, newFormattedTextWithoutLinks, newFormattedTextWithoutLinks));
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
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS:
        return basicSetFormattedTextWithoutLinks(null, msgs);
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
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS:
        return getFormattedTextWithoutLinks();
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
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS:
        setFormattedTextWithoutLinks((EObject)newValue);
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
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS:
        setFormattedTextWithoutLinks((EObject)null);
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
      case MyDslPackage.FORMATTED_TEXT_WITHOUT_LINKS__FORMATTED_TEXT_WITHOUT_LINKS:
        return formattedTextWithoutLinks != null;
    }
    return super.eIsSet(featureID);
  }

} //FormattedTextWithoutLinksImpl
