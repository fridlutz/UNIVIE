/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Revision;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;
import at.ac.univie.swa.ase2015.a9902268.task3.WikiMLStandaloneSetup;

public class WikipediaManager {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private IGenerator generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	Resource resource;
	Wikipedia wikipedia;
	User defaultUser;

	public WikipediaManager() {

		// Register the XMI resource factory for the .website extension
		ModelPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		org.eclipse.ocl.ecore.delegate.OCLDelegateDomain.initialize(resSet,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");

		// Get the resource
		resource = resSet.getResource(URI.createURI("Wikipedia.model"), true);
		wikipedia = (Wikipedia) resource.getContents().get(0);
		try {
			String IP = InetAddress.getLocalHost().toString();
			if (findUnregisteredUserByIP(IP) != null)
				defaultUser = findUnregisteredUserByIP(IP);
			else {
				UnregisteredUser defaultUser = ModelFactory.eINSTANCE.createUnregisteredUser();
				defaultUser.setIPAddress(IP);
				wikipedia.getUser().add(defaultUser);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private User findUnregisteredUserByIP(String IP) {
		Iterator<User> userIt = wikipedia.getUser().iterator();
		while (userIt.hasNext()) {
			User user = (User) userIt.next();
			if (user instanceof UnregisteredUser) {
				if (((UnregisteredUser) user).getIPAddress() != null
						&& ((UnregisteredUser) user).getIPAddress().equals(IP))
					return user;
			}
		}
		return null;
	}

	private boolean isArticleAvailable(String title) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (eObject instanceof Article) {
				Article article = (Article) eObject;
				return article.getTitle().equals(title);
			}
		}
		return false;
	}

	void createNewContent(String title, Object content, User author, Class<?> clazz) {
		System.out.println(title);
		// check if an article with title already exists, if already existing
		if (isArticleAvailable(title)) {
			Content existingContent = getContentByTitle(title);
			Revision newRev = existingContent.createNewRevision();
			newRev.setAuthor(author);
			newRev.setContent(content);
		} else {
			if (clazz.equals(Article.class)) {
				Article article = ModelFactory.eINSTANCE.createArticle();
				article.setTitle(title);
				Revision revision = article.createNewRevision();
				revision.setContent(content);
				revision.setAuthor(author);
				wikipedia.getContent().add(article);
			} else if (clazz.equals(Media.class)) {
				Media media = ModelFactory.eINSTANCE.createMedia();
				media.setTitle(title);
				Revision revision = media.createNewRevision();
				revision.setAuthor(author);
				revision.setContent(content);
				wikipedia.getContent().add(media);

			} else if (clazz.equals(InternalContent.class)) {
				InternalContent internal = ModelFactory.eINSTANCE.createInternalContent();
				internal.setTitle(title);
				Revision revision = internal.createNewRevision();
				revision.setAuthor(author);
				revision.setContent(content);
				wikipedia.getContent().add(internal);
			}

		}
		System.out.println("-> New content node with title " + title + " added");
		saveContentToXMI();
	}

	void removeAllContent() {
		System.out.println("-> Deleting " + wikipedia.getContent().size() + " nodes");
		for (int i = 1; i < wikipedia.getContent().size(); i++) {
			wikipedia.getContent().remove(i);
		}
		saveContentToXMI();
	}

	void saveContentToXMI() {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void showAllContent() {
		// print results
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (eObject instanceof Content) {
				Content content = (Content) eObject;
				System.out.println(content.getCurrentRevision().getContent());
			}
		}
	}

	void addDiscussion(String title, String discussion, User author) {
		getContentByTitle(title).addDiscussionItem();
		System.out.println("-> Saving discussion for node " + title);
		saveContentToXMI();
	}

	void createNewRevision(String title, Object content, User author) {
		Revision newRev = getContentByTitle(title).createNewRevision();
		newRev.setAuthor(author);
		newRev.setContent(content);
		saveContentToXMI();
	}

	Content getContentByTitle(String title) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (eObject instanceof Content) {
				Content content = (Content) eObject;
				if (content.getTitle() != null && content.getTitle().equals(title))
					return content;
			}
		}
		return null;
	}

	User getUserByUserName(String userName) {
		Iterator<User> it = wikipedia.getUser().iterator();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (eObject instanceof RegisteredUser) {
				RegisteredUser user = (RegisteredUser) eObject;
				if (user.getUserName() != null && user.getUserName().equals(userName))
					return user;
			} else if (eObject instanceof UnregisteredUser) {
				UnregisteredUser user = (UnregisteredUser) eObject;
				if (user.getIPAddress() != null && user.getIPAddress().equals(userName))
					return user;
			}
		}
		return null;
	}

	public void showNodeContent(String nodeName) {
		Content content = getContentByTitle(nodeName);
		System.out.println(content.getCurrentRevision().getContent());

	}

	public User getDefaultUser() {
		return defaultUser;
	}

	public void createNewRegisteredUser(String userName) {
		RegisteredUser user = ModelFactory.eINSTANCE.createRegisteredUser();
		user.setRegistrationDateJD(wikipedia.getCurrentDateJD());
		user.setUserName(userName);
		wikipedia.getUser().add(user);
	}

	public String renderContent(String title) {
		Content content = getContentByTitle(title);
		WikiMLStandaloneSetup setup = new WikiMLStandaloneSetup();
		Injector inj = setup.createInjectorAndDoEMFRegistration();
		WikipediaManager mgr = inj.getInstance(WikipediaManager.class);
		try {
			PrintWriter out = new PrintWriter(title + ".wikiml");
			out.print(content.getCurrentRevision().getContent().toString());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mgr.runGenerator(title + ".wikiml");
		return readFile("output/" + title + ".html");

	}

	private String readFile(String pathname) {

		Scanner scanner = null;
		try {
			File file = new File(pathname);
			StringBuilder fileContents = new StringBuilder((int) file.length());
			scanner = new Scanner(file);
			String lineSeparator = System.getProperty("line.separator");
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return null;
	}


	protected void runGenerator(String file) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(file), true);
	
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}
	
		// configure and start the generator
		fileAccess.setOutputPath("output/");
		generator.doGenerate(resource, fileAccess);
	
		System.out.println("Code generation finished.");
	}
}
