/**
 */
package at.ac.univie.swa.ase2015.a9902268.task3.wikiML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>View Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiMLPackage#getViewType()
 * @model
 * @generated
 */
public enum ViewType implements Enumerator
{
  /**
   * The '<em><b>Thumb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THUMB_VALUE
   * @generated
   * @ordered
   */
  THUMB(0, "thumb", "thumb"),

  /**
   * The '<em><b>Thumbnail</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THUMBNAIL_VALUE
   * @generated
   * @ordered
   */
  THUMBNAIL(1, "thumbnail", "thumbnail"),

  /**
   * The '<em><b>Frame</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAME_VALUE
   * @generated
   * @ordered
   */
  FRAME(2, "frame", "frame"),

  /**
   * The '<em><b>Framed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAMED_VALUE
   * @generated
   * @ordered
   */
  FRAMED(3, "framed", "framed"),

  /**
   * The '<em><b>Frameless</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRAMELESS_VALUE
   * @generated
   * @ordered
   */
  FRAMELESS(4, "frameless", "frameless");

  /**
   * The '<em><b>Thumb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Thumb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THUMB
   * @model name="thumb"
   * @generated
   * @ordered
   */
  public static final int THUMB_VALUE = 0;

  /**
   * The '<em><b>Thumbnail</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Thumbnail</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THUMBNAIL
   * @model name="thumbnail"
   * @generated
   * @ordered
   */
  public static final int THUMBNAIL_VALUE = 1;

  /**
   * The '<em><b>Frame</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Frame</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRAME
   * @model name="frame"
   * @generated
   * @ordered
   */
  public static final int FRAME_VALUE = 2;

  /**
   * The '<em><b>Framed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Framed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRAMED
   * @model name="framed"
   * @generated
   * @ordered
   */
  public static final int FRAMED_VALUE = 3;

  /**
   * The '<em><b>Frameless</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Frameless</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRAMELESS
   * @model name="frameless"
   * @generated
   * @ordered
   */
  public static final int FRAMELESS_VALUE = 4;

  /**
   * An array of all the '<em><b>View Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ViewType[] VALUES_ARRAY =
    new ViewType[]
    {
      THUMB,
      THUMBNAIL,
      FRAME,
      FRAMED,
      FRAMELESS,
    };

  /**
   * A public read-only list of all the '<em><b>View Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ViewType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ViewType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ViewType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ViewType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ViewType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>View Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ViewType get(int value)
  {
    switch (value)
    {
      case THUMB_VALUE: return THUMB;
      case THUMBNAIL_VALUE: return THUMBNAIL;
      case FRAME_VALUE: return FRAME;
      case FRAMED_VALUE: return FRAMED;
      case FRAMELESS_VALUE: return FRAMELESS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ViewType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ViewType
