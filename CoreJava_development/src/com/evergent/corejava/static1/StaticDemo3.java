package com.evergent.corejava.static1;
//static methods can not access non static methods and 
//non static varibles
public class StaticDemo3 {
static String cname="India";//static variable
       String name="Ravi";//non static variable
	static public void myData()//static method
	{   //myshow
		System.out.println("Mydata:static method");
	}
    public void myShow()
    {   myData();
    	System.out.println("santhosha");
    }
	public static void main(String[] args) {
		
     System.out.println(cname);
     StaticDemo3.myData();
     
	}

}
