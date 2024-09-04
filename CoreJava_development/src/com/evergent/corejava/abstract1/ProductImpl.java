package com.evergent.corejava.abstract1;

public class ProductImpl extends Product {
	public void newProduct()
	{
		System.out.println("my new product");
	}
	public void show()
	{
		System.out.println("Local methods of product impl class");
	}
    
	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
