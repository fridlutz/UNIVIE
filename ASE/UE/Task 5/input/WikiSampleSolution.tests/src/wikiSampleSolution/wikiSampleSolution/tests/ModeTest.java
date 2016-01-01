/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.Mode;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeTest extends TestCase {

	/**
	 * The fixture for this Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeTest.class);
	}

	/**
	 * Constructs a new Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Mode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mode getFixture() {
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
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createMode());
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

} //ModeTest
