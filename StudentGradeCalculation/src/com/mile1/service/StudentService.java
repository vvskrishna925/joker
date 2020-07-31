package com.mile1.service;
import com.mile1.bean.*;
public class StudentService {
    
	public int findNumberOfNullMarksArray(Student s []){
	 // write code here
		int c=0;
		if(s!=null)
		{
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=null)
			{
			try
			{
			if(s[i].getMarks()==null)
				c++;
			}
			catch(Exception e)
		    {
		    }
			}
		}
		}
		return c;
	}
	public int findNumberOfNullName(Student s []) {
	int c=0;
	for(int i=0;i<s.length;i++)
	{
       if(s[i]!=null)
       {
		try
		{
		if(s[i].getName()==null)
			{
			c++;
			}
		}
		catch(Exception e)
		{
		}
       }

	}	
	return c;
	}
	public int findNumberOfNullObjects(Student s []) {
		int c=0;
		for(int i=0;i<s.length;i++)
		{
			try
			{
			    if(s[i]==null)
			    	{
			    	c++;
			    	}
			}
			catch(Exception e) {
				
			}
		}	
		return c;
	}
}
