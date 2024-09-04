package com.evergent.corejava.casestudy1;

import java.util.*;

public class KidUsers extends Library_User {
	Scanner sc=new Scanner(System.in);
	static ArrayList<String> li1=new ArrayList<>();
	static ArrayList<String> li2=new ArrayList<>();
	public void registerAccount(int age) throws AgeNotSupportException
	{
	if(age<12) {
		System.out.println("You have successfully registered under a Kids Account");
	}
	else {
		throw new AgeNotSupportException("Sorry, Age must be less than 12 to register as a kid");
	}
	}
	public void registerAccount(double age) {
		System.out.println("age not be in double");
	}
	public void requestBook(String bookType) throws InvalidBookException
	{
	
	if(bookType.equals("kids")) {
		System.out.println("Book Issued successfully, please return the book within 10 days");
		System.out.println("entre your name:");
		String name=sc.next();
		li1.add(name);
		li2.add(bookType);
	}
	else {
		throw new InvalidBookException("Oops, you are allowed to take only kids books");
	}
	
	}
}
