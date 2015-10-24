/**
 * @author Wilfrid Utz, a9902268, wilfrid.utz@gmail.com
 **/
package at.ac.univie.swa.ase2015.a9902268.task1.model;

import java.io.Serializable;

public class MetaData implements Serializable{

	private static final long serialVersionUID = 5591731357669418926L;
	String key;
	String value;
	
	public MetaData (String key, String value) {
		this.key = key;
		this.value = value;
	}
}
