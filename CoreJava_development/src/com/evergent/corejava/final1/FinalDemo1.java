package com.evergent.corejava.final1;
//final variables are can't be modify
public class FinalDemo1 {
	final String cname="India";
	public void myData()
	{
		System.out.println(cname);
	}

	public static void main(String[] args) {
		FinalDemo1 fd1=new FinalDemo1();
		fd1.myData();
		

	}

}
