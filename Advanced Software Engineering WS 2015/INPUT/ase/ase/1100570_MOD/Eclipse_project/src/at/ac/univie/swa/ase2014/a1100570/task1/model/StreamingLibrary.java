/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.model;

import java.util.Vector;

public class StreamingLibrary{
	private int id;
	private Vector<Content> content;
	
	public StreamingLibrary(){
		this.setContent(new Vector<Content>());
	}

	public Vector<Content> getContent() {
		return content;
	}

	public void setContent(Vector<Content> content) {
		this.content = content;
	}
	
	public void addContent(Content c){
		this.content.add(c);
	}
	
	public void removeContent(Content c){
		this.content.remove(c);
	}
	
	public void removeContent(int i){
		int id=content.get(i).getId();
		this.content.remove(i);
		Content.deleteID(id);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
