package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import com.sun.media.jfxmedia.locator.HLSConnectionHolder.Playlist;


class Instance {
	static main(args){
		def builder = new BuilderFactory()
		Library lib = builder.Library(){
			d1 = Distributor(name: "UniversalMusic", adress: "56 Some Street, 12345 New York, NY, US", bic: "SOMEUSX1", iban: "US 12 123 123 123")
			d2 = Distributor(name: "SonyMusic", adress: "1 Sony Street, 2345 Tokia, JP", bic: "SOMEJPJ1", iban: "JP 12 34 43 55 93")
			d3 = Distributor(name: "WarnerMusic", adress: "1 Warner Gasse, 1010 Wien, AT", bic: "Dumdidum", iban: "AT 234 3234 234")
			
			s1 = Song(name: "Get Lucky", artist: "Daft Punk", distributor: d1, length: 3.01, price: 4.32, genre: "OTHER")
			s2 = Song(name: "Come as you are", artist: "Nirvana", distributor: d1, length: 7.23, price: 7.57, genre: "OTHER")
			s3 = Song(name: "Bohemian Rapsody", artist: "Queen", distributor: d2, length: 5.32, price: 3.35, genre: "ROCK")
			s4 = Song(name: "Song2", artist: "Blur", distributor: d1, length:4.23, price:3.45, genre: "ROCK")
			s5 = Song(name: "Roarr", artist:"Katy Perry", distributor: d2, length:2.35, price:4.67, genre: "POP")
			s6 = Song(name: "Tagebuch", artist:"MoTrip", distributor: d3, length: 2.45, price: 1.99, genre: "OTHER")
			
			p1 = Playlist(name: 'SimpleList', include:[s3,s2,s1])
			p2 = Playlist(name: 'ComplexList', include:[s4,p1,s5], exclude:[s1])
			p3 = Playlist(name: 'NewList', include:[s6,p2], exclude:[s4])
		}
		lib.printAll()
	}
}
