package com.evergent.corejava.strings;
//append():adds a string to the end of the current string
//insert():adds a string at a specific position in the current string
//replace():replaces a substring with a new string
//delete():removes a substring from the current string
//reverse():reverse a substring from the current string
//capacity():returns the current capacity capacity of the buffer
//length():returns the current length of the string
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		//append a string
		sb.append("  world!");
		System.out.println("After append:"+sb);
		//Insert a string at a specific position
		sb.insert(6,"Beautiful");
		System.out.println("after insert:"+sb);
		//replace a substring 
        sb.replace(0, 5,"Hi");
        System.out.println("after replace:"+sb);
        //delete a substring
        sb.delete(0, 3);
        System.out.println("after delete:"+sb);
        //reverse a string 
        sb.reverse();
        System.out.println("After reverse:"+sb);
        //capacity and length
        System.out.println("capacity:"+sb.capacity());
        System.out.println("length:"+sb.length());
        
	}

}
