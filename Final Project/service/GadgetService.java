package com.evergent.corejava.service;

import com.evergent.corejava.bean.*;
import com.evergent.corejava.dao.*;

public class GadgetService {
    String str = "";
    GadgetDAO gadgetDAO = new GadgetDAO();

    public int addGadget(int gadgetId, String gadgetName, String model, double price, int stockQuantity) {
        GadgetBean gadget = new GadgetBean();
        gadget.setGadgetId(gadgetId);
        gadget.setGadgetName(gadgetName);
        gadget.setModel(model);
        gadget.setPrice(price);
        gadget.setStockQuantity(stockQuantity);
        int re = gadgetDAO.addGadget(gadget);
        if (re != 0) {
            str = "Added Gadget: " + gadgetName;
            gadgetDAO.addTransaction(gadgetId, str);
        }
        return re;
    }

    public String showGadgetDetails(int gadgetId) {
        return gadgetDAO.showGadget(gadgetId);
    }

    public int updateStock(int gadgetId, int stock) {
        int a = gadgetDAO.updateStock(gadgetId, stock);
        str = "Updated Stock by: " + stock;
        gadgetDAO.addTransaction(gadgetId, str);
        return a;
    }

    public int sellGadget(int gadgetId, int qty) {
        int a = gadgetDAO.sellGadget(gadgetId, qty);
        if (a != 0) {
            str = "Sold Quantity: " + qty;
            gadgetDAO.addTransaction(gadgetId, str);
        }
        return a;
    }

    public int transferStock(int gadgetId1, int gadgetId2, int qty) {
        int fromStock = gadgetDAO.sellGadget(gadgetId1, qty);
        int toStock = gadgetDAO.updateStock(gadgetId2, qty);
        if (fromStock != 0 && toStock != 0) {
            str = "Transferred Stock of " + qty + " from Gadget ID " + gadgetId1 + " to Gadget ID " + gadgetId2;
            gadgetDAO.addTransaction(gadgetId1, str);
            gadgetDAO.addTransaction(gadgetId2, str);
        }
        return toStock;
    }

    public String getTransactionHistory(int gadgetId) {
        return gadgetDAO.getTransaction(gadgetId);
    }
}