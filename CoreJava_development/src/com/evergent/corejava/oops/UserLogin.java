package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData()
	{
		System.out.println("LoginInfo");
	}
    public void loginData(String uname,String pass)
    {
    	System.out.println("uname:"+uname);
    	System.out.println("pass:"+pass);
    }
    public void loginData(String uname,String pass,String captcha)
    {
    	System.out.println("user name:"+uname);
    	System.out.println("pass:"+pass);
    }
    public void loginData(int mobile,String pass)
    {
    	System.out.println("mobile:"+mobile);
    	System.out.println("pass:"+pass);
    	
    }
    public void show()
    {
    	System.out.println("show method");
    }
	public static void main(String[] args) {
		UserLogin login=new UserLogin();
		login.loginData();
		login.loginData("Raj","Raju123");
		login.loginData("Ravi", "Ravi123", "ABC");
		login.loginData(123456789,"welcome");
		login.show();
		

	}

}
