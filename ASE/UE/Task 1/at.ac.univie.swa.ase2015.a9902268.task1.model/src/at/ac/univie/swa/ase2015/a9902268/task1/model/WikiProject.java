/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.util.List;

public class WikiProject extends Internal {

	private static final long serialVersionUID = -1124404918875501612L;
	List<User> members;

	public WikiProject(String nodeName, String content, User author) {
		super(nodeName, content, author);
	}
	
	public void addMember (User member) {
		//check for user role
		if (member.getRole() instanceof RegisterUser) {
			members.add(member);
		}
		
	}

}
