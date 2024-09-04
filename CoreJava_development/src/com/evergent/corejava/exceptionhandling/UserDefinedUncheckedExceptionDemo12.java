package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException
{
	
public InvalidScoreException(String Message)
{
	super(Message);
}
}
 public class UserDefinedUncheckedExceptionDemo12 {
	//method that throws the custom unchecked exception
	public static void validateScore(int score)
	{
		if(score<0 || score>100)
		{
			throw new InvalidScoreException("score must be between 0 and 100");
		}
		else
		{
			System.out.println("score is valid");
		}
	}	

	public static void main(String[] args) {
		try
		{
			validateScore(110);//this will trigger the exception
		}
        catch(InvalidScoreException e)
		{
        	System.out.println("caught the exception:"+e.getMessage());
        	System.out.println(e);
		}
		System.out.println("program continues after handling the exception");
	}
 }


