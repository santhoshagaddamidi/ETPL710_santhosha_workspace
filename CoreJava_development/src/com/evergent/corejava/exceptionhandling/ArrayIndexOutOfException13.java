package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfException13 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		
        try
        {
        	//code that might throw an exception
        	System.out.println("accessing index 10:"+numbers[10]);
        	
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("caught the exception"+e.getMessage());
        }
	}

}
