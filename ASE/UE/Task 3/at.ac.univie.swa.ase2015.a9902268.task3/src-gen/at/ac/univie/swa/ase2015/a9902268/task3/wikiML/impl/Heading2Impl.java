/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading2Impl#getHeadingValue2 <em>Heading Value2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Heading2Impl extends ParagraphTypesImpl implements Heading2
{
  /**
   * The cached value of the '{@link #getHeadingValue2() <em>Heading Value2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadingValue2()
   * @generated
   * @ordered
   */
  protected AbstractUnformattedInlineContent headingValue2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Heading2Impl()
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
    return WikiMLPackage.Literals.HEADING2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent getHeadingValue2()
  {
    return headingValue2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadingValue2(AbstractUnformattedInlineContent newHeadingValue2, NotificationChain msgs)
  {
    AbstractUnformattedInlineContent oldHeadingValue2 = headingValue2;
    headingValue2 = newHeadingValue2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING2__HEADING_VALUE2, oldHeadingValue2, newHeadingValue2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadingValue2(AbstractUnformattedInlineContent newHeadingValue2)
  {
    if (newHeadingValue2 != headingValue2)
    {
      NotificationChain msgs = null;
      if (headingValue2 != null)
        msgs = ((InternalEObject)headingValue2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING2__HEADING_VALUE2, null, msgs);
      if (newHeadingValue2 != null)
        msgs = ((InternalEObject)newHeadingValue2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING2__HEADING_VALUE2, null, msgs);
      msgs = basicSetHeadingValue2(newHeadingValue2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING2__HEADING_VALUE2, newHeadingValue2, newHeadingValue2));
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
      case WikiMLPackage.HEADING2__HEADING_VALUE2:
        return basicSetHeadingValue2(null, msgs);
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
      case WikiMLPackage.HEADING2__HEADING_VALUE2:
        return getHeadingValue2();
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
      case WikiMLPackage.HEADING2__HEADING_VALUE2:
        setHeadingValue2((AbstractUnformattedInlineContent)newValue);
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
      case WikiMLPackage.HEADING2__HEADING_VALUE2:
        setHeadingValue2((AbstractUnformattedInlineContent)null);
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
      case WikiMLPackage.HEADING2__HEADING_VALUE2:
        return headingValue2 != null;
    }
    return super.eIsSet(featureID);
  }

} //Heading2Impl
