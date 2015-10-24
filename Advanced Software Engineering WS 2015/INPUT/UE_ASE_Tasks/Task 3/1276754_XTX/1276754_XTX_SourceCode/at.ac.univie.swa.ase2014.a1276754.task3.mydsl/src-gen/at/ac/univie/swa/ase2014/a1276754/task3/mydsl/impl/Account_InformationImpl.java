/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.Account_InformationImpl#getBic <em>Bic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Account_InformationImpl extends MinimalEObjectImpl.Container implements Account_Information
{
  /**
   * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIban()
   * @generated
   * @ordered
   */
  protected static final String IBAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIban()
   * @generated
   * @ordered
   */
  protected String iban = IBAN_EDEFAULT;

  /**
   * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBic()
   * @generated
   * @ordered
   */
  protected static final String BIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBic()
   * @generated
   * @ordered
   */
  protected String bic = BIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Account_InformationImpl()
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
    return MydslPackage.Literals.ACCOUNT_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIban()
  {
    return iban;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIban(String newIban)
  {
    String oldIban = iban;
    iban = newIban;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.ACCOUNT_INFORMATION__IBAN, oldIban, iban));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBic()
  {
    return bic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBic(String newBic)
  {
    String oldBic = bic;
    bic = newBic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.ACCOUNT_INFORMATION__BIC, oldBic, bic));
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
      case MydslPackage.ACCOUNT_INFORMATION__IBAN:
        return getIban();
      case MydslPackage.ACCOUNT_INFORMATION__BIC:
        return getBic();
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
      case MydslPackage.ACCOUNT_INFORMATION__IBAN:
        setIban((String)newValue);
        return;
      case MydslPackage.ACCOUNT_INFORMATION__BIC:
        setBic((String)newValue);
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
      case MydslPackage.ACCOUNT_INFORMATION__IBAN:
        setIban(IBAN_EDEFAULT);
        return;
      case MydslPackage.ACCOUNT_INFORMATION__BIC:
        setBic(BIC_EDEFAULT);
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
      case MydslPackage.ACCOUNT_INFORMATION__IBAN:
        return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
      case MydslPackage.ACCOUNT_INFORMATION__BIC:
        return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
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
    result.append(" (iban: ");
    result.append(iban);
    result.append(", bic: ");
    result.append(bic);
    result.append(')');
    return result.toString();
  }

} //Account_InformationImpl
