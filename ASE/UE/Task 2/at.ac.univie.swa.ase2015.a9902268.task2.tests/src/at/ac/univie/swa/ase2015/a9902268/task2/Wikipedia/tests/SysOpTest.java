/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.tests;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sys Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysOpTest extends RegisteredUserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SysOpTest.class);
	}

	/**
	 * Constructs a new Sys Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sys Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SysOp getFixture() {
		return (SysOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createSysOp());
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

} //SysOpTest
