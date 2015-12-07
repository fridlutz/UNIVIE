/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading4Impl#getHeadingValue4 <em>Heading Value4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Heading4Impl extends ParagraphTypesImpl implements Heading4
{
  /**
   * The cached value of the '{@link #getHeadingValue4() <em>Heading Value4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadingValue4()
   * @generated
   * @ordered
   */
  protected AbstractUnformattedInlineContent headingValue4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Heading4Impl()
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
    return WikiMLPackage.Literals.HEADING4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent getHeadingValue4()
  {
    return headingValue4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadingValue4(AbstractUnformattedInlineContent newHeadingValue4, NotificationChain msgs)
  {
    AbstractUnformattedInlineContent oldHeadingValue4 = headingValue4;
    headingValue4 = newHeadingValue4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING4__HEADING_VALUE4, oldHeadingValue4, newHeadingValue4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadingValue4(AbstractUnformattedInlineContent newHeadingValue4)
  {
    if (newHeadingValue4 != headingValue4)
    {
      NotificationChain msgs = null;
      if (headingValue4 != null)
        msgs = ((InternalEObject)headingValue4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING4__HEADING_VALUE4, null, msgs);
      if (newHeadingValue4 != null)
        msgs = ((InternalEObject)newHeadingValue4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING4__HEADING_VALUE4, null, msgs);
      msgs = basicSetHeadingValue4(newHeadingValue4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING4__HEADING_VALUE4, newHeadingValue4, newHeadingValue4));
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
      case WikiMLPackage.HEADING4__HEADING_VALUE4:
        return basicSetHeadingValue4(null, msgs);
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
      case WikiMLPackage.HEADING4__HEADING_VALUE4:
        return getHeadingValue4();
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
      case WikiMLPackage.HEADING4__HEADING_VALUE4:
        setHeadingValue4((AbstractUnformattedInlineContent)newValue);
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
      case WikiMLPackage.HEADING4__HEADING_VALUE4:
        setHeadingValue4((AbstractUnformattedInlineContent)null);
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
      case WikiMLPackage.HEADING4__HEADING_VALUE4:
        return headingValue4 != null;
    }
    return super.eIsSet(featureID);
  }

} //Heading4Impl
