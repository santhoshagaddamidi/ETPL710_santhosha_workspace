package com.evergent.corejava.logicalprogramming;

public class LogicalProgramming2 {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0;
		System.out.print(n1+""+n2);
		for(int i=1;i<=5;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum);
		}
        System.out.println();
	}

}
