/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends ParagraphTypes
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Text)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage_Name()
   * @model containment="true"
   * @generated
   */
  Text getName();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Text value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
   * @see #setType(ViewType)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage_Type()
   * @model
   * @generated
   */
  ViewType getType();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType
   * @see #getType()
   * @generated
   */
  void setType(ViewType value);

  /**
   * Returns the value of the '<em><b>HAlign</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HAlign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HAlign</em>' attribute.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
   * @see #setHAlign(HorizontalAlign)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage_HAlign()
   * @model
   * @generated
   */
  HorizontalAlign getHAlign();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getHAlign <em>HAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HAlign</em>' attribute.
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign
   * @see #getHAlign()
   * @generated
   */
  void setHAlign(HorizontalAlign value);

  /**
   * Returns the value of the '<em><b>Alt Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt Text</em>' containment reference.
   * @see #setAltText(AbstractUnformattedInlineContent)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage_AltText()
   * @model containment="true"
   * @generated
   */
  AbstractUnformattedInlineContent getAltText();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getAltText <em>Alt Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt Text</em>' containment reference.
   * @see #getAltText()
   * @generated
   */
  void setAltText(AbstractUnformattedInlineContent value);

  /**
   * Returns the value of the '<em><b>Caption</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' containment reference.
   * @see #setCaption(AnyTextSequence)
   * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getImage_Caption()
   * @model containment="true"
   * @generated
   */
  AnyTextSequence getCaption();

  /**
   * Sets the value of the '{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image#getCaption <em>Caption</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' containment reference.
   * @see #getCaption()
   * @generated
   */
  void setCaption(AnyTextSequence value);

} // Image
