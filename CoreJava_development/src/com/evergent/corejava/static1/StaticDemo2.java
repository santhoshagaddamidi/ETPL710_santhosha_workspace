package com.evergent.corejava.static1;
//static methods can access static methods and static variables only 
public class StaticDemo2 {
static String cname="India";
	static public void myData()
	{
		System.out.println("Mydata");
	}

	public static void main(String[] args) {
		
     System.out.println(StaticDemo2.cname);
     StaticDemo2.myData();
     
	}

}
