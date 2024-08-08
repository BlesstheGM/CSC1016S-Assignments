import java.util.Scanner;

public class SumCosts12 {

   public static void main(String[] args) {
      Scanner question = new Scanner(System.in);
      Currency rand = new Currency("R", "ZAR", 100);
      Money total = new Money("R0.00", rand);
      System.out.println("Enter an amount or '[D]one' to quit:");
      String amount = question.nextLine();
      
      while (!amount.equals("D")) {       
         Money money = new Money(amount, rand);
         total = total.add(money); 
         System.out.println("Enter an amount or '[D]one' to quit:");
         amount = question.nextLine();
      }
         System.out.println(total.toString());
     
  }
   
}