/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl;

import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Genre;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song;
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getDist <em>Dist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getLength <em>Length</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase2014.a1276754.task3.mydsl.impl.SongImpl#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongImpl extends MinimalEObjectImpl.Container implements Song
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
   * The default value of the '{@link #getArtist() <em>Artist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtist()
   * @generated
   * @ordered
   */
  protected static final String ARTIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtist() <em>Artist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtist()
   * @generated
   * @ordered
   */
  protected String artist = ARTIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getDist() <em>Dist</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDist()
   * @generated
   * @ordered
   */
  protected Distributor dist;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected Time length;

  /**
   * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected static final Genre GENRE_EDEFAULT = Genre.POP;

  /**
   * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected Genre genre = GENRE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final String PRICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected String price = PRICE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SongImpl()
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
    return MydslPackage.Literals.SONG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtist()
  {
    return artist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtist(String newArtist)
  {
    String oldArtist = artist;
    artist = newArtist;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__ARTIST, oldArtist, artist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distributor getDist()
  {
    if (dist != null && dist.eIsProxy())
    {
      InternalEObject oldDist = (InternalEObject)dist;
      dist = (Distributor)eResolveProxy(oldDist);
      if (dist != oldDist)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MydslPackage.SONG__DIST, oldDist, dist));
      }
    }
    return dist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distributor basicGetDist()
  {
    return dist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDist(Distributor newDist)
  {
    Distributor oldDist = dist;
    dist = newDist;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__DIST, oldDist, dist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLength(Time newLength, NotificationChain msgs)
  {
    Time oldLength = length;
    length = newLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__LENGTH, oldLength, newLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(Time newLength)
  {
    if (newLength != length)
    {
      NotificationChain msgs = null;
      if (length != null)
        msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MydslPackage.SONG__LENGTH, null, msgs);
      if (newLength != null)
        msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MydslPackage.SONG__LENGTH, null, msgs);
      msgs = basicSetLength(newLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__LENGTH, newLength, newLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Genre getGenre()
  {
    return genre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenre(Genre newGenre)
  {
    Genre oldGenre = genre;
    genre = newGenre == null ? GENRE_EDEFAULT : newGenre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__GENRE, oldGenre, genre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(String newPrice)
  {
    String oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.SONG__PRICE, oldPrice, price));
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
      case MydslPackage.SONG__LENGTH:
        return basicSetLength(null, msgs);
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
      case MydslPackage.SONG__NAME:
        return getName();
      case MydslPackage.SONG__ARTIST:
        return getArtist();
      case MydslPackage.SONG__DIST:
        if (resolve) return getDist();
        return basicGetDist();
      case MydslPackage.SONG__LENGTH:
        return getLength();
      case MydslPackage.SONG__GENRE:
        return getGenre();
      case MydslPackage.SONG__PRICE:
        return getPrice();
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
      case MydslPackage.SONG__NAME:
        setName((String)newValue);
        return;
      case MydslPackage.SONG__ARTIST:
        setArtist((String)newValue);
        return;
      case MydslPackage.SONG__DIST:
        setDist((Distributor)newValue);
        return;
      case MydslPackage.SONG__LENGTH:
        setLength((Time)newValue);
        return;
      case MydslPackage.SONG__GENRE:
        setGenre((Genre)newValue);
        return;
      case MydslPackage.SONG__PRICE:
        setPrice((String)newValue);
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
      case MydslPackage.SONG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MydslPackage.SONG__ARTIST:
        setArtist(ARTIST_EDEFAULT);
        return;
      case MydslPackage.SONG__DIST:
        setDist((Distributor)null);
        return;
      case MydslPackage.SONG__LENGTH:
        setLength((Time)null);
        return;
      case MydslPackage.SONG__GENRE:
        setGenre(GENRE_EDEFAULT);
        return;
      case MydslPackage.SONG__PRICE:
        setPrice(PRICE_EDEFAULT);
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
      case MydslPackage.SONG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MydslPackage.SONG__ARTIST:
        return ARTIST_EDEFAULT == null ? artist != null : !ARTIST_EDEFAULT.equals(artist);
      case MydslPackage.SONG__DIST:
        return dist != null;
      case MydslPackage.SONG__LENGTH:
        return length != null;
      case MydslPackage.SONG__GENRE:
        return genre != GENRE_EDEFAULT;
      case MydslPackage.SONG__PRICE:
        return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
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
    result.append(", artist: ");
    result.append(artist);
    result.append(", genre: ");
    result.append(genre);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} //SongImpl
