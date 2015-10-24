package factories

import entities.Model
import entities.Song
import groovy.util.FactoryBuilderSupport;

import java.util.Map;

class ModelFactory extends AbstractFactory{

	@Override
	public Object newInstance(FactoryBuilderSupport builder, Object name,
			Object value, Map attributes) throws InstantiationException,
			IllegalAccessException {
		attributes += [name : value]
		return new Model()
	}

}
