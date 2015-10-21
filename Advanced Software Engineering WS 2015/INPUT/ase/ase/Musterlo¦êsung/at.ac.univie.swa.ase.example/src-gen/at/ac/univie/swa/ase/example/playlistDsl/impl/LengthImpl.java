/**
 */
package at.ac.univie.swa.ase.example.playlistDsl.impl;

import at.ac.univie.swa.ase.example.playlistDsl.Length;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.LengthImpl#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LengthImpl extends MinimalEObjectImpl.Container implements Length
{
  /**
   * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected static final int MINUTES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinutes()
   * @generated
   * @ordered
   */
  protected int minutes = MINUTES_EDEFAULT;

  /**
   * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected static final String SECONDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeconds()
   * @generated
   * @ordered
   */
  protected String seconds = SECONDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LengthImpl()
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
    return PlaylistDslPackage.Literals.LENGTH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinutes()
  {
    return minutes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinutes(int newMinutes)
  {
    int oldMinutes = minutes;
    minutes = newMinutes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.LENGTH__MINUTES, oldMinutes, minutes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeconds()
  {
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeconds(String newSeconds)
  {
    String oldSeconds = seconds;
    seconds = newSeconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.LENGTH__SECONDS, oldSeconds, seconds));
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
      case PlaylistDslPackage.LENGTH__MINUTES:
        return getMinutes();
      case PlaylistDslPackage.LENGTH__SECONDS:
        return getSeconds();
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
      case PlaylistDslPackage.LENGTH__MINUTES:
        setMinutes((Integer)newValue);
        return;
      case PlaylistDslPackage.LENGTH__SECONDS:
        setSeconds((String)newValue);
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
      case PlaylistDslPackage.LENGTH__MINUTES:
        setMinutes(MINUTES_EDEFAULT);
        return;
      case PlaylistDslPackage.LENGTH__SECONDS:
        setSeconds(SECONDS_EDEFAULT);
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
      case PlaylistDslPackage.LENGTH__MINUTES:
        return minutes != MINUTES_EDEFAULT;
      case PlaylistDslPackage.LENGTH__SECONDS:
        return SECONDS_EDEFAULT == null ? seconds != null : !SECONDS_EDEFAULT.equals(seconds);
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
    result.append(" (minutes: ");
    result.append(minutes);
    result.append(", seconds: ");
    result.append(seconds);
    result.append(')');
    return result.toString();
  }

} //LengthImpl
