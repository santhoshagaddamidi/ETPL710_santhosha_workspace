package com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String Message)
	{
		super(Message);
	}
}
public class UserDefinedExceptionFunds11 {
	//method that throws a custom checked exception
	public static void withdraw(double amount)  throws InsufficientFundsException
	{
	    double balance=500.00;
	    if(amount>balance)
	    {
	    	throw new  InsufficientFundsException(" Insufficient Funds for withdraw");
	    }
	    else
	    {
	    	System.out.println("withdrawl successful");
	    }
	}
		public static void main(String[] args) {
		try
		{
			withdraw(600.00);//this will throw an throws InsufficientFundsException
		}
		catch( InsufficientFundsException e)
		{
			System.out.println("caught hrows InsufficientFundsException:"+e.getMessage());
			System.out.println(e);
		}
          System.out.println("program continues after handling the exception");
	}

}
