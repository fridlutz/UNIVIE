package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class Movie extends StreamingMedia {
	public String Regisseur;
	
	public Movie(){
		super();
		this.Regisseur = "Regisseur "+this.ID;
		this.Name = "Movie "+this.ID; //this.Name.replace("Media", "Movie");
	}
}
