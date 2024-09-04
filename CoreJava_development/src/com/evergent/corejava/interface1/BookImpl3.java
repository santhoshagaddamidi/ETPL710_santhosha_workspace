package com.evergent.corejava.interface1;
//java will support multiple inheritance through interface
public class BookImpl3 implements Book,NewBook {
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
	public void myNewBook()
	{
		System.out.println("My new book");
	}

	public static void main(String[] args) {
		BookImpl3 book1=new BookImpl3();
		book1.bookAuthor();
		book1.bookPrice();
		book1.bookTitle();
		book1.show();
		book1.myNewBook();		
}

}
