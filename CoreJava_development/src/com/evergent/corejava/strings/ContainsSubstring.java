package com.evergent.corejava.strings;
//write a program that create a string check if it 
//contains a specific substring and then prints out the result
public class ContainsSubstring {

	public static void main(String[] args) {
		String str="The quick brown ooooofox jumps over the lazy dog";
		String substr="fox";
		boolean contains=str.contains(substr);
		System.out.println("contains:"+substr+" ,"+contains);

	}

}
