package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product {
	public void newProduct()
	{
		System.out.println("my new product");
	}
	public void show()
	{
		System.out.println("Local methods of product impl class");
	}
    
	public static void main(String[] args) {
		Product p2=new ProductImpl2();
		//p2.show();
		p2.newProduct();
		p2.allProducts();
//we can not create object for abstract class but we can create reference

		            
	}

}
