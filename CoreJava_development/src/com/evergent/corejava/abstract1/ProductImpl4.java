package com.evergent.corejava.abstract1;
//we can access abstract class constructor through 
//sub class,object creation
public class ProductImpl4 extends Product4 {
	public ProductImpl4()
	{
		System.out.println("productImpl sub class constructor");
	}
	public void newProduct()
	{
		System.out.println("my new product");
	}
	public void show()
	{
		System.out.println("Local methods of productsImpl class");
	}
	public static void main(String args[])
	{
		Product4 p3=new ProductImpl4();
		p3.allProducts();
		p3.newProduct();
		
	}

}
