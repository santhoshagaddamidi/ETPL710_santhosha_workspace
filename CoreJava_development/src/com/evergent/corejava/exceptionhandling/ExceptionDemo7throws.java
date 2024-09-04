package com.evergent.corejava.exceptionhandling;
//14.throws an exception will be executed method by method
public class ExceptionDemo7throws {
	String name=null;
	int k=0;
	public void myData() throws NullPointerException
	{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	

	public static void main(String[] args) {
		try
		{
			ExceptionDemo7throws ex1=new ExceptionDemo7throws();
			ex1.myData();
		}
	    catch(Exception e)
		{
	    	System.err.println("I can handle"+e);
		}
	    

	}

}
