package com.lams1989.arraysds;

import junit.framework.TestCase;

public class ReverseArrayTest extends TestCase {

	public void testReverse1() {
		int[] arr = {1,2,3,4,5,6};
		int[] actual =ReverseArray.reverseSaveArray(arr);
		int[] expected ={ 6, 5, 4, 3, 2, 1 };
		
		for (int i = 0; i < arr.length; i++) {
			assertEquals(expected[i],actual[i]);	
		}
		
	}

	

}
