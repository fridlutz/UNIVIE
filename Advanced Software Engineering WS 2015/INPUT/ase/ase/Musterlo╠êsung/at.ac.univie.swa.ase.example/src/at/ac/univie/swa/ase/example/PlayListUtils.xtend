package at.ac.univie.swa.ase.example

import at.ac.univie.swa.ase.example.playlistDsl.Item
import at.ac.univie.swa.ase.example.playlistDsl.Playlist
import at.ac.univie.swa.ase.example.playlistDsl.PlaylistItem
import at.ac.univie.swa.ase.example.playlistDsl.Song
import java.util.Collection
import java.util.Set

class PlayListUtils {
		
	def dispatch Set<Song> getSongs(PlaylistItem playListItem) {
		return emptySet
	}
	
	def dispatch Set<Song> getSongs(Song song) {
		
		return newHashSet(song);
	}
	
	def dispatch Collection<Song> getSongs(Playlist list) {
		return list.items.map[getSongs()].flatten.toList;
	}
	
	def dispatch Collection<Song> getSongs(Item item) {
		var songs = item.item.songs
		if(item.item instanceof Playlist && (!item.excluded.empty)) {
			songs.removeAll(item.excluded)
		}
		return songs.toList
		
	}
	
	
}