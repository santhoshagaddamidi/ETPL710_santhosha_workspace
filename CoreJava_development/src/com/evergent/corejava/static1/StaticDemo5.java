package com.evergent.corejava.static1;
//whenever the class is loaded into the JVM,at that time static
//block are initialised first only
public class StaticDemo5 {
	static 
	{
		System.out.println("static block:open db/connections");
	}
	
    static String cname="India";
	static public void myData()
	{
		System.out.println("Mydata");
	}

	public static void main(String[] args) {
		
     System.out.println(StaticDemo5.cname);
     StaticDemo5.myData();
     
	}

}
