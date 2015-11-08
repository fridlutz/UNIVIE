/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>admin Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage#getadminActions()
 * @model
 * @generated
 */
public enum adminActions implements Enumerator {
	/**
	 * The '<em><b>Create Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_CONTENT(2, "CreateContent", "CreateContent"),

	/**
	 * The '<em><b>Create Delete Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_DELETE_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_DELETE_CONTENT(3, "CreateDeleteContent", "CreateDeleteContent");

	/**
	 * The '<em><b>Create Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_CONTENT
	 * @model name="CreateContent"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_CONTENT_VALUE = 2;

	/**
	 * The '<em><b>Create Delete Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create Delete Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_DELETE_CONTENT
	 * @model name="CreateDeleteContent"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_DELETE_CONTENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>admin Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final adminActions[] VALUES_ARRAY =
		new adminActions[] {
			CREATE_CONTENT,
			CREATE_DELETE_CONTENT,
		};

	/**
	 * A public read-only list of all the '<em><b>admin Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<adminActions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>admin Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static adminActions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			adminActions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>admin Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static adminActions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			adminActions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>admin Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static adminActions get(int value) {
		switch (value) {
			case CREATE_CONTENT_VALUE: return CREATE_CONTENT;
			case CREATE_DELETE_CONTENT_VALUE: return CREATE_DELETE_CONTENT;
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
	private adminActions(int value, String name, String literal) {
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
	
} //adminActions
