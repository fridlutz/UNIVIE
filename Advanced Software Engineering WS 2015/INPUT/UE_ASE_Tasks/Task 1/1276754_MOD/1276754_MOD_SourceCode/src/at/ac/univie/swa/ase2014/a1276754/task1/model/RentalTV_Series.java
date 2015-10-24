package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class RentalTV_Series extends RentalMedia {
	public int Anzahl_Episoden;
	
	public RentalTV_Series(){
		super();
		this.Anzahl_Episoden = 20;
		this.Name = "RTV Series "+this.ID;
	}
}
