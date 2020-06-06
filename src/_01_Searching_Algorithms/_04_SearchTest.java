package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
String[] arr= {"banana", "apple", "fruit", "grapes"};
assertEquals(1,_00_LinearSearch.linearSearch(arr, "apple"));
assertEquals(-1, _00_LinearSearch.linearSearch(arr, "water"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[]arr= {1,2,3,5,8};
		assertEquals(3,_01_BinarySearch.binarySearch(arr, 0, 4, 5));
		assertEquals(-1, _01_BinarySearch.binarySearch(arr, 0, 4, 10));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[]arr= {1,2,3,4};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(arr, 3));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(arr, 9));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[]arr= {1,2,3,4};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(arr, 3));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(arr, 9));
	}
}
