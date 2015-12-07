/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HorizontalAlign;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ViewType;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.ImageImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ParagraphTypesImpl implements Image
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ViewType TYPE_EDEFAULT = ViewType.THUMB;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ViewType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHAlign()
   * @generated
   * @ordered
   */
  protected static final HorizontalAlign HALIGN_EDEFAULT = HorizontalAlign.RIGHT;

  /**
   * The cached value of the '{@link #getHAlign() <em>HAlign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHAlign()
   * @generated
   * @ordered
   */
  protected HorizontalAlign hAlign = HALIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltText()
   * @generated
   * @ordered
   */
  protected AbstractUnformattedInlineContent altText;

  /**
   * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected AnyTextSequence caption;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageImpl()
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
    return WikiMLPackage.Literals.IMAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ViewType newType)
  {
    ViewType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HorizontalAlign getHAlign()
  {
    return hAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHAlign(HorizontalAlign newHAlign)
  {
    HorizontalAlign oldHAlign = hAlign;
    hAlign = newHAlign == null ? HALIGN_EDEFAULT : newHAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__HALIGN, oldHAlign, hAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractUnformattedInlineContent getAltText()
  {
    return altText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAltText(AbstractUnformattedInlineContent newAltText, NotificationChain msgs)
  {
    AbstractUnformattedInlineContent oldAltText = altText;
    altText = newAltText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__ALT_TEXT, oldAltText, newAltText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAltText(AbstractUnformattedInlineContent newAltText)
  {
    if (newAltText != altText)
    {
      NotificationChain msgs = null;
      if (altText != null)
        msgs = ((InternalEObject)altText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.IMAGE__ALT_TEXT, null, msgs);
      if (newAltText != null)
        msgs = ((InternalEObject)newAltText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.IMAGE__ALT_TEXT, null, msgs);
      msgs = basicSetAltText(newAltText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__ALT_TEXT, newAltText, newAltText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyTextSequence getCaption()
  {
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaption(AnyTextSequence newCaption, NotificationChain msgs)
  {
    AnyTextSequence oldCaption = caption;
    caption = newCaption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__CAPTION, oldCaption, newCaption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaption(AnyTextSequence newCaption)
  {
    if (newCaption != caption)
    {
      NotificationChain msgs = null;
      if (caption != null)
        msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.IMAGE__CAPTION, null, msgs);
      if (newCaption != null)
        msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.IMAGE__CAPTION, null, msgs);
      msgs = basicSetCaption(newCaption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.IMAGE__CAPTION, newCaption, newCaption));
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
      case WikiMLPackage.IMAGE__ALT_TEXT:
        return basicSetAltText(null, msgs);
      case WikiMLPackage.IMAGE__CAPTION:
        return basicSetCaption(null, msgs);
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
      case WikiMLPackage.IMAGE__NAME:
        return getName();
      case WikiMLPackage.IMAGE__TYPE:
        return getType();
      case WikiMLPackage.IMAGE__HALIGN:
        return getHAlign();
      case WikiMLPackage.IMAGE__ALT_TEXT:
        return getAltText();
      case WikiMLPackage.IMAGE__CAPTION:
        return getCaption();
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
      case WikiMLPackage.IMAGE__NAME:
        setName((String)newValue);
        return;
      case WikiMLPackage.IMAGE__TYPE:
        setType((ViewType)newValue);
        return;
      case WikiMLPackage.IMAGE__HALIGN:
        setHAlign((HorizontalAlign)newValue);
        return;
      case WikiMLPackage.IMAGE__ALT_TEXT:
        setAltText((AbstractUnformattedInlineContent)newValue);
        return;
      case WikiMLPackage.IMAGE__CAPTION:
        setCaption((AnyTextSequence)newValue);
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
      case WikiMLPackage.IMAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WikiMLPackage.IMAGE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case WikiMLPackage.IMAGE__HALIGN:
        setHAlign(HALIGN_EDEFAULT);
        return;
      case WikiMLPackage.IMAGE__ALT_TEXT:
        setAltText((AbstractUnformattedInlineContent)null);
        return;
      case WikiMLPackage.IMAGE__CAPTION:
        setCaption((AnyTextSequence)null);
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
      case WikiMLPackage.IMAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WikiMLPackage.IMAGE__TYPE:
        return type != TYPE_EDEFAULT;
      case WikiMLPackage.IMAGE__HALIGN:
        return hAlign != HALIGN_EDEFAULT;
      case WikiMLPackage.IMAGE__ALT_TEXT:
        return altText != null;
      case WikiMLPackage.IMAGE__CAPTION:
        return caption != null;
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
    result.append(", type: ");
    result.append(type);
    result.append(", hAlign: ");
    result.append(hAlign);
    result.append(')');
    return result.toString();
  }

} //ImageImpl
