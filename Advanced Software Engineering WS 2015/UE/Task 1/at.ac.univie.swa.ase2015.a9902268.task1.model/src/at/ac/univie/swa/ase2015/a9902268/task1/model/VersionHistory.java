/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class VersionHistory implements Serializable{

	private static final long serialVersionUID = 5494741880051569060L;

	public String renderHTML(List<Revision> revisions, Revision currentRevision) {
		// iterate through revisions
		StringBuffer buffer = new StringBuffer();
		Iterator<Revision> RevIt = revisions.iterator();
		while (RevIt.hasNext()) {
			Revision revision = (Revision) RevIt.next();
			buffer.append(revision.creationDate + " - " + revision.author.getUserName());
			if (currentRevision.equals(revision)) {
				buffer.append(" - current");
			}
			buffer.append("\n");
		}
		return buffer.toString();
	}

}
