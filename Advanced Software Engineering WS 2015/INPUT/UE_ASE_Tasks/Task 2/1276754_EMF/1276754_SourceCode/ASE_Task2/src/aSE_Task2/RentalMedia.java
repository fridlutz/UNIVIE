/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.RentalMedia#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getRentalMedia()
 * @model abstract="true"
 * @generated
 */
public interface RentalMedia extends Media {
	/**
	 * Returns the value of the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl</em>' attribute.
	 * @see #setAnzahl(int)
	 * @see aSE_Task2.ASE_Task2Package#getRentalMedia_Anzahl()
	 * @model
	 * @generated
	 */
	int getAnzahl();

	/**
	 * Sets the value of the '{@link aSE_Task2.RentalMedia#getAnzahl <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl</em>' attribute.
	 * @see #getAnzahl()
	 * @generated
	 */
	void setAnzahl(int value);

} // RentalMedia
