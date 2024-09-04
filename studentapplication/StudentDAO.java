package com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addStudent(studentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getsId());
			studentList.add(studentBean.getsName());
			studentList.add(studentBean.getsMarks());
			studentList.add(studentBean.getGrade());	
			
			System.out.println(studentList);
			
			System.out.println("Student ID :"+studentBean.getsId());
			System.out.println("Student Name :"+studentBean.getsName());
			System.out.println("Student Marks :"+studentBean.getsMarks());
			System.out.println("Student Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
