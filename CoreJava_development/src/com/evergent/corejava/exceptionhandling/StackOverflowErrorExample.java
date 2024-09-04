package com.evergent.corejava.exceptionhandling;

public class StackOverflowErrorExample {

	public static void main(String[] args) {
		try
		{
			recursiveMethod();//start the recursive method
		}
		catch(StackOverflowError e)
		{
			System.out.println("stack over flow error caught:"+e.getMessage());
		}
	}
		public static void recursiveMethod()
		{
			recursiveMethod();//the method keeps calling itself
		}

	}


