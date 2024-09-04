package com.evergent.corejava.santhosha.application4;

class TV extends Gadget {
    public TV(String name, int cost) {
        super(name, cost);
    }

  
    public int calculateCost(int quantity) {
        return this.cost * quantity;
    }
}

