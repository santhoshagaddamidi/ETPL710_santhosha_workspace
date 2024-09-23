package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);//automatically primitive data type to object
		System.out.println(i1);
		//object to primitive data type 
		int a1=i1.intValue();
		System.out.println(a1);
				

	}

}
