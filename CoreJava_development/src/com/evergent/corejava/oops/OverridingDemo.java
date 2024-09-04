package com.evergent.corejava.oops;
class myDataInfo
{
	public void myDataInfo()
	{
		System.out.println("Super class method");
	}
	
}


public class OverridingDemo extends myDataInfo {
	public void myData()
	{
		System.out.println("Sub class method");
	}

	public static void main(String[] args) {
		OverridingDemo od=new OverridingDemo();
		od.myData();
		

	}

}
