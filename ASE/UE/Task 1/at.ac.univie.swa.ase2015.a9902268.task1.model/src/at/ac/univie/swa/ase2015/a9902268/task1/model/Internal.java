/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

public class Internal extends Content {
	private static final long serialVersionUID = -3064431840649330226L;
	final static String nodePrefix = "Wikipedia:";
	String content;
	
	public Internal(String nodeName, String content, User author) {
		super(nodeName, nodePrefix);
		createNewRevision(content, author);
	}
}
