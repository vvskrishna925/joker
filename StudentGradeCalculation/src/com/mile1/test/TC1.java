package com.mile1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mile1.bean.*;
import com.mile1.service.*;

public class TC1 {
	StudentReport sr = new StudentReport();
	@Test
	public void test() {
		Student tc1 = new Student ("sri",new int[] {80,90,70});
		Student tc2 = new Student ("sai",new int[] {80,80,80});
		assertEquals("A",sr.findGrades(tc1));
		assertEquals("A",sr.findGrades(tc2));
		assertTrue(sr.findGrades(tc1).equals("A"));
		assertFalse(sr.findGrades(tc2).equals("B"));
	}

}
