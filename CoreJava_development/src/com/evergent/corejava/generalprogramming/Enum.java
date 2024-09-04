package com.evergent.corejava.generalprogramming;
enum Color{
	RED,GREEN,BLUE
}
enum News{
	North,East,West,South
}

	
enum AbcProducts{
	Laptops,Desktops,Tabs;
}
enum Days{
	M,T,W,Tues,F,Sunday
}
public class Enum {

	public static void main(String[] args) {
		Color c=Color.RED;
		System.out.println(c);
		News s=News.North;
		System.out.println(s);
		AbcProducts p=AbcProducts.Laptops;
		System.out.println(p);
		Days day=Days.Sunday;
		System.out.println("Holiday"+day);
				
		
		
		}

	}


