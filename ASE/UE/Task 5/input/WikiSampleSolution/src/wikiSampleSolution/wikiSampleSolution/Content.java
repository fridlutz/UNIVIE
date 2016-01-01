/**
 */
package wikiSampleSolution.wikiSampleSolution;

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
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getHistory <em>History</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getDiscussionpage <em>Discussionpage</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getGroup <em>Group</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getEditor <em>Editor</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getTtile <em>Ttile</em>}</li>
 *   <li>{@link wikiSampleSolution.wikiSampleSolution.Content#getContentMarkup <em>Content Markup</em>}</li>
 * </ul>
 *
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(History)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_History()
	 * @model containment="true" required="true"
	 * @generated
	 */
	History getHistory();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Content#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(History value);

	/**
	 * Returns the value of the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discussionpage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussionpage</em>' containment reference.
	 * @see #setDiscussionpage(DiscussionPage)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_Discussionpage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DiscussionPage getDiscussionpage();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Content#getDiscussionpage <em>Discussionpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussionpage</em>' containment reference.
	 * @see #getDiscussionpage()
	 * @generated
	 */
	void setDiscussionpage(DiscussionPage value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link wikiSampleSolution.wikiSampleSolution.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_Group()
	 * @model
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' reference.
	 * @see #setEditor(User)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_Editor()
	 * @model required="true"
	 * @generated
	 */
	User getEditor();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Content#getEditor <em>Editor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' reference.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(User value);

	/**
	 * Returns the value of the '<em><b>Ttile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttile</em>' attribute.
	 * @see #setTtile(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_Ttile()
	 * @model
	 * @generated
	 */
	String getTtile();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Content#getTtile <em>Ttile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttile</em>' attribute.
	 * @see #getTtile()
	 * @generated
	 */
	void setTtile(String value);

	/**
	 * Returns the value of the '<em><b>Content Markup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Markup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Markup</em>' attribute.
	 * @see #setContentMarkup(String)
	 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getContent_ContentMarkup()
	 * @model
	 * @generated
	 */
	String getContentMarkup();

	/**
	 * Sets the value of the '{@link wikiSampleSolution.wikiSampleSolution.Content#getContentMarkup <em>Content Markup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Markup</em>' attribute.
	 * @see #getContentMarkup()
	 * @generated
	 */
	void setContentMarkup(String value);

} // Content
