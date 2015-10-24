/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental TV Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.RentalTV_Series#getEpsioden <em>Epsioden</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getRentalTV_Series()
 * @model
 * @generated
 */
public interface RentalTV_Series extends RentalMedia {
	/**
	 * Returns the value of the '<em><b>Epsioden</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epsioden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epsioden</em>' attribute.
	 * @see #setEpsioden(int)
	 * @see aSE_Task2.ASE_Task2Package#getRentalTV_Series_Epsioden()
	 * @model default="20"
	 * @generated
	 */
	int getEpsioden();

	/**
	 * Sets the value of the '{@link aSE_Task2.RentalTV_Series#getEpsioden <em>Epsioden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsioden</em>' attribute.
	 * @see #getEpsioden()
	 * @generated
	 */
	void setEpsioden(int value);

} // RentalTV_Series
