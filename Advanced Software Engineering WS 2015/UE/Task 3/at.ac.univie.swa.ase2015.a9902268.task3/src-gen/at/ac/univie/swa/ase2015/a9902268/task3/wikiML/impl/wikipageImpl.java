/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.wikipage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wikipage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.wikipageImpl#getAbstractSections <em>Abstract Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class wikipageImpl extends MinimalEObjectImpl.Container implements wikipage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<String> content;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<AbstractSection> sections;

  /**
   * The cached value of the '{@link #getAbstractSections() <em>Abstract Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractSections()
   * @generated
   * @ordered
   */
  protected EList<AbstractSection> abstractSections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected wikipageImpl()
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
    return WikiMLPackage.Literals.WIKIPAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.WIKIPAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getContent()
  {
    if (content == null)
    {
      content = new EDataTypeEList<String>(String.class, this, WikiMLPackage.WIKIPAGE__CONTENT);
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSection> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<AbstractSection>(AbstractSection.class, this, WikiMLPackage.WIKIPAGE__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSection> getAbstractSections()
  {
    if (abstractSections == null)
    {
      abstractSections = new EObjectContainmentEList<AbstractSection>(AbstractSection.class, this, WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS);
    }
    return abstractSections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WikiMLPackage.WIKIPAGE__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS:
        return ((InternalEList<?>)getAbstractSections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case WikiMLPackage.WIKIPAGE__NAME:
        return getName();
      case WikiMLPackage.WIKIPAGE__CONTENT:
        return getContent();
      case WikiMLPackage.WIKIPAGE__SECTIONS:
        return getSections();
      case WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS:
        return getAbstractSections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WikiMLPackage.WIKIPAGE__NAME:
        setName((String)newValue);
        return;
      case WikiMLPackage.WIKIPAGE__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends String>)newValue);
        return;
      case WikiMLPackage.WIKIPAGE__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends AbstractSection>)newValue);
        return;
      case WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS:
        getAbstractSections().clear();
        getAbstractSections().addAll((Collection<? extends AbstractSection>)newValue);
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
      case WikiMLPackage.WIKIPAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WikiMLPackage.WIKIPAGE__CONTENT:
        getContent().clear();
        return;
      case WikiMLPackage.WIKIPAGE__SECTIONS:
        getSections().clear();
        return;
      case WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS:
        getAbstractSections().clear();
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
      case WikiMLPackage.WIKIPAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WikiMLPackage.WIKIPAGE__CONTENT:
        return content != null && !content.isEmpty();
      case WikiMLPackage.WIKIPAGE__SECTIONS:
        return sections != null && !sections.isEmpty();
      case WikiMLPackage.WIKIPAGE__ABSTRACT_SECTIONS:
        return abstractSections != null && !abstractSections.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //wikipageImpl
