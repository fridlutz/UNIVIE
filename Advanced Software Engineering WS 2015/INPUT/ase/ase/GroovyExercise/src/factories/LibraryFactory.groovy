package factories

import java.util.Map;

import entities.Library
import groovy.util.AbstractFactory;
import groovy.util.FactoryBuilderSupport;

class LibraryFactory extends AbstractFactory{

	@Override
	public Object newInstance(FactoryBuilderSupport builder, Object name,
			Object value, Map attributes) throws InstantiationException,
			IllegalAccessException {
		attributes += [name : value]
		return new Library()
	}
	public void setParent( FactoryBuilderSupport builder, Object parent, Object child ) {
		child.model = parent
		parent.libraries += child
	}
}