package com.evergent.corejava.santhosha.task3;

	import java.util.HashSet;
	import java.util.Set;

	public class ElectronicsImp implements ElectronicsInterface {
		Set<Electronics> electronicsSet=null;
		public ElectronicsImp() {
			electronicsSet=new HashSet<Electronics>();
		}
		
		@Override
		public String addGadgets(Electronics c) {
			electronicsSet.add(c);
			return c.getCustomerName();
		} 

		@Override
		public void searchBycustomerName(String isbn) {
			boolean b=false;
			if(electronicsSet.size()>0 && electronicsSet!=null){
				for(Electronics gadget:electronicsSet){
					if(gadget.getCustomerName().equals(isbn)){
						System.out.println(gadget.getCustomerName()+" "+gadget.getGadgetName()+" "+gadget.getPrice());	
						b=true;
						break;	
					}
				}
			}
			if(!b)
				System.out.println("The gadgets is not found");
				
		}

		@Override
		public void  getAllGadgets() {
				if(electronicsSet.size()>0){
					for(Electronics gadgets:electronicsSet){
						System.out.println(gadgets.getCustomerName()+" "+gadgets.getGadgetName()+" "+gadgets.getPrice());
					}
						
				}else{
					System.out.println("No gadgets are available");
				}
		}

	}
