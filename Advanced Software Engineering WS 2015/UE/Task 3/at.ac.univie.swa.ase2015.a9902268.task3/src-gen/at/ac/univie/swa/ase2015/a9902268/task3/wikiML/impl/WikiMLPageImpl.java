/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractSection;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.PageTitle;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.WikiMLPageImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WikiMLPageImpl extends MinimalEObjectImpl.Container implements WikiMLPage
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected EList<PageTitle> title;

  /**
   * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected EList<AbstractSection> section;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WikiMLPageImpl()
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
    return WikiMLPackage.Literals.WIKI_ML_PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PageTitle> getTitle()
  {
    if (title == null)
    {
      title = new EObjectContainmentEList<PageTitle>(PageTitle.class, this, WikiMLPackage.WIKI_ML_PAGE__TITLE);
    }
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSection> getSection()
  {
    if (section == null)
    {
      section = new EObjectContainmentEList<AbstractSection>(AbstractSection.class, this, WikiMLPackage.WIKI_ML_PAGE__SECTION);
    }
    return section;
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
      case WikiMLPackage.WIKI_ML_PAGE__TITLE:
        return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
      case WikiMLPackage.WIKI_ML_PAGE__SECTION:
        return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
      case WikiMLPackage.WIKI_ML_PAGE__TITLE:
        return getTitle();
      case WikiMLPackage.WIKI_ML_PAGE__SECTION:
        return getSection();
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
      case WikiMLPackage.WIKI_ML_PAGE__TITLE:
        getTitle().clear();
        getTitle().addAll((Collection<? extends PageTitle>)newValue);
        return;
      case WikiMLPackage.WIKI_ML_PAGE__SECTION:
        getSection().clear();
        getSection().addAll((Collection<? extends AbstractSection>)newValue);
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
      case WikiMLPackage.WIKI_ML_PAGE__TITLE:
        getTitle().clear();
        return;
      case WikiMLPackage.WIKI_ML_PAGE__SECTION:
        getSection().clear();
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
      case WikiMLPackage.WIKI_ML_PAGE__TITLE:
        return title != null && !title.isEmpty();
      case WikiMLPackage.WIKI_ML_PAGE__SECTION:
        return section != null && !section.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WikiMLPageImpl
