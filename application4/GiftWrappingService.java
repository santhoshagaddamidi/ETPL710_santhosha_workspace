package com.evergent.corejava.santhosha.application4;

class GiftWrappingService implements Service {
    private static final int COST = 50;

    
    public void execute() {
        System.out.println("Gift wrapping is available for an additional Rs " + COST + ".");
    }

    public int getCost() {
        return COST;
    }
}

