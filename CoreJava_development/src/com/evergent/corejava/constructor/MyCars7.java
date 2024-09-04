package com.evergent.corejava.constructor;
class Car
{
	String color;
	int maxspeed;////default constructor
	Car()
	{
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed)//parameterized constructor
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display()
	{
		System.out.println("color:"+color);
		System.out.println("maxspeed:"+maxspeed);
	}
}
public class MyCars7 {

	public static void main(String[] args) {
		//creating objects using different constructors
		Car car1=new Car();
		Car car2=new Car();
		car1.display();
		car2.display();
		

	}

}
