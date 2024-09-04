package com.evergent.corejava.santhosha.application2;

import java.io.IOException;
import java.util.Scanner;

public class ElectronicsGadgetsManagementSystem_Santhosha {
    enum module1 {A, B, C, D, E, F};
    enum submodule1 {P, L, T};
    enum submodule2 {C, M, I, H, G};
    enum submodule3 {I,S,P};
    enum submodule4 {W, E};
    enum submodule5 {P, N};
    enum submodule1_1 {R, O, V};
    enum submodule1_2 {A, B, C};
    enum submodule1_3 {S, L, SS};
    static int itemcost;
    static int amount;
    static int pieces;
    static int amountdisc;
    static int giftWrapCost = 50; // Cost of gift wrapping
    
    static boolean giftWrappingSelected = false; // Track if gift wrapping is selected
    static String warrantyStatus = "Standard 1-Year Warranty";

    public static void main(String[] args) throws IOException {
        String module = null;
        Scanner br = new Scanner(System.in);
        
        System.out.println("\n\t <<<<<<<Welcome To Electronics Gadgets Management System>>>>>>>");
        
        while (true) {
        	
            System.out.println("-----------------------------");
            System.out.println("BAJAJ ELECTRONICS");
            System.out.println("-----------------------------");
            System.out.println("A-Gadgets - Electronic gadgets module.....");
            System.out.println("B-Services - Services module......");
            System.out.println("C-Payment - Payment Module.....");
            System.out.println("D-Warranty - Warranty Module.....");
            System.out.println("E-Feedback - Feedback Module.....");
            System.out.println("F-Exit - Quit Module");
            System.out.println("-----------------------------");
            System.out.println("Enter your Module codes (A, B, C, D, E, F) : ");
            module = br.nextLine().toUpperCase();
            System.out.println("You entered module: " + module);
            
            switch (module1.valueOf(module)) {
            
                case A:
                    System.out.println("<<<<<Electronics Gadgets>>>>>");
                    System.out.println("-------------------------");
                    
                    System.out.println("P-Phones");
                    System.out.println("L-Laptops");
                    System.out.println("T-TVs");
                    System.out.println("------------------------------");
                    System.out.println("Enter your Gadgets Codes (P, L, T) : ");
                    module = br.nextLine().toUpperCase();
                    switch (submodule1.valueOf(module)) {
                    
                        case P:
                            System.out.println("------------------------");
                            System.out.println("R-redmi");
                            System.out.println("O-oppo");
                            System.out.println("V-vivo");
                            System.out.println("------------------------------");
                            System.out.println("Enter your phone Codes (R, O, V) : ");
                            module = br.nextLine().toUpperCase();
                            switch (submodule1_1.valueOf(module)) {
                                case R:
                                    itemcost = 10000;
                                    break;
                                case O:
                                    itemcost = 15000;
                                    break;
                                case V:
                                    itemcost = 20000;
                                    break;
                            }
                            
                            break;
                        case L:
                            System.out.println("------------------------");
                            System.out.println("A-Dell");
                            System.out.println("B-acer");
                            System.out.println("C-hp");
                            System.out.println("------------------------------");
                            System.out.println("Enter your Laptop Codes (A, B,C) : ");
                            module = br.nextLine().toUpperCase();
                            switch (submodule1_2.valueOf(module)) {
                                case A:
                                    itemcost = 40000;
                                    break;
                                case B:
                                    itemcost = 50000;
                                    break;
                                case C:
                                    itemcost = 44000;
                                    break;
                            }
                            break;
                            
                        case T:
                            System.out.println("------------------------");
                            
                            System.out.println("S-sony");
                            System.out.println("L-LG");
                            System.out.println("SS-samsung");
                            System.out.println("------------------------------");
                            System.out.println("Enter your TV Codes (S, L, SS) : ");
                            module = br.nextLine().toUpperCase();
                            switch (submodule1_3.valueOf(module)) {
                                case S:
                                    itemcost = 25000;
                                    break;
                                case L:
                                    itemcost = 30000;
                                    break;
                                case SS:
                                    itemcost = 14000;
                                    break;
                            }
                            break;
                    }
                    
                    System.out.println("Enter the number of pieces");
                    
                    pieces = Integer.parseInt(br.nextLine());
                    System.out.println("You selected no of pieces: " + pieces);
                    amount = itemcost * pieces;
                    System.out.println("Amount for ordered gadgets before discount is Rs " + amount);
                    if (amount >= 20000 && amount <= 30000)
                        amountdisc = (int) (amount - (amount * 0.02));
                    if (amount >= 30000 && amount <= 50000)
                        amountdisc = (int) (amount - (amount * 0.05));
                    else if (amount >= 51000 && amount <= 100000)
                    	
                        amountdisc = (int) ((amount - amount * 0.06));
                    else if (amount >= 150000)
                        amountdisc = (int) ((amount - amount * 0.08));
                    System.out.println("Amount for ordered items after Discount for selected pieces is Rs " + amountdisc);
                    break;
                
                case B:
                    System.out.println("--------------------------");
                    System.out.println("C-Call");
                    System.out.println("M-Mail");
                    System.out.println("I-Instagram");
                    System.out.println("H-Home Delivery");
                    System.out.println("G-Gift Wrapping");
                    System.out.println("------------------------------");
                    System.out.println("Enter your Module Codes (C, M, I, H, G) : ");
                    module = br.nextLine().toUpperCase();
                    
                    switch (submodule2.valueOf(module)) {
                    
                        case C:
                            System.out.println("Phone number: 6301664899");
                            break;
                        case M:
                            System.out.println("Mail address: santhoshagoud57@gmail.com");
                            break;
                        case I:
                            System.out.println("Instagram ID: ramya123");
                            break;
                        case H:
                            System.out.println("Home delivery is available within 3-5 business days.");
                            break;
                        case G:
                            System.out.println("Gift wrapping is available for an additional Rs 50.");
                            giftWrappingSelected = true;
                            break;
                    }
                    break;

                case C:
                    System.out.println("Payment Module");
                    System.out.println("------------------------");
                    System.out.println("I-Invoice");
                    System.out.println("S-Summary");
                    System.out.println("P-payamount");
                    System.out.println("---------------------------");
                    System.out.println("Enter your payment Codes (I, S, P) : ");
                    module = br.nextLine().toUpperCase();
                    if (giftWrappingSelected) {
                        amountdisc += giftWrapCost;
                    }
                    
                    switch (submodule3.valueOf(module)) {
                        case I:
                            System.out.println("Invoice Display");
                            System.out.println("----------------------------");
                            System.out.println("Ordered ID : " + (Math.ceil(Math.random() * 1000)));
                            System.out.println("You selected no of pieces: " + pieces);
                            System.out.println("To Make Payment: Rs " + amount);
                            break;
                        case S:
                            System.out.println("Summary Of Order");
                            System.out.println("-------------------------------------");
                            System.out.println("You selected electronics item cost Rs " + amount);
                            System.out.println("You selected no of pieces: " + pieces);
                            System.out.println("Amount for ordered items after Discount for selected pieces is Rs " + amountdisc);
                            if (giftWrappingSelected) {
                                System.out.println("Gift wrapping selected: Rs " + giftWrapCost);
                            }
                            System.out.println("\n");
                            System.out.println("Total Amount to be Paid: Rs " + amountdisc);
                            break;
                        case P:
                            System.out.println("Total payment amount: Rs " + amountdisc);
                            break;
                    }
                    
                    break;

                case D:
                    System.out.println("Warranty Module");
                    System.out.println("------------------------");
                    System.out.println("W-WarrantyCheck");
                    System.out.println("E-ExtendWarranty");
                    System.out.println("---------------------------");
                    System.out.println("Enter your warranty Codes (W, E) : ");
                    module = br.nextLine().toUpperCase();
                    switch (submodule4.valueOf(module)) {
                        case W:
                            System.out.println("Current warranty status: " + warrantyStatus);
                            break;
                        case E:
                            warrantyStatus = "Extended 2-Year Warranty";
                            System.out.println("Warranty has been extended! New status: " + warrantyStatus);
                            break;
                    }
                    
                    break;

                case E:
                    System.out.println("Feedback Module");
                    System.out.println("------------------------");
                    System.out.println("P-Positive");
                    System.out.println("N-Negative");
                    System.out.println("---------------------------");
                    System.out.println("Enter your Feedback Codes(P, N) : ");
                    module = br.nextLine().toUpperCase();
                    switch (submodule5.valueOf(module)) {
                        case P:
                            System.out.println("Thank you for your positive feedback!");
                            break;
                        case N:
                            System.out.println("We're sorry to hear that. Please contact our support team (phn no:123456789) to resolve any issues.");
                            break;
                    }
                    break;

                case F:
                    System.out.println("THANK YOU  ***** VISIT AGAIN****");
                    System.exit(0);
                    break;
            }
        }
    }
}
