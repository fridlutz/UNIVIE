package factories

import java.util.Map;

import entities.Song
import groovy.util.AbstractFactory;
import groovy.util.FactoryBuilderSupport;

class SongFactory extends AbstractFactory{

	@Override
	public Object newInstance(FactoryBuilderSupport builder, Object name,
			Object value, Map attributes) throws InstantiationException,
			IllegalAccessException {
		attributes += [name : value]
		return new Song(attributes)
	}
	public void setParent( FactoryBuilderSupport builder, Object parent, Object child ) {
		child.library = parent
		parent.songs += child
	}
}
