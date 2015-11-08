/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.model.util;

import at.ac.univie.swa.ase2015.a9902268.task2.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseWikipedia(Wikipedia object) {
				return createWikipediaAdapter();
			}
			@Override
			public Adapter caseContent(Content object) {
				return createContentAdapter();
			}
			@Override
			public Adapter caseArticle(Article object) {
				return createArticleAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseInternalContent(InternalContent object) {
				return createInternalContentAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRegisteredUser(RegisteredUser object) {
				return createRegisteredUserAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseDiscussion(Discussion object) {
				return createDiscussionAdapter();
			}
			@Override
			public Adapter caseVersionHistory(VersionHistory object) {
				return createVersionHistoryAdapter();
			}
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
			}
			@Override
			public Adapter caseWikiProject(WikiProject object) {
				return createWikiProjectAdapter();
			}
			@Override
			public Adapter caseUnregisteredUser(UnregisteredUser object) {
				return createUnregisteredUserAdapter();
			}
			@Override
			public Adapter caseAdministrator(Administrator object) {
				return createAdministratorAdapter();
			}
			@Override
			public Adapter caseSysOp(SysOp object) {
				return createSysOpAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Wikipedia <em>Wikipedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Wikipedia
	 * @generated
	 */
	public Adapter createWikipediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Content
	 * @generated
	 */
	public Adapter createContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Article
	 * @generated
	 */
	public Adapter createArticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent <em>Internal Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.InternalContent
	 * @generated
	 */
	public Adapter createInternalContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.RegisteredUser
	 * @generated
	 */
	public Adapter createRegisteredUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Discussion
	 * @generated
	 */
	public Adapter createDiscussionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory <em>Version History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.VersionHistory
	 * @generated
	 */
	public Adapter createVersionHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject <em>Wiki Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.WikiProject
	 * @generated
	 */
	public Adapter createWikiProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.UnregisteredUser
	 * @generated
	 */
	public Adapter createUnregisteredUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.Administrator
	 * @generated
	 */
	public Adapter createAdministratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp <em>Sys Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.univie.swa.ase2015.a9902268.task2.model.SysOp
	 * @generated
	 */
	public Adapter createSysOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
