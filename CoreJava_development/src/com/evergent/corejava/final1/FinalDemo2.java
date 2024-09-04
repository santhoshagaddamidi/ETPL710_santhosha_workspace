package com.evergent.corejava.final1;
//final methods we can't override
final class MyClass
{
	final public void myProducts()
	{
		System.out.println("All products");
	}
}
public class FinalDemo2  {
	final String cname="India";
	public void myProducts1()
	{
		System.out.println("new Products");
	}
	public static void main(String[] args) {
		FinalDemo2 fd1=new FinalDemo2();
		MyClass my=new MyClass();
		
		my.myProducts();
		fd1.myProducts1();
		
		

	}

}
