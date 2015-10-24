/*
 * generated by Xtext
 */
package at.ac.univie.swa.ase2014.a1276754.task3.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Playlist
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Song
import java.util.HashMap
import at.ac.univie.swa.ase2014.a1276754.task3.mydsl.Distributor
import java.util.Map
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MydslGenerator implements IGenerator {
	HashMap<String,Song> playlist;
	Map<Distributor,Double> distributors;
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		distributors = new HashMap<Distributor,Double>;
		for(Playlist p: resource.allContents.toIterable.filter(Playlist)) {
			playlist = new HashMap<String,Song>
    		fsa.generateFile(
      		"pl_"+p.name+".html",
      		p.compile)
      		System.out.println(p + " "+playlist.size);
  		}
//		for(Distributor d: resource.allContents.toIterable.filter(Distributor)) {
//    		fsa.generateFile(
//      		"distributors.html", 
//      		d.compile)
//      		System.out.println(d + " "+distributors.size);
//  		}
	    fsa.generateFile(
  		"distributors.html", 
  		writeDist())
  		System.out.println(distributors + " "+distributors.size);
	}
	
	def writeDist() '''
«««	«var ArrayList<Distributor> list = new ArrayList<Distributor>()»
	<table style="border:thin solid black">
	<tr><td colspan="6" align="center">Distributors</td></tr>
	<tr><td>Name</td><td>Earnings</td></tr>
	«FOR Map.Entry<Distributor, Double> entry : distributors.entrySet()»
    	«var Distributor key = entry.getKey()»
    	«var Double value = entry.getValue()»
    	<tr><td>«key.name»</td><td>«value»</td></tr>
    «ENDFOR»
    </table>
	'''
	
	def compile (Distributor di) '''
	<table style="border:thin solid black">
	<tr><td colspan="6" align="center">Distributors</td></tr>
	<tr><td>Name</td><td>Earnings</td></tr>
	'''
	
	def compile(Playlist pl) '''	
	«FOR s:pl.songs»
        «s.compile»
        «System.out.println("songs: "+s.name)»
    «ENDFOR»
    «FOR p:pl.incl»
	   «p.include»
	   «System.out.println("include playlist: "+p.name)»
    «ENDFOR»
    «System.out.println()»
	<table style="border:thin solid black">
	<tr><td colspan="6" align="center">«pl.name»</td></tr>
	<tr><td>Titel</td><td>Kuenstler</td><td>Produzent</td><td>Laenge</td><td>Genre</td><td>Preis</td></tr>
	«writeTable()»
    </table>
	'''

	def include(Playlist p){
		for(s:p.songs){
			s.compile
			System.out.println("p:incl songs: "+s.name);
		}
		System.out.println(p.excl);      
	   for(s:p.excl){
	   		s.exclude;
        	System.out.println("p:exclude songs: "+s.name);
	   }	           	
	}
	
	def compile(Song song){
		playlist.put(song.name,song)
		System.out.println("song:: "+song.name)
	}
	
	def exclude(Song song) {
		System.out.println("excl:: "+song.name);
		if(playlist.containsKey(song.name)) {
			playlist.remove(song)
			System.out.println("excl done:: "+song.name);
		}
//		playlist.put(song.name,song)
	}
	def writeTable() '''
	«FOR s:playlist.values()»
		<tr><td>«s.name »</td><td>«s.artist »</td><td>«s.dist.name »</td><td>«s.length.min+":"+ s.length.sec »</td><td>«s.genre »</td><td>«s.price »</td></tr>
		«countDist(s.dist, s.price)»
	«ENDFOR»	
	'''
	
	def countDist(Distributor distributor, String price) {
		var double dPrice = Double.parseDouble(price);
		if (distributors.containsKey(distributor)){
			dPrice = dPrice + distributors.get(distributor);
			distributors.replace(distributor,dPrice);
		}
		else
		{
			distributors.put(distributor, dPrice);
		}
	}
	
}
