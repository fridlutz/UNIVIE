/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.application;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import at.ac.univie.swa.ase2014.a1100570.task1.model.Content;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Movie;
import at.ac.univie.swa.ase2014.a1100570.task1.model.Music;
import at.ac.univie.swa.ase2014.a1100570.task1.model.TvSeries;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.Vector;

public class Application extends JPanel {
	
	private static final long serialVersionUID = -1561293184946713167L;
	//Controller
	private Controller controller;
		
	//important  view components for easy access
	private static JFrame frame;
	private Vector<String> colNamesSL;
	private Vector<String> colNamesAC;
	private Vector<String> colNamesPR;
	private JTable tableSL;
	private JButton c1;
	private JButton d1;
	private JTable tableAC;
	private JButton c2;
	private JButton d2;
	private JTable tablePR;
	private JButton c3;
	private JButton d3;

	public Application() throws ParseException {
		controller=new Controller(this);
		controller.createTestData();
		initView();
		createView();
	}
	
	public void initView(){
		colNamesSL=new Vector<String>();
		colNamesSL.add("ID");
		colNamesSL.add("Name");
		colNamesSL.add("Inhouse");
		colNamesSL.add("Type");
		
		colNamesAC=new Vector<String>();
		colNamesAC.add("ID");
		colNamesAC.add("Trial");
		colNamesAC.add("Registration Date");
		colNamesAC.add("Trial Expiration Date");
		colNamesAC.add("Amount of Profiles");
		
		colNamesPR=new Vector<String>();
		colNamesPR.add("ID Account");
		colNamesPR.add("ID Profile");
		colNamesPR.add("Name");
		
		tableSL = new JTable(controller.getDataSL(),colNamesSL);
		tableSL.getTableHeader().setReorderingAllowed(false);
		tableAC = new JTable(controller.getDataAC(),colNamesAC);
		tableAC.getTableHeader().setReorderingAllowed(false);
		tablePR = new JTable(controller.getDataPR(),colNamesPR);
		tablePR.getTableHeader().setReorderingAllowed(false);
	}
	
