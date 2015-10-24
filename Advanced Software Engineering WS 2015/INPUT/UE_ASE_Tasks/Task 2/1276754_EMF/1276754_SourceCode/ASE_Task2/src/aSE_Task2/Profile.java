/**
 */
package aSE_Task2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aSE_Task2.Profile#getPasswort <em>Passwort</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getName <em>Name</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getID <em>ID</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getWrites <em>Writes</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getFriend <em>Friend</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getStreamt <em>Streamt</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getMediaQeue <em>Media Qeue</em>}</li>
 *   <li>{@link aSE_Task2.Profile#getRecommandation <em>Recommandation</em>}</li>
 * </ul>
 * </p>
 *
 * @see aSE_Task2.ASE_Task2Package#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passwort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passwort</em>' attribute.
	 * @see #setPasswort(String)
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Passwort()
	 * @model
	 * @generated
	 */
	String getPasswort();

	/**
	 * Sets the value of the '{@link aSE_Task2.Profile#getPasswort <em>Passwort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passwort</em>' attribute.
	 * @see #getPasswort()
	 * @generated
	 */
	void setPasswort(String value);

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
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aSE_Task2.Profile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see aSE_Task2.ASE_Task2Package#getProfile_ID()
	 * @model id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link aSE_Task2.Profile#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Writes</b></em>' containment reference list.
	 * The list contents are of type {@link aSE_Task2.Review}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writes</em>' containment reference list.
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Writes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Review> getWrites();

	/**
	 * Returns the value of the '<em><b>Friend</b></em>' reference list.
	 * The list contents are of type {@link aSE_Task2.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friend</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friend</em>' reference list.
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Friend()
	 * @model
	 * @generated
	 */
	EList<Profile> getFriend();

	/**
	 * Returns the value of the '<em><b>Streamt</b></em>' reference list.
	 * The list contents are of type {@link aSE_Task2.StreamingMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streamt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streamt</em>' reference list.
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Streamt()
	 * @model
	 * @generated
	 */
	EList<StreamingMedia> getStreamt();

	/**
	 * Returns the value of the '<em><b>Media Qeue</b></em>' reference list.
	 * The list contents are of type {@link aSE_Task2.StreamingMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Qeue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Qeue</em>' reference list.
	 * @see aSE_Task2.ASE_Task2Package#getProfile_MediaQeue()
	 * @model
	 * @generated
	 */
	EList<StreamingMedia> getMediaQeue();

	/**
	 * Returns the value of the '<em><b>Recommandation</b></em>' reference list.
	 * The list contents are of type {@link aSE_Task2.Media}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommandation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommandation</em>' reference list.
	 * @see aSE_Task2.ASE_Task2Package#getProfile_Recommandation()
	 * @model
	 * @generated
	 */
	EList<Media> getRecommandation();

} // Profile
