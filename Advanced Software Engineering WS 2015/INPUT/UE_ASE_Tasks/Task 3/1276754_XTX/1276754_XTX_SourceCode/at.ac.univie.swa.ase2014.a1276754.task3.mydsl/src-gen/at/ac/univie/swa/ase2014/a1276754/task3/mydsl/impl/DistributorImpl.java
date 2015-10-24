/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.DistributorImpl#getAcc_info <em>Acc info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributorImpl extends MinimalEObjectImpl.Container implements Distributor
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdresse()
   * @generated
   * @ordered
   */
  protected static final String ADRESSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdresse()
   * @generated
   * @ordered
   */
  protected String adresse = ADRESSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAcc_info() <em>Acc info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcc_info()
   * @generated
   * @ordered
   */
  protected Account_Information acc_info;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DistributorImpl()
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
    return MydslPackage.Literals.DISTRIBUTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.DISTRIBUTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdresse()
  {
    return adresse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdresse(String newAdresse)
  {
    String oldAdresse = adresse;
    adresse = newAdresse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.DISTRIBUTOR__ADRESSE, oldAdresse, adresse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account_Information getAcc_info()
  {
    return acc_info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcc_info(Account_Information newAcc_info, NotificationChain msgs)
  {
    Account_Information oldAcc_info = acc_info;
    acc_info = newAcc_info;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MydslPackage.DISTRIBUTOR__ACC_INFO, oldAcc_info, newAcc_info);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcc_info(Account_Information newAcc_info)
  {
    if (newAcc_info != acc_info)
    {
      NotificationChain msgs = null;
      if (acc_info != null)
        msgs = ((InternalEObject)acc_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MydslPackage.DISTRIBUTOR__ACC_INFO, null, msgs);
      if (newAcc_info != null)
        msgs = ((InternalEObject)newAcc_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MydslPackage.DISTRIBUTOR__ACC_INFO, null, msgs);
      msgs = basicSetAcc_info(newAcc_info, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.DISTRIBUTOR__ACC_INFO, newAcc_info, newAcc_info));
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
      case MydslPackage.DISTRIBUTOR__ACC_INFO:
        return basicSetAcc_info(null, msgs);
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
      case MydslPackage.DISTRIBUTOR__NAME:
        return getName();
      case MydslPackage.DISTRIBUTOR__ADRESSE:
        return getAdresse();
      case MydslPackage.DISTRIBUTOR__ACC_INFO:
        return getAcc_info();
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
      case MydslPackage.DISTRIBUTOR__NAME:
        setName((String)newValue);
        return;
      case MydslPackage.DISTRIBUTOR__ADRESSE:
        setAdresse((String)newValue);
        return;
      case MydslPackage.DISTRIBUTOR__ACC_INFO:
        setAcc_info((Account_Information)newValue);
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
      case MydslPackage.DISTRIBUTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MydslPackage.DISTRIBUTOR__ADRESSE:
        setAdresse(ADRESSE_EDEFAULT);
        return;
      case MydslPackage.DISTRIBUTOR__ACC_INFO:
        setAcc_info((Account_Information)null);
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
      case MydslPackage.DISTRIBUTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MydslPackage.DISTRIBUTOR__ADRESSE:
        return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
      case MydslPackage.DISTRIBUTOR__ACC_INFO:
        return acc_info != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", adresse: ");
    result.append(adresse);
    result.append(')');
    return result.toString();
  }

} //DistributorImpl
