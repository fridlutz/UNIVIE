/**
 */
package aSE_Task2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streaming Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.StreamingMedia#getGroesse <em>Groesse</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getStreamingMedia()
 * @model abstract="true"
 * @generated
 */
public interface StreamingMedia extends Media {
	/**
	 * Returns the value of the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groesse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groesse</em>' attribute.
	 * @see #setGroesse(int)
	 * @see aSE_Task2.ASE_Task2Package#getStreamingMedia_Groesse()
	 * @model
	 * @generated
	 */
	int getGroesse();

	/**
	 * Sets the value of the '{@link aSE_Task2.StreamingMedia#getGroesse <em>Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groesse</em>' attribute.
	 * @see #getGroesse()
	 * @generated
	 */
	void setGroesse(int value);

} // StreamingMedia
