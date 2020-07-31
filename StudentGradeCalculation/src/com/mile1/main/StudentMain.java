package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
	static Student data [] = new Student [10];
	static  {
		for (int i = 0; i < data. length; i++) {
			 data [i]= new Student();
			}
		data[0] = new Student ("A1",new int [] {72,73,74});
				data[1] = new Student ("B1", new int [] {75,76,77});
				data [2] = new Student ("C1", new int [] {99,99,99});
				data[3] = new Student ("C3", new int [] {100,100,99});
				data [4] = new Student ("B2", new int [] {13,88,13});
				data[5] = new Student ("C3", new int [] {14,14,99});
				data [6] = new Student (null, new int [] {77,55,12});
				data [7] = new Student (null, new int [] {13,88,13});
				data [8] = null;
				data [9]= new Student("Ram",null);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Student Grades:-");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = e.toString();
			} catch (NullMarksArrayException e) {
				x = e.toString();
			} catch (NullStudentObjectException e) {
				x = e.toString();
			}
			if(x.equals("VALID")) {
				String q=studentReport.findGrades(data[i]);
			System.out.println("Student "+i+" Grade = " +q);
			}
			else
			{
				System.out.println("Student "+i+" Grade = "+x);
			}
		}
		System.out.println("-------------NULL COUNT----------------");
		     System.out.println("Number of Objects with Marks array as null = " +studentService.findNumberOfNullMarksArray(data));
             System.out.println("Number of Objects with Name as null = " +studentService.findNumberOfNullName(data));
             System.out.println("Number of Objects that are entierly null = " +studentService.findNumberOfNullObjects(data));
	}

}
