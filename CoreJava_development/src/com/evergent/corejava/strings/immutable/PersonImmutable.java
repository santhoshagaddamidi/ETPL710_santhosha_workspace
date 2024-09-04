package com.evergent.corejava.strings.immutable;

final public class PersonImmutable {
  private final String name;
  private final int age;
  //construction to initialize the final fields
  public PersonImmutable(String name,int age)
  {
	  this.name=name;
	  this.age=age;
  }
  public String myName()
  {
	  return name;
  }
  public int myAge()
  {
	  return age;
  }

}
