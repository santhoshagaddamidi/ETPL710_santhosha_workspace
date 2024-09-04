package com.evergent.corejava.santhosha.application4;
class Laptop extends Gadget {
    public Laptop(String name, int cost) {
        super(name, cost);
    }

    public int calculateCost(int quantity) {
        return this.cost * quantity;
    }
}
