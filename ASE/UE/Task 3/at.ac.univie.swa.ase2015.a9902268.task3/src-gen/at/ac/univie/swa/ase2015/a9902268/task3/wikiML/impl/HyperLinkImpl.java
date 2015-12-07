/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.HyperLinkImpl#getAltText <em>Alt Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperLinkImpl extends AbstractUnformattedInlineContentImpl implements HyperLink
{
  /**
   * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltText()
   * @generated
   * @ordered
   */
  protected AnyText altText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HyperLinkImpl()
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
    return WikiMLPackage.Literals.HYPER_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyText getAltText()
  {
    return altText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAltText(AnyText newAltText, NotificationChain msgs)
  {
    AnyText oldAltText = altText;
    altText = newAltText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HYPER_LINK__ALT_TEXT, oldAltText, newAltText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAltText(AnyText newAltText)
  {
    if (newAltText != altText)
    {
      NotificationChain msgs = null;
      if (altText != null)
        msgs = ((InternalEObject)altText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HYPER_LINK__ALT_TEXT, null, msgs);
      if (newAltText != null)
        msgs = ((InternalEObject)newAltText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HYPER_LINK__ALT_TEXT, null, msgs);
      msgs = basicSetAltText(newAltText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HYPER_LINK__ALT_TEXT, newAltText, newAltText));
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
      case WikiMLPackage.HYPER_LINK__ALT_TEXT:
        return basicSetAltText(null, msgs);
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
      case WikiMLPackage.HYPER_LINK__ALT_TEXT:
        return getAltText();
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
      case WikiMLPackage.HYPER_LINK__ALT_TEXT:
        setAltText((AnyText)newValue);
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
      case WikiMLPackage.HYPER_LINK__ALT_TEXT:
        setAltText((AnyText)null);
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
      case WikiMLPackage.HYPER_LINK__ALT_TEXT:
        return altText != null;
    }
    return super.eIsSet(featureID);
  }

} //HyperLinkImpl
