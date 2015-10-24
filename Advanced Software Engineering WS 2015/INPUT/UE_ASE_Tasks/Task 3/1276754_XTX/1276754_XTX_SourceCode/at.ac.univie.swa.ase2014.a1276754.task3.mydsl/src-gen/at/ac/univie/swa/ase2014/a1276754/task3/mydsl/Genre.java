/**
 */
package at.ac.univie.swa.ase2014.a1276754.task3.mydsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Genre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2014.a1276754.task3.mydsl.MydslPackage#getGenre()
 * @model
 * @generated
 */
public enum Genre implements Enumerator
{
  /**
   * The '<em><b>Pop</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POP_VALUE
   * @generated
   * @ordered
   */
  POP(0, "pop", "POP"),

  /**
   * The '<em><b>Rock</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROCK_VALUE
   * @generated
   * @ordered
   */
  ROCK(1, "rock", "ROCK"),

  /**
   * The '<em><b>Hardrock</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HARDROCK_VALUE
   * @generated
   * @ordered
   */
  HARDROCK(2, "hardrock", "HARDROCK"),

  /**
   * The '<em><b>Classic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLASSIC_VALUE
   * @generated
   * @ordered
   */
  CLASSIC(3, "classic", "CLASSIC"),

  /**
   * The '<em><b>Folk</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOLK_VALUE
   * @generated
   * @ordered
   */
  FOLK(4, "folk", "FOLK"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(5, "other", "OTHER");

  /**
   * The '<em><b>Pop</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pop</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POP
   * @model name="pop" literal="POP"
   * @generated
   * @ordered
   */
  public static final int POP_VALUE = 0;

  /**
   * The '<em><b>Rock</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rock</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROCK
   * @model name="rock" literal="ROCK"
   * @generated
   * @ordered
   */
  public static final int ROCK_VALUE = 1;

  /**
   * The '<em><b>Hardrock</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Hardrock</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HARDROCK
   * @model name="hardrock" literal="HARDROCK"
   * @generated
   * @ordered
   */
  public static final int HARDROCK_VALUE = 2;

  /**
   * The '<em><b>Classic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Classic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLASSIC
   * @model name="classic" literal="CLASSIC"
   * @generated
   * @ordered
   */
  public static final int CLASSIC_VALUE = 3;

  /**
   * The '<em><b>Folk</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Folk</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOLK
   * @model name="folk" literal="FOLK"
   * @generated
   * @ordered
   */
  public static final int FOLK_VALUE = 4;

  /**
   * The '<em><b>Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OTHER
   * @model name="other" literal="OTHER"
   * @generated
   * @ordered
   */
  public static final int OTHER_VALUE = 5;

  /**
   * An array of all the '<em><b>Genre</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Genre[] VALUES_ARRAY =
    new Genre[]
    {
      POP,
      ROCK,
      HARDROCK,
      CLASSIC,
      FOLK,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Genre</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Genre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Genre</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Genre get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Genre result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Genre</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Genre getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Genre result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Genre</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Genre get(int value)
  {
    switch (value)
    {
      case POP_VALUE: return POP;
      case ROCK_VALUE: return ROCK;
      case HARDROCK_VALUE: return HARDROCK;
      case CLASSIC_VALUE: return CLASSIC;
      case FOLK_VALUE: return FOLK;
      case OTHER_VALUE: return OTHER;
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
  private Genre(int value, String name, String literal)
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
  
} //Genre
