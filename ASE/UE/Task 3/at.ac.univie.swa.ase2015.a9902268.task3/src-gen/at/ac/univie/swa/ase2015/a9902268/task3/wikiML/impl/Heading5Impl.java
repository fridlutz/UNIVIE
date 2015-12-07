/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading5Impl#getHeadingValue5 <em>Heading Value5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Heading5Impl extends ParagraphTypesImpl implements Heading5
{
  /**
   * The cached value of the '{@link #getHeadingValue5() <em>Heading Value5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadingValue5()
   * @generated
   * @ordered
   */
  protected AbstractUnformattedInlineContent headingValue5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Heading5Impl()
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
    return WikiMLPackage.Literals.HEADING5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent getHeadingValue5()
  {
    return headingValue5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadingValue5(AbstractUnformattedInlineContent newHeadingValue5, NotificationChain msgs)
  {
    AbstractUnformattedInlineContent oldHeadingValue5 = headingValue5;
    headingValue5 = newHeadingValue5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING5__HEADING_VALUE5, oldHeadingValue5, newHeadingValue5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadingValue5(AbstractUnformattedInlineContent newHeadingValue5)
  {
    if (newHeadingValue5 != headingValue5)
    {
      NotificationChain msgs = null;
      if (headingValue5 != null)
        msgs = ((InternalEObject)headingValue5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING5__HEADING_VALUE5, null, msgs);
      if (newHeadingValue5 != null)
        msgs = ((InternalEObject)newHeadingValue5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING5__HEADING_VALUE5, null, msgs);
      msgs = basicSetHeadingValue5(newHeadingValue5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING5__HEADING_VALUE5, newHeadingValue5, newHeadingValue5));
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
      case WikiMLPackage.HEADING5__HEADING_VALUE5:
        return basicSetHeadingValue5(null, msgs);
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
      case WikiMLPackage.HEADING5__HEADING_VALUE5:
        return getHeadingValue5();
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
      case WikiMLPackage.HEADING5__HEADING_VALUE5:
        setHeadingValue5((AbstractUnformattedInlineContent)newValue);
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
      case WikiMLPackage.HEADING5__HEADING_VALUE5:
        setHeadingValue5((AbstractUnformattedInlineContent)null);
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
      case WikiMLPackage.HEADING5__HEADING_VALUE5:
        return headingValue5 != null;
    }
    return super.eIsSet(featureID);
  }

} //Heading5Impl
