package at.ac.univie.swa.ase2014.a1276754.task1.model;

public abstract class RentalMedia extends Media{
	public int Anzahl; //MB
	public boolean BlueRay; //false = DVD
	
	public RentalMedia(){
		super();
		this.Anzahl = 50;
		this.BlueRay = false;
	}
}
