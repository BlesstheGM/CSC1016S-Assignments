// Program to calculate the sum of the amounts entered
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 31 July 2023

import java.util.Scanner;

class SumCosts {
   public static void main(String [] args){
   
      String user_input; // creating my two variables
      String old_total;
     
      Scanner question = new Scanner(System.in); 
      
      System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
      user_input = question.nextLine();
      old_total = "R0.00"; // My total starts at zero then I will add up from there
      
      Currency rand = new Currency("R", "rand", 100);
      Money total = new Money(old_total, rand);
      
      while ( !user_input.equals("Done") && !user_input.equals("D")) { // if the user did not type "Done" then continue
         Money amount = new Money(user_input, rand);
         total = total.add(amount); // Add up the amounts
         System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
         user_input = question.nextLine();
     }
     
         System.out.println("Total: " + total.toString()); // Print the final Total Amount
   }
}