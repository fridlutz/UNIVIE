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

import org.xtext.example.mydsl.myDsl.ActualInformation;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.UnformattedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl#getInformationOnWhat <em>Information On What</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActualInformationImpl#getAdditionalLinks <em>Additional Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualInformationImpl extends MinimalEObjectImpl.Container implements ActualInformation
{
  /**
   * The cached value of the '{@link #getInformationOnWhat() <em>Information On What</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInformationOnWhat()
   * @generated
   * @ordered
   */
  protected UnformattedText informationOnWhat;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected UnformattedText link;

  /**
   * The cached value of the '{@link #getAdditionalLinks() <em>Additional Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalLinks()
   * @generated
   * @ordered
   */
  protected EList<UnformattedText> additionalLinks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActualInformationImpl()
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
    return MyDslPackage.Literals.ACTUAL_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getInformationOnWhat()
  {
    return informationOnWhat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInformationOnWhat(UnformattedText newInformationOnWhat, NotificationChain msgs)
  {
    UnformattedText oldInformationOnWhat = informationOnWhat;
    informationOnWhat = newInformationOnWhat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT, oldInformationOnWhat, newInformationOnWhat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInformationOnWhat(UnformattedText newInformationOnWhat)
  {
    if (newInformationOnWhat != informationOnWhat)
    {
      NotificationChain msgs = null;
      if (informationOnWhat != null)
        msgs = ((InternalEObject)informationOnWhat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT, null, msgs);
      if (newInformationOnWhat != null)
        msgs = ((InternalEObject)newInformationOnWhat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT, null, msgs);
      msgs = basicSetInformationOnWhat(newInformationOnWhat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT, newInformationOnWhat, newInformationOnWhat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLink(UnformattedText newLink, NotificationChain msgs)
  {
    UnformattedText oldLink = link;
    link = newLink;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUAL_INFORMATION__LINK, oldLink, newLink);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(UnformattedText newLink)
  {
    if (newLink != link)
    {
      NotificationChain msgs = null;
      if (link != null)
        msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUAL_INFORMATION__LINK, null, msgs);
      if (newLink != null)
        msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ACTUAL_INFORMATION__LINK, null, msgs);
      msgs = basicSetLink(newLink, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTUAL_INFORMATION__LINK, newLink, newLink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnformattedText> getAdditionalLinks()
  {
    if (additionalLinks == null)
    {
      additionalLinks = new EObjectContainmentEList<UnformattedText>(UnformattedText.class, this, MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS);
    }
    return additionalLinks;
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
      case MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT:
        return basicSetInformationOnWhat(null, msgs);
      case MyDslPackage.ACTUAL_INFORMATION__LINK:
        return basicSetLink(null, msgs);
      case MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS:
        return ((InternalEList<?>)getAdditionalLinks()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT:
        return getInformationOnWhat();
      case MyDslPackage.ACTUAL_INFORMATION__LINK:
        return getLink();
      case MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS:
        return getAdditionalLinks();
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
      case MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT:
        setInformationOnWhat((UnformattedText)newValue);
        return;
      case MyDslPackage.ACTUAL_INFORMATION__LINK:
        setLink((UnformattedText)newValue);
        return;
      case MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS:
        getAdditionalLinks().clear();
        getAdditionalLinks().addAll((Collection<? extends UnformattedText>)newValue);
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
      case MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT:
        setInformationOnWhat((UnformattedText)null);
        return;
      case MyDslPackage.ACTUAL_INFORMATION__LINK:
        setLink((UnformattedText)null);
        return;
      case MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS:
        getAdditionalLinks().clear();
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
      case MyDslPackage.ACTUAL_INFORMATION__INFORMATION_ON_WHAT:
        return informationOnWhat != null;
      case MyDslPackage.ACTUAL_INFORMATION__LINK:
        return link != null;
      case MyDslPackage.ACTUAL_INFORMATION__ADDITIONAL_LINKS:
        return additionalLinks != null && !additionalLinks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActualInformationImpl
