package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class ArrayList_WrapperClasses4 {

	public static void main(String[] args) {
		//jdk 1.44
		int a=10;
		Integer i1=new Integer(a);
		ArrayList myList=new ArrayList();
		myList.add(i1);
		Integer i2=new Integer(100);
		myList.add(i2);
		myList.add(new Integer(200));
		System.out.println(myList);
		//jdk 1.5
		ArrayList myList1=new ArrayList();
		myList1.add(100);//internal auto boxing jdk will do
		System.out.println(myList1.get(0));
		//internal auto-unboxing jdk will do

	}

}
