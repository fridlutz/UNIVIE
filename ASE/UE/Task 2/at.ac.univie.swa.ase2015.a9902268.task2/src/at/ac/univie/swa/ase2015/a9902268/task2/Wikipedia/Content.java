/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getCurrentRevision <em>Current Revision</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getRevision <em>Revision</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getVersionhistory <em>Versionhistory</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Revision</em>' reference.
	 * @see #setCurrentRevision(Revision)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent_CurrentRevision()
	 * @model required="true"
	 * @generated
	 */
	Revision getCurrentRevision();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getCurrentRevision <em>Current Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Revision</em>' reference.
	 * @see #getCurrentRevision()
	 * @generated
	 */
	void setCurrentRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent_Revision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision> getRevision();

	/**
	 * Returns the value of the '<em><b>Versionhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versionhistory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versionhistory</em>' containment reference.
	 * @see #setVersionhistory(VersionHistory)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent_Versionhistory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VersionHistory getVersionhistory();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getVersionhistory <em>Versionhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionhistory</em>' containment reference.
	 * @see #getVersionhistory()
	 * @generated
	 */
	void setVersionhistory(VersionHistory value);

	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discussion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference.
	 * @see #setDiscussion(Discussion)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getContent_Discussion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Discussion getDiscussion();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content#getDiscussion <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion</em>' containment reference.
	 * @see #getDiscussion()
	 * @generated
	 */
	void setDiscussion(Discussion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Revision createNewRevision();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDiscussionItem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void renderHTML();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void render();

} // Content
