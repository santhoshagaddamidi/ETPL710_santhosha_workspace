package com.evergent.corejava.casestudy1;
import java.util.*;
class AgeNotSupportException extends RuntimeException{
	public AgeNotSupportException(String msg) {
		super(msg);
	}
}

class InvalidBookException extends RuntimeException{
	public InvalidBookException(String msg) {
		super(msg);
	}
}
class InvalidLoginException extends RuntimeException{
	public InvalidLoginException(String msg) {
		super (msg);
	}
}
public class LibraryInterfaceDemo {
	static {
		System.out.println("Welcome to Library Application.......!");
		System.out.println("=========================");
	}
	static final String Uname="santhosha";
	public static void main(String[] args) {
		KidUsers kid=new KidUsers();
		AdultUser adu=new AdultUser();
		Library_User lib=new KidUsers();
		//Library_User lib1=new AdultUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name:");
		String s=sc.next();
		try {
		if(Uname.equals(s)) {
			System.out.println("login succesfully.....");
		}
		else {
			throw new InvalidLoginException("please enter correct username....");
		}
		
		while(true) {
			
			lib.show();
			System.out.println("enter login type:");
			int s1=sc.nextInt();
			 switch(s1) {
			 case 1:
				 		try {
				        System.out.println("please enter age:");
			 			int n1=sc.nextInt();
			 			kid.registerAccount(n1);
			 			System.out.println("please enter book type:");
			 			String b1=sc.next();
			 			kid.requestBook(b1);
			 			}
			 			catch(AgeNotSupportException e) {
			 				System.out.println(e);
			 			}
			 			catch(InvalidBookException e) {
			 			System.out.println(e);
			 			}
			 			break;
			 case 2:	try {
				 		System.out.println("please enter age:");
	 					int n2=sc.nextInt();
	 					adu.registerAccount(n2);
	 					System.out.println("please enter book type:");
	 					String b2=sc.next();
	 					adu.requestBook(b2);
	 					}
	 					catch(AgeNotSupportException e) {
	 						System.out.println(e);
	 					}
	 					catch(InvalidBookException e) {
	 						System.out.println(e);
	 					}
	 					break;
			 	case 3:
			 			System.out.println("==================");
			 			System.out.println("Library Kid Users are:");
			 			System.out.println("===================");
			 			System.out.println("User Name"+"      "+"Book Name");
			 			for(int i=0;i<kid.li1.size();i++) {
			 				System.out.println(kid.li1.get(0)+"          "+kid.li2.get(0));
			 			}
			 			break;
			 	case 4:
			 		System.out.println("==================");
		 			System.out.println("Library Adult Users are:");
		 			System.out.println("===================");
		 			System.out.println("User Name"+"      "+"Book Name");
		 			for(int i=0;i<adu.li1.size();i++) {
		 				System.out.println(adu.li1.get(0)+"          "+adu.li2.get(0));
		 			}
		 			break;
			 	case 5:System.out.println("Thanks for Coming.....!");
			 			System.exit(0);
			 	default : System.out.println("please enter valid input.....");
			 				
			 }
			 
			 
			}
		}
		catch(InvalidLoginException e) {
			System.out.println(e);
		}
	}	
}