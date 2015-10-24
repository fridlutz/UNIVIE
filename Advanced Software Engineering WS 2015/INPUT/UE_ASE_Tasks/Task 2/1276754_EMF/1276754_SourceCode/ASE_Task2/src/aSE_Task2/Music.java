/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Music#getKuenstler <em>Kuenstler</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getMusic()
 * @model
 * @generated
 */
public interface Music extends StreamingMedia {
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
	 * @see aSE_Task2.ASE_Task2Package#getMusic_Kuenstler()
	 * @model
	 * @generated
	 */
	String getKuenstler();

	/**
	 * Sets the value of the '{@link aSE_Task2.Music#getKuenstler <em>Kuenstler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kuenstler</em>' attribute.
	 * @see #getKuenstler()
	 * @generated
	 */
	void setKuenstler(String value);

} // Music
