package com.evergent.corejava.static1;
//non static methods can access static methods and static variables
public class StaticDemo4 {
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
	 StaticDemo4 s4=new StaticDemo4();
     s4.myShow();
     System.out.println(s4.name);
     
	}

}
