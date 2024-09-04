package com.evergent.corejava.strings;
//reverse the order of its characters and then print out the result
public class ReverseString {

	public static void main(String[] args) {
		String str="Hello,World";
		StringBuilder reversed=new StringBuilder(str).reverse();
		System.out.println(reversed);

	}

}
