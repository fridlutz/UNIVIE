package entities

import java.util.List;

class Playlist {
	Model model
	String name;
	List items
	
	def PlaylistItem without(List songs) {
		return new PlaylistItem (list:this,withoutSongs: songs);
	}
	
	def PlaylistItem without(Song song) {
		return new PlaylistItem (list:this,withoutSongs: [song]);
	}
	

	
}

class PlaylistItem {
	Song song
	Playlist list
	List<Song> withoutSongs
}