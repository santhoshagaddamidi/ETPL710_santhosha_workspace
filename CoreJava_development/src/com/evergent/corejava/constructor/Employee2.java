package com.evergent.corejava.constructor;
//default constructor
//parameterized constructor
public class Employee2 {
	int eno;
	String ename;
	double sal;
	
	Employee2()
	{
		System.out.println("Default constructor");
	}
	Employee2(int eno1,String ename1,double sal1)
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
		
	}
    public void display()
    {
    	System.out.println("Employee no:"+eno);
    	System.out.println("Employee name:"+ename);
    	System.out.println("Employee sal:"+sal);
    }
	public static void main(String[] args) {
		new Employee2();
		Employee2 emp2=new Employee2(123,"Raj",55000);
		emp2.display();
		

	}

}
