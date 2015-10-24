package at.ac.univie.swa.ase2014.a1276754.task1.model;

public abstract class Media {
	private static int Counter = 1;
	public int ID;
	public String Name;
	public String Produzent;
	public Distributor DistributedBy;
	
	public Media(){
		this.ID = Counter;
		this.Name = "Media "+Counter;
		this.Produzent ="Produzent "+Counter;
		this.DistributedBy = null;
		Counter++;
	}
}
