// Program to create a questionnaire user interface
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

import java.util.Scanner;

public class Question3 {

   public static void main(String [] args) {
       Scanner inKey = new Scanner(System.in);
       String empty;
       System.out.println("Enter the vehicle manufacturer:");
       String manufacturer = inKey.nextLine();
       System.out.println("Enter the name of the vehicle owner:");
       String name = inKey.nextLine();
       System.out.println("Enter the owner's gender:");
       String gender = inKey.nextLine();
       System.out.println("Enter the owner's programme of study:");
       String programOfStudy = inKey.nextLine();
       System.out.println("Enter the owner's Institution name:");
       String nameOfInstitution = inKey.nextLine();
       System.out.println("Enter the owner's hobbies:");
       String hobbies = inKey.nextLine();
       System.out.println("Enter the owner's age:");
       int age = inKey.nextInt();
       System.out.println("Enter the number of cylinders in the engine:");
       int numberOfCylinders = inKey.nextInt();
       System.out.println("Enter the car seating capacity:");
       int capacity = inKey.nextInt();
       System.out.println("Enter the weight of the car:");
       double weight = inKey.nextDouble();
       Student owner = new Student(hobbies, 1, nameOfInstitution, programOfStudy, gender, age, name);
       Car car = new Car(numberOfCylinders, manufacturer, owner, capacity, weight);
       System.out.println(new Vehicle(car).toString()); // upcasting
       System.out.println(car);
   }

}