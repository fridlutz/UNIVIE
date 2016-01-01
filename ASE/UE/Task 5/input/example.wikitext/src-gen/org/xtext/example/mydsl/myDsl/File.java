/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.File#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.File#getViewType <em>View Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.File#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.File#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
  /**
   * Returns the value of the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' containment reference.
   * @see #setFileName(UnformattedText)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFile_FileName()
   * @model containment="true"
   * @generated
   */
  UnformattedText getFileName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.File#getFileName <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' containment reference.
   * @see #getFileName()
   * @generated
   */
  void setFileName(UnformattedText value);

  /**
   * Returns the value of the '<em><b>View Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Type</em>' attribute.
   * @see #setViewType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFile_ViewType()
   * @model
   * @generated
   */
  String getViewType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.File#getViewType <em>View Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Type</em>' attribute.
   * @see #getViewType()
   * @generated
   */
  void setViewType(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(FormattedTextWithoutLinks)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFile_Text()
   * @model containment="true"
   * @generated
   */
  FormattedTextWithoutLinks getText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.File#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(FormattedTextWithoutLinks value);

  /**
   * Returns the value of the '<em><b>Additional</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFile_Additional()
   * @model containment="true"
   * @generated
   */
  EList<FormattedTextWithoutLinks> getAdditional();

} // File
