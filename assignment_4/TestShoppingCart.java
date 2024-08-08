// Program to print an invoice of items
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 18 August 2023

import java.util.Scanner;

public class TestShoppingCart {
   
   public static void main(String [] args) {
      // Declaring and Initializing some of our variables and objects
      String waste;
      String productName = "";
      int quantity=0;
      double unitPrice=0.00;
      int numberOfItems;
      int position = 0;
      Item item;
      double total;

      
      Scanner inKey = new Scanner(System.in);
      ShoppingCart cart;
      cart = new ShoppingCart(); // Creates a new shopping cart
      cart.coupon = "WELCOME20"; // Setting the shopping cart coupon to WELCOME20
      
      System.out.println("How many items would you like to add to your Shopping Cart?:");
      numberOfItems = inKey.nextInt();
      waste = inKey.nextLine(); // removes "" character
      
      if (numberOfItems == 0) {
            System.out.println("Your Shopping Cart is empty.");
      } else {
         while(position < numberOfItems)  { // Creating a loop until we done typing our items
            System.out.println("Enter the Product Name:");
            productName = inKey.next();
            System.out.println("Enter the Quantity:");
            quantity = inKey.nextInt();
            System.out.println("Enter the Unit Cost:");
            unitPrice = inKey.nextDouble();
            position++; // Moves to the next item
            item = new Item(productName , quantity , unitPrice); // Creates an Item 
            cart.addItems(item); // Adds Item on shooping cart
            }
            System.out.println("The Shopping Cart has the following items:");
      for (Item eachItem : cart.item) { // fetches each item on the shopping cart
         System.out.println(eachItem.productName + ": " + eachItem.quantity);
      }
         System.out.println("--- Shopping Cart with all items ---");
         cart.printInvoice(); // Method to print Invoice
      }

      
         }
}