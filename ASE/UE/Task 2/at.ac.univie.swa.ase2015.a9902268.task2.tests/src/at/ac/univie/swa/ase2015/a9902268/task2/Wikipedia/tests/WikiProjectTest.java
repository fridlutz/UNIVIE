/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.tests;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wiki Project</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiProjectTest extends InternalContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WikiProjectTest.class);
	}

	/**
	 * Constructs a new Wiki Project test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiProjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wiki Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WikiProject getFixture() {
		return (WikiProject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createWikiProject());
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

} //WikiProjectTest
