/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 * */

package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;

public abstract class Node  implements Serializable{
	
	private static final long serialVersionUID = -2820625825172502547L;
	String nodeName;
	String nodePrefix;
	
	public String getNodeName () {
		return nodeName;
	}	
	public void setNodeName (String name) {
		this.nodeName = name;
	}
	public void setPrefix (String prefix) {
		this.nodePrefix = prefix;
	}
	public String getPrefix () {
		return nodePrefix;
	}
	
	public abstract String renderText();
	
	public abstract String renderHTML(boolean contentOnly);
}
