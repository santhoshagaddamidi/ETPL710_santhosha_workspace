package com.evergent.corejava.generalprogramming;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("Name" +name);
		System.out.println("Add"+(a+b));
		

	}

}
