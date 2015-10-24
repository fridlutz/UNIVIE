/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Media extends Content {
	private static final long serialVersionUID = 7425384674015335931L;
	final static String nodePrefix = "File:";
	List<Content> usage;
	List<MetaData> meta;
	File mediaFile;
	
	
	public Media(String nodeName, File media, User author) {
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
}