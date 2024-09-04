package com.evergent.corejava.javabeans;

public class ProductBeanImpl {

	public static void main(String[] args) {
		ProductBean product=new ProductBean(10,"Laptop",85000);
		System.out.println("Product no:"+product.getPno());
		System.out.println("Product no:"+product.getPname());
		System.out.println("Product no:"+product.getPrice());
	}

}
