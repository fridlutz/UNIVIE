package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class Distributor {
	private static int Counter = 1;
	private int ID;
	private String Name;
	
	public Distributor(){
		this.ID = Counter;
		this.Name = "Name "+Counter;
		Counter++;
	}
}
