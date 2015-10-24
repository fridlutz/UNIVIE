package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import groovy.time.TimeDuration


class Song {
	def name
	String artist
	Distributor distributor
	double length
	Genre genre
	double price 
	
	enum Genre{
	POP,ROCK,HARDROCK,CLASSIC,FOLK,OTHER
	}
	
	String toString(){
		return "Title: $name, Artist: $artist, Distributor: $distributor.name, Length: $length, Genre: $genre, Price: $price"
	}
}
