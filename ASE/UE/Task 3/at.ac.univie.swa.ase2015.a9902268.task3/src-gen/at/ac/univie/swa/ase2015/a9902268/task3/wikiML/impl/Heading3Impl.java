/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading3Impl#getHeadingValue3 <em>Heading Value3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Heading3Impl extends ParagraphTypesImpl implements Heading3
{
  /**
   * The cached value of the '{@link #getHeadingValue3() <em>Heading Value3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadingValue3()
   * @generated
   * @ordered
   */
  protected AbstractUnformattedInlineContent headingValue3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Heading3Impl()
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
    return WikiMLPackage.Literals.HEADING3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent getHeadingValue3()
  {
    return headingValue3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadingValue3(AbstractUnformattedInlineContent newHeadingValue3, NotificationChain msgs)
  {
    AbstractUnformattedInlineContent oldHeadingValue3 = headingValue3;
    headingValue3 = newHeadingValue3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING3__HEADING_VALUE3, oldHeadingValue3, newHeadingValue3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadingValue3(AbstractUnformattedInlineContent newHeadingValue3)
  {
    if (newHeadingValue3 != headingValue3)
    {
      NotificationChain msgs = null;
      if (headingValue3 != null)
        msgs = ((InternalEObject)headingValue3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING3__HEADING_VALUE3, null, msgs);
      if (newHeadingValue3 != null)
        msgs = ((InternalEObject)newHeadingValue3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING3__HEADING_VALUE3, null, msgs);
      msgs = basicSetHeadingValue3(newHeadingValue3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING3__HEADING_VALUE3, newHeadingValue3, newHeadingValue3));
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
      case WikiMLPackage.HEADING3__HEADING_VALUE3:
        return basicSetHeadingValue3(null, msgs);
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
      case WikiMLPackage.HEADING3__HEADING_VALUE3:
        return getHeadingValue3();
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
      case WikiMLPackage.HEADING3__HEADING_VALUE3:
        setHeadingValue3((AbstractUnformattedInlineContent)newValue);
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
      case WikiMLPackage.HEADING3__HEADING_VALUE3:
        setHeadingValue3((AbstractUnformattedInlineContent)null);
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
      case WikiMLPackage.HEADING3__HEADING_VALUE3:
        return headingValue3 != null;
    }
    return super.eIsSet(featureID);
  }

} //Heading3Impl
