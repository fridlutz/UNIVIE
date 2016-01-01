/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Category;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.UnformattedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CategoryImpl#getCategoryLink <em>Category Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category
{
  /**
   * The cached value of the '{@link #getCategoryLink() <em>Category Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryLink()
   * @generated
   * @ordered
   */
  protected UnformattedText categoryLink;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CategoryImpl()
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
    return MyDslPackage.Literals.CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getCategoryLink()
  {
    return categoryLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCategoryLink(UnformattedText newCategoryLink, NotificationChain msgs)
  {
    UnformattedText oldCategoryLink = categoryLink;
    categoryLink = newCategoryLink;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CATEGORY__CATEGORY_LINK, oldCategoryLink, newCategoryLink);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryLink(UnformattedText newCategoryLink)
  {
    if (newCategoryLink != categoryLink)
    {
      NotificationChain msgs = null;
      if (categoryLink != null)
        msgs = ((InternalEObject)categoryLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CATEGORY__CATEGORY_LINK, null, msgs);
      if (newCategoryLink != null)
        msgs = ((InternalEObject)newCategoryLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CATEGORY__CATEGORY_LINK, null, msgs);
      msgs = basicSetCategoryLink(newCategoryLink, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CATEGORY__CATEGORY_LINK, newCategoryLink, newCategoryLink));
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
      case MyDslPackage.CATEGORY__CATEGORY_LINK:
        return basicSetCategoryLink(null, msgs);
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
      case MyDslPackage.CATEGORY__CATEGORY_LINK:
        return getCategoryLink();
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
      case MyDslPackage.CATEGORY__CATEGORY_LINK:
        setCategoryLink((UnformattedText)newValue);
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
      case MyDslPackage.CATEGORY__CATEGORY_LINK:
        setCategoryLink((UnformattedText)null);
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
      case MyDslPackage.CATEGORY__CATEGORY_LINK:
        return categoryLink != null;
    }
    return super.eIsSet(featureID);
  }

} //CategoryImpl
