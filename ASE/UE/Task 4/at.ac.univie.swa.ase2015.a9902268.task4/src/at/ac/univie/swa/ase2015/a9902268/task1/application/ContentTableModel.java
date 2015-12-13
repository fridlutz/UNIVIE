/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/package at.ac.univie.swa.ase2015.a9902268.task1.application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Content;


public class ContentTableModel extends AbstractTableModel implements TableModelListener{
	List<Content> content;

	private final String[] columnNames = new String[] { "URI", "Type", "Title", "Last change date", "Number of revisions",
			"Number of discussion items", "Author" };
	private final Class<?>[] columnClass = new Class[] { String.class, String.class, String.class, String.class, Integer.class,
			Integer.class, String.class };

	public ContentTableModel(WikipediaManager contentmgr) {
		content = new ArrayList<Content>(contentmgr.wikipedia.getContent());

	}

	private static final long serialVersionUID = 8214022093650157869L;

	@Override
	public int getRowCount() {
		return content.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnClass[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Content row = content.get(rowIndex);
		if (0 == columnIndex) {
			return row.getTitle();
		} else if (1 == columnIndex) {
			return row.getClass().getSimpleName();
		} else if (2 == columnIndex) {
			return row.getTitle();
		} else if (3 == columnIndex) {
			return row.getCurrentRevision().getAuthor();
		} else if (4 == columnIndex) {
			return row.getRevision().size();
		} else if (5 == columnIndex) {
			return 10;
		} else if (6 == columnIndex) {
			return row.getCurrentRevision().getAuthor();
		}
		return null;
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
