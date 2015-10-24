package at.ac.univie.swa.ase2014.a1276754.task1.application;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import at.ac.univie.swa.ase2014.a1276754.task1.model.*;

public class Library<T> extends JPanel implements TableModelListener{

	private static final long serialVersionUID = 1L;
	AbstractTableModel modell;
	
	public Library(List<T> modelData, String[] columnNames, Class<?> classname) {
        super(new GridLayout(3,0));
        if (classname == Account.class)
        {
        	modell = (modelAccount)new modelAccount((List<Account>)modelData, columnNames);
        }else if (classname == Media.class)
        {
        	modell = (modelMedia)new modelMedia((List<Media>)modelData, columnNames);
        }else if (classname == Profile.class)
        {
        	modell = (modelProfile)new modelProfile((List<Profile>)modelData, columnNames);
        }
        
        final JTable table = new JTable(modell);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        JButton add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	if(modell.getClass() == modelAccount.class)
            		((Library<T>.modelAccount) modell).addRow(new Account());
            	else if(modell.getClass() == modelMedia.class)
            		((Library<T>.modelMedia) modell).addRow(new Movie()); //Music
            	else if(modell.getClass() == modelProfile.class)
            		((Library<T>.modelProfile) modell).addRow(new Profile());
            }
        });
        JButton remove = new JButton("Remove");
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	int row = table.getSelectedRow();
            	if(row != -1)
            		if(modell.getClass() == modelAccount.class)
            			((Library<T>.modelAccount) modell).removeRow(row);
                	else if(modell.getClass() == modelMedia.class)
                		((Library<T>.modelMedia) modell).removeRow(row);
                	else if(modell.getClass() == modelProfile.class)
                		((Library<T>.modelProfile) modell).removeRow(row);
            }
        });
        
        add(add);
        add(remove);        
    }	
	public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        AbstractTableModel model = (AbstractTableModel) e.getSource();
        Object data = model.getValueAt(row, column);
        model.setValueAt(data, row, column);
    }
	class modelAccount extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		protected Boolean[] isColumnEditable;
		private boolean isModelEditable = true;
		protected List<Account> modelData;
    	protected String[] columnNames;
    	
    	protected modelAccount(List<Account> modelData, String[] columnNames)
    	{
    		this.modelData = modelData;
    		this.columnNames = columnNames;
    		isColumnEditable = new Boolean[getColumnCount()];
    		fireTableStructureChanged();
    	}
    	public boolean isCellEditable(int row, int column)
    	{
    		Boolean isEditable = null;

    		if (column < isColumnEditable.length)
    			isEditable = isColumnEditable[column];

    		return (isEditable == null) ? isModelEditable : isEditable.booleanValue();
    	}
    	public void setColumnEditable(int column, boolean isEditable)
    	{
    		isColumnEditable[column] = isEditable ? Boolean.TRUE : Boolean.FALSE;
    	}
    	public int getColumnCount()
    	{
    		return columnNames.length;
    	}
    	public int getRowCount()
    	{
    		return modelData.size();
    	}
        public Object getValueAt(int row, int col) {
        	Account obj = modelData.get( row );
        	Object value;        	
    		switch(col){
    			case 0: value= (int)obj.ID;break;
    			case 1: value= (String)obj.Name;break;
    			case 2: value= (String)obj.Email;break;
    			case 3: value= (String)obj.Passwort;break;
    			case 4: value= (int)obj.bezahlte_Abozeit;break;
    			case 5: value= (String)obj.Land;break;
    			default: value= null;
    		}
//    		System.out.println("Get: "+row+" "+col+" "+value);
        	return value;
    	}
        public Class<?> getColumnClass(int row) {
            Class<?> type = String.class;
            switch (row) {
                case 0:
                	type = Integer.class;
                    break;
                case 4:
                	type = Integer.class;
                    break;
            }
            return type;
        }
    	public String getColumnName(int column)
    	{
    		Object columnName = null;
    		if (column < columnNames.length)
    		{
    			columnName = columnNames[column];
    		}
    		return (columnName == null) ? super.getColumnName( column ) : columnName.toString();
    	}
        public void setValueAt(Object value, int row, int col) {
        	Account obj = modelData.get( row );
    		switch(col){
    			case 0: obj.ID = ((Integer)value);break;
    			case 1: obj.Name = (String)value;break;
    			case 2: obj.Email = (String)value;break;
    			case 3: obj.Passwort = (String)value;break;
    			case 4: obj.bezahlte_Abozeit = (Integer)value;break;
    			case 5: obj.Land = (String)value;break;
    			default: ;
        	}
    		System.out.println("Set: "+row+" "+col+" "+value);
            fireTableCellUpdated(row, col);
        }
        public void removeRow(int row)
        {
        	Account rRow = modelData.get( row );
        	modelData.remove(rRow);
        	fireTableRowsDeleted(row, row);
        }
    	public Account getRow(int row)
    	{
    		return modelData.get( row );
    	}
    	public void insertRow(int row, Account rowData)
    	{
    		modelData.add(row, rowData);
    		fireTableRowsInserted(row, row);
    	}
    	public void addRow(Account rowData)
    	{
    		insertRow(getRowCount(), rowData);
    	}
    }
	class modelMedia extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		
		protected List<Media> modelData;
    	protected String[] columnNames;
		protected Boolean[] isColumnEditable;
		private boolean isModelEditable = true;
    	
    	protected modelMedia(List<Media> modelData, String[] columnNames)
    	{
    		this.modelData = modelData;
    		this.columnNames = columnNames;
    		isColumnEditable = new Boolean[getColumnCount()];
    		fireTableStructureChanged();
    	}
    	public boolean isCellEditable(int row, int column)
    	{
    		Boolean isEditable = null;

    		if (column < isColumnEditable.length)
    			isEditable = isColumnEditable[column];

    		return (isEditable == null) ? isModelEditable : isEditable.booleanValue();
    	}
    	public void setColumnEditable(int column, boolean isEditable)
    	{
    		isColumnEditable[column] = isEditable ? Boolean.TRUE : Boolean.FALSE;
    	}
		public int getColumnCount()
    	{
    		return columnNames.length;
    	}
    	public int getRowCount()
    	{
    		return modelData.size();
    	}
    	public Media getRow(int row)
    	{
    		return modelData.get( row );
    	}
        public Object getValueAt(int row, int col) {
        	Media o = modelData.get( row );
        	Object value;
        	Class cl = o.getClass();
        	cl = cl.getSuperclass();
        	if(cl == StreamingMedia.class){
	        	StreamingMedia obj = (StreamingMedia) modelData.get( row );	        	
	    		switch(col){
	    			case 0: value = obj.ID;break;
	    			case 1: value = obj.Name;break;
	    			case 2: value = obj.Produzent;break;
	    			case 3: value = obj.Groesse;break;
	    			default: value = null;
	    		}
        	}else{
	        	RentalMedia obj = (RentalMedia) modelData.get( row );
	    		switch(col){
	    			case 0: value = obj.ID;break;
	    			case 1: value = obj.Name;break;
	    			case 2: value = obj.Produzent;break;
	    			case 3: value = obj.Anzahl;break;
	    			default: value = null;
	    		}
        	}        		
    		fireTableCellUpdated(row, col);
    		return value;
    	}
        public Class<?> getColumnClass(int row) {
            Class<?> type = String.class;
            switch (row) {
                case 0:
                	type = Integer.class;
                    break;
                case 3:
                	type = Integer.class;
                    break;
            }
            return type;
        }
    	public String getColumnName(int column)
    	{
    		Object columnName = null;
    		if (column < columnNames.length)
    		{
    			columnName = columnNames[column];
    		}
    		return (columnName == null) ? super.getColumnName( column ) : columnName.toString();
    	}
        public void setValueAt(Object value, int row, int col) {
        	Media o = modelData.get( row );
        	Class cl = o.getClass();
        	if(cl == Music.class || cl == Movie.class || cl == TV_Series.class){
	        	StreamingMedia obj = (StreamingMedia) modelData.get( row );	        	
	    		switch(col){
	    			case 0: obj.ID = (int) value;break;
	    			case 1: obj.Name = (String) value;break;
	    			case 2: obj.Produzent = (String) value;break;
	    			case 3: obj.Groesse = (int) value;break;
	    			default: ;
	    		}
        	}else{
	        	RentalMedia obj = (RentalMedia) modelData.get( row );
	    		switch(col){
	    			case 0: obj.ID = (int) value;break;
	    			case 1: obj.Name = (String) value;break;
	    			case 2: obj.Produzent = (String) value;break;
	    			case 3: obj.Anzahl = (int) value;break;
	    			default: ;
	    		}
        	}
            fireTableCellUpdated(row, col);
        }

        public void removeRow(int row)
        {
        	Media rRow = modelData.get( row );
        	modelData.remove(rRow);
        	fireTableRowsDeleted(row, row);
        }
    	public void insertRow(int row, Media rowData)
    	{
    		modelData.add(row, rowData);
    		fireTableRowsInserted(row, row);
    	}
    	public void addRow(Media rowData)
    	{
    		insertRow(getRowCount(), rowData);
    	}
    }
	class modelProfile extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		
		protected List<Profile> modelData;
    	protected String[] columnNames;
		protected Boolean[] isColumnEditable;
		private boolean isModelEditable = true;

    	protected modelProfile(List<Profile> modelData, String[] columnNames)
    	{
    		this.modelData = modelData;
    		this.columnNames = columnNames;
    		isColumnEditable = new Boolean[getColumnCount()];
    		fireTableStructureChanged();
    	}
    	public boolean isCellEditable(int row, int column)
    	{
    		Boolean isEditable = null;

    		if (column < isColumnEditable.length)
    			isEditable = isColumnEditable[column];

    		return (isEditable == null) ? isModelEditable : isEditable.booleanValue();
    	}
    	public void setColumnEditable(int column, boolean isEditable)
    	{
    		isColumnEditable[column] = isEditable ? Boolean.TRUE : Boolean.FALSE;
    	}
    	public int getColumnCount()
    	{
    		return columnNames.length;
    	}
    	public int getRowCount()
    	{
    		return modelData.size();
    	}
    	public String getColumnName(int column)
    	{
    		Object columnName = null;
    		if (column < columnNames.length)
    		{
    			columnName = columnNames[column];
    		}
    		return (columnName == null) ? super.getColumnName( column ) : columnName.toString();
    	}
    	public Profile getRow(int row)
    	{
    		return modelData.get( row );
    	}
        public Object getValueAt(int row, int col) {
        	Profile obj = modelData.get( row );
        	Object value;
    		switch(col){
    			case 0: value = obj.ID;break;
    			case 1: value = obj.Username;break;
    			case 2: value = obj.Passwort;break;
    			default: value = null;
    		}
    		return value;
    	}
        public Class<?> getColumnClass(int row) {
            Class<?> type = String.class;
            switch (row) {
                case 0:
                	type = Integer.class;
                    break;
            }
            return type;
        }
        public void setValueAt(Object value, int row, int col) {
        	Profile obj = modelData.get( row );
    		switch(col){
    			case 0: obj.ID = (int) value;break;
    			case 1: obj.Username = (String) value;break;
    			case 2: obj.Passwort = (String) value;break;
    			default: ;
        	}
    		System.out.println(row+" "+col+" "+value);
            fireTableCellUpdated(row, col);
        }
        public void removeRow(int row)
        {
        	Profile rRow = modelData.get( row );
        	modelData.remove(rRow);
        	fireTableRowsDeleted(row, row);
        }
    	public void insertRow(int row, Profile rowData)
    	{
    		modelData.add(row, rowData);
    		fireTableRowsInserted(row, row);
    	}
    	public void addRow(Profile rowData)
    	{
    		insertRow(getRowCount(), rowData);
    	}
    }
}
