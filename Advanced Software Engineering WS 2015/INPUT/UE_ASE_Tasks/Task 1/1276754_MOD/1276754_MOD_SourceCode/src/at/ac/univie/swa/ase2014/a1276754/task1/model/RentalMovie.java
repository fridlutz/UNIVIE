package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class RentalMovie extends RentalMedia {
	public String Regisseur;
	
	public RentalMovie(){
		super();
		this.Regisseur = "Regisseur "+this.ID;
		this.Name = "RMovie "+this.ID; //this.Name.replace("Media", "Movie");
	}
}
