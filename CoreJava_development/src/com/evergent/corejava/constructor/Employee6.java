package com.evergent.corejava.constructor;
//super is a keyword ,it always calls the super class
class myEmployee {
	int eno;
	public myEmployee() {	
	}
	public myEmployee(int eno)//default constructor
	{	
		System.out.println("myemployee no:"+eno);
	}
}
public class Employee6 extends myEmployee{
	String ename;
	double sal;
	Employee6()
	{
		System.out.println("Default constructor");
	}
	Employee6(int eno,String ename,double sal)//parameterized constructor
	{
		super(eno);
		this.ename=ename;
		this.sal=sal;	
	}
    public void display()
    {
    	
    	System.out.println("Employee name:"+ename);
    	System.out.println("Employee sal:"+sal);
    }
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp2=new Employee6(123,"Raj",55000);
		emp2.display();
	}
}
