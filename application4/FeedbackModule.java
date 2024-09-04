package com.evergent.corejava.santhosha.application4;

//Class to handle feedback
class FeedbackModule {
 public void giveFeedback(boolean isPositive) {
     if (isPositive) {
         System.out.println("Thank you for your positive feedback!");
     } else {
         System.out.println("We're sorry to hear that. Please contact our support team (phn no:123456789) to resolve any issues.");
     }
 }
}
