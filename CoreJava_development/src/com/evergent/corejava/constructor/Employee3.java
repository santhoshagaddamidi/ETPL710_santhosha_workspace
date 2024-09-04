package com.evergent.corejava.constructor;
//use of this keyword
public class Employee3 {
	int eno;
	String ename;
	double sal;
	
	Employee3()//default constructor
	{
		System.out.println("Default constructor");
	}
	Employee3(int eno,String ename,double sal)//parameterized constructor
	{
		this.eno=eno;
		this.ename=ename;
		sal=sal;
		
	}
    public void display()
    {
    	System.out.println("Employee no:"+eno);
    	System.out.println("Employee name:"+ename);
    	System.out.println("Employee sal:"+sal);
    }
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp2=new Employee3(123,"Raj",55000);
		emp2.display();
		

	}

}
