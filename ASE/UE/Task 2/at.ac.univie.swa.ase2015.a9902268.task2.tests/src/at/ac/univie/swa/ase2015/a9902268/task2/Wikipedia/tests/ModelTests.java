/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Wikipedia</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ModelTests("Wikipedia Tests");
		suite.addTestSuite(WikipediaTest.class);
		suite.addTestSuite(ArticleTest.class);
		suite.addTestSuite(MediaTest.class);
		suite.addTestSuite(InternalContentTest.class);
		suite.addTestSuite(RegisteredUserTest.class);
		suite.addTestSuite(DiscussionTest.class);
		suite.addTestSuite(VersionHistoryTest.class);
		suite.addTestSuite(WikiProjectTest.class);
		suite.addTestSuite(UnregisteredUserTest.class);
		suite.addTestSuite(AdministratorTest.class);
		suite.addTestSuite(SysOpTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTests(String name) {
		super(name);
	}

} //ModelTests
