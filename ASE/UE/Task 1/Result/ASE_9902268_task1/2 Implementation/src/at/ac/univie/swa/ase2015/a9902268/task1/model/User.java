/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;


public class User implements Serializable {
	final static String nodePrefix = "User:";
	boolean isBlocked = false;
	boolean isReader = true;
	boolean isEditor = false;
	Role userRole;
	private static final long serialVersionUID = -5631596905518897547L;
	String username;

	public User(String username) {
		this.username = username;
	}

	public String getUserName() {
		return username;
	}
	
	public void setRole (Role role) {
		this.userRole = role;
	}
	
	public Role getRole () {
		return userRole;
	}

}
