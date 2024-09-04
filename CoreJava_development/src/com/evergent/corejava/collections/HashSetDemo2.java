package com.evergent.corejava.collections;
import java.util.HashSet;
public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add("hello");
		mySet.add(100);
		mySet.add(20);
		mySet.add(45.2);
		System.out.println(mySet);
		

	}

}
