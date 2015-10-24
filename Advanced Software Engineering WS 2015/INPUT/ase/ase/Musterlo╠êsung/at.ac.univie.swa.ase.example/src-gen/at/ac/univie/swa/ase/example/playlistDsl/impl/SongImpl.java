/**
 */
package at.ac.univie.swa.ase.example.playlistDsl.impl;

import at.ac.univie.swa.ase.example.playlistDsl.Distributor;
import at.ac.univie.swa.ase.example.playlistDsl.Genre;
import at.ac.univie.swa.ase.example.playlistDsl.Length;
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistDslPackage;
import at.ac.univie.swa.ase.example.playlistDsl.Song;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl#getLength <em>Length</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link at.ac.univie.swa.ase.example.playlistDsl.impl.SongImpl#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SongImpl extends PlaylistItemImpl implements Song
{
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
   * The cached value of the '{@link #getDistributor() <em>Distributor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistributor()
   * @generated
   * @ordered
   */
  protected Distributor distributor;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected Length length;

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
  protected static final double PRICE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected double price = PRICE_EDEFAULT;

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
    return PlaylistDslPackage.Literals.SONG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__ARTIST, oldArtist, artist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distributor getDistributor()
  {
    if (distributor != null && distributor.eIsProxy())
    {
      InternalEObject oldDistributor = (InternalEObject)distributor;
      distributor = (Distributor)eResolveProxy(oldDistributor);
      if (distributor != oldDistributor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaylistDslPackage.SONG__DISTRIBUTOR, oldDistributor, distributor));
      }
    }
    return distributor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distributor basicGetDistributor()
  {
    return distributor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistributor(Distributor newDistributor)
  {
    Distributor oldDistributor = distributor;
    distributor = newDistributor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__DISTRIBUTOR, oldDistributor, distributor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Length getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLength(Length newLength, NotificationChain msgs)
  {
    Length oldLength = length;
    length = newLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__LENGTH, oldLength, newLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(Length newLength)
  {
    if (newLength != length)
    {
      NotificationChain msgs = null;
      if (length != null)
        msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlaylistDslPackage.SONG__LENGTH, null, msgs);
      if (newLength != null)
        msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlaylistDslPackage.SONG__LENGTH, null, msgs);
      msgs = basicSetLength(newLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__LENGTH, newLength, newLength));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__GENRE, oldGenre, genre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(double newPrice)
  {
    double oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlaylistDslPackage.SONG__PRICE, oldPrice, price));
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
      case PlaylistDslPackage.SONG__LENGTH:
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
      case PlaylistDslPackage.SONG__ARTIST:
        return getArtist();
      case PlaylistDslPackage.SONG__DISTRIBUTOR:
        if (resolve) return getDistributor();
        return basicGetDistributor();
      case PlaylistDslPackage.SONG__LENGTH:
        return getLength();
      case PlaylistDslPackage.SONG__GENRE:
        return getGenre();
      case PlaylistDslPackage.SONG__PRICE:
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
      case PlaylistDslPackage.SONG__ARTIST:
        setArtist((String)newValue);
        return;
      case PlaylistDslPackage.SONG__DISTRIBUTOR:
        setDistributor((Distributor)newValue);
        return;
      case PlaylistDslPackage.SONG__LENGTH:
        setLength((Length)newValue);
        return;
      case PlaylistDslPackage.SONG__GENRE:
        setGenre((Genre)newValue);
        return;
      case PlaylistDslPackage.SONG__PRICE:
        setPrice((Double)newValue);
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
      case PlaylistDslPackage.SONG__ARTIST:
        setArtist(ARTIST_EDEFAULT);
        return;
      case PlaylistDslPackage.SONG__DISTRIBUTOR:
        setDistributor((Distributor)null);
        return;
      case PlaylistDslPackage.SONG__LENGTH:
        setLength((Length)null);
        return;
      case PlaylistDslPackage.SONG__GENRE:
        setGenre(GENRE_EDEFAULT);
        return;
      case PlaylistDslPackage.SONG__PRICE:
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
      case PlaylistDslPackage.SONG__ARTIST:
        return ARTIST_EDEFAULT == null ? artist != null : !ARTIST_EDEFAULT.equals(artist);
      case PlaylistDslPackage.SONG__DISTRIBUTOR:
        return distributor != null;
      case PlaylistDslPackage.SONG__LENGTH:
        return length != null;
      case PlaylistDslPackage.SONG__GENRE:
        return genre != GENRE_EDEFAULT;
      case PlaylistDslPackage.SONG__PRICE:
        return price != PRICE_EDEFAULT;
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
    result.append(" (artist: ");
    result.append(artist);
    result.append(", genre: ");
    result.append(genre);
    result.append(", price: ");
    result.append(price);
    result.append(')');
    return result.toString();
  }

} //SongImpl
