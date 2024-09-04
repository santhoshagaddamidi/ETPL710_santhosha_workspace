package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int sId=0;
		String sName="";
		float sMarks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter student ID");
		sId=sin.nextInt();
		System.out.println(("Enter student name"));
	    sName = sin.next();
		System.out.println("Enter student marks");
		sMarks = sin.nextFloat();
		
		StudentService bookService = new StudentService();
		
		int updeateCount=bookService.addStudentService(sId,sName,sMarks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record santhosha Success");
		
		
		
		
	}

}
