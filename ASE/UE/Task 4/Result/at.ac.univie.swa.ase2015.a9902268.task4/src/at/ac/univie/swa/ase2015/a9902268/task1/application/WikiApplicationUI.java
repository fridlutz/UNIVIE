/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import at.ac.univie.swa.ase2015.a9902268.task1.application.index.TreeExpansionUtil;
import at.ac.univie.swa.ase2015.a9902268.task1.application.index.WikipediaIndexTreeModelListener;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Article;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.InternalContent;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Media;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.RegisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.UnregisteredUser;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.User;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;
import jodd.datetime.JDateTime;
import jodd.datetime.JulianDateStamp;

public class WikiApplicationUI extends JFrame {

	WikipediaManager wikimgr = new WikipediaManager();
	// JTable indexTable;
	JTree tree;
	JButton editContent;
	JButton addArticle;
	JButton addMedia;
	JButton registerUser;
	JButton addInternal;
	JButton saveChanges;
	JEditorPane contentEditorPane;
	User author = wikimgr.getDefaultUser();
	private static final long serialVersionUID = -7071509208050710875L;
	DefaultMutableTreeNode wikipediaRoot;
	DefaultMutableTreeNode article;
	DefaultMutableTreeNode media;
	DefaultMutableTreeNode internal;
	DefaultMutableTreeNode user;
	DefaultTreeModel treeModel;

	TreeExpansionUtil expander = new TreeExpansionUtil(tree);

	JDateTime today;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

	public WikiApplicationUI() {

		initUI();
	}

