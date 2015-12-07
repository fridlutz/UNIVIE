/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Media extends Content {
	private static final long serialVersionUID = 7425384674015335931L;
	final static String nodePrefix = "File:";
	List<Content> usage;
	List<MetaData> meta;
	URL mediaFile;
	
	
	public Media(String nodeName, URL media, User author) {
		super(nodeName, nodePrefix);
		this.createNewRevision(media, author);
		//initialize metaData
		usage = new ArrayList<Content>();
		meta = new ArrayList<MetaData>();
	}

	//file usage
	void addContentToFileUsage(Content content) {
		usage.add(content);
	}
	
	void removeContent(Content content) {
		usage.remove(content);
	}
	
	List<Content> getFileUsage () {
		return usage;
	}
	
	//meta-data
	void addMetaData (MetaData metadata) {
		meta.add(metadata);
	}
	void removeMetaData (MetaData metadata) {
		meta.remove(metadata);
	}
	
	List<MetaData> getMetaData () {
		return meta;
	}
	
	public String renderHTML(boolean contentOnly) {
		if (contentOnly)
			return this.getCurrentRevision().content.toString();
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<p><i>URI: " + getURI() + "</i></p>");
		buffer.append("<h1>" + this.nodeName + "</h1>");
		buffer.append("<p><i>Last change date: " + this.getCurrentRevision().creationDate + "</i></p>");
		buffer.append("<p><img src=\"" + ((URL) getCurrentRevision().content) + "\"/></p>");
		buffer.append("</body></html>");
System.out.println(buffer.toString());
		return buffer.toString();
	}
}