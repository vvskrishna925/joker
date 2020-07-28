package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.wipro.task.*;
public class TestCheckPresence {

	@Test
	public void test() {
		DailyTasks dt = new DailyTasks();
		assertTrue(dt.checkPresence("Krishna", "krishna"));
	}
	@Test
	public void test2() {
		DailyTasks dt = new DailyTasks();
		assertFalse(dt.checkPresence("Krishna", "kris"));
	}
	
}
