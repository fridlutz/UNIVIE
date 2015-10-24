package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class Music extends StreamingMedia {
	public String Kuenstler;
	
	public Music(){
		super();
		this.Kuenstler = "Kuenstler "+this.ID;
		this.Name = "Music "+this.ID;//this.Name.replace("Media", "Music");
	}
}
