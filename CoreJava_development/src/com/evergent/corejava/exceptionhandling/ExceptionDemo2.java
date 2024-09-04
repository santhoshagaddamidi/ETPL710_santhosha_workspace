package com.evergent.corejava.exceptionhandling;
/*
 3.All exceptions are executed while abnormal conditions only
 4.normal flow it won't execute any exceptions.
 5.once any exceptions are occurring in java then remain lines
  of code is unreachable.
 */
public class ExceptionDemo2 {
	String name="null";
	public void myData()
	{
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("I can handle:"+e);
		}
		
	}

	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
		

	}

}
