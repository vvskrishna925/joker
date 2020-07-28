package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

	@Test
	public void test() {
		DailyTasks dt = new DailyTasks();
		String s1 = "Vvs";
		String s2 = "Krishna";
		assertEquals("VvsKrishna",dt.doStringConcat(s1, s2));
	}
	@Test
	public void test2() {
		DailyTasks dt = new DailyTasks();
		String s1 = "Vvs";
		String s2 = "Krishna";
		assertEquals("Vvs",dt.doStringConcat(s1, s2));
	}

}
