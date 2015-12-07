/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsBlocked <em>Is Blocked</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsReader <em>Is Reader</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsEditor <em>Is Editor</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getWikiTime <em>Wiki Time</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getCountRevisions <em>Count Revisions</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#getAuthoredRevisions <em>Authored Revisions</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Blocked</em>' attribute.
	 * @see #setIsBlocked(boolean)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_IsBlocked()
	 * @model
	 * @generated
	 */
	boolean isIsBlocked();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsBlocked <em>Is Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Blocked</em>' attribute.
	 * @see #isIsBlocked()
	 * @generated
	 */
	void setIsBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Reader</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reader</em>' attribute.
	 * @see #setIsReader(boolean)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_IsReader()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsReader();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsReader <em>Is Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reader</em>' attribute.
	 * @see #isIsReader()
	 * @generated
	 */
	void setIsReader(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Editor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Editor</em>' attribute.
	 * @see #setIsEditor(boolean)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_IsEditor()
	 * @model
	 * @generated
	 */
	boolean isIsEditor();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User#isIsEditor <em>Is Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Editor</em>' attribute.
	 * @see #isIsEditor()
	 * @generated
	 */
	void setIsEditor(boolean value);

	/**
	 * Returns the value of the '<em><b>Wiki Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiki Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Time</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_WikiTime()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.Wikipedia.currentDateJD'"
	 * @generated
	 */
	BigInteger getWikiTime();

	/**
	 * Returns the value of the '<em><b>Count Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Revisions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Revisions</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_CountRevisions()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.authoredRevisions->size()'"
	 * @generated
	 */
	BigInteger getCountRevisions();

	/**
	 * Returns the value of the '<em><b>Authored Revisions</b></em>' reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authored Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authored Revisions</em>' reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getUser_AuthoredRevisions()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Revision.allInstances()->select(author = self)'"
	 * @generated
	 */
	EList<Revision> getAuthoredRevisions();

} // User
