package com.evergent.corejava.constructor;
class Animal{
	private String name;//field(attributes)
	private int age;
	public Animal(String name,int age)//constructor
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()	//method (Behaviour)
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Dog extends Animal//subclass(inheritance)
{
	private String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);//call to super class constructor
		this.breed=breed;
	}
	public void displayInfo()//method overiding (polymorphism)
	{
		super.displayInfo();
		System.out.println("Breed:"+breed);
	}
}
public class Inheritance_Overriding8 {

	public static void main(String[] args) {
		Dog dog=new Dog("Buddy",5,"Golden Retriver");
		dog.displayInfo();	
	}
}
