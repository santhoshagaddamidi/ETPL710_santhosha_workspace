package com.evergent.corejava.santhosha.application4;
//Class for payment processing
class PaymentModule {
 private int amount;
 private int discountAmount;
 private int pieces;
 private boolean giftWrappingSelected = false;

 public PaymentModule(int amount, int pieces) {
     this.amount = amount;
     this.pieces = pieces;
     this.discountAmount = amount;  // Initialize discountAmount with the original amount
 }

 public void applyDiscount() {
     if (amount >= 20000 && amount <= 30000) {
         discountAmount = (int) (amount - (amount * 0.02));
     } else if (amount >= 30000 && amount <= 50000) {
         discountAmount = (int) (amount - (amount * 0.05));
     } else if (amount >= 51000 && amount <= 100000) {
         discountAmount = (int) ((amount - amount * 0.06));
     } else if (amount >= 150000) {
         discountAmount = (int) ((amount - amount * 0.08));
     }
 }

 public int getDiscountAmount() {
     return discountAmount;
 }

 public void addGiftWrapping(GiftWrappingService giftWrappingService) {
     giftWrappingSelected = true;
     discountAmount += giftWrappingService.getCost();
 }

 public void printInvoice() {
     System.out.println("Invoice Display");
     System.out.println("----------------------------");
     System.out.println("Ordered ID : " + (Math.ceil(Math.random() * 1000)));
     System.out.println("You selected no of pieces: " + pieces);
     System.out.println("Total Amount to be Paid: Rs " + discountAmount);
 }

 public void printSummary() {
     System.out.println("Summary Of Order");
     System.out.println("-------------------------------------");
     System.out.println("You selected electronics item cost Rs " + amount);
     System.out.println("You selected no of pieces: " + pieces);
     System.out.println("Amount for ordered items after Discount for selected pieces is Rs " + discountAmount);
     if (giftWrappingSelected) {
         System.out.println("Gift wrapping selected.");
     }
     System.out.println("\n");
     System.out.println("Total Amount to be Paid: Rs " + discountAmount);
 }

 public void processPayment() {
     System.out.println("Total payment amount: Rs " + discountAmount);
 }
}