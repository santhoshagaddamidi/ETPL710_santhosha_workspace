package com.evergent.corejava.strings;

public class StringPerformance3 {
//string performance
	public static void main(String[] args) {
		String series="";
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			series=series+ch;
		}
			 System.out.print(series);	
       
	}

}
