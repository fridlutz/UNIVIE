/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.RentalMusic#getKuenstler <em>Kuenstler</em>}</li>
 *   <li>{@link aSE_Task2.RentalMusic#getEpsioden <em>Epsioden</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getRentalMusic()
 * @model
 * @generated
 */
public interface RentalMusic extends RentalMedia {
	/**
	 * Returns the value of the '<em><b>Kuenstler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kuenstler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kuenstler</em>' attribute.
	 * @see #setKuenstler(String)
	 * @see aSE_Task2.ASE_Task2Package#getRentalMusic_Kuenstler()
	 * @model
	 * @generated
	 */
	String getKuenstler();

	/**
	 * Sets the value of the '{@link aSE_Task2.RentalMusic#getKuenstler <em>Kuenstler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kuenstler</em>' attribute.
	 * @see #getKuenstler()
	 * @generated
	 */
	void setKuenstler(String value);

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
	 * @see aSE_Task2.ASE_Task2Package#getRentalMusic_Epsioden()
	 * @model default="20"
	 * @generated
	 */
	int getEpsioden();

	/**
	 * Sets the value of the '{@link aSE_Task2.RentalMusic#getEpsioden <em>Epsioden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsioden</em>' attribute.
	 * @see #getEpsioden()
	 * @generated
	 */
	void setEpsioden(int value);

} // RentalMusic
