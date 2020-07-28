package com.wipro.test;

import static org.junit.Assert.*;



import org.junit.Test;
import com.wipro.task.*;
public class TestSort {

	@Test
	public void test() {
		DailyTasks dt = new DailyTasks();
		int[] arr  = {3,4,5,2,7,6};
		int[] expectedArray = {2,3,4,5,6,7};
		int[] resultantArray = dt.sortValues(arr);
		assertArrayEquals(expectedArray,resultantArray);
	}

}
