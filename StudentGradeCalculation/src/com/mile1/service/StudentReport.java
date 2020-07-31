package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentReport {

	public String findGrades(Student studentObject)
	{
		int marks[]=studentObject.getMarks();
		int sum=0;
		String grade="";
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
			if(marks[i]<35)
			{
				grade="F";
			    return grade;
			}
		}
		if(sum<=150)
			grade="C";
		else if(sum>150&&sum<=200)
			grade="B";
		else if(sum>200&&sum<=250)
			grade="A";
		else
			grade="A+";
		return grade;
    }
	public String validate(Student s)throws NullStudentObjectException,NullNameException,NullMarksArrayException
	{
		
		if(s==null)
		{
             throw new NullStudentObjectException();
		}
		else
		{
			if(s.getName()==null)
			{
				throw new NullNameException();
			}
			if(s.getMarks()==null)
			{
				throw new NullMarksArrayException();
			}
		}
		return "VALID";
		
	}
}