package com.evergent.corejava.constructor;
//constructor doesnot have return type not even void also,if declare as a void then it will considered as the method

public class Employee4 {
	void Employee4()
	{
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
	Employee4 emp4=new Employee4();
	emp4.Employee4();
	}

}
