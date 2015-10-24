/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getMin <em>Min</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getSec <em>Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getTime_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec</em>' attribute.
   * @see #setSec(int)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getTime_Sec()
   * @model
   * @generated
   */
  int getSec();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time#getSec <em>Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec</em>' attribute.
   * @see #getSec()
   * @generated
   */
  void setSec(int value);

} // Time
