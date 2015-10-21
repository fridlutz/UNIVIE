package builder

import factories.DistributorFactory
import factories.LibraryFactory
import factories.ModelFactory
import factories.PlaylistFactory
import factories.SongFactory
import groovy.util.FactoryBuilderSupport;

class MusicBuilder extends FactoryBuilderSupport{
	public MusicBuilder(){
		registerTags()
	}
	protected void registerTags(){
		registerFactory("model", new ModelFactory())
		registerFactory("distributor", new DistributorFactory())
		registerFactory("library", new LibraryFactory())
		registerFactory("playlist", new PlaylistFactory())
		registerFactory("songDef", new SongFactory())
	}
}
