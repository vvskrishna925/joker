package com.mile1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class TC2 {
	StudentReport sr = new StudentReport();
	@Test
	public void test() {
		Student tc1 = new Student ("sri",new int[] {50,50,40});
		Student tc2 = new Student ("sai",new int[] {40,40,50});
		assertEquals("C",sr.findGrades(tc1));
		assertEquals("C",sr.findGrades(tc2));
		assertTrue(sr.findGrades(tc1).equals("C"));
		assertFalse(sr.findGrades(tc2).equals("F"));
	}

}