	private void initUI() {

		// set the current date to the julian date - today is the day the last
		// time the application was exited
		JulianDateStamp stamp = new JulianDateStamp(wikimgr.wikipedia.getCurrentDateJD().doubleValue());
		today = new JDateTime(stamp);
		wikimgr.wikipedia.setCurrentDateJD(new BigInteger(String.valueOf(today.getJulianDayNumber())));
		wikimgr.saveContentToXMI();

		// One day = 2secs
		Timer t1 = new Timer(2000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				today = today.addDay(1);
				wikimgr.wikipedia.setCurrentDateJD(new BigInteger(String.valueOf(today.getJulianDayNumber())));
				wikipediaRoot.setUserObject("Wikipedia - (Date-Julian: " + today.getJulianDayNumber()
						+ ", Date-Calendar: " + today.toString("YYYY.MM.DD") + ")");
				((DefaultTreeModel) tree.getModel()).nodeChanged(wikipediaRoot);
				wikimgr.saveContentToXMI();
			}
		});
		t1.start();

		// init toolbar
		createToolBar();

		// HTML preview panel
		contentEditorPane = new JEditorPane();
		contentEditorPane.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(contentEditorPane);
		HTMLEditorKit kit = new HTMLEditorKit();
		contentEditorPane.setEditorKit(kit);

		String htmlString = "<html><body><h1>No content selected!</h1><p>Select a content from the index or enter a URI in the address bar!</p></body></html>";
		Document doc = kit.createDefaultDocument();
		contentEditorPane.setDocument(doc);
		contentEditorPane.setText(htmlString);

		// init table model for page index
		/*
		 * ContentTableModel model = new ContentTableModel(contentmgr);
		 * indexTable = new JTable(model);
		 * 
		 * indexTable.getSelectionModel().addListSelectionListener(new
		 * ListSelectionListener() {
		 * 
		 * @Override public void valueChanged(ListSelectionEvent event) { if
		 * (indexTable.getSelectedRow() > -1) { String title = (String)
		 * indexTable.getValueAt(indexTable.getSelectedRow(), 2); Content
		 * selectedContent = contentmgr.getContentByTitle(title);
		 * contentEditorPane.setText(selectedContent.renderHTML());
		 * contentEditorPane.repaint(); // activate edit button
		 * editContent.setEnabled(true);
		 * versionHistoryPane.setText(selectedContent.getVersionhistory().
		 * renderHTML()); versionHistoryPane.repaint(); } } });
		 */
		// init discussion and version area

		wikipediaRoot = new DefaultMutableTreeNode("Wikipedia - (Date-Julian: " + today.getJulianDayNumber()
				+ ", Date-Calendar: " + today.toString("YYYY.MM.DD") + ")");
		createUserContentTree(wikipediaRoot, wikimgr.wikipedia);

		treeModel = new DefaultTreeModel(wikipediaRoot);

		treeModel.addTreeModelListener(new WikipediaIndexTreeModelListener());

		tree = new JTree(treeModel);
		tree.setEditable(false);
		tree.addMouseListener(ml);
		JScrollPane index = new JScrollPane(tree);

		// create split pane and add to the frame
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, index, scrollPane);
		splitPane.setResizeWeight(.5d);
		add(splitPane, BorderLayout.CENTER);

		setTitle("WikiApplication (Logged in as: " + author + ")");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	private void createUserContentTree(DefaultMutableTreeNode wikipediaRoot, Wikipedia wikipedia) {
		DefaultMutableTreeNode content = new DefaultMutableTreeNode("Content");
		wikipediaRoot.add(content);
		user = new DefaultMutableTreeNode("User");
		wikipediaRoot.add(user);
		Iterator<Content> contentElements = wikipedia.getContent().iterator();
		article = new DefaultMutableTreeNode("Articles");
		content.add(article);
		media = new DefaultMutableTreeNode("Media");
		content.add(media);
		internal = new DefaultMutableTreeNode("Internal");
		content.add(internal);
		while (contentElements.hasNext()) {
			Content contentElement = (Content) contentElements.next();
			if (contentElement instanceof Article)
				article.add(new DefaultMutableTreeNode(contentElement.getTitle()));
			if (contentElement instanceof Media)
				media.add(new DefaultMutableTreeNode(contentElement.getTitle()));
			if (contentElement instanceof InternalContent)
				internal.add(new DefaultMutableTreeNode(contentElement.getTitle()));
		}
		Iterator<User> userElements = wikipedia.getUser().iterator();
		while (userElements.hasNext()) {
			User userElement = (User) userElements.next();
			String userName = "";
			if (userElement instanceof UnregisteredUser) {
				userName = ((UnregisteredUser) userElement).getIPAddress();
			} else {
				userName = ((RegisteredUser) userElement).getUserName();
			}

			if (userElement.equals(author)) {
				user.add(new DefaultMutableTreeNode("<html><b>" + userName + "</b></html>"));
			} else {
				user.add(new DefaultMutableTreeNode(userName));
			}

		}

	}

	private void createToolBar() {

		JToolBar toolbar = new JToolBar();
		/*
		 * JTextField searchCreateContent = new JTextField(
		 * "SEARCH/CREATE ARTICLE", 10);
		 * searchCreateContent.addFocusListener(new
		 * java.awt.event.FocusAdapter() { public void
		 * focusGained(java.awt.event.FocusEvent evt) {
		 * SwingUtilities.invokeLater(new Runnable() {
		 * 
		 * @Override public void run() { searchCreateContent.selectAll(); } });
		 * } }); toolbar.add(searchCreateContent); /*
		 * searchCreateContent.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { String title =
		 * searchCreateContent.getText(); Content content =
		 * contentmgr.getContentByTitle(title); if (content == null) {
		 * contentmgr.createNewContent(title, "", author, Article.class);
		 * indexTable.setModel(new ContentTableModel(contentmgr));
		 * indexTable.repaint(); }
		 * contentEditorPane.setText(contentmgr.getContentByTitle(title).
		 * renderHTML()); contentEditorPane.repaint(); // activate edit button
		 * editContent.setEnabled(true);
		 * 
		 * } });
		 */

		addArticle = new JButton("ADD ARTICLE");
		addArticle.setEnabled(true);
		toolbar.add(addArticle);

		addArticle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String articleTitle = "";
				while (articleTitle.length() == 0 || wikimgr.getContentByTitle(articleTitle) != null) {
					articleTitle = (String) JOptionPane.showInputDialog(new JFrame(), "Article title",
							"Wikipedia Dialog", JOptionPane.PLAIN_MESSAGE, null, null, articleTitle);
				}
				// create element and store in XMI
				wikimgr.createNewContent(articleTitle, "=" + articleTitle + "=", author, Article.class);
				article.add(new DefaultMutableTreeNode(articleTitle));
				treeModel.reload();
			}
		});

		addMedia = new JButton("ADD MEDIA");
		addMedia.setEnabled(true);
		toolbar.add(addMedia);

		addMedia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String mediaTitle = "";
				while (mediaTitle.length() == 0 || wikimgr.getContentByTitle("File:" + mediaTitle) != null) {
					mediaTitle = (String) JOptionPane.showInputDialog(new JFrame(), "Media title", "Wikipedia Dialog",
							JOptionPane.PLAIN_MESSAGE, null, null, mediaTitle);
				}
				// create element and store in XMI
				wikimgr.createNewContent("File:" + mediaTitle, null, author, Media.class);
				media.add(new DefaultMutableTreeNode("File:" + mediaTitle));
				treeModel.reload();
			}

		});

		addInternal = new JButton("ADD INTERNAL");
		addInternal.setEnabled(true);
		toolbar.add(addInternal);

		addInternal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String internalTitle = "";
				while (internalTitle.length() == 0 || wikimgr.getContentByTitle("Internal:" + internalTitle) != null) {
					internalTitle = (String) JOptionPane.showInputDialog(new JFrame(), "Internal title",
							"Wikipedia Dialog", JOptionPane.PLAIN_MESSAGE, null, null, internalTitle);
				}
				// create element and store in XMI
				wikimgr.createNewContent("Internal:" + internalTitle, null, author, InternalContent.class);
				internal.add(new DefaultMutableTreeNode("Internal:" + internalTitle));
				treeModel.reload();
			}

		});

		registerUser = new JButton("REGISTER USER");
		registerUser.setEnabled(true);
		toolbar.add(registerUser);

		registerUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String userName = "";
				while (userName.length() == 0 || wikimgr.getUserByUserName(userName) != null) {
					userName = (String) JOptionPane.showInputDialog(new JFrame(), "Registered User", "Wikipedia Dialog",
							JOptionPane.PLAIN_MESSAGE, null, null, userName);
				}
				// create element and store in XMI
				wikimgr.createNewRegisteredUser(userName);
				user.add(new DefaultMutableTreeNode(userName));
				treeModel.reload();
			}

		});

		editContent = new JButton("EDIT CONTENT");
		editContent.setEnabled(false);
		toolbar.add(editContent);

		editContent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				contentEditorPane
						.setText(wikimgr.getContentByTitle(tree.getSelectionPath().getLastPathComponent().toString())
								.getCurrentRevision().getContent().toString());

				contentEditorPane.setEditable(true);
				saveChanges.setEnabled(true);
				contentEditorPane.repaint();
			}
		});

		saveChanges = new JButton("SAVE CHANGES");
		saveChanges.setEnabled(false);
		toolbar.add(saveChanges);

		saveChanges.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				contentEditorPane.setEditable(false);
				String newContent;
				try {
					newContent = contentEditorPane.getDocument().getText(0,
							contentEditorPane.getDocument().getLength());
					wikimgr.createNewRevision(tree.getSelectionPath().getLastPathComponent().toString(), newContent,
							author);
					contentEditorPane
							.setText(wikimgr.renderContent(tree.getSelectionPath().getLastPathComponent().toString()));
					contentEditorPane.repaint();
					saveChanges.setEnabled(false);
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;

			}
		});

		/*
		 * JButton removeContentButton = new JButton("REMOVE ALL CONTENT");
		 * toolbar.add(removeContentButton);
		 * 
		 * removeContentButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent event) {
		 * contentmgr.removeAllContent(); indexTable.setModel(new
		 * ContentTableModel(contentmgr)); indexTable.repaint(); } });
		 * 
		 * JButton exitButton = new JButton("EXIT"); toolbar.add(exitButton);
		 * 
		 * exitButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent event) {
		 * System.exit(0); } });
		 */

		add(toolbar, BorderLayout.NORTH);
	}

	MouseListener ml = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
			if (selPath != null) {
				if (e.getClickCount() == 2) {
					DefaultMutableTreeNode node = ((DefaultMutableTreeNode) selPath.getLastPathComponent());
					if (node.isLeaf() && node.getParent().equals(user)) {
						author = wikimgr.getUserByUserName(selPath.getLastPathComponent().toString());
						setTitle("WikiApplication (Logged in as: " + author + ")");
					}
					if (node.isLeaf() && node.getParent().equals(article)) {
						contentEditorPane.setText(wikimgr.renderContent(selPath.getLastPathComponent().toString()));
						contentEditorPane.repaint();
						editContent.setEnabled(true);
					}
				}
			} else {

			}

		}
	};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				WikiApplicationUI ex = new WikiApplicationUI();
				ex.setVisible(true);
			}
		});
	}
}
