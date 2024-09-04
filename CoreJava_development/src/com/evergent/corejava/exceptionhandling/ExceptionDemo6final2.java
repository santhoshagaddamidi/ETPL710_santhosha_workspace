package com.evergent.corejava.exceptionhandling;
/*
 16.try followed by either catch clock or finally
 */
public class ExceptionDemo6final2 {
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
		finally
		{
			System.out.println("finally block close connections");
		}
		
	}

	public static void main(String[] args) {
		ExceptionDemo6final2 ed2=new ExceptionDemo6final2();
		ed2.myData();
		

	}

}
