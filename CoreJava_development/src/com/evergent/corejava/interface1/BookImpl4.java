package com.evergent.corejava.interface1;
//one interface can extend other interface
public class BookImpl4 implements Book,NewBook2 {
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
    public void dataInfo()
    {
    	System.out.println("my new data info");
    }
	public static void main(String[] args) {
		BookImpl4 book1=new BookImpl4();
		book1.bookAuthor();
		book1.bookPrice();
		book1.bookTitle();
		book1.show();
		book1.myNewBook();
     	book1.dataInfo();	
	}}
