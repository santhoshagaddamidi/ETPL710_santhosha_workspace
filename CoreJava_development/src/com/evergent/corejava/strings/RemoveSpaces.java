package com.evergent.corejava.strings;
//remove all spaces from the string,print out the string
public class RemoveSpaces {

	public static void main(String[] args) {
		String str="Hello world,this is a test";
		String nospaces=str.replace(" ", "");
		System.out.println(nospaces);

	}

}
