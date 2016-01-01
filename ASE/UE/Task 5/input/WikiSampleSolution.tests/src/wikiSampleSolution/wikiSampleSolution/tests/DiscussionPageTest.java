/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.DiscussionPage;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discussion Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscussionPageTest extends ContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscussionPageTest.class);
	}

	/**
	 * Constructs a new Discussion Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discussion Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscussionPage getFixture() {
		return (DiscussionPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createDiscussionPage());
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

} //DiscussionPageTest
