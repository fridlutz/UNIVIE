/**
 */
package wikiSampleSolution.wikiSampleSolution.tests;

import junit.textui.TestRunner;

import wikiSampleSolution.wikiSampleSolution.ProjectPage;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectPageTest extends ContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectPageTest.class);
	}

	/**
	 * Constructs a new Project Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Project Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProjectPage getFixture() {
		return (ProjectPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikiSampleSolutionFactory.eINSTANCE.createProjectPage());
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

} //ProjectPageTest
