package com.evergent.corejava.santhosha.task3;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;
	 
	public class Electronics_Clent {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ElectronicsInterface e=new ElectronicsImp();
			for(;;){
				System.out.println("1. Add Gadgets 2.Search by customer name 3.displayAll 4. exit");
				int no=sc.nextInt();
				switch(no){
				case 1:System.out.println("Enter the customer name");
					   String isbn=sc.next();
					   System.out.println("Enter the gadget name");
					   String name=sc.next();
					   System.out.println("Enter the price");
					   int price=sc.nextInt();
					   Electronics b=new Electronics();
					   b.setCustomerName(isbn);
					   b.setGadgetName(name);
					   b.setPrice(price);
					   String message=e.addGadgets(b);
					   System.out.println(message);
					   break;
				case 2:System.out.println("Enter the customer name");
				   	   String isb=sc.next();
				   	   e.searchBycustomerName(isb);
				   	   break;
				  			
				case 3:e.getAllGadgets();
					break;
				case 4:System.exit(0);
				}
				
			}
		}
	}
		
