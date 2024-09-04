package com.evergent.corejava.oops;

public class Person {
	String pname="Santhosha";
	int page=22;
	String address="Hyderabad";
	public void display()
	{
		System.out.println("name of person"+pname);
		System.out.println("age of the person"+page);
		System.out.println("address of the person"+address);
	}

	public static void main(String[] args) {
		 Person p=new Person();
		p.display();
		

	}

}
