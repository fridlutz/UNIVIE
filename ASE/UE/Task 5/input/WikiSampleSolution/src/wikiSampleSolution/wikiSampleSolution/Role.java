/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Role#getPrivileg <em>Privileg</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Role#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Privileg</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Privileg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privileg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileg</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRole_Privileg()
	 * @model required="true"
	 * @generated
	 */
	EList<Privileg> getPrivileg();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wikiSampleSolution.wikiSampleSolution.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wikiSampleSolution.wikiSampleSolution.RoleType
	 * @see #setType(RoleType)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRole_Type()
	 * @model
	 * @generated
	 */
	RoleType getType();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wikiSampleSolution.wikiSampleSolution.RoleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoleType value);

} // Role
