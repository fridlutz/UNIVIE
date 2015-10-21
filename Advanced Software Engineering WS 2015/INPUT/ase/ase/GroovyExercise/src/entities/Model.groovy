package entities
import java.util.List;
import java.util.Map.Entry

class Model {
	List<Distributor> distributors = new ArrayList<Distributor>()
	List<Library> libraries = new ArrayList<Library>()
	List<Playlist> playlists = new ArrayList<Playlist>()

	def Map<Distributor, Double> earnings;


	public printTables() {
		earnings = [:];
		println "Playlist table:"
		for(Playlist p : this.playlists){
			println "${p.name}"
			println "-------------------------------------"
			println "Name\tSinger\tProducer\tLength\tGenre\tPrice"
			printSongs(p)
			println "\n"
		}


		Map<Double, Distributor> sortedMap = earnings.sort{-it.value}

		println "Distributor\tEarning"
		for(Entry e : sortedMap) {
			println e.getKey().name + "\t" + e.getValue()
		}
	}

	def printSongs(Playlist p ) {
		for(Song s : getSongs(p)) {
			println s.name + "\t" + s.singer + "\t" + s.distributor.name + "\t" + s.length + "\t" +
					s.genre + "\t" + s.price
			def val = 0;
			if(earnings.containsKey(s.distributor))	{
				val = earnings.get(s.distributor);
			}
			val += s.price
			earnings.put(s.distributor,val);
		}
	}


	def List<Song> getSongs(def p){
		def List<Song> songs = [];
		for(def item : p.items){
			if(item instanceof PlaylistItem) {
				if (item.list != null) {
					if(item.withoutSongs == null) {
						songs.addAll(getSongs(item));
					} else {
						def temp = getSongs(item.list);
						temp.removeAll(item.withoutSongs);
						songs.addAll(temp);
					}
				} else if( item.song != null) {
					songs << item.song;
				}
			} else if(item instanceof Playlist) {
				songs.addAll(getSongs(item))
			} else if(item instanceof Song) {
				songs << item
			}
		}
		return songs
	}
}
