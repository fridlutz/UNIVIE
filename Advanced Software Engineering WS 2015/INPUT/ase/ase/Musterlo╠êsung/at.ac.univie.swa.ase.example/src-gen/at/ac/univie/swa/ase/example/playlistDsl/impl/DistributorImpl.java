/**
 */
package at.ac.univie.swa.ase.example.playlistDsl.impl;

import at.ac.univie.swa.ase.example.playlistDsl.Distributor;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.DistributorImpl#getBic <em>Bic</em>}</li>
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
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

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
    return PlaylistDslPackage.Literals.DISTRIBUTOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.DISTRIBUTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.DISTRIBUTOR__ADDRESS, oldAddress, address));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.DISTRIBUTOR__IBAN, oldIban, iban));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.DISTRIBUTOR__BIC, oldBic, bic));
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
      case PlaylistDslPackage.DISTRIBUTOR__NAME:
        return getName();
      case PlaylistDslPackage.DISTRIBUTOR__ADDRESS:
        return getAddress();
      case PlaylistDslPackage.DISTRIBUTOR__IBAN:
        return getIban();
      case PlaylistDslPackage.DISTRIBUTOR__BIC:
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
      case PlaylistDslPackage.DISTRIBUTOR__NAME:
        setName((String)newValue);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__ADDRESS:
        setAddress((String)newValue);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__IBAN:
        setIban((String)newValue);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__BIC:
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
      case PlaylistDslPackage.DISTRIBUTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__IBAN:
        setIban(IBAN_EDEFAULT);
        return;
      case PlaylistDslPackage.DISTRIBUTOR__BIC:
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
      case PlaylistDslPackage.DISTRIBUTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlaylistDslPackage.DISTRIBUTOR__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
      case PlaylistDslPackage.DISTRIBUTOR__IBAN:
        return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
      case PlaylistDslPackage.DISTRIBUTOR__BIC:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", address: ");
    result.append(address);
    result.append(", iban: ");
    result.append(iban);
    result.append(", bic: ");
    result.append(bic);
    result.append(')');
    return result.toString();
  }

} //DistributorImpl
