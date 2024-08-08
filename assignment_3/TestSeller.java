// Program to store seller information
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 10 August 2023

import java.util.Scanner;
   
class TestSeller{
   public static void main(String [] arg ) {
      Seller seller = new Seller(); // Creates seller object
      Scanner question = new Scanner(System.in);      
      System.out.println("Please enter the details of the seller.");
      // Ask the user info then stores in seller
      System.out.print("ID: ");
      seller.id = question.nextLine();
      System.out.print("Name: ");
      seller.name = question.nextLine();
      System.out.print("Location: ");
      seller.location = question.nextLine();
      System.out.print("Product: ");
      seller.product = question.nextLine();
      System.out.print("Price: ");
      seller.unitPrice = question.nextLine();
      System.out.print("Units: ");
      seller.numberOfUnits = question.nextInt();
      
      // Prints user information
      System.out.println("The seller has been successfully created:");
      System.out.println("ID of the seller: " + seller.id);
      System.out.println("Name of the seller: " + seller.name);
      System.out.println("Location of the seller: " + seller.location);
      System.out.println("The product to sell: " + seller.product);
      System.out.println("Product unit price: " + seller.unitPrice);
      System.out.println("The number of available units: " + seller.numberOfUnits);
   }
}
  