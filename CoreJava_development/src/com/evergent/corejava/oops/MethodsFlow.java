package com.evergent.corejava.oops;

public class MethodsFlow {
	public void display()
	{
		System.out.println("my name is santhosha");
	}
    public void add(int a,int b)
    {
    	System.out.println(a+b);
    }
    public int myData(int a,int b)
    {
    	return (a+b);
    }
    public int myChange()
    {
    	return 100;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFlow mf=new MethodsFlow();
		mf.display();
		mf.add(5, 15);
		int t=mf.myData(5, 5);
		System.out.println(t);
		int k=mf.myChange();
		System.out.println(k);
		
	}

}
