package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class TV_Series extends StreamingMedia {
	public int Anzahl_Episoden;
	
	public TV_Series(){
		super();
		this.Anzahl_Episoden = 20;
		this.Name = "TV Series "+this.ID;
	}
}
