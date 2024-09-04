package com.evergent.corejava.santhosha.application4;
//Concrete classes for different types of gadgets
class Phone extends Gadget {
 public Phone(String name, int cost) {
     super(name, cost);
 }

 
 public int calculateCost(int quantity) {
     return this.cost * quantity;
 }
}
