/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/package at.ac.univie.swa.ase2015.a9902268.task1.model.application;

import java.io.File;
import java.util.Scanner;

import at.ac.univie.swa.ase2015.a9902268.task1.model.Article;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Content;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Internal;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Media;
import at.ac.univie.swa.ase2015.a9902268.task1.model.User;

public class WikiApplicationConsole {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ContentManager contentmgr = new ContentManager();

		int actionID = 0;
		while (true) {
			System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.println("Empty all content (1)");
			System.out.println("Create content element (2)");
			System.out.println("Update content (3)");
			System.out.println("Add discussion (4)");
			System.out.println("Browse content (5)");
			System.out.println("Show all content (6)");
			System.out.println("Create dummy content (7)");
			System.out.println("Shut down Wiki (8)");
			System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooo");
			System.out.print("Enter Action ID: ");
			actionID = scanner.nextInt();
			scanner.nextLine();
			if (actionID == 1)
				contentmgr.removeAllContent();
			if (actionID == 2)
				createContent(contentmgr);
			if (actionID == 3) {
				updateContent(contentmgr);
			}
			if (actionID == 4) {
				addDiscussion(contentmgr);
			}
			if (actionID == 5) {
				browseContent(contentmgr);
			}
			if (actionID == 6)
				contentmgr.showAllContent();
			if (actionID == 7)
				contentmgr.createDummyContent();
			if (actionID == 8) {
				System.out.println("-> Shutting down Wiki, Bye");
				break;
			}

			if (actionID > 8)
				System.err.println("-> Invalid ID - retry");
		}
	}

	static void browseContent(ContentManager contentmgr) {
		String nodeName = "";
		while (contentmgr.getContentByTitle(nodeName) == null) {
			if (nodeName.length() > 0)
				System.out.println("The page cannot be found - retry");
			System.out.println("Select page by name: ");
			System.out.println(contentmgr.getNodeList());
			nodeName = scanner.nextLine();
		}
		contentmgr.showNodeContent(nodeName);
	}

	static void addDiscussion(ContentManager contentmgr) {
		String nodeName = "";
		while (contentmgr.getContentByTitle(nodeName) == null) {
			if (nodeName.length() > 0)
				System.out.println("The page cannot be found - retry");
			System.out.println("Select page by name: ");
			System.out.println(contentmgr.getNodeList());
			nodeName = scanner.nextLine();
		}
		System.out.println("Enter user name: ");
		String username = scanner.nextLine();
		System.out.println("Discussion content: ");
		String discussion = scanner.nextLine();
		System.out.println("Save discussion item");
		System.out
				.println("Author: " + username + " Content: " + discussion + " for page " + nodeName + "? (Y) or (N)");
		String decision = scanner.next();
		if (decision.equals("Y"))
			contentmgr.addDiscussion(nodeName, discussion, new User(username));
	}

	static void updateContent(ContentManager contentmgr) {
		String nodeName = "";
		while (contentmgr.getContentByTitle(nodeName) == null) {
			if (nodeName.length() > 0)
				System.out.println("The page cannot be found - retry");
			System.out.println("Select page by name: ");
			System.out.println(contentmgr.getNodeList());
			nodeName = scanner.nextLine();
		}
		System.out.println("Enter user name: ");
		String username = scanner.nextLine();
		User author = new User(username);

		Content currentContent = contentmgr.getContentByTitle(nodeName);

		if (currentContent instanceof Article) {
			System.out.println("Enter content text: ");
			String content = scanner.nextLine();
			System.out.println("Save update? (Y) or (N)");
			String decision = scanner.next();
			if (decision.equals("Y"))
				contentmgr.createNewContent(nodeName, content, author, Article.class);

		}
		if (currentContent instanceof Media) {
			System.out.println("Enter media file: ");
			String content = scanner.nextLine();
			System.out.println("Save update? (Y) or (N)");
			String decision = scanner.next();
			if (decision.equals("Y"))
				contentmgr.createNewContent(nodeName, new File(content), author, Media.class);
		}

		if (currentContent instanceof Internal) {
			System.out.println("Enter content text: ");
			String content = scanner.nextLine();
			System.out.println("Save update? (Y) or (N)");
			String decision = scanner.next();
			if (decision.equals("Y"))
				contentmgr.createNewContent(nodeName, content, author, Internal.class);
		}
	}

	static void createContent(ContentManager contentmgr) {
		System.out.print("Enter user name: ");
		String username = scanner.next();
		User author = new User(username);

		System.out.print("Enter node title: ");
		String title = scanner.next();

		System.out.println("Select node type");
		System.out.println("Article (1)");
		System.out.println("Media (2)");
		System.out.println("Internal (3)");
		int type = scanner.nextInt();

		if (type == 1) {
			System.out.print("Enter content text: ");
			String content = scanner.next();
			contentmgr.createNewContent(title, content, author, Article.class);

		}
		if (type == 2) {
			System.out.print("Enter media file: ");
			String content = scanner.next();
			contentmgr.createNewContent(title, new File(content), author, Media.class);
		}

		if (type == 3) {
			System.out.print("Enter content text: ");
			String content = scanner.next();
			contentmgr.createNewContent(title, content, author, Internal.class);
		}
	}
}
