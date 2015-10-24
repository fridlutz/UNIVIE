/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Movie#getRegisseur <em>Regisseur</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getMovie()
 * @model
 * @generated
 */
public interface Movie extends StreamingMedia {
	/**
	 * Returns the value of the '<em><b>Regisseur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regisseur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regisseur</em>' attribute.
	 * @see #setRegisseur(String)
	 * @see aSE_Task2.ASE_Task2Package#getMovie_Regisseur()
	 * @model
	 * @generated
	 */
	String getRegisseur();

	/**
	 * Sets the value of the '{@link aSE_Task2.Movie#getRegisseur <em>Regisseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regisseur</em>' attribute.
	 * @see #getRegisseur()
	 * @generated
	 */
	void setRegisseur(String value);

} // Movie
