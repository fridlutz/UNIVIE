package at.ac.univie.swa.ase2015.a9902268.task4.test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelFactory;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.ModelPackage;
import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;

public class Tester {
	public static void main(String[] args) {
		// Initialize the model
		ModelPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		ModelFactory factory = ModelFactory.eINSTANCE;

		// create the content of the model via this program
		Wikipedia wiki = factory.createWikipedia();
		wiki.setCurrentDateJD(new BigInteger("1231312"));

		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI("Wikipedia.model"));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(wiki);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}