/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.impl;

import at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version History</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VersionHistoryImpl extends MinimalEObjectImpl.Container implements VersionHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERSION_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void renderHTML() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.VERSION_HISTORY___RENDER_HTML:
				renderHTML();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //VersionHistoryImpl
