import java.util.Scanner;

public class CalculateDuration12 {

   public static void main(String[] args) {
      Scanner question = new Scanner(System.in);
      String timeA;
      String timeB;
      Time time1;
      Time time2;
      System.out.println("Enter Time A: ");
      timeA = question.nextLine();
      System.out.println("Enter Time B: ");
      timeB = question.nextLine();
      time1 = new Time(timeA);
      time2 = new Time(timeB);
      Duration difference = time2.subtract(time1);
      System.out.println("The time " + time1.toString() + " occurs " + difference.intValue("minute") + " after the time " + time2.toString() + "."); 
   }

}