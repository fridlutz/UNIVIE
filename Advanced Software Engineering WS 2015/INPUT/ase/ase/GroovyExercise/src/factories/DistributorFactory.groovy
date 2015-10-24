package factories

import java.util.Map;

import entities.Distributor
import groovy.util.AbstractFactory;
import groovy.util.FactoryBuilderSupport;

class DistributorFactory extends AbstractFactory{

	@Override
	public Object newInstance(FactoryBuilderSupport builder, Object name,
			Object value, Map attributes) throws InstantiationException,
			IllegalAccessException {
		attributes += [name : value]
		return new Distributor(attributes)
	}
	public void setParent( FactoryBuilderSupport builder, Object parent, Object child ) {
		child.model = parent
		parent.distributors += child
	}
}
