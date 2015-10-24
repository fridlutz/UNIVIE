/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getIban <em>Iban</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getBic <em>Bic</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getAccount_Information()
 * @model
 * @generated
 */
public interface Account_Information extends EObject
{
  /**
   * Returns the value of the '<em><b>Iban</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iban</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iban</em>' attribute.
   * @see #setIban(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getAccount_Information_Iban()
   * @model
   * @generated
   */
  String getIban();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getIban <em>Iban</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iban</em>' attribute.
   * @see #getIban()
   * @generated
   */
  void setIban(String value);

  /**
   * Returns the value of the '<em><b>Bic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bic</em>' attribute.
   * @see #setBic(String)
   * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getAccount_Information_Bic()
   * @model
   * @generated
   */
  String getBic();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Account_Information#getBic <em>Bic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bic</em>' attribute.
   * @see #getBic()
   * @generated
   */
  void setBic(String value);

} // Account_Information
