/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 * */
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Discussion implements Serializable{

	private static final long serialVersionUID = -7737304837551908828L;

	HashMap<Date, String> discussions = new HashMap<Date, String>();
	
	public void add(String discussion, User user) {
		Date date = new Date();
		discussions.put(date, user.getUserName() + ": " + discussion);
	}
	public String renderHTML() {
		// iterate through revisions
		StringBuffer buffer = new StringBuffer();
		Iterator<Date> DiscIt = discussions.keySet().iterator();
		while (DiscIt.hasNext()) {
			Date date = (Date) DiscIt.next();
			buffer.append(date + " - " + discussions.get(date));
			buffer.append("\n");
		}
		return buffer.toString();
	}

}
