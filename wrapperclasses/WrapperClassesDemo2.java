package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		Float f2=new Float(f1);
		float f3=f2.floatValue();
		double d1=2.322;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		System.out.println("float value is:"+f1);
		System.out.println("float object value:"+f2);
		
		System.out.println("float value is:"+f3);
		System.out.println("double value is:"+d1);
		System.out.println("double value is:"+d2);
		System.out.println("double value is:"+d3);
		System.out.println("byte value is:"+b1);
		System.out.println("byte value is:"+b2);
		System.out.println("byte value is:"+b3);	
	}
}
