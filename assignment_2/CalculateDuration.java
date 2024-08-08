import java.util.Scanner;
// Program to calculate duration between two distinct time points
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 31 July 2023

public class CalculateDuration {

   public static void main(String[] args) {
      Scanner question = new Scanner(System.in);
      String timeA;
      String timeB;
      Time time1;
      Time Time2;
      System.out.println("Enter Time A: ");
      timeA = question.nextLine();
      System.out.println("Enter Time B: ");
      timeB = question.nextLine();
      time1 = new Time(timeA)
      time2 = new Time(timeB);
      Duration difference = time1.subtract(time2);
      System.out.println("The time " + time1.toString() + " occurs " + difference.intValue("minute") + " after the time " + time2.toString() + "."); 
   }

}