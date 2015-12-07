/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.tests;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Content</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalContentTest extends ContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalContentTest.class);
	}

	/**
	 * Constructs a new Internal Content test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalContentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Content test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalContent getFixture() {
		return (InternalContent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createInternalContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InternalContentTest
