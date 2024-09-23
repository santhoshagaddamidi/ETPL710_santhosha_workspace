package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		//Auto-boxing
		char ch1='a';
		Character myc=new Character(ch1);
		//Auto-unboxing
        char ch=myc.charValue();
        System.out.println("value of ch:"+ch);
        System.out.println(myc);
	}

}
