package at.ac.univie.swa.ase2014.a1276754.task1.model;

public class Review {
	private Profile reviewer;
	private Media reviewedMedia;
	private String ReviewText;
	
	public Review (Profile rw, Media rwM, String text){
		this.reviewedMedia = rwM;
		this.reviewer = rw;
		this.ReviewText = text;
	}
}
