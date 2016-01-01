/**
 */
package wikiSampleSolution.wikiSampleSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Mode#getAvailableActions <em>Available Actions</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Mode#getParent <em>Parent</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Mode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Actions</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Actions</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getMode_AvailableActions()
	 * @model
	 * @generated
	 */
	EList<Action> getAvailableActions();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Mode)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getMode_Parent()
	 * @model
	 * @generated
	 */
	Mode getParent();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Mode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Mode value);

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
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Mode
