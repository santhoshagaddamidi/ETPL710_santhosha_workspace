package com.evergent.corejava.oops;

 class PersonData {

	     public void myPersonData() {
		 System.out.println("persondata class method");

	}

}
class PersonInfo extends PersonData
{
	public void myDetails()
	{
		System.out.println("personInfo class method");
	}
}
public class MultilevelInheritanceDemo extends PersonInfo
{
	public void show()
	{
		System.out.println("Local method");
	}

 public static void main(String[] args) {
	 MultilevelInheritanceDemo mi=new MultilevelInheritanceDemo();
	 mi.myPersonData();
	 mi.myDetails();
	 mi.show();
 }
}