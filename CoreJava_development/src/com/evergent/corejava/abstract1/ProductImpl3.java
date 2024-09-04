package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product {
	public void newProduct()
	{
		//it is not final,the variables are overriding
		String cName="welcome";
		System.out.println("my new product:"+cName);
	}
	public void show()
	{
		System.out.println("Local methods of product impl class:");
	}
    
	public static void main(String[] args) {
		Product p2=new ProductImpl3();
		//p2.show();
		p2.newProduct();
		p2.allProducts();
		            
	}

}
