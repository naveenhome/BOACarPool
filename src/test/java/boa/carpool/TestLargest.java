package boa.carpool;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testCase1()
	{
		Largest obj = new Largest();
		int arr[]= {3,4,7,8,2};
		assertEquals(8, obj.find(arr));
	}
	public void testCase2()
	{
		Largest obj = new Largest();
		int arr[]= {3,4,7,8,9};
		assertEquals(9, obj.find(arr));
	}
	public void testCase3()
	{
		Largest obj = new Largest();
		int arr[]= {-3,-4,-7,-8,-9};
		assertEquals(-3, obj.find(arr));
	}


}
