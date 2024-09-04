package com.evergent.corejava.final1;
//final methods we can't override
class MyClass1
{
	final public void myProducts()
	{
		System.out.println("All products");
	}
}
public class FinalDemo3 extends MyClass1 {
	final String cname="India";
	public void myProducts1()
	{
		System.out.println("new Products");
	}
	public static void main(String[] args) {
		FinalDemo3 fd1=new FinalDemo3();
		fd1.myProducts();
		fd1.myProducts1();
		
		

	}

}
