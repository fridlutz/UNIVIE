/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading1;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.Heading1Impl#getHeadingValue1 <em>Heading Value1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Heading1Impl extends ParagraphTypesImpl implements Heading1
{
  /**
   * The cached value of the '{@link #getHeadingValue1() <em>Heading Value1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadingValue1()
   * @generated
   * @ordered
   */
  protected Text headingValue1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Heading1Impl()
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
    return WikiMLPackage.Literals.HEADING1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getHeadingValue1()
  {
    return headingValue1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadingValue1(Text newHeadingValue1, NotificationChain msgs)
  {
    Text oldHeadingValue1 = headingValue1;
    headingValue1 = newHeadingValue1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING1__HEADING_VALUE1, oldHeadingValue1, newHeadingValue1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadingValue1(Text newHeadingValue1)
  {
    if (newHeadingValue1 != headingValue1)
    {
      NotificationChain msgs = null;
      if (headingValue1 != null)
        msgs = ((InternalEObject)headingValue1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING1__HEADING_VALUE1, null, msgs);
      if (newHeadingValue1 != null)
        msgs = ((InternalEObject)newHeadingValue1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.HEADING1__HEADING_VALUE1, null, msgs);
      msgs = basicSetHeadingValue1(newHeadingValue1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.HEADING1__HEADING_VALUE1, newHeadingValue1, newHeadingValue1));
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
      case WikiMLPackage.HEADING1__HEADING_VALUE1:
        return basicSetHeadingValue1(null, msgs);
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
      case WikiMLPackage.HEADING1__HEADING_VALUE1:
        return getHeadingValue1();
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
      case WikiMLPackage.HEADING1__HEADING_VALUE1:
        setHeadingValue1((Text)newValue);
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
      case WikiMLPackage.HEADING1__HEADING_VALUE1:
        setHeadingValue1((Text)null);
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
      case WikiMLPackage.HEADING1__HEADING_VALUE1:
        return headingValue1 != null;
    }
    return super.eIsSet(featureID);
  }

} //Heading1Impl
