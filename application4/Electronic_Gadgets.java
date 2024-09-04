package com.evergent.corejava.santhosha.application4;

import java.io.IOException;
import java.util.Scanner;
// Main class
public class Electronic_Gadgets
{
    public static void main(String[] args) throws IOException
    {
        Scanner br = new Scanner(System.in);
        Gadget selectedGadget = null;
        PaymentModule paymentModule = null;
        GiftWrappingService giftWrappingService = new GiftWrappingService();
        WarrantyModule warrantyModule = new WarrantyModule();
        FeedbackModule feedbackModule = new FeedbackModule();

        System.out.println("\n\t <<<<<<<Welcome To Electronics Gadgets Management System>>>>>>>");
        
        while (true)
        {
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
            String module = br.nextLine().toUpperCase();

            switch (module) 
            {
                case "A":
                    System.out.println("<<<<<Electronics Gadgets>>>>>");
                    System.out.println("-------------------------");
                    System.out.println("P-Phones");
                    System.out.println("L-Laptops");
                    System.out.println("T-TVs");
                    System.out.println("------------------------------");
                    System.out.println("Enter your Gadgets Codes (P, L, T) : ");
                    String gadgetType = br.nextLine().toUpperCase();

                    switch (gadgetType) 
                    {
                        case "P":
                        	System.out.println("--------Phones----------");
                            System.out.println("------------------------");
                            System.out.println("R-redmi");
                            System.out.println("O-oppo");
                            System.out.println("V-vivo");
                            System.out.println("------------------------------");
                            System.out.println("Enter your phone Codes (R, O, V) : ");
                            String phoneModel = br.nextLine().toUpperCase();
                            if (phoneModel.equals("R")) 
                            {
                                selectedGadget = new Phone("Redmi", 10000);
                            } else if (phoneModel.equals("O")) 
                            {
                                selectedGadget = new Phone("Oppo", 15000);
                            } else if (phoneModel.equals("V"))
                            {
                                selectedGadget = new Phone("Vivo", 20000);
                            }
                            break;
                        case "L":
                        	System.out.println("---------Laptops---------");
                            System.out.println("------------------------");
                            System.out.println("A-Dell");
                            System.out.println("B-acer");
                            System.out.println("C-hp");
                            System.out.println("------------------------------");
                            System.out.println("Enter your Laptop Codes (A, B, C) : ");
                            String laptopModel = br.nextLine().toUpperCase();
                            if (laptopModel.equals("A")) 
                            {
                                selectedGadget = new Laptop("Dell", 40000);
                            } else if (laptopModel.equals("B"))
                            {
                                selectedGadget = new Laptop("Acer", 50000);
                            } else if (laptopModel.equals("C")) 
                            {
                                selectedGadget = new Laptop("HP", 44000);
                            }
                            break;
                        case "T":
                        	System.out.println("--------Tvs-------------");
                            System.out.println("------------------------");
                            System.out.println("S-sony");
                            System.out.println("L-LG");
                            System.out.println("SS-samsung");
                            System.out.println("------------------------------");
                            System.out.println("Enter your TV Codes (S, L, SS) : ");
                            String tvModel = br.nextLine().toUpperCase();
                            if (tvModel.equals("S"))
                            {
                                selectedGadget = new TV("Sony", 25000);
                            } else if (tvModel.equals("L")) 
                            {
                                selectedGadget = new TV("LG", 30000);
                            } else if (tvModel.equals("SS"))
                            {
                                selectedGadget = new TV("Samsung", 14000);
                            }
                            break;
                    }

                    
                    System.out.println("Enter the number of pieces");
                    int pieces = Integer.parseInt(br.nextLine());
                    int amount = selectedGadget.calculateCost(pieces);
                    paymentModule = new PaymentModule(amount, pieces);
                    paymentModule.applyDiscount();
                    System.out.println("Amount for ordered gadgets before discount is Rs " + amount);
                    System.out.println("Amount for ordered items after Discount for selected pieces is Rs " + ((PaymentModule) paymentModule).getDiscountAmount());
                    break;

                case "B":
                	System.out.println("---------services---------");
                    System.out.println("--------------------------");
                    System.out.println("C-Call");
                    System.out.println("M-Mail");
                    System.out.println("I-Instagram");
                    System.out.println("H-Home Delivery");
                    System.out.println("G-Gift Wrapping");
                    System.out.println("------------------------------");
                    System.out.println("Enter your Module Codes (C, M, I, H, G) : ");
                    String serviceCode = br.nextLine().toUpperCase();
                    Service service = null;

                    switch (serviceCode)
                    {
                        case "C":
                            service = new CallService();
                            break;
                        case "M":
                            service = new MailService();
                            break;
                        case "I":
                            service = new InstagramService();
                            break;
                        case "H":
                            service = new HomeDeliveryService();
                            break;
                        case "G":
                            service = giftWrappingService;
                            paymentModule.addGiftWrapping(giftWrappingService);
                            break;
                    }
                    service.execute();
                    break;

                case "C":
                    System.out.println("--------Payment Module--------");
                    System.out.println("------------------------");
                    System.out.println("I-Invoice");
                    System.out.println("S-Summary");
                    System.out.println("P-payamount");
                    System.out.println("---------------------------");
                    System.out.println("Enter your payment Codes (I, S, P) : ");
                    String paymentCode = br.nextLine().toUpperCase();

                    switch (paymentCode) 
                    {
                        case "I":
                            paymentModule.printInvoice();
                            break;
                        case "S":
                            paymentModule.printSummary();
                            break;
                        case "P":
                            paymentModule.processPayment();
                            break;
                    }
                    break;

                case "D":
                    System.out.println("---------Warranty Module----------");
                    System.out.println("------------------------");
                    System.out.println("W-WarrantyCheck");
                    System.out.println("E-ExtendWarranty");
                    System.out.println("---------------------------");
                    System.out.println("Enter your warranty Codes (W, E) : ");
                    String warrantyCode = br.nextLine().toUpperCase();

                    switch (warrantyCode) 
                    {
                        case "W":
                            warrantyModule.checkWarranty();
                            break;
                        case "E":
                            warrantyModule.extendWarranty();
                            break;
                    }
                    break;

                case "E":
                    System.out.println("---------Feedback Module---------");
                    System.out.println("------------------------");
                    System.out.println("P-Positive");
                    System.out.println("N-Negative");
                    System.out.println("---------------------------");
                    System.out.println("Enter your Feedback Codes(P, N) : ");
                    String feedbackCode = br.nextLine().toUpperCase();

                    feedbackModule.giveFeedback(feedbackCode.equals("P"));
                    break;

                case "F":
                    System.out.println("THANK YOU  * VISIT AGAIN");
                    System.exit(0);
                    break;
            }
        }
    }
}