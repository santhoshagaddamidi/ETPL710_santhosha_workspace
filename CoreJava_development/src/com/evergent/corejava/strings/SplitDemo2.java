package com.evergent.corejava.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str="Java is a powerful programming language";
		//split the string by space using for each loop
		String[] words= str.split(" ");
		  for(String w:words)
	        {
	        	System.out.println(w);
	        }

	}

}
