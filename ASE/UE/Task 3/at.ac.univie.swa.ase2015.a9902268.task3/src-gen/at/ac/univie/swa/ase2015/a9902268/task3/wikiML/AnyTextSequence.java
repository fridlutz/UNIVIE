/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Text Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getAnyTextSequence()
 * @model
 * @generated
 */
public interface AnyTextSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getAnyTextSequence_Content()
   * @model containment="true"
   * @generated
   */
  EList<AnyText> getContent();

} // AnyTextSequence
