/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distributor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAcc_info <em>Acc info</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getDistributor()
 * @model
 * @generated
 */
public interface Distributor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getDistributor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Adresse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adresse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adresse</em>' attribute.
   * @see #setAdresse(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getDistributor_Adresse()
   * @model
   * @generated
   */
  String getAdresse();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAdresse <em>Adresse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adresse</em>' attribute.
   * @see #getAdresse()
   * @generated
   */
  void setAdresse(String value);

  /**
   * Returns the value of the '<em><b>Acc info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acc info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acc info</em>' containment reference.
   * @see #setAcc_info(Account_Information)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getDistributor_Acc_info()
   * @model containment="true"
   * @generated
   */
  Account_Information getAcc_info();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor#getAcc_info <em>Acc info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acc info</em>' containment reference.
   * @see #getAcc_info()
   * @generated
   */
  void setAcc_info(Account_Information value);

} // Distributor
