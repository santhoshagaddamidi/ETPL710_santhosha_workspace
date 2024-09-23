package com.evergent.corejava.java8.lambda;

 interface Person3a
 {
	abstract public void eat(String foodName);
 }

public class Lambda3Prog2 {

	public static void main(String[] args) {
		 
		Person3a p3= foodName -> { 
			
				System.out.println("Drink ..."+foodName);
			  			
		};
        p3.eat("Milk");
	}

}