package com.evergent.corejava.controller;

import java.util.Scanner;
import com.evergent.corejava.service.*;

public class GadgetController {
    public static void main(String[] args) {
        int gadgetId = 0;
        String gadgetName = "";
        String model = "";
        double price = 0;
        int stockQuantity = 0;
        int ch, ch1 = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("-----------------WELCOME TO GADGET STORE-----------------");
        GadgetService gadgetService = new GadgetService();
        
        while (ch1 != 0) {
            System.out.println("1. Add a New Gadget");
            System.out.println("2. Show Gadget Details");
            System.out.println("3. Update Stock");
            System.out.println("4. Sell Gadget");
            System.out.println("5. Transfer Stock");
            System.out.println("6. Print Transactions");
            System.out.println("Enter your choice :");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Gadget ID");
                    gadgetId = s.nextInt();
                    System.out.println("Enter Gadget Name");
                    gadgetName = s.next();
                    System.out.println("Enter Model");
                    model = s.next();
                    System.out.println("Enter Price");
                    price = s.nextDouble();
                    System.out.println("Enter Stock Quantity");
                    stockQuantity = s.nextInt();
                    int updateCount = gadgetService.addGadget(gadgetId, gadgetName, model, price, stockQuantity);
                    System.out.println(updateCount + " Gadget Added Successfully");
                    break;
                case 2:
                    try {
                        System.out.println("Enter Gadget ID");
                        int id = s.nextInt();
                        String details = gadgetService.showGadgetDetails(id);
                        System.out.println("Gadget Details: " + details);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter Gadget ID");
                        int id = s.nextInt();
                        System.out.println("Enter Stock to Add");
                        int stock = s.nextInt();
                        int updatedStock = gadgetService.updateStock(id, stock);
                        System.out.println("Stock Updated Successfully, New Stock: " + updatedStock);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter Gadget ID");
                        int id = s.nextInt();
                        System.out.println("Enter Quantity to Sell");
                        int qty = s.nextInt();
                        int status = gadgetService.sellGadget(id, qty);
                        if (status == 0) {
                            System.out.println("Insufficient Stock");
                        } else {
                            System.out.println("Gadget Sold Successfully");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Enter Source Warehouse Gadget ID");
                    int id1 = s.nextInt();
                    System.out.println("Enter Destination Warehouse Gadget ID");
                    int id2 = s.nextInt();
                    System.out.println("Enter Quantity to Transfer");
                    int qty = s.nextInt();
                    int transferStatus = gadgetService.transferStock(id1, id2, qty);
                    if (transferStatus == 0) {
                        System.out.println("Insufficient Stock for Transfer");
                    } else {
                        System.out.println("Stock Transferred Successfully");
                    }
                    break;
                case 6:
                    System.out.println("Enter Gadget ID");
                    int id = s.nextInt();
                    String transactions = gadgetService.getTransactionHistory(id);
                    System.out.println("-----GADGET TRANSACTIONS-----\n" + transactions);
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("\nEnter 1 to perform more operations and 0 to Exit:");
            ch1 = s.nextInt();
        }
    }
}