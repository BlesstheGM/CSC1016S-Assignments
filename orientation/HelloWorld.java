import java.util.Scanner;

// My First Program
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 31 July 2023

class HelloWorld{
   public static void main(String [] args){
      Scanner question = new Scanner(System.in);
      String time_A;
      System.out.println("Enter Time A");
      time_A = question.nextLine();
      Time time_1 = new Time(time_A);
      System.out.println("Enter Time B");
      String time_B;
      time_B = question.nextLine();
      Time time_2 = new Time(time_B);
      
      Duration d = time1.subtract(time2);
      System.out.println("The time " + time_B + " occurs" + d.intValue("minute") + "minutes after the time" + time_A + ".");
      
   }
}