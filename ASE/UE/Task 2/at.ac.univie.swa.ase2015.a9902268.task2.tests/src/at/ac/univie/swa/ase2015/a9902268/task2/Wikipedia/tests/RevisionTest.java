/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.tests;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RevisionTest extends TestCase {

	/**
	 * The fixture for this Revision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Revision fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RevisionTest.class);
	}

	/**
	 * Constructs a new Revision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Revision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Revision fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Revision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Revision getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRevision());
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

} //RevisionTest
