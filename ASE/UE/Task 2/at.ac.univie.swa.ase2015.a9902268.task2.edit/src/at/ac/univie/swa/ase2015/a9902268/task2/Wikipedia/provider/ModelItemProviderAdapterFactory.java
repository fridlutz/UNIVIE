/**
 */
package at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.provider;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.util.ModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikipediaItemProvider wikipediaItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWikipediaAdapter() {
		if (wikipediaItemProvider == null) {
			wikipediaItemProvider = new WikipediaItemProvider(this);
		}

		return wikipediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleItemProvider articleItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArticleAdapter() {
		if (articleItemProvider == null) {
			articleItemProvider = new ArticleItemProvider(this);
		}

		return articleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaItemProvider mediaItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMediaAdapter() {
		if (mediaItemProvider == null) {
			mediaItemProvider = new MediaItemProvider(this);
		}

		return mediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalContentItemProvider internalContentItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalContentAdapter() {
		if (internalContentItemProvider == null) {
			internalContentItemProvider = new InternalContentItemProvider(this);
		}

		return internalContentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredUserItemProvider registeredUserItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisteredUserAdapter() {
		if (registeredUserItemProvider == null) {
			registeredUserItemProvider = new RegisteredUserItemProvider(this);
		}

		return registeredUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionItemProvider revisionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRevisionAdapter() {
		if (revisionItemProvider == null) {
			revisionItemProvider = new RevisionItemProvider(this);
		}

		return revisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionItemProvider discussionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Discussion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscussionAdapter() {
		if (discussionItemProvider == null) {
			discussionItemProvider = new DiscussionItemProvider(this);
		}

		return discussionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionHistoryItemProvider versionHistoryItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.VersionHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionHistoryAdapter() {
		if (versionHistoryItemProvider == null) {
			versionHistoryItemProvider = new VersionHistoryItemProvider(this);
		}

		return versionHistoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataItemProvider metaDataItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetaDataAdapter() {
		if (metaDataItemProvider == null) {
			metaDataItemProvider = new MetaDataItemProvider(this);
		}

		return metaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikiProjectItemProvider wikiProjectItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.WikiProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWikiProjectAdapter() {
		if (wikiProjectItemProvider == null) {
			wikiProjectItemProvider = new WikiProjectItemProvider(this);
		}

		return wikiProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredUserItemProvider unregisteredUserItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnregisteredUserAdapter() {
		if (unregisteredUserItemProvider == null) {
			unregisteredUserItemProvider = new UnregisteredUserItemProvider(this);
		}

		return unregisteredUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Administrator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorItemProvider administratorItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Administrator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdministratorAdapter() {
		if (administratorItemProvider == null) {
			administratorItemProvider = new AdministratorItemProvider(this);
		}

		return administratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysOpItemProvider sysOpItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.SysOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSysOpAdapter() {
		if (sysOpItemProvider == null) {
			sysOpItemProvider = new SysOpItemProvider(this);
		}

		return sysOpItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (wikipediaItemProvider != null) wikipediaItemProvider.dispose();
		if (articleItemProvider != null) articleItemProvider.dispose();
		if (mediaItemProvider != null) mediaItemProvider.dispose();
		if (internalContentItemProvider != null) internalContentItemProvider.dispose();
		if (registeredUserItemProvider != null) registeredUserItemProvider.dispose();
		if (revisionItemProvider != null) revisionItemProvider.dispose();
		if (discussionItemProvider != null) discussionItemProvider.dispose();
		if (versionHistoryItemProvider != null) versionHistoryItemProvider.dispose();
		if (metaDataItemProvider != null) metaDataItemProvider.dispose();
		if (wikiProjectItemProvider != null) wikiProjectItemProvider.dispose();
		if (unregisteredUserItemProvider != null) unregisteredUserItemProvider.dispose();
		if (administratorItemProvider != null) administratorItemProvider.dispose();
		if (sysOpItemProvider != null) sysOpItemProvider.dispose();
	}

}