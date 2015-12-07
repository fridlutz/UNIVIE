/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 * */
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Content extends Node {

	private static final long serialVersionUID = -2092959709982243113L;
	VersionHistory versionHistory;
	Discussion discussion;
	List<Revision> revisions;
	Revision currentRevision;

	public Content(String nodeName, String nodePrefix) {
		// create a new node
		super();
		setNodeName(nodeName);
		setPrefix(nodePrefix);
		// create revisions, discussion and versionhistory
		this.revisions = new ArrayList<Revision>();
		this.discussion = new Discussion();
		this.versionHistory = new VersionHistory();
	}

	public void createNewRevision(Object content, User user) {
		Revision revision = new Revision(content, user);
		revisions.add(revision);
		this.currentRevision = revision;
	}

	public Revision getCurrentRevision() {
		return currentRevision;
	}

	public List<Revision> getRevisions() {
		return revisions;
	}

	public void addDiscussionItem(String discussion, User user) {
		this.discussion.add(discussion, user);
	}

	public Discussion getDiscussion() {
		return discussion;
	}

	public VersionHistory getVersionHistory() {
		return versionHistory;
	}

	public String getURI() {
		String URI = getPrefix() + getNodeName();
		return URI.replaceAll(" ", "_");
	}

	public String renderText() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("############################################################\n");
		buffer.append("URI: " + getURI() + "\n");
		buffer.append("Title: " + this.nodeName + "\n");
		buffer.append("Last change date: " + this.getCurrentRevision().creationDate + "\n");
		buffer.append("Number of revisions: " + this.revisions.size() + "\n");
		buffer.append("Actual content: " + this.getCurrentRevision().content + "\n");
		buffer.append("------------------------------------------------------------\n");
		buffer.append("----------------------VERSION HISTORY-----------------------\n");
		buffer.append("------------------------------------------------------------\n");
		VersionHistory history = getVersionHistory();
		buffer.append(history.render(getRevisions(), this.getCurrentRevision()));
		buffer.append("------------------------------------------------------------\n");
		buffer.append("-------------------------DISCUSSION-------------------------\n");
		buffer.append("------------------------------------------------------------\n");
		Discussion discussion = getDiscussion();
		buffer.append(discussion.renderHTML());
		buffer.append("############################################################\n");

		return buffer.toString();
	}

	public String renderHTML(boolean contentOnly) {
		if (contentOnly)
			return this.getCurrentRevision().content.toString();
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<p><i>URI: " + getURI() + "</i></p>");
		buffer.append("<h1>" + this.nodeName + "</h1>");
		buffer.append("<p><i>Last change date: " + this.getCurrentRevision().creationDate + "</i></p>");
		buffer.append("<p>" + this.getCurrentRevision().content + "</p>");
		buffer.append("</body></html>");

		return buffer.toString();
	}

}
