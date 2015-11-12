/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wikipage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getContent <em>Content</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getwikipage()
 * @model
 * @generated
 */
public interface wikipage extends EObject
{
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
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getwikipage_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.InlineContent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getwikipage_Content()
   * @model containment="true"
   * @generated
   */
  EList<InlineContent> getContent();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getwikipage_Sections()
   * @model containment="true"
   * @generated
   */
  EList<AbstractSection> getSections();

} // wikipage
