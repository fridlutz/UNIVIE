/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ExternalLinkAlternative;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Link Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ExternalLinkAlternativeImpl#getAlternativeText <em>Alternative Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalLinkAlternativeImpl extends HyperlinkImpl implements ExternalLinkAlternative
{
  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected UnFormattedText url;

  /**
   * The cached value of the '{@link #getAlternativeText() <em>Alternative Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternativeText()
   * @generated
   * @ordered
   */
  protected UnFormattedText alternativeText;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalLinkAlternativeImpl()
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
    return WikiMLPackage.Literals.EXTERNAL_LINK_ALTERNATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnFormattedText getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(UnFormattedText newUrl, NotificationChain msgs)
  {
    UnFormattedText oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL, oldUrl, newUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(UnFormattedText newUrl)
  {
    if (newUrl != url)
    {
      NotificationChain msgs = null;
      if (url != null)
        msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL, null, msgs);
      if (newUrl != null)
        msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL, null, msgs);
      msgs = basicSetUrl(newUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL, newUrl, newUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnFormattedText getAlternativeText()
  {
    return alternativeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternativeText(UnFormattedText newAlternativeText, NotificationChain msgs)
  {
    UnFormattedText oldAlternativeText = alternativeText;
    alternativeText = newAlternativeText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, oldAlternativeText, newAlternativeText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternativeText(UnFormattedText newAlternativeText)
  {
    if (newAlternativeText != alternativeText)
    {
      NotificationChain msgs = null;
      if (alternativeText != null)
        msgs = ((InternalEObject)alternativeText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, null, msgs);
      if (newAlternativeText != null)
        msgs = ((InternalEObject)newAlternativeText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, null, msgs);
      msgs = basicSetAlternativeText(newAlternativeText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, newAlternativeText, newAlternativeText));
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
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL:
        return basicSetUrl(null, msgs);
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        return basicSetAlternativeText(null, msgs);
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
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL:
        return getUrl();
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        return getAlternativeText();
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
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL:
        setUrl((UnFormattedText)newValue);
        return;
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        setAlternativeText((UnFormattedText)newValue);
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
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL:
        setUrl((UnFormattedText)null);
        return;
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        setAlternativeText((UnFormattedText)null);
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
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__URL:
        return url != null;
      case WikiMLPackage.EXTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        return alternativeText != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternalLinkAlternativeImpl
