/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.File;
import org.xtext.example.mydsl.myDsl.FormattedTextWithoutLinks;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.UnformattedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FileImpl#getViewType <em>View Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FileImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FileImpl#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
{
  /**
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected UnformattedText fileName;

  /**
   * The default value of the '{@link #getViewType() <em>View Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewType()
   * @generated
   * @ordered
   */
  protected static final String VIEW_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewType() <em>View Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewType()
   * @generated
   * @ordered
   */
  protected String viewType = VIEW_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected FormattedTextWithoutLinks text;

  /**
   * The cached value of the '{@link #getAdditional() <em>Additional</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditional()
   * @generated
   * @ordered
   */
  protected EList<FormattedTextWithoutLinks> additional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
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
    return MyDslPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnformattedText getFileName()
  {
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileName(UnformattedText newFileName, NotificationChain msgs)
  {
    UnformattedText oldFileName = fileName;
    fileName = newFileName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FILE__FILE_NAME, oldFileName, newFileName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(UnformattedText newFileName)
  {
    if (newFileName != fileName)
    {
      NotificationChain msgs = null;
      if (fileName != null)
        msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILE__FILE_NAME, null, msgs);
      if (newFileName != null)
        msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILE__FILE_NAME, null, msgs);
      msgs = basicSetFileName(newFileName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILE__FILE_NAME, newFileName, newFileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewType()
  {
    return viewType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewType(String newViewType)
  {
    String oldViewType = viewType;
    viewType = newViewType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILE__VIEW_TYPE, oldViewType, viewType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormattedTextWithoutLinks getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(FormattedTextWithoutLinks newText, NotificationChain msgs)
  {
    FormattedTextWithoutLinks oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FILE__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(FormattedTextWithoutLinks newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILE__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILE__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILE__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormattedTextWithoutLinks> getAdditional()
  {
    if (additional == null)
    {
      additional = new EObjectContainmentEList<FormattedTextWithoutLinks>(FormattedTextWithoutLinks.class, this, MyDslPackage.FILE__ADDITIONAL);
    }
    return additional;
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
      case MyDslPackage.FILE__FILE_NAME:
        return basicSetFileName(null, msgs);
      case MyDslPackage.FILE__TEXT:
        return basicSetText(null, msgs);
      case MyDslPackage.FILE__ADDITIONAL:
        return ((InternalEList<?>)getAdditional()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.FILE__FILE_NAME:
        return getFileName();
      case MyDslPackage.FILE__VIEW_TYPE:
        return getViewType();
      case MyDslPackage.FILE__TEXT:
        return getText();
      case MyDslPackage.FILE__ADDITIONAL:
        return getAdditional();
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
      case MyDslPackage.FILE__FILE_NAME:
        setFileName((UnformattedText)newValue);
        return;
      case MyDslPackage.FILE__VIEW_TYPE:
        setViewType((String)newValue);
        return;
      case MyDslPackage.FILE__TEXT:
        setText((FormattedTextWithoutLinks)newValue);
        return;
      case MyDslPackage.FILE__ADDITIONAL:
        getAdditional().clear();
        getAdditional().addAll((Collection<? extends FormattedTextWithoutLinks>)newValue);
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
      case MyDslPackage.FILE__FILE_NAME:
        setFileName((UnformattedText)null);
        return;
      case MyDslPackage.FILE__VIEW_TYPE:
        setViewType(VIEW_TYPE_EDEFAULT);
        return;
      case MyDslPackage.FILE__TEXT:
        setText((FormattedTextWithoutLinks)null);
        return;
      case MyDslPackage.FILE__ADDITIONAL:
        getAdditional().clear();
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
      case MyDslPackage.FILE__FILE_NAME:
        return fileName != null;
      case MyDslPackage.FILE__VIEW_TYPE:
        return VIEW_TYPE_EDEFAULT == null ? viewType != null : !VIEW_TYPE_EDEFAULT.equals(viewType);
      case MyDslPackage.FILE__TEXT:
        return text != null;
      case MyDslPackage.FILE__ADDITIONAL:
        return additional != null && !additional.isEmpty();
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
    result.append(" (viewType: ");
    result.append(viewType);
    result.append(')');
    return result.toString();
  }

} //FileImpl
