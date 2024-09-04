package com.evergent.corejava.interface1;
interface Vehicle1
{
	interface Engine1
	{
		void stop();
		void start();
	}
	void drive();
}
class Car1 implements Vehicle1.Engine1
{
	public void stop()
	{
		System.out.println("stop the car");
	}
	public void start()
	{
		System.out.println("start the car");
	}
	
}
class Bike1 implements Vehicle1
{
	public void drive()
	{
		System.out.println("bike driving");
	}
	class BikeEngine1 implements Vehicle1.Engine1{
		public void stop()
		{
			System.out.println("bike is stopped");
		}
		public void start()
		{
			System.out.println("bike is started");
		}
	}
}
public class Nested_Interface {

	public static void main(String[] args) {
	  Vehicle1.Engine1 a=new Car1();
	  a.stop();
	  a.start();
	  Vehicle1 b=new Bike1();
	  b.drive();
	  Vehicle1.Engine1 c=new Bike1().new BikeEngine1();
	  c.stop();
	  c.start();
	  

	}

}
