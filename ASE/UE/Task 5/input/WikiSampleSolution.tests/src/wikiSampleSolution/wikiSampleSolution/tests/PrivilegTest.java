/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.Privileg;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Privileg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivilegTest extends TestCase {

	/**
	 * The fixture for this Privileg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Privileg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrivilegTest.class);
	}

	/**
	 * Constructs a new Privileg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivilegTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Privileg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Privileg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Privileg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Privileg getFixture() {
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
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createPrivileg());
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

} //PrivilegTest
