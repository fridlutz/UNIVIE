/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;
import java.util.Date;

public class Revision implements Serializable {

	private static final long serialVersionUID = -2519101614151728175L;
	Object content;
	User author;
	Date creationDate;

	public Revision(Object content, User user) {
		this.content = content;
		this.author = user;
		this.creationDate = new Date();

	}

}
