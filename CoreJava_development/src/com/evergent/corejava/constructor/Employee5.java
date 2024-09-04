package com.evergent.corejava.constructor;
//this keyword is used to instance the data of one constructor to 
//another constructor ,within same class,without creating the object
public class Employee5 {
	int eno;
	String ename;
	double sal;
	
	Employee5()//default constructor
	{
		System.out.println("Default constructor");
	}
	Employee5(int eno)
	{
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal)//parameterized constructor
	{
		this(eno);
		this.ename=ename;
		this.sal=sal;
		
	}
    public void display()
    {
    	System.out.println("Employee no:"+eno);
    	System.out.println("Employee name:"+ename);
    	System.out.println("Employee sal:"+sal);
    }
	public static void main(String[] args) {
		new Employee5();
		Employee5 emp2=new Employee5(123,"Raj",55000);
		emp2.display();
		}
}


