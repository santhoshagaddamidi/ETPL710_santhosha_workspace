package com.evergent.corejava.exceptionhandling;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String Message)
	{
		//message the detail message ,the detail message is saved
		//for later retrieval by the getmessage() method
		super(Message);
	}
}
public class UserDefinedExceptionDemo10 {
	//method that throws the custom checked exception
	public static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age must be 18 or older");
		}
		else
		{
			System.out.println("access granted-you are ols enough");
			
		}
	}
	public static void main(String[] args) {
		try
		{
			checkAge(16);//this will trigger the exception
		}
		catch(InvalidAgeException e)
		{
			System.out.println("caught the exception:"+e.getMessage());
			System.out.println(e);
		}
        System.out.println("program continues after handling the exception");
	}}
