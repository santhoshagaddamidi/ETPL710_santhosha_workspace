package com.evergent.corejava.javabeans;

public class EmployeeBeansImpl {

	public static void main(String[] args) {
		//initialising the values through the bean
		EmployeeBeans emp=new EmployeeBeans();
		emp.setEno(100);
		emp.setEname("santhosha");
		emp.setSal(50000);
		//get the values from the bean
		System.out.println("Employee no:"+emp.getEno());
		System.out.println("Employee no:"+emp.getEname());
		System.out.println("Employee no:"+emp.getSal());

	}

}
