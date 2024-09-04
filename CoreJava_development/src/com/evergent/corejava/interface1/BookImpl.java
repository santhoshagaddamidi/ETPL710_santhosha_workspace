package com.evergent.corejava.interface1;
//if any class implements interface that class should be 
//override all interface methods otherwise that class will be showing 
//compile time error 
public class BookImpl implements Book {
	public void bookTitle()
	{
		System.out.println("core Java");
	}
	public void bookAuthor()
	{
		System.out.println("oracle crop:"+cName);
		
	}
	public void bookPrice()
	{
		System.out.println("rs 550");
	}
	public void show()
	{
		System.out.println("Local methods of BookIMPL");
	}

	public static void main(String[] args) {
		BookImpl book1=new BookImpl();
		book1.bookAuthor();
		book1.bookPrice();
		book1.bookTitle();
		book1.show();
		

	}

}
