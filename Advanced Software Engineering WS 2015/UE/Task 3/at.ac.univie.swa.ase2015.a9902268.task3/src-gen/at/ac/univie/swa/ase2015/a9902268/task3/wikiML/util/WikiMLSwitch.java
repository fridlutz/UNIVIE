/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.util;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage
 * @generated
 */
public class WikiMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WikiMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = WikiMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case WikiMLPackage.WIKIPAGE:
      {
        wikipage wikipage = (wikipage)theEObject;
        T result = casewikipage(wikipage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.ABSTRACT_SECTION:
      {
        AbstractSection abstractSection = (AbstractSection)theEObject;
        T result = caseAbstractSection(abstractSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL1:
      {
        SubsectionLevel1 subsectionLevel1 = (SubsectionLevel1)theEObject;
        T result = caseSubsectionLevel1(subsectionLevel1);
        if (result == null) result = caseAbstractSection(subsectionLevel1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL2:
      {
        SubsectionLevel2 subsectionLevel2 = (SubsectionLevel2)theEObject;
        T result = caseSubsectionLevel2(subsectionLevel2);
        if (result == null) result = caseAbstractSection(subsectionLevel2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL3:
      {
        SubsectionLevel3 subsectionLevel3 = (SubsectionLevel3)theEObject;
        T result = caseSubsectionLevel3(subsectionLevel3);
        if (result == null) result = caseAbstractSection(subsectionLevel3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case WikiMLPackage.SUBSECTION_LEVEL4:
      {
        SubsectionLevel4 subsectionLevel4 = (SubsectionLevel4)theEObject;
        T result = caseSubsectionLevel4(subsectionLevel4);
        if (result == null) result = caseAbstractSection(subsectionLevel4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>wikipage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>wikipage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewikipage(wikipage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSection(AbstractSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel1(SubsectionLevel1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel2(SubsectionLevel2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel3(SubsectionLevel3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsection Level4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsection Level4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsectionLevel4(SubsectionLevel4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //WikiMLSwitch
