/**
 */
package at.ac.univie.swa.ase.example.playlistDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLength()
 * @model
 * @generated
 */
public interface Length extends EObject
{
  /**
   * Returns the value of the '<em><b>Minutes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minutes</em>' attribute.
   * @see #setMinutes(int)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLength_Minutes()
   * @model
   * @generated
   */
  int getMinutes();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getMinutes <em>Minutes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minutes</em>' attribute.
   * @see #getMinutes()
   * @generated
   */
  void setMinutes(int value);

  /**
   * Returns the value of the '<em><b>Seconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seconds</em>' attribute.
   * @see #setSeconds(String)
   * @see at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage#getLength_Seconds()
   * @model
   * @generated
   */
  String getSeconds();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase.example.playlistDsl.Length#getSeconds <em>Seconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seconds</em>' attribute.
   * @see #getSeconds()
   * @generated
   */
  void setSeconds(String value);

} // Length