	public void createView() throws ParseException{

		
		//pane with 2 tabs
		JTabbedPane generalTabPane = new JTabbedPane();
		JTabbedPane smTabPane = new JTabbedPane();
				
		//first tab
		JPanel tab1 = new JPanel();
		tab1.setLayout(new BorderLayout());

		//table
		
		JScrollPane tableContainer = new JScrollPane(tableSL);
		tableSL.getModel().addTableModelListener(new TableModelListener() {
			  @Override
		      public void tableChanged(TableModelEvent e) {
				  if(e.getType()==0)
					  controller.updateSL(e.getFirstRow(),e.getColumn());
		      }
		});
		
		//disable table when user tries to modify class name
		tableSL.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent evt) {
		        int col = tableSL.columnAtPoint(evt.getPoint());
		        if (col == 3)
		        	tableSL.setEnabled(false);
		        else
		        	tableSL.setEnabled(true);
		    }
		});
		        
		//buttons
		JPanel group = new JPanel();
		group.setLayout(new BoxLayout(group, BoxLayout.Y_AXIS));
		c1=new JButton("create");
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JPanel pan=new JPanel();
				pan.setLayout(new FlowLayout());
				
				JLabel lid=new JLabel("ID:");
			    JLabel ln=new JLabel("Name:");
			    JLabel li=new JLabel("Inhome:");
			    JLabel lt=new JLabel("Type:");
			    final JTextField tn=new JTextField();
			    tn.setColumns(5);
			    final JTextField tid=new JTextField();
			    tid.setColumns(5);
			    final JCheckBox cb=new JCheckBox();
			    Vector<String> entries=new Vector<String>();
			    entries.add("Music");
			    entries.add("Movies");
			    entries.add("TvSeries");

			    final JComboBox combo=new JComboBox(entries);
			    JButton create=new JButton("Create");
			    
				create.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(!tn.getText().equals("") && !tid.getText().equals("")){
							boolean inhome=false;
							if(cb.isSelected())
								inhome=true;
							String name=tn.getText();
							Content c;
							if(combo.getSelectedIndex()==0){
								c=new Music(Integer.parseInt(tid.getText()),name,inhome);
							}
							else if(combo.getSelectedIndex()==1){
								c=new Movie(Integer.parseInt(tid.getText()),name,inhome);
							}
							else{
								c=new TvSeries(Integer.parseInt(tid.getText()),name,inhome);
							}
							controller.createSL(c);
						}
				  }
				});
			    
			    JDialog d = new JDialog(frame, "Create", true);
			    d.setSize(500, 100);
			    pan.add(lid);
			    pan.add(tid);
			    pan.add(ln);
			    pan.add(tn);
			    pan.add(li);
			    pan.add(cb);
			    pan.add(lt);
			    pan.add(combo);
			    pan.add(create);
			    
			    d.add(pan);
			    d.setLocationRelativeTo(frame);
			    d.setVisible(true);
		  }
		});
		d1=new JButton("delete");
		d1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int index=tableSL.getSelectedRow();
				if(index!=-1){
					controller.removeSL(index);
				}
				else{
				    JDialog d = new JDialog(frame, "Error", true);
				    JLabel l=new JLabel("No entry selected to delete!");
				    d.setSize(180, 100);
				    d.add(l);
				    d.setLocationRelativeTo(frame);
				    d.setVisible(true);
				}
		  }
		});
		group.add(c1);
		group.add(d1);
		
		tab1.add(tableContainer, BorderLayout.WEST);
		tab1.add(group, BorderLayout.EAST);
		generalTabPane.addTab("Streaming Library", tab1);
				
		//second tab:inner tab for accounts
		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		//table
		
		JScrollPane tableContainer2 = new JScrollPane(tableAC);
		((DefaultTableModel) tableAC.getModel()).addTableModelListener(new TableModelListener() {
			  @Override
		      public void tableChanged(TableModelEvent e) {
				  if(e.getType()==0)
					try {
						controller.updateAC(e.getFirstRow(),e.getColumn());
					} catch (ParseException e1) {
						throw new IllegalArgumentException();
					}
		      }
		});
		
		//disable table when user tries to modify amount of profiles name
		tableAC.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent evt) {
		        int col = tableAC.columnAtPoint(evt.getPoint());
		        if (col == 4)
		        	tableAC.setEnabled(false);
		        else
		        	tableAC.setEnabled(true);
		    }
		});
		        
		//buttons
		
		JPanel group2 = new JPanel();
		group2.setLayout(new BoxLayout(group2, BoxLayout.Y_AXIS));
		c2=new JButton("create");
		c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JPanel pan=new JPanel();
				pan.setLayout(new FlowLayout());
				
			    JLabel li=new JLabel("Id:");
			    JLabel lt=new JLabel("Trial:");
			    JLabel lr=new JLabel("Registration (dd-mm-yyyy):");
			    JLabel le=new JLabel("Expiration (dd-mm-yyyy):");
			    final JTextField ti=new JTextField();
			    ti.setColumns(2);
			    final JTextField tr=new JTextField();
			    tr.setColumns(6);
			    final JTextField te=new JTextField();
			    te.setColumns(6);
			    final JCheckBox cb=new JCheckBox();

			    JButton create=new JButton("Create");
			    
				create.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(!ti.getText().equals("") && !tr.getText().equals("") && !te.getText().equals("")){
							boolean trial=false;
							if(cb.isSelected())
								trial=true;
							controller.createAC(Integer.parseInt(ti.getText()), trial, tr.getText(),te.getText());
						}
				  }
				});
			    
			    JDialog d = new JDialog(frame, "Create", true);
			    d.setSize(700, 100);
			    pan.add(li);
			    pan.add(ti);
			    pan.add(lt);
			    pan.add(cb);
			    pan.add(lr);
			    pan.add(tr);
			    pan.add(le);
			    pan.add(te);
			    pan.add(create);
			    
			    d.add(pan);
			    d.setLocationRelativeTo(frame);
			    d.setVisible(true);
		  }
		});
		
		d2=new JButton("delete");
		d2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int index=tableAC.getSelectedRow();
				if(index!=-1){
					controller.deleteAC(index);
				}
				else{
				    JDialog d = new JDialog(frame, "Error", true);
				    JLabel l=new JLabel("No entry selected to delete!");
				    d.setSize(180, 100);
				    d.add(l);
				    d.setLocationRelativeTo(frame);
				    d.setVisible(true);
				}
		  }
		});
		group2.add(c2);
		group2.add(d2);

		tab2.add(tableContainer2, BorderLayout.WEST);
		tab2.add(group2, BorderLayout.EAST);
		smTabPane.addTab("Accounts",tab2);
		
		//third tab:inner tab for profiles
		JPanel tab3 = new JPanel();
		tab3.setLayout(new BorderLayout());
		
		//table

		JScrollPane tableContainer3 = new JScrollPane(tablePR);
		((DefaultTableModel) tablePR.getModel()).addTableModelListener(new TableModelListener() {
				@Override
				public void tableChanged(TableModelEvent e) {
					if(e.getType()==0){
						controller.updatePR(e.getFirstRow(),e.getColumn());
					}
				}
		});
		
		//disable table when user tries to modify class name
		tablePR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				int col = tablePR.columnAtPoint(evt.getPoint());
				if (col == 0)
					tablePR.setEnabled(false);
				else
					tablePR.setEnabled(true);
				}
		});
				        
		//buttons
				
		JPanel group3 = new JPanel();
		group3.setLayout(new BoxLayout(group3, BoxLayout.Y_AXIS));
		c3=new JButton("create");
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JPanel pan=new JPanel();
				pan.setLayout(new FlowLayout());
				
			    JLabel lai=new JLabel("Account ID:");
			    JLabel lpi=new JLabel("Profile ID:");
			    JLabel ln=new JLabel("Name:");
			    Vector<String> entries=new Vector<String>();
			    for(int i=0;i<controller.getSm().getAccounts().size();i++){
			    	entries.add(""+controller.getSm().getAccounts().get(i).getId());
			    }

			    final JComboBox ci=new JComboBox(entries);
			    final JTextField tpi=new JTextField();
			    tpi.setColumns(6);
			    final JTextField tn=new JTextField();
			    tn.setColumns(6);

			    JButton create=new JButton("Create");
			    
				create.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(!tpi.getText().equals("") && !tn.getText().equals("")){
							boolean res=controller.createPR(Integer.parseInt(ci.getSelectedItem().toString()), Integer.parseInt(tpi.getText()), tn.getText());
							if(res)
								controller.updateAcAndPrViews();
							else
								JOptionPane.showMessageDialog(null, "Limit Reached!");
						}
				  }
				});
			    
			    JDialog d = new JDialog(frame, "Create", true);
			    d.setSize(700, 100);
			    pan.add(lai);
			    pan.add(ci);
			    pan.add(lpi);
			    pan.add(tpi);
			    pan.add(ln);
			    pan.add(tn);
			    pan.add(create);
			    
			    d.add(pan);
			    d.setLocationRelativeTo(frame);
			    d.setVisible(true);
		  }
		});
		d3=new JButton("delete");
		d3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int index=tablePR.getSelectedRow();
				if(index!=-1){
					controller.deletePR(index);
				}
				else{
				    JDialog d = new JDialog(frame, "Error", true);
				    JLabel l=new JLabel("No entry selected to delete!");
				    d.setSize(180, 100);
				    d.add(l);
				    d.setLocationRelativeTo(frame);
				    d.setVisible(true);
				}
		  }
		});
		group3.add(c3);
		group3.add(d3);

		tab3.add(tableContainer3, BorderLayout.WEST);
		tab3.add(group3, BorderLayout.EAST);
		
		smTabPane.addTab("Profiles", tab3);
		generalTabPane.addTab("Subscription Management", smTabPane);
				
		// Add the tabbed pane to this panel.
		setLayout(new GridLayout(1, 1));
		add(generalTabPane);		
	}
	
	public JTable getTableAC(){
		return tableAC;
	}
	public JTable getTableSL(){
		return tableSL;
	}
	
	public JTable getTablePR(){
		return tablePR;
	}
	
	public static void main(String[] args) throws ParseException {
		
		frame = new JFrame("MOD");
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(new Application(), BorderLayout.CENTER);
		frame.setSize(580, 500);
		frame.setVisible(true);
		
	}
}
