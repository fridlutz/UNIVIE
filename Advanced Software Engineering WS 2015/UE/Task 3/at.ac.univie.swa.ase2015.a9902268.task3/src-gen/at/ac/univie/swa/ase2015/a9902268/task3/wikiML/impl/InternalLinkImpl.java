/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InternalLink;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnFormattedText;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalLinkImpl#getPageName <em>Page Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLinkImpl extends HyperlinkImpl implements InternalLink
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternalLinkImpl()
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
    return WikiMLPackage.Literals.INTERNAL_LINK;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK__PAGE_NAME, oldPageName, newPageName);
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
        msgs = ((InternalEObject)pageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK__PAGE_NAME, null, msgs);
      if (newPageName != null)
        msgs = ((InternalEObject)newPageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL_LINK__PAGE_NAME, null, msgs);
      msgs = basicSetPageName(newPageName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL_LINK__PAGE_NAME, newPageName, newPageName));
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
      case WikiMLPackage.INTERNAL_LINK__PAGE_NAME:
        return basicSetPageName(null, msgs);
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
      case WikiMLPackage.INTERNAL_LINK__PAGE_NAME:
        return getPageName();
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
      case WikiMLPackage.INTERNAL_LINK__PAGE_NAME:
        setPageName((UnFormattedText)newValue);
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
      case WikiMLPackage.INTERNAL_LINK__PAGE_NAME:
        setPageName((UnFormattedText)null);
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
      case WikiMLPackage.INTERNAL_LINK__PAGE_NAME:
        return pageName != null;
    }
    return super.eIsSet(featureID);
  }

} //InternalLinkImpl
