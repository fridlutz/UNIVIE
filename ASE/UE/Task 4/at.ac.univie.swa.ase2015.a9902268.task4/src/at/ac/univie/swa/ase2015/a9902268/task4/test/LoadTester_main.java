package at.ac.univie.swa.ase2015.a9902268.task4.test;

import at.ac.univie.swa.ase2015.a9902268.task2.Wikipedia.Wikipedia;

public class LoadTester_main {
	public static void main(String[] args) {
		// Loading the existing model
		LoadTester loader = new LoadTester();
		Wikipedia myWeb = loader.load();
		// Accessing the model information
		System.out.println(myWeb.getCurrentDateJD());
		// Lets see what info the webpage has
	}
}
