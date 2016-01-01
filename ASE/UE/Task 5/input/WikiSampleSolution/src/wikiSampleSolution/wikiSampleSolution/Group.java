/**
 */
package wikiSampleSolution.wikiSampleSolution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Group#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Subscribable {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getGroup_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Group#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Group
