package com.evergent.corejava.strings.immutable;

public class MyData {

	public static void main(String[] args) {
		ImmutableString str=new ImmutableString("Hello,string world!");
		System.out.println(str.myValue());
		System.out.println(str.toString());
		System.out.println(str);

	}

}
