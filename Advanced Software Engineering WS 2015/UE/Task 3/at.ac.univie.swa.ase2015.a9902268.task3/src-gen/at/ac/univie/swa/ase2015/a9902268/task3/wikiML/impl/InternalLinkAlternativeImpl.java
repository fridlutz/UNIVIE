/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLinkAlternative;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl#getPageName <em>Page Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkAlternativeImpl#getAlternativeText <em>Alternative Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLinkAlternativeImpl extends HyperlinkImpl implements InternalLinkAlternative
{
  /**
   * The cached value of the '{@link #getPageName() <em>Page Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageName()
   * @generated
   * @ordered
   */
  protected UnFormattedText pageName;

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
  protected InternalLinkAlternativeImpl()
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
    return WikiMLPackage.Literals.INTERNAL_LINK_ALTERNATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnFormattedText getPageName()
  {
    return pageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPageName(UnFormattedText newPageName, NotificationChain msgs)
  {
    UnFormattedText oldPageName = pageName;
    pageName = newPageName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME, oldPageName, newPageName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPageName(UnFormattedText newPageName)
  {
    if (newPageName != pageName)
    {
      NotificationChain msgs = null;
      if (pageName != null)
        msgs = ((InternalEObject)pageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME, null, msgs);
      if (newPageName != null)
        msgs = ((InternalEObject)newPageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME, null, msgs);
      msgs = basicSetPageName(newPageName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME, newPageName, newPageName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, oldAlternativeText, newAlternativeText);
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
        msgs = ((InternalEObject)alternativeText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, null, msgs);
      if (newAlternativeText != null)
        msgs = ((InternalEObject)newAlternativeText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, null, msgs);
      msgs = basicSetAlternativeText(newAlternativeText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT, newAlternativeText, newAlternativeText));
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
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME:
        return basicSetPageName(null, msgs);
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
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
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME:
        return getPageName();
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
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
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME:
        setPageName((UnFormattedText)newValue);
        return;
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
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
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME:
        setPageName((UnFormattedText)null);
        return;
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
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
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__PAGE_NAME:
        return pageName != null;
      case WikiMLPackage.INTERNAL_LINK_ALTERNATIVE__ALTERNATIVE_TEXT:
        return alternativeText != null;
    }
    return super.eIsSet(featureID);
  }

} //InternalLinkAlternativeImpl
