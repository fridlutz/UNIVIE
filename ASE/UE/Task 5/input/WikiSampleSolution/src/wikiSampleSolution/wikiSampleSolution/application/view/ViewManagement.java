package wikiSampleSolution.wikiSampleSolution.application.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;

import wikiSampleSolution.wikiSampleSolution.application.controller.ControllerManagement;

import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;

import wikiSampleSolution.main.Main;
import wikiSampleSolution.wikiSampleSolution.Article;
import wikiSampleSolution.wikiSampleSolution.Content;
import wikiSampleSolution.wikiSampleSolution.RegisteredUser;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;
import wikiSampleSolution.wikiSampleSolution.Wiki;

import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;

//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.Media;
//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.Movie;
//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.NetflixFactory;
//import at.ac.univie.swa.ase2014.a0123456.task1.model.netflix.StreamingLibrary;

public class ViewManagement extends JFrame implements ActionListener{

	//private JTable table;
	//private String[] columnNames = {"Name", "Length"};
	//private DefaultTableModel tableModel = new DefaultTableModel(null,columnNames);
	
	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private IGenerator generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;
	

	private JTextPane textPane = new JTextPane();
	private JScrollPane scrollPane = new JScrollPane(textPane);
	private JTextField articleTitle = new JTextField();
	
	private Object[] message = {
		    "Title:", articleTitle,
		    "MarkupText:", scrollPane
		};
	
	
	private JTextField userName = new JTextField();
	private JPasswordField password = new JPasswordField();
	
	private Object[] message_user = {
		    "User name:", userName,
	};
	
	private JButton newReadBtn = new JButton("Read");
	private JButton newEditBtn = new JButton("Edit");	
	private JButton newRegistredUserBtn = new JButton("Register");
	private JButton newArticleBtn = new JButton("New Article");
	private JButton editArticleBtn = new JButton("Edit Article");
	private JButton removeArticleBtn = new JButton("Remove Article");
	private JButton showArticleBtn = new JButton("Show Article");
	private JButton showHistoryBtn = new JButton("Show History");
	private JButton newSaveBtn = new JButton("Save");
	private JButton newExportJSONBtn = new JButton("Export to JSON");
	
	// to be edited by EditCobtentView class
	private JTextPane editTextPane = new JTextPane();
	private JScrollPane editScrollPane=new JScrollPane(editTextPane);
	JEditorPane read_jEditorPane = new JEditorPane();
	private JScrollPane readScrollPane=new JScrollPane(read_jEditorPane);
	
