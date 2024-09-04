package com.evergent.corejava.santhosha.application4;

//Class to handle warranty
class WarrantyModule
{
	private String warrantyStatus = "Standard 1-Year Warranty";
	public void checkWarranty() 
	{
		System.out.println("Current warranty status: " + warrantyStatus);
	}
	public void extendWarranty() 
	{
		warrantyStatus = "Extended 2-Year Warranty";
		System.out.println("Warranty has been extended! New status: " + warrantyStatus);
	}
}