/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.model;

import java.util.Vector;

public abstract class Content {

	private static Vector<Integer> usedIDs=new Vector<Integer>();
	private int id;
	private String name;
	private boolean inhome;
	
	public Content(int id, String _name, boolean _inhome){
		this.setId(id);
		this.setName(_name);
		this.setInhome(_inhome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInhome() {
		return inhome;
	}

	public void setInhome(boolean inhome) {
		this.inhome = inhome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(!usedIDs.contains(id)){
			int index=0;
			boolean in=false;
			for(int i=0;i<usedIDs.size();i++){
				if(usedIDs.get(i)==this.id){
					in=true;
					index=i;
					break;
				}
			}
			//remove old version if exists
			if(in){
				System.out.println("in");
				usedIDs.remove(index);
			}
			this.id = id;
			//add new version
			usedIDs.add(id);
		}
		else if(this.id==id){
			//do nothing if users starts to edit the table but doesnt change the id
		}
		else
			throw new IllegalArgumentException();
	}
	
	public static void deleteID(int id){
		int index=0;
		boolean in=false;
		for(int i=0;i<usedIDs.size();i++){
			if(usedIDs.get(i)==id){
				in=true;
				index=i;
			}
		}
		//remove old version if exists
		if(in){
			usedIDs.remove(index);
		}
	}
	
}
