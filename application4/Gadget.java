package com.evergent.corejava.santhosha.application4;
// Abstract class representing a generic electronic gadget
abstract class Gadget {
    protected String name;
    protected int cost;

    public Gadget(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public abstract int calculateCost(int quantity);
}