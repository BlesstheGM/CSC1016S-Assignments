import java.util.Scanner;

public class TestSeller12 {

   public static void main(String [] args) {
      Scanner question = new Scanner(System.in);
      Seller seller = new Seller();
      
      System.out.println("Please enter details of the seller.");
      
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
      
      System.out.println("The user has been successfully created");
      System.out.println("ID of the seller: " + seller.id);
      System.out.println("Name of the seller: " + seller.name);
  }
}