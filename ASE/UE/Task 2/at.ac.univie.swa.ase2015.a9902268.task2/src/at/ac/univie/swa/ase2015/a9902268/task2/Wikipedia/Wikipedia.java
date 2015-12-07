/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wikipedia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getCurrentDateJD <em>Current Date JD</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getContent <em>Content</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getUser <em>User</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getAverageEditedPagesPerUser <em>Average Edited Pages Per User</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikipedia()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneSysOpOrAdminAvailable qualityOfWikipedia'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot atLeastOneSysOpOrAdminAvailable='user->select(obj |\n\t\t\t\tobj.oclIsKindOf(RegisteredUser))->size() > 0 implies (user->select(obj |\n\t\t\t\tobj.oclIsKindOf(SysOp))->size() > 0 and user->select(obj | obj.oclIsKindOf(Administrator))->size() > 0)' qualityOfWikipedia='averageEditedPagesPerUser >= 1'"
 * @generated
 */
public interface Wikipedia extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Date JD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Date JD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Date JD</em>' attribute.
	 * @see #setCurrentDateJD(BigInteger)
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikipedia_CurrentDateJD()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCurrentDateJD();

	/**
	 * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia#getCurrentDateJD <em>Current Date JD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Date JD</em>' attribute.
	 * @see #getCurrentDateJD()
	 * @generated
	 */
	void setCurrentDateJD(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikipedia_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikipedia_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Average Edited Pages Per User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Edited Pages Per User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Edited Pages Per User</em>' attribute.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage#getWikipedia_AverageEditedPagesPerUser()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='user.countRevisions->sum() / user->size()'"
	 * @generated
	 */
	BigDecimal getAverageEditedPagesPerUser();

} // Wikipedia
