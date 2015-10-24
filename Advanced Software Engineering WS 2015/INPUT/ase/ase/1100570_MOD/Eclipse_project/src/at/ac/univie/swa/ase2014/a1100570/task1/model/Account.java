/**
 * @author Volodimir Begy, a1100570
 */

package at.ac.univie.swa.ase2014.a1100570.task1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Account {

	private static Vector<Integer> usedIDs=new Vector<Integer>();
	private int id;
	private Vector<Profile> profiles;
	private boolean trial;
	private Date registrationDate;
	private Date trialExpiration;
	private String email;
	
	public Account(int id, boolean trial, String rd, String te) throws ParseException{

		this.trial=trial;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

		this.registrationDate=sdf.parse(rd);
		this.trialExpiration=sdf.parse(te);
		this.setId(id);
		this.setProfiles(new Vector<Profile>());
	}

	public Vector<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(Vector<Profile> profiles) {
		this.profiles = profiles;
	}

	public boolean isTrial() {
		return trial;
	}

	public void setTrial(boolean trial) {
		this.trial = trial;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getTrialExpiration() {
		return trialExpiration;
	}

	public void setTrialExpiration(Date trialExpiration) {
		this.trialExpiration = trialExpiration;
	}
	
	public boolean addProfile(int id, String name){
		if(this.profiles.size()<5){
			this.profiles.add(new Profile(id,this,name));
			return true;
		}
		else{
			System.out.println("Limit Reached!");
			return false;
		}
	}
	
	public void removeProfile(int id){
		boolean in=false;
		int index=0;
		for(int i=0;i<profiles.size();i++){
			if(profiles.get(i).getId()==id){
				in=true;
				index=i;
				break;
			}
		}
		if(in){
			profiles.remove(index);
			Profile.deleteID(id);
		}
	}
	
	public int amountProfiles(){
		return this.profiles.size();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(!usedIDs.contains(id)){
			int index=0;
			boolean in=false;
			for(int i=0;i<usedIDs.size();i++){
				if(usedIDs.get(i)==this.id){
					in=true;
					index=i;
				}
			}
			//remove old version if exists
			if(in){
				usedIDs.remove(index);
			}
			this.id = id;
			//add new version
			usedIDs.add(id);
		}
		else if(this.id==id){
			//do nothing if users starts to edit the table but doesnt change the id
		}
		else
			throw new IllegalArgumentException();
	}
	
	public static void deleteID(int id){
		int index=0;
		boolean in=false;
		for(int i=0;i<usedIDs.size();i++){
			if(usedIDs.get(i)==id){
				in=true;
				index=i;
			}
		}
		//remove old version if exists
		if(in){
			usedIDs.remove(index);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
