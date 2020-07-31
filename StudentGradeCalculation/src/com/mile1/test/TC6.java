package com.mile1.test;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import static org.junit.Assert.*;
import org.junit.Test;


public class TC6 {

	StudentReport sr=new StudentReport();
	@Test
	public void test() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
		Student tc1=new Student("Manoj",null);
		Student tc2=new Student("charan",new int[] {34,50,40});
		String x="";
		try {
			x = sr.validate(tc1);
		} catch (NullNameException e) {
			x = e.toString();
		} catch (NullMarksArrayException e) {
			x = e.toString();
		} catch (NullStudentObjectException e) {
			x = e.toString();
		}
		assertEquals("mark array is null",x);
		
		String y="";
		try {
			y = sr.validate(tc2);
		} catch (NullNameException e) {
			y = e.toString();
		} catch (NullMarksArrayException e) {
			y = e.toString();
		} catch (NullStudentObjectException e) {
			y= e.toString();
		}
		assertEquals("VALID",y);
		
		
		assertFalse(x.equals("VALID"));
		assertTrue(y.equals("VALID"));
	}

	
}
