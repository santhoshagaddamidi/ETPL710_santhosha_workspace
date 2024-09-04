package com.evergent.corejava.interface1;
//Outer interface
interface Vehicle {

 // Nested interface
	interface Engine {
		void start();
		void stop();
 }

 void drive();
}

//Implementing the nested interface
class Car implements Vehicle.Engine {
 public void start() {
     System.out.println("Car engine started.");
 }
 public void stop() {
     System.out.println("Car engine stopped.");
 }
}

//Implementing the outer interface
class Bike implements Vehicle {
 public void drive() {
     System.out.println("Bike is driving.");
 }
 // Implementing the nested interface within the same class
 class BikeEngine implements Vehicle.Engine {
  
     public void start() {
         System.out.println("Bike engine started.");
     }

     @Override
     public void stop() {
         System.out.println("Bike engine stopped.");
     }
 }
}
//Main class to test the nested interfaces
public class Main {
 public static void main(String[] args) {
     // Using the Car class
     Vehicle.Engine carEngine = new Car();
     carEngine.start();
     carEngine.stop();

     // Using the Bike class and its nested BikeEngine class
     Vehicle bike = new Bike();
     bike.drive();
     Vehicle.Engine bikeEngine = new Bike().new BikeEngine();
     bikeEngine.start();
     bikeEngine.stop();
 }
}
