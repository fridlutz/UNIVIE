/**
 */
package wikiSampleSolution.wikiSampleSolution;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Version#getPrevious <em>Previous</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Version#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Version#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Version#getDiff <em>Diff</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Version#getCommitMsg <em>Commit Msg</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Version)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion_Previous()
	 * @model
	 * @generated
	 */
	Version getPrevious();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Version#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Version value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Version#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Edited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edited By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edited By</em>' reference.
	 * @see #setEditedBy(User)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion_EditedBy()
	 * @model
	 * @generated
	 */
	User getEditedBy();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Version#getEditedBy <em>Edited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edited By</em>' reference.
	 * @see #getEditedBy()
	 * @generated
	 */
	void setEditedBy(User value);

	/**
	 * Returns the value of the '<em><b>Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff</em>' attribute.
	 * @see #setDiff(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion_Diff()
	 * @model
	 * @generated
	 */
	String getDiff();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Version#getDiff <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff</em>' attribute.
	 * @see #getDiff()
	 * @generated
	 */
	void setDiff(String value);

	/**
	 * Returns the value of the '<em><b>Commit Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Msg</em>' attribute.
	 * @see #setCommitMsg(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getVersion_CommitMsg()
	 * @model
	 * @generated
	 */
	String getCommitMsg();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Version#getCommitMsg <em>Commit Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Msg</em>' attribute.
	 * @see #getCommitMsg()
	 * @generated
	 */
	void setCommitMsg(String value);

} // Version
