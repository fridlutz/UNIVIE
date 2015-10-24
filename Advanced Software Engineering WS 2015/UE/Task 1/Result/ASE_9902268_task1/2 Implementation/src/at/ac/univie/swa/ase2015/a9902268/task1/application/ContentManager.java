/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import at.ac.univie.swa.ase2015.a9902268.task1.model.Article;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Content;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Internal;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Media;
import at.ac.univie.swa.ase2015.a9902268.task1.model.User;

public class ContentManager {

	Map<String, Content> allContentNodes = new HashMap<String, Content>();

	public ContentManager() {
		deserializeNodes();
	}

	void createNewContent(String title, Object content, User author, Class<?> clazz) {
		// check if an article with title already exists, if already existing
		if (allContentNodes.get(title) != null) {
			allContentNodes.get(title).createNewRevision(content, author);
		} else {
			if (clazz.equals(Article.class)) {
				Article article = new Article(title, (String) content, author);
				allContentNodes.put(title, article);
			} else if (clazz.equals(Media.class)) {
				Media media = null;
				try {
					media = new Media(title, new URL((String) content), author);
					allContentNodes.put(title, media);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (clazz.equals(Internal.class)) {
				Internal internal = new Internal(title, (String) content, author);
				allContentNodes.put(title, internal);
			}

		}
		System.out.println("-> New content node with title " + title + " added");
		serializeNodes();
	}

	void removeAllContent() {
		System.out.println("-> Deleting " + allContentNodes.size() + " nodes");
		allContentNodes.clear();
		serializeNodes();
	}

	void showAllContent() {
		// print results
		Iterator<Content> contentIt = allContentNodes.values().iterator();
		while (contentIt.hasNext()) {
			Content content = (Content) contentIt.next();
			System.out.println(content.renderText());
		}
	}

	void addDiscussion(String title, String discussion, User author) {
		getContentByTitle(title).addDiscussionItem(discussion, author);
		System.out.println("-> Saving discussion for node " + title);
		serializeNodes();
	}

	void createNewRevision(String title, Object content, User author) {
		getContentByTitle(title).createNewRevision(content, author);
		serializeNodes();
	}

	Content getContentByTitle(String title) {
		return allContentNodes.get(title);
	}

	public String getNodeList() {
		StringBuffer buffer = new StringBuffer();
		Iterator<Content> contentIt = allContentNodes.values().iterator();
		while (contentIt.hasNext()) {
			Content content = (Content) contentIt.next();
			buffer.append("- " + content.getNodeName() + "\n");
		}
		return buffer.toString();
	}

	void serializeNodes() {
		try {
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(allContentNodes);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	void deserializeNodes() {
		try {
			FileInputStream fis = new FileInputStream("hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			allContentNodes = (HashMap<String, Content>) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
	}

	public void showNodeContent(String nodeName) {
		Content content = getContentByTitle(nodeName);
		System.out.println(content.renderText());

	}

	public void createDummyContent() {
		createNewContent("University of Vienna",
				"The University of Vienna (German: Universität Wien) is a public university located in Vienna, Austria. It was founded by Duke Rudolph IV in 1365 and is the oldest university in the German-speaking world. With its long and rich history, the University of Vienna has developed into one of the biggest universities in Europe, and also one of the most renowned, especially in the Humanities. It is associated with 15 Nobel prize winners and has been the academic home of a large number of figures both of historical and academic importance.",
				new User("Tillmo"), Article.class);
		createNewContent("Model-driven architecture",
				"Model-driven architecture (MDA) is a software design approach for the development of software systems. It provides a set of guidelines for the structuring of specifications, which are expressed as models. Model-driven architecture is a kind of domain engineering, and supports model-driven engineering of software systems. It was launched by the Object Management Group (OMG) in 2001.",
				new User("Googolplexideas"), Article.class);
		createNewContent("Great Wave off Kanagawa2.jpg",
				"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Great_Wave_off_Kanagawa2.jpg/800px-Great_Wave_off_Kanagawa2.jpg",
				new User("Crisco 1492"), Media.class);
		createNewContent("Community_portal",
				"Welcome! The Community portal is a place to find collaborations, tasks, and news about English Wikipedia. To find other internal project pages of interest, see the department directory.",
				new User("The Transhumanist"), Internal.class);

	}

}
