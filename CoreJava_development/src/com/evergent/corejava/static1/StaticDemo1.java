package com.evergent.corejava.static1;
//static methods can access static methods and static variables only 
public class StaticDemo1 {
static String cname="India";
	static public void myData()
	{
		System.out.println("Mydata");
	}

	public static void main(String[] args) {
		
     System.out.println(cname);
     StaticDemo1.myData();
     
	}

}
