/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/package at.ac.univie.swa.ase2015.a9902268.task1.model.application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import at.ac.univie.swa.ase2015.a9902268.task1.model.Article;
import at.ac.univie.swa.ase2015.a9902268.task1.model.Content;
import at.ac.univie.swa.ase2015.a9902268.task1.model.User;

public class WikiApplicationUI extends JFrame {

	ContentManager contentmgr = new ContentManager();
	JTable indexTable;
	JButton editContent;
	JEditorPane contentEditorPane;
	JEditorPane versionHistoryPane;
	User author = new User(System.getProperty("user.name"));
	private static final long serialVersionUID = -7071509208050710875L;

	public WikiApplicationUI() {

		initUI();
	}

	private void initUI() {

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
		ContentTableModel model = new ContentTableModel(contentmgr);
		indexTable = new JTable(model);

		indexTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (indexTable.getSelectedRow() > -1) {
					String title = (String) indexTable.getValueAt(indexTable.getSelectedRow(), 2);
					Content selectedContent = contentmgr.getContentByTitle(title);
					contentEditorPane.setText(selectedContent.renderHTML(false));
					contentEditorPane.repaint();
					// activate edit button
					editContent.setEnabled(true);
					versionHistoryPane.setText(selectedContent.getVersionHistory()
							.renderHTML(selectedContent.getRevisions(), selectedContent.getCurrentRevision()));
					versionHistoryPane.repaint();
				}
			}
		});

		// init discussion and version area
		versionHistoryPane = new JEditorPane();
		versionHistoryPane.setEditable(false);
		JScrollPane version = new JScrollPane(versionHistoryPane);
		versionHistoryPane.setEditorKit(kit);
		Document versionDoc = kit.createDefaultDocument();
		versionHistoryPane.setDocument(versionDoc);
		versionHistoryPane.setText(htmlString);

		JScrollPane index = new JScrollPane(indexTable);

		// create split pane and add to the frame
		JSplitPane versionIndex = new JSplitPane(JSplitPane.VERTICAL_SPLIT, index, version);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				versionIndex, scrollPane);
		versionIndex.setResizeWeight(.5d);
		splitPane.setResizeWeight(.5d);
		add(splitPane, BorderLayout.CENTER);

		setTitle("WikiApplication (Logged in as: " + author.getUserName() + ")");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	private void createToolBar() {

		JToolBar toolbar = new JToolBar();
		JTextField searchCreateContent = new JTextField("SEARCH/CREATE ARTICLE", 10);
		searchCreateContent.addFocusListener(new java.awt.event.FocusAdapter() {
		    public void focusGained(java.awt.event.FocusEvent evt) {
		        SwingUtilities.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		            	searchCreateContent.selectAll();
		            }
		        });
		    }
		});
		toolbar.add(searchCreateContent);
		searchCreateContent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String title = searchCreateContent.getText();
				Content content = contentmgr.getContentByTitle(title);
				if (content == null) {
					contentmgr.createNewContent(title, "", author, Article.class);
					indexTable.setModel(new ContentTableModel(contentmgr));
					indexTable.repaint();
				}
				contentEditorPane.setText(contentmgr.getContentByTitle(title).renderHTML(false));
				contentEditorPane.repaint();
				// activate edit button
				editContent.setEnabled(true);

			}
		});

		editContent = new JButton("EDIT CONTENT");
		editContent.setEnabled(false);
		toolbar.add(editContent);

		editContent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (indexTable.getSelectedRow() > -1) {
					String title = (String) indexTable.getValueAt(indexTable.getSelectedRow(), 2);
					Content selectedContent = contentmgr.getContentByTitle(title);
					if (editContent.getText().equals("EDIT CONTENT")) {
						contentEditorPane.setText(selectedContent.renderHTML(true));
						contentEditorPane.setEditable(true);
						contentEditorPane.repaint();
						editContent.setText("SAVE AND READ CONTENT");
						editContent.repaint();
					} else {
						editContent.setText("EDIT CONTENT");
						editContent.repaint();
						
						contentmgr.createNewRevision(title, contentEditorPane.getText(), author);
						contentEditorPane.setText(selectedContent.renderHTML(false));
						contentEditorPane.setEditable(false);
						contentEditorPane.repaint();
						indexTable.setModel(new ContentTableModel(contentmgr));
						indexTable.repaint();
						versionHistoryPane.setText(selectedContent.getVersionHistory()
								.renderHTML(selectedContent.getRevisions(), selectedContent.getCurrentRevision()));
						versionHistoryPane.repaint();
					}
				}

			}
		});

		JButton addDummyContent = new JButton("ADD DUMMY CONTENT");
		toolbar.add(addDummyContent);

		addDummyContent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				contentmgr.createDummyContent();
				indexTable.setModel(new ContentTableModel(contentmgr));
				indexTable.repaint();
			}
		});

		JButton removeContentButton = new JButton("REMOVE ALL CONTENT");
		toolbar.add(removeContentButton);

		removeContentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				contentmgr.removeAllContent();
				indexTable.setModel(new ContentTableModel(contentmgr));
				indexTable.repaint();
			}
		});

		JButton exitButton = new JButton("EXIT");
		toolbar.add(exitButton);

		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		add(toolbar, BorderLayout.NORTH);
	}

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
