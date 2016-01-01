/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wiki</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiTest extends TestCase {

	/**
	 * The fixture for this Wiki test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wiki fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WikiTest.class);
	}

	/**
	 * Constructs a new Wiki test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Wiki test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Wiki fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Wiki test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wiki getFixture() {
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
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createWiki());
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

} //WikiTest
