package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class RentalMusic extends RentalMedia {
	public String Kuenstler;
	
	public RentalMusic(){
		super();
		this.Kuenstler = "Kuenstler "+this.ID;
		this.Name = "RMusic "+this.ID;//this.Name.replace("Media", "Music");
	}
}
