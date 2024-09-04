package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo8throws2 {
	String name=null;
	int k=0;
	public void myData() throws NullPointerException
	{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	
     public void myChange() throws NullPointerException
     {
    	 myData();
    	 System.out.println("mychange method");
     }
	public static void main(String[] args) {
		try
		{
			ExceptionDemo8throws2 ex1=new ExceptionDemo8throws2();
			ex1.myData();
		}
	    catch(Exception e)
		{
	    	System.err.println("I can handle"+e);
		}
	    

	}

}
