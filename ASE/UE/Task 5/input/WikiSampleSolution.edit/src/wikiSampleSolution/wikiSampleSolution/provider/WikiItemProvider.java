/**
 */
package wikiSampleSolution.wikiSampleSolution.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;
import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionPackage;

/**
 * This is the item provider adapter for a {@link wikiSampleSolution.wikiSampleSolution.Wiki} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WikiItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHistoryPropertyDescriptor(object);
			addVersionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Wiki_history_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Wiki_history_feature", "_UI_Wiki_type"),
				 WikiSampleSolutionPackage.Literals.WIKI__HISTORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Wiki_versions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Wiki_versions_feature", "_UI_Wiki_type"),
				 WikiSampleSolutionPackage.Literals.WIKI__VERSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__CONTENT);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__PRIVILEGS);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__GROUPS);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__USERS);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__MODE);
			childrenFeatures.add(WikiSampleSolutionPackage.Literals.WIKI__ROLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Wiki.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Wiki"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Wiki_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Wiki.class)) {
			case WikiSampleSolutionPackage.WIKI__CONTENT:
			case WikiSampleSolutionPackage.WIKI__PRIVILEGS:
			case WikiSampleSolutionPackage.WIKI__GROUPS:
			case WikiSampleSolutionPackage.WIKI__USERS:
			case WikiSampleSolutionPackage.WIKI__MODE:
			case WikiSampleSolutionPackage.WIKI__ROLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__CONTENT,
				 WikiSampleSolutionFactory.eINSTANCE.createArticle()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__CONTENT,
				 WikiSampleSolutionFactory.eINSTANCE.createMedia()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__CONTENT,
				 WikiSampleSolutionFactory.eINSTANCE.createProjectPage()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__CONTENT,
				 WikiSampleSolutionFactory.eINSTANCE.createDiscussionPage()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__CONTENT,
				 WikiSampleSolutionFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__PRIVILEGS,
				 WikiSampleSolutionFactory.eINSTANCE.createPrivileg()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__GROUPS,
				 WikiSampleSolutionFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__USERS,
				 WikiSampleSolutionFactory.eINSTANCE.createRegisteredUser()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__USERS,
				 WikiSampleSolutionFactory.eINSTANCE.createUnregisteredUser()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__MODE,
				 WikiSampleSolutionFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(WikiSampleSolutionPackage.Literals.WIKI__ROLE,
				 WikiSampleSolutionFactory.eINSTANCE.createRole()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WikiSampleSolutionEditPlugin.INSTANCE;
	}

}
