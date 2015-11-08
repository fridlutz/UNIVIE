/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>user Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getuserType()
 * @model
 * @generated
 */
public enum userType implements Enumerator {
	/**
	 * The '<em><b>Auto Confirmed User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_CONFIRMED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_CONFIRMED_USER(2, "AutoConfirmedUser", "AutoConfirmedUser"),

	/**
	 * The '<em><b>Registered User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_USER_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED_USER(3, "RegisteredUser", "RegisteredUser");

	/**
	 * The '<em><b>Auto Confirmed User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto Confirmed User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_CONFIRMED_USER
	 * @model name="AutoConfirmedUser"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_CONFIRMED_USER_VALUE = 2;

	/**
	 * The '<em><b>Registered User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Registered User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_USER
	 * @model name="RegisteredUser"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_USER_VALUE = 3;

	/**
	 * An array of all the '<em><b>user Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final userType[] VALUES_ARRAY =
		new userType[] {
			AUTO_CONFIRMED_USER,
			REGISTERED_USER,
		};

	/**
	 * A public read-only list of all the '<em><b>user Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<userType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>user Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static userType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			userType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>user Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static userType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			userType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>user Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static userType get(int value) {
		switch (value) {
			case AUTO_CONFIRMED_USER_VALUE: return AUTO_CONFIRMED_USER;
			case REGISTERED_USER_VALUE: return REGISTERED_USER;
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
	private userType(int value, String name, String literal) {
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
	
} //userType
