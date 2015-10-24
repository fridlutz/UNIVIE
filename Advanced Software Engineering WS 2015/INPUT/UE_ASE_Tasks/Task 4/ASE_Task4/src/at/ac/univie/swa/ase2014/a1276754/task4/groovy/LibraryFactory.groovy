package at.ac.univie.swa.ase2014.a1276754.task4.groovy
import java.util.Map

import groovy.util.AbstractFactory;
import groovy.util.FactoryBuilderSupport;


class LibraryFactory extends AbstractFactory {

	@Override
	public Object newInstance(FactoryBuilderSupport arg0, Object name,
			Object value, Map attr) throws InstantiationException,
			IllegalAccessException {
		attr += [name : value]
		return new Library(attr);
	}

}
