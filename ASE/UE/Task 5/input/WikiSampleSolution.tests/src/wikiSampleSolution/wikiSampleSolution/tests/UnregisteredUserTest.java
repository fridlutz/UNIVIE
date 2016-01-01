/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.UnregisteredUser;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unregistered User</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnregisteredUserTest extends UserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnregisteredUserTest.class);
	}

	/**
	 * Constructs a new Unregistered User test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisteredUserTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unregistered User test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnregisteredUser getFixture() {
		return (UnregisteredUser)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createUnregisteredUser());
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

} //UnregisteredUserTest
