package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import groovy.util.FactoryBuilderSupport;

import java.util.Map;


class SongFactory extends AbstractFactory{

	@Override
	public Object newInstance(FactoryBuilderSupport arg0, Object name,
			Object value, Map attr) throws InstantiationException,
			IllegalAccessException {
		attr += [name : value]
		return new Song(attr);
	}
			public void setParent (FactoryBuilderSupport builder, Object parent, Object child ){
				parent.songs += child
//				println "$parent - $child"
			}
}
