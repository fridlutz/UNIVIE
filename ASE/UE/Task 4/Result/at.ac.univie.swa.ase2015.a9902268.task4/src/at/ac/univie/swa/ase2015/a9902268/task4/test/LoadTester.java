package at.ac.univie.swa.ase2015.a9902268.task4.test;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;

public class LoadTester {
	public Wikipedia load() {
		// Register the XMI resource factory for the .website extension
		ModelPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI("Wikipedia.model"), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Wikipedia wiki = (Wikipedia) resource.getContents().get(0);
		return wiki;
	}

}
