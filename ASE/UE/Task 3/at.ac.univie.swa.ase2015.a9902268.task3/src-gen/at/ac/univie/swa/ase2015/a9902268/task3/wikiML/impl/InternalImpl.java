/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl;

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage;
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl#getLink <em>Link</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2015.a9902268.task3.wikiML.impl.InternalImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalImpl extends HyperLinkImpl implements Internal
{
  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected WikiPage link;

  /**
   * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnchor()
   * @generated
   * @ordered
   */
  protected Text anchor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternalImpl()
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
    return WikiMLPackage.Literals.INTERNAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiPage getLink()
  {
    if (link != null && link.eIsProxy())
    {
      InternalEObject oldLink = (InternalEObject)link;
      link = (WikiPage)eResolveProxy(oldLink);
      if (link != oldLink)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikiMLPackage.INTERNAL__LINK, oldLink, link));
      }
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WikiPage basicGetLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(WikiPage newLink)
  {
    WikiPage oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getAnchor()
  {
    return anchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnchor(Text newAnchor, NotificationChain msgs)
  {
    Text oldAnchor = anchor;
    anchor = newAnchor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL__ANCHOR, oldAnchor, newAnchor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnchor(Text newAnchor)
  {
    if (newAnchor != anchor)
    {
      NotificationChain msgs = null;
      if (anchor != null)
        msgs = ((InternalEObject)anchor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL__ANCHOR, null, msgs);
      if (newAnchor != null)
        msgs = ((InternalEObject)newAnchor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikiMLPackage.INTERNAL__ANCHOR, null, msgs);
      msgs = basicSetAnchor(newAnchor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WikiMLPackage.INTERNAL__ANCHOR, newAnchor, newAnchor));
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
      case WikiMLPackage.INTERNAL__ANCHOR:
        return basicSetAnchor(null, msgs);
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
      case WikiMLPackage.INTERNAL__LINK:
        if (resolve) return getLink();
        return basicGetLink();
      case WikiMLPackage.INTERNAL__ANCHOR:
        return getAnchor();
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
      case WikiMLPackage.INTERNAL__LINK:
        setLink((WikiPage)newValue);
        return;
      case WikiMLPackage.INTERNAL__ANCHOR:
        setAnchor((Text)newValue);
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
      case WikiMLPackage.INTERNAL__LINK:
        setLink((WikiPage)null);
        return;
      case WikiMLPackage.INTERNAL__ANCHOR:
        setAnchor((Text)null);
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
      case WikiMLPackage.INTERNAL__LINK:
        return link != null;
      case WikiMLPackage.INTERNAL__ANCHOR:
        return anchor != null;
    }
    return super.eIsSet(featureID);
  }

} //InternalImpl
