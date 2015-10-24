package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import groovy.util.FactoryBuilderSupport;


class BuilderFactory  extends FactoryBuilderSupport{
	public BuilderFactory(){
		registerFactory('Library', new LibraryFactory())
		registerFactory('Playlist', new PlaylistFactory())
		registerFactory('Song', new SongFactory())
		registerFactory('Distributor', new DistributorFactory())
	}
}