	private JTabbedPane tabbedPane=new JTabbedPane();
	private JPanel panel1=new JPanel();
	private JPanel panel2 = new JPanel(new BorderLayout());
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	
	private String[] columnNames = {"Title","MarkupText"};
	private DefaultTableModel tableModel = new DefaultTableModel(null,columnNames)//used to make a table non-editable
	{

		@Override
	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	private JTable table=new JTable(tableModel);
	
	//history table
	private String[] columnNames_history = {"Title","MarkupText","Date","EditedBy"};
	private DefaultTableModel tableModel_history = new DefaultTableModel(null,columnNames_history)//used to make a table non-editable
	{

		@Override
	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	private JTable table_history=new JTable(tableModel_history);
	
	//users table
	private String[] columnNames_users = {"Registered Users"};
	private DefaultTableModel tableModel_users = new DefaultTableModel(null, columnNames_users)//used to make a table non-editable
	{

		@Override
	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	private JTable table_users=new JTable(tableModel_users);
	
	//private JButton removeMovieBtn = new JButton("Remove");
	//private JButton updateMovieBtn = new JButton("Update");
	
	private ControllerManagement controller;
	
	public ViewManagement() {
		
	}
	
		
	
	public ViewManagement (ControllerManagement controller_inst){
		
		controller=controller_inst;
		
				
		tabbedPane.addTab("Articles", panel1);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		//add a table with articles in the given tab
		panel1.add(new JScrollPane(table),BorderLayout.CENTER);
		populateTable();
		
		panel1.add(new JScrollPane(table_users),BorderLayout.SOUTH);
		populateTable_users();
		
		//add buttons for the table editing 
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(newArticleBtn);
		newArticleBtn.addActionListener(this);
		panel.add(editArticleBtn);
		editArticleBtn.addActionListener(this);
		panel.add(removeArticleBtn);
		removeArticleBtn.addActionListener(this);
		panel.add(showArticleBtn);
		showArticleBtn.addActionListener(this);
		panel.add(showHistoryBtn);
		showHistoryBtn.addActionListener(this);
		panel.add(newExportJSONBtn);
		newExportJSONBtn.addActionListener(this);		
		panel1.add(panel, BorderLayout.SOUTH);
		

		
		tabbedPane.addTab("Edit", panel2);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		editTextPane.getDocument().addDocumentListener(documentListener);
		//editTextPane.setMinimumSize(new Dimension (600,400));
		//editScrollPane.setSize(new Dimension (300,200));
		panel2.add(editScrollPane, BorderLayout.CENTER);
		panel2.add(newSaveBtn,BorderLayout.SOUTH);
		//newSaveBtn.setSize(new Dimension (30,20));
		//panel2.setSize(new Dimension (700,500));
		newSaveBtn.addActionListener(this);
		tabbedPane.setEnabledAt(1, false);		
		
		
		tabbedPane.addTab("Read",readScrollPane);
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
		tabbedPane.setEnabledAt(2, false);
		//panel3.add(readScrollPane);
		
		
		tabbedPane.addTab("Register", panel4);
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		//tabbedPane.setEnabledAt(3, false);
		panel4.add(newRegistredUserBtn);
		newRegistredUserBtn.addActionListener(this);
		
		
		tabbedPane.addTab("History", panel5);
		tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
		//add a table with articles in the given tab
		panel5.add(new JScrollPane(table_history),BorderLayout.CENTER);
		tabbedPane.setEnabledAt(4, false);
				
		
		//controller.setStreamingLibrary(streamingLibrary);
		
		this.setTitle("Wkipedia");

		this.setLayout(new BorderLayout());
		//2. Optional: What happens when the frame closes?
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		this.add(tabbedPane);
		
		
		
		//table = new JTable(tableModel);
		//this.add(new JScrollPane(table),BorderLayout.CENTER);
		
		/*JPanel panel = new JPanel(new FlowLayout());
		panel.add(newReadBtn);
		newReadBtn.addActionListener(this);
		panel.add(newEditBtn);
		newEditBtn.addActionListener(this);
		panel.add(newRegistredUserBtn);
		newRegistredUserBtn.addActionListener(this);*/
		
		
					
		//panel.add(updateMovieBtn);
		//updateMovieBtn.addActionListener(this);
		//panel.add(removeMovieBtn);
		//removeMovieBtn.addActionListener(this);
		
		
				
		
		this.setSize(800,600);
		//4. Size the frame.
		//this.pack();

		//5. Show it.
		this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		if(newArticleBtn == arg0.getSource()){
			int option = JOptionPane.showConfirmDialog(null, message, "New Article", JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
			    Article article = WikiSampleSolutionFactory.eINSTANCE.createArticle();
			    controller.assign_ID(article);
			    article.setTtile(articleTitle.getText());
			    article.setContentMarkup(textPane.getText());
			    controller.addContent(article);
			    populateTable();
			}
			return;
		}
				
		else if(newRegistredUserBtn == arg0.getSource()){
			int option = JOptionPane.showConfirmDialog(null, message_user, "New User", JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				RegisteredUser user = WikiSampleSolutionFactory.eINSTANCE.createRegisteredUser();
				controller.assign_ID(user);
				user.setUsername(userName.getText());
				
				controller.setLastRegisteredUser(user);
		
			    controller.enable_user_actions(user, this);
			    
			    populateTable_users();
			}
			return;
		}
		else if(newExportJSONBtn == arg0.getSource())
		{
			controller.json_export();
			controller.write_json_file();
		}
		//when no rows in the table are selected
		else if(table.getSelectedRow() == -1){
			JOptionPane.showConfirmDialog(null, new JLabel("No row selected"), "Error", JOptionPane.CANCEL_OPTION);
			return;
		}
		else if(showHistoryBtn == arg0.getSource()){
			
			populateTable_history(table.getSelectedRow());
			tabbedPane.setEnabledAt(4, true);
			tabbedPane.setSelectedComponent(panel5);
			
		}
		else if(editArticleBtn == arg0.getSource()){
						
			editTextPane.setText((String) tableModel.getValueAt(table.getSelectedRow(), 1));
			//editScrollPane.setSize(600, 400);
			tabbedPane.setEnabledAt(1, true);
			tabbedPane.setEnabledAt(2, false);
			//tabbedPane.setEnabledAt(3, false);
			tabbedPane.setEnabledAt(0, false);
			tabbedPane.setSelectedComponent(panel2);
			
			
			//tabbedPane.revalidate();
			//tabbedPane.repaint();
			return;
						
						
			
		}
		else if(newSaveBtn == arg0.getSource()){
			
			String title_before=(String) tableModel.getValueAt(table.getSelectedRow(), 0);
			String markup_before=(String) tableModel.getValueAt(table.getSelectedRow(), 1);
			String markup_update=editTextPane.getText();
			
			//updating history of the selected article
			controller.updateHistory(table.getSelectedRow(),title_before, markup_update);
			
			controller.updateContent(table.getSelectedRow(),title_before , markup_update);
			populateTable();
			
			//call xtext generators
			Injector injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
			ViewManagement main = injector.getInstance(ViewManagement.class);
			//create a file with the markup text and pass it to the model below
			try {
				PrintWriter markup_file = new PrintWriter("markup.mydsl", "UTF-8");
				markup_file.println(editTextPane.getText());
				markup_file.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
						
			main.runGenerator("markup.mydsl");
			
			tabbedPane.setEnabledAt(0, true);
			tabbedPane.setEnabledAt(1, false);
			tabbedPane.setSelectedComponent(panel1);
			
			return;
			
		}
		else if(newReadBtn == arg0.getSource()){
			
			
			
		}
								
		else if(removeArticleBtn == arg0.getSource()){
			int index = table.getSelectedRow();
			controller.removeContent(index);
			populateTable();
			clearTable_history();
			
			tabbedPane.setEnabledAt(1, false);
			tabbedPane.setEnabledAt(2, false);
			//tabbedPane.setEnabledAt(3, false);
			
			return;
		}
		//this is editing in a separate jframe
		/*else if(editArticleBtn == arg0.getSource()){
			this.articleTitle.setText((String)tableModel.getValueAt(table.getSelectedRow(), 0));
			this.textPane.setText((String) tableModel.getValueAt(table.getSelectedRow(), 1));
			int option = JOptionPane.showConfirmDialog(null, message, "Update movie", JOptionPane.OK_CANCEL_OPTION);
			int index = table.getSelectedRow();
			controller.removeContent(controller.getContent().get(index));
			if (option == JOptionPane.OK_OPTION) {
				Article article = WikiSampleSolutionFactory.eINSTANCE.createArticle();
			    article.setTtile(articleTitle.getText());
			    article.setContentMarkup(textPane.getText());
			    controller.addContent(article);
			    
			}
			populateTable();
			return;
		}*/
		else if(showArticleBtn == arg0.getSource()){
			
			//show wiki.html from src-gen/ folder generated with xtext generators
			
			String title=(String) tableModel.getValueAt(table.getSelectedRow(), 0);
			String markup_text=(String) tableModel.getValueAt(table.getSelectedRow(), 1);
					
			
			//call xtext generators
			Injector injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
			ViewManagement main = injector.getInstance(ViewManagement.class);
			//create a file with the markup text and pass it to the model below
			try {
				PrintWriter markup_file = new PrintWriter("markup.mydsl", "UTF-8");
				markup_file.println(markup_text);
				markup_file.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
						
			main.runGenerator("markup.mydsl");			
			//visualize a generated HTML page using jEditorPane
			
			read_jEditorPane.setSize(600, 500);
	        read_jEditorPane.setEditable(false);
	        
	        	        	        
	        // add an html editor kit
	        HTMLEditorKit kit = new HTMLEditorKit();
	        read_jEditorPane.setEditorKit(kit);
	        
	        //reading the wiki.html file created by xtext generators
	        String content=null;
			try {
				content = Main.readFile("src-gen/wiki.html", StandardCharsets.UTF_8);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        // create a document, set it on the jeditorpane, then add the html
	        Document doc = kit.createDefaultDocument();
	        read_jEditorPane.setDocument(doc);
	        read_jEditorPane.setText(content);
	        
	      //add a hyperlink listener used to navigate among the pages in the view
	        read_jEditorPane.addHyperlinkListener(new HyperlinkListener() {
	            public void hyperlinkUpdate(HyperlinkEvent e) {
	                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
	                    if(Desktop.isDesktopSupported()) {
	                    	try {
	                    	      URL url = new URL(e.getURL().toString());
	                    	      read_jEditorPane.setPage(url);
	                    	      //mURLField.setText(url.toExternalForm());
	                    	    } catch (Exception except) {
	                    	      System.out.println("Couldn't open " + e.getURL() + ":" + except);
	                    	    }
	                    	//the commented code below opens URI in a browser
	                        /*try {
	                            Desktop.getDesktop().browse(e.getURL().toURI());
	                        }
	                        catch (IOException | URISyntaxException e1) {
	                            e1.printStackTrace();
	                        }*/
	                    }
	                }
	            }
	        }
	        );
	        
			tabbedPane.setSelectedComponent(readScrollPane);
			tabbedPane.setEnabledAt(2, true);
			
			return;
		}
		
		
	}
	private void populateTable(){
		tableModel.setRowCount(0);
		for(Content content: controller.getContent()){
			tableModel.addRow(new Object[]{content.getTtile(), content.getContentMarkup()});
		}
		
	}
	private void populateTable_users(){
		tableModel_users.setRowCount(0);
		for(User user: controller.getUsers()){
			tableModel_users.addRow(new Object[]{((RegisteredUser)user).getUsername()});
		}
		
	}
	private void clearTable_history(){
		tableModel_history.setRowCount(0);
	}
	
	private void populateTable_history(int index){
		tableModel_history.setRowCount(0);
		List<Version> list_of_versions=controller.getHistory(index);
		List<Content> list_of_articles=controller.getContent();
		
		for(Version version: list_of_versions){
			
			String editedBy="Unregistered User";
			if((RegisteredUser)(version.getEditedBy())!=null)
			{
				editedBy=((RegisteredUser)(version.getEditedBy())).getUsername();
			}
			tableModel_history.addRow(new Object[]{list_of_articles.get(index).getTtile(), version.getDiff(), version.getTimestamp(), editedBy});
		}
		
	}
	
		
	public void enable_registered_actions()
	{
		newArticleBtn.setEnabled(false);
		removeArticleBtn.setEnabled(false);
		showArticleBtn.setEnabled(true);
		editArticleBtn.setEnabled(true);
	}
	
	public void enable_autoconfirmed_actions()
	{
		newArticleBtn.setEnabled(true);
		removeArticleBtn.setEnabled(false);
		showArticleBtn.setEnabled(true);
		editArticleBtn.setEnabled(true);
	}
	public void enable_admin_actions()
	{
		newArticleBtn.setEnabled(true);
		removeArticleBtn.setEnabled(true);
		showArticleBtn.setEnabled(true);
		editArticleBtn.setEnabled(true);
	}
	public void enable_sysop_actions()
	{
		newArticleBtn.setEnabled(true);
		removeArticleBtn.setEnabled(true);
		showArticleBtn.setEnabled(true);
		editArticleBtn.setEnabled(true);
	}
	public void enable_unregistered_actions()
	{
		newArticleBtn.setEnabled(false);
		removeArticleBtn.setEnabled(false);
		showArticleBtn.setEnabled(true);
		editArticleBtn.setEnabled(true);
	}
	
	
	//adding text area document listener
	public DocumentListener documentListener = new DocumentListener() {
	      public void changedUpdate(DocumentEvent documentEvent) {
	        //printIt(documentEvent);
	      }
	      public void insertUpdate(DocumentEvent documentEvent) {
	        printIt(documentEvent);
	      }
	      public void removeUpdate(DocumentEvent documentEvent) {
	        printIt(documentEvent);
	      }
	      private void printIt(DocumentEvent documentEvent) {
	        DocumentEvent.EventType type = documentEvent.getType();
	        String typeString = null;
	        if (type.equals(DocumentEvent.EventType.CHANGE)) {
	          typeString = "Change";
	        }  else if (type.equals(DocumentEvent.EventType.INSERT)) {
	          typeString = "Insert";
	        }  else if (type.equals(DocumentEvent.EventType.REMOVE)) {
	          typeString = "Remove";
	        }
	        System.out.print("Type : " + typeString);
	        Document source = documentEvent.getDocument();
	        int length = source.getLength();
	        System.out.println("Length: " + length);
	      }
	    };
    protected void runGenerator(String string) {
	    // load the resource
	    ResourceSet set = resourceSetProvider.get();
	    Resource resource = set.getResource(URI.createURI(string), true);

	    List<Issue> list = validator.validate(resource, CheckMode.ALL,
	            CancelIndicator.NullImpl);
	    if (!list.isEmpty()) {
	        for (Issue issue : list) {
	            System.err.println(issue);
	        }
	        System.exit(-1);
	    }

	    // configure and start the generator
	    fileAccess.setOutputPath("src-gen/");
	    generator.doGenerate(resource, fileAccess);

	    System.out.println("Code generation finished.");
	}    
}
