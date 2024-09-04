package com.evergent.corejava.interface1;
//we cannot create object to interface ,but we can create reference to interface
public class BookImpl2 implements Book {
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
		Book b2=new BookImpl2();
		b2.bookAuthor();
		b2.bookPrice();
		b2.bookTitle();
		//b2.show();
		

	}

}
