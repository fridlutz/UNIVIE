/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ParagraphImpl#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagraphImpl extends ParagraphTypesImpl implements Paragraph
{
  /**
   * The default value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraph()
   * @generated
   * @ordered
   */
  protected static final String PARAGRAPH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagraph()
   * @generated
   * @ordered
   */
  protected String paragraph = PARAGRAPH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParagraphImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WikiMLPackage.Literals.PARAGRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParagraph()
  {
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParagraph(String newParagraph)
  {
    String oldParagraph = paragraph;
    paragraph = newParagraph;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.PARAGRAPH__PARAGRAPH, oldParagraph, paragraph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WikiMLPackage.PARAGRAPH__PARAGRAPH:
        return getParagraph();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WikiMLPackage.PARAGRAPH__PARAGRAPH:
        setParagraph((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WikiMLPackage.PARAGRAPH__PARAGRAPH:
        setParagraph(PARAGRAPH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WikiMLPackage.PARAGRAPH__PARAGRAPH:
        return PARAGRAPH_EDEFAULT == null ? paragraph != null : !PARAGRAPH_EDEFAULT.equals(paragraph);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (paragraph: ");
    result.append(paragraph);
    result.append(')');
    return result.toString();
  }

} //ParagraphImpl
