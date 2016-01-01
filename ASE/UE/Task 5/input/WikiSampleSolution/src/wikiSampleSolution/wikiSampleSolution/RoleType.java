/**
 */
package wikiSampleSolution.wikiSampleSolution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage#getRoleType()
 * @model
 * @generated
 */
public enum RoleType implements Enumerator {
	/**
	 * The '<em><b>UNREGISTERED USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNREGISTERED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	UNREGISTERED_USER(0, "UNREGISTERED_USER", "UNREGISTERED_USER"), /**
	 * The '<em><b>REGISTERED USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED_USER(0, "REGISTERED_USER", "REGISTERED_USER"),

	/**
	 * The '<em><b>AUTOCONFIRMED USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOCONFIRMED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOCONFIRMED_USER(0, "AUTOCONFIRMED_USER", "AUTOCONFIRMED_USER"),

	/**
	 * The '<em><b>ADMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN(0, "ADMIN", "ADMIN"),

	/**
	 * The '<em><b>SYSOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSOP_VALUE
	 * @generated
	 * @ordered
	 */
	SYSOP(0, "SYSOP", "SYSOP");

	/**
	 * The '<em><b>UNREGISTERED USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNREGISTERED USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNREGISTERED_USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNREGISTERED_USER_VALUE = 0;

	/**
	 * The '<em><b>REGISTERED USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGISTERED USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_USER_VALUE = 0;

	/**
	 * The '<em><b>AUTOCONFIRMED USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTOCONFIRMED USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOCONFIRMED_USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOCONFIRMED_USER_VALUE = 0;

	/**
	 * The '<em><b>ADMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_VALUE = 0;

	/**
	 * The '<em><b>SYSOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSOP_VALUE = 0;

	/**
	 * An array of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleType[] VALUES_ARRAY =
		new RoleType[] {
			UNREGISTERED_USER,
			REGISTERED_USER,
			AUTOCONFIRMED_USER,
			ADMIN,
			SYSOP,
		};

	/**
	 * A public read-only list of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(int value) {
		switch (value) {
			case UNREGISTERED_USER_VALUE: return UNREGISTERED_USER;
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
	private RoleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RoleType
