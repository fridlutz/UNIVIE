package at.ac.univie.swa.ase2014.a1276754.task1.model;

import java.util.ArrayList;

public class Account {
	
	public int ID;
	public String Name;
	public String Email;
	public String Passwort;
	public String Land;
	public int bezahlte_Abozeit = 30;
	public static int Counter= 100;
	
	private Profile[] zugeh_Profile; //Beziehung zu Profile
	private ArrayList<String> devices;
	
	public Account(){
		this.ID = Counter;
		this.Name ="Name "+Counter;
		this.Email ="Email "+Counter;
		this.Land = "Deutschland";
		this.Passwort ="Passwort "+Counter;
		this.zugeh_Profile = new Profile[5];
		Counter++;
	}
	
	public void addProfile(Profile newP){
		boolean inserted = false;
		for (int i=0;i<this.zugeh_Profile.length;i++){
			if(this.zugeh_Profile[i] == null){
				this.zugeh_Profile[i] = newP;
				inserted=true;
				break;
			}
		}
		if(inserted)
			System.out.println("Profil wurde hinzugefuegt!");
		else
			System.out.println("Es kann kein weiteres Profil hinzugefuegt werden!");
	}
}
