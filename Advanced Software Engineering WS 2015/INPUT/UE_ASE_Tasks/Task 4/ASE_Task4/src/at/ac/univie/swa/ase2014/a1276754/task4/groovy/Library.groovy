package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import java.util.HashMap;


class Library{
	static HashMap distMap = new HashMap()
	def name
	Distributor [] distributors =[]
	Song[] songs = []
	Playlist[] playlists = []
	
	void printAll(){
		distributors.each {
			println it
		}
		println ''
//		songs.each {
//			println it
//		}
		playlists.each {
			printList(it)
		}
		def sortedDist = distMap.sort {a, b -> b.value <=> a.value}
		sortedDist.each {
			k , v -> println "${k} - ${v}"
		}
	}
	void printList(Playlist p){
		LinkedHashMap map = new HashMap()
		println p.name
		p.include.each {
			def x = it.getClass()
			if (x == Song.class){
				Song y = (Song)it
//				println y.name
				map.put(y.name, y)				
			}else if (x == Playlist.class){
				putSongs((Playlist)it,map)
			}
		}
//		println p.exclude
//		println map
		p.exclude.each {
//			println it.name
			if(map.containsKey(it.name)){
//				println 'contains'
				map.remove(it.name)
			}
		}
//		println p.name
		map.each {
			k, v -> println("${v}")
			addDist(v.distributor.name,v.price)
		}
		println "\n"
	}
	
	void putSongs(Playlist p, HashMap map){
//		println p.include
		p.include.each {
			def x = it.getClass()
			if (x == Song.class){
				Song y = (Song)it
				if(!(map.containsKey(y.name))){
					map.put(y.name, y)
//					addDist(y.distributor.name,y.price)
				}
			}else if (x == Playlist.class){
				putSongs((Playlist)it,map)
			}
		}
		p.exclude.each {
//			println("$it")
			if(map.containsKey(it.name))
				map.remove(it.name)
		}
	}
	void addDist(String dist, double price)
	{
		if(distMap.containsKey(dist))
		{
			double d = distMap.get(dist)
			d += price
			distMap.put(dist, d)
		}
		else
		{
			distMap.put(dist, price)
		}
	}
}
