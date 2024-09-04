package com.evergent.corejava.strings;
import java.util.Arrays;
public class StringPerformance5 {

	public static void main(String[] args) {
	String name="JavaTechnologies";
	System.out.println(Arrays.toString(name.toCharArray()));
	System.out.println(name.indexOf('T'));
	//removes spaces
	System.out.println("     Java     ".strip());
		

	}

}
