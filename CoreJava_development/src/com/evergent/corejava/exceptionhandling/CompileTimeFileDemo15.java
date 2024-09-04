package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CompileTimeFileDemo15 {
	

	public static void main(String[] args) {
		try
		{
			//attempt to open a file that doesn't exist
			File file =new File("D:/CoreJava_Training/myinfo.txt");
			Scanner scanner =new Scanner(file);
			while(scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
	
		}
		catch(FileNotFoundException e)
		{
			//Handle the FileNotFoundException 
			//System.out.println("file not found:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
