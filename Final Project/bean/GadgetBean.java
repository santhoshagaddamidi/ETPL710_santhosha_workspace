package com.evergent.corejava.bean;

public class GadgetBean {
    private int gadgetId;
    private String gadgetName;
    private String model;
    private double price;
    private int stockQuantity;

    // Getters and Setters
    public int getGadgetId() {
        return gadgetId;
    }
    public void setGadgetId(int gadgetId) {
        this.gadgetId = gadgetId;
    }
    public String getGadgetName() {
        return gadgetName;
    }
    public void setGadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}