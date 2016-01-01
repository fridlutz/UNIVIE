/**
 */
package wikiSampleSolution.wikiSampleSolution.provider;

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

import wikiSampleSolution.wikiSampleSolution.util.WikiSampleSolutionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiSampleSolutionItemProviderAdapterFactory extends WikiSampleSolutionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public WikiSampleSolutionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Wiki} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikiItemProvider wikiItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Wiki}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWikiAdapter() {
		if (wikiItemProvider == null) {
			wikiItemProvider = new WikiItemProvider(this);
		}

		return wikiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Article} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleItemProvider articleItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Article}.
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
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Media} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaItemProvider mediaItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Media}.
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
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.ProjectPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectPageItemProvider projectPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.ProjectPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectPageAdapter() {
		if (projectPageItemProvider == null) {
			projectPageItemProvider = new ProjectPageItemProvider(this);
		}

		return projectPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.DiscussionPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionPageItemProvider discussionPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.DiscussionPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscussionPageAdapter() {
		if (discussionPageItemProvider == null) {
			discussionPageItemProvider = new DiscussionPageItemProvider(this);
		}

		return discussionPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Version} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionItemProvider versionItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionAdapter() {
		if (versionItemProvider == null) {
			versionItemProvider = new VersionItemProvider(this);
		}

		return versionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.History} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryItemProvider historyItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.History}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistoryAdapter() {
		if (historyItemProvider == null) {
			historyItemProvider = new HistoryItemProvider(this);
		}

		return historyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Mode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeItemProvider modeItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeAdapter() {
		if (modeItemProvider == null) {
			modeItemProvider = new ModeItemProvider(this);
		}

		return modeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Privileg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivilegItemProvider privilegItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Privileg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrivilegAdapter() {
		if (privilegItemProvider == null) {
			privilegItemProvider = new PrivilegItemProvider(this);
		}

		return privilegItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.RegisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredUserItemProvider registeredUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.RegisteredUser}.
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
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.UnregisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredUserItemProvider unregisteredUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.UnregisteredUser}.
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
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Profile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileItemProvider profileItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Profile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfileAdapter() {
		if (profileItemProvider == null) {
			profileItemProvider = new ProfileItemProvider(this);
		}

		return profileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikiSampleSolution.wikiSampleSolution.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link wikiSampleSolution.wikiSampleSolution.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
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
		if (wikiItemProvider != null) wikiItemProvider.dispose();
		if (articleItemProvider != null) articleItemProvider.dispose();
		if (mediaItemProvider != null) mediaItemProvider.dispose();
		if (projectPageItemProvider != null) projectPageItemProvider.dispose();
		if (discussionPageItemProvider != null) discussionPageItemProvider.dispose();
		if (versionItemProvider != null) versionItemProvider.dispose();
		if (historyItemProvider != null) historyItemProvider.dispose();
		if (groupItemProvider != null) groupItemProvider.dispose();
		if (modeItemProvider != null) modeItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (privilegItemProvider != null) privilegItemProvider.dispose();
		if (registeredUserItemProvider != null) registeredUserItemProvider.dispose();
		if (unregisteredUserItemProvider != null) unregisteredUserItemProvider.dispose();
		if (profileItemProvider != null) profileItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
	}

}
