/**
 * MFEmptySequence.java
 *
 * This file was generated by MapForce 2015r3sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */

package com.altova.mapforce;

public class MFEmptySequence implements IEnumerable 
{
	public static class Enumerator implements IEnumerator
	{
		private Enumerator() {}
		public Object current() {throw new UnsupportedOperationException();}
		public int position() {throw new UnsupportedOperationException();}
		public boolean moveNext() {return false;}
		public void close() {}
	}
	
	public MFEmptySequence() {}
		
	public IEnumerator enumerator() 
	{
		return new Enumerator();
	}

}
