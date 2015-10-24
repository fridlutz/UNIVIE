package at.ac.univie.swa.ase2014.a1276754.task1.model;


import java.util.ArrayList;
import java.util.List;

public class Profile {
	public static int Counter = 1;
	public int ID;
	public String Username;
	public String Passwort;
	
	private List<StreamingMedia> favoriteMedia;
	private List<Profile> friendList;
	private List<Media> recommendation;
	
	public Profile(){
		this.ID = Counter;
		this.Username = "Username "+Counter;
		this.Passwort = "passwort"+Counter;
		this.favoriteMedia = new ArrayList<StreamingMedia>();
		this.friendList = new ArrayList<Profile>();
		this.recommendation = new ArrayList<Media>();
		Counter++;
	}
	
	public void addFavorite(StreamingMedia newSM){
		this.favoriteMedia.add(newSM);
	}
	
	public void addFriend(Profile newF){
		this.friendList.add(newF);
	}
	
	public void addRommendation(Media newR){
		this.recommendation.add(newR);
	}
}
