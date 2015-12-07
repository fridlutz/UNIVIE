/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 * */
package at.ac.univie.swa.ase2015.a9902268.task1.model;

public class Article extends Content {

	private static final long serialVersionUID = -6029541454082670760L;
	
	final static String nodePrefix = "";
	String content;
	
	
	public Article(String nodeName, String content, User author) {
		super(nodeName, nodePrefix);
		createNewRevision(content, author);
	}

}
