import builder.MusicBuilder
import entities.Distributor
import entities.Model
import entities.Genre
import entities.Playlist
import entities.PlaylistItem
import entities.Song
import java.util.Map.Entry
 
def song(def builder,def name){
	['sung_by': {String singer ->
		['produced_by' : {Distributor distributor ->
			['length' : {String length ->
				['genre' : {Genre genre ->
					['price' : {double price ->
		return builder.songDef(name : name, length: length, genre: genre, price: price, singer: singer,
			distributor: distributor)
					}]
				}]
			}]
		}]
	}]
}

def MusicBuilder builder = new MusicBuilder()
/*
 * DSL Instance
 */
Model library = builder.model(){
	Distributor test = distributor(
			name: "Univseral",
			address: "Test",
			iban: "12313123",
			bic: "123"
		)
	Distributor test1 = distributor(
		name: "Sony",
		address: "Test",
		iban: "3323424",
		bic: "23"
		)
	library(){
		roar = song builder, "Roar" sung_by "Katy Perry" produced_by test length "01:04" genre Genre.ROCK price 10.0 
		testSong = song  builder, "Test" sung_by "Bon Jovi" produced_by test length "04:02" genre Genre.ROCK price 20.0
		testSongDis1 = song builder, "Test1" sung_by "Michael Jackson" produced_by test1 length "03:04" genre Genre.POP price 15.0
	}
	myPlaylist = playlist name: "MyPlaylist", items: [roar, testSong]
	playlist name: "SecondPlaylist", items: [testSongDis1,myPlaylist.without(roar),testSong,roar,myPlaylist]
}



library.printTables() 
