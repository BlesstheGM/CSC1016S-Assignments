// Program to create a questionnaire user interface
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question1 {

   public static void main(String [] arg) {
      String serialNumber;
      String manufacturer;
      String colour;
      Scanner inKey = new Scanner(System.in);
      int position=-1;
      String input="";
      List<Object> myItems = new ArrayList<>();
      
      System.out.println("Welcome to Great International Technology");
      
      while (input!="q" || input!="Q") {
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            input = inKey.next();
            
         if (input.equals("q") || input.equals("Q")) {
            break;
         }else if (input.equals("b") || input.equals("B")) {
            System.out.println("Enter the serial number");
            serialNumber = inKey.next();
            String empty = inKey.nextLine();
            System.out.println("Enter the manufacturer");
            manufacturer = inKey.nextLine();
            System.out.println("Enter the colour");
            colour = inKey.nextLine();   
            System.out.println("Enter the amount of memory (MB)");
            int amountOfMemory = inKey.nextInt();
            Box box = new Box(serialNumber, manufacturer, colour, amountOfMemory);   
            myItems.add(box);    
            System.out.println("Done");    
         }else if (input.equals("s") || input.equals("S")) {
            System.out.println("Enter the serial number");
            serialNumber = inKey.next();
            System.out.println("Enter the manufacturer");
            manufacturer = inKey.next();
            System.out.println("Enter the colour");
            colour = inKey.next(); 
            System.out.println("Enter the screen size in inches");
            int size = inKey.nextInt();
            Screen screen = new Screen(serialNumber, manufacturer, colour, size);
            myItems.add(screen);
            System.out.println("Done"); 
         }else if (input.equals("a") || input.equals("A")) {
           System.out.println("Enter the serial number");
            serialNumber = inKey.next();
            System.out.println("Enter the manufacturer");
            manufacturer = inKey.next();
            System.out.println("Enter the colour");
            colour = inKey.next(); 
            Accessory accessory = new Accessory(serialNumber, manufacturer, colour);
            myItems.add(accessory);
            System.out.println("Done"); 
         }else if (input.equals("d") || input.equals("D")){
            System.out.println("Enter the serial number");
            serialNumber = inKey.next();
            for (Object item: myItems) {
               if (item instanceof Box) {
                  Box box = (Box)item;
                  if (box.serialNumber.equals(serialNumber)) { 
                     position = myItems.indexOf(box);
                  }
                  
               } else if (item instanceof Screen) {
                  Screen screen = (Screen)item;
                  if (screen.serialNumber.equals(serialNumber)) { 
                     position = myItems.indexOf(screen);                  
                  }
                
               } else if (item instanceof Accessory){
                  Accessory accessory = (Accessory)item;
                  if (accessory.serialNumber.equals(serialNumber)) { 
                     position = myItems.indexOf(accessory);
                  }
                  
               }
            }
               if (position == -1) {
                  System.out.println("Not found");
               } else {
                  myItems.remove(position);
                  System.out.println("Done");
               }
            
         }else if (input.equals("l") || input.equals("L")){
            for (Object item: myItems) {
               if (item instanceof Box) {
                  Box box = (Box)item; // downcasting
                  System.out.println(box);
               } else if (item instanceof Screen) {
                  Screen screen = (Screen)item;
                  System.out.println(screen);
               } else if (item instanceof Accessory){
                  Accessory accessory = (Accessory)item;
                  System.out.println(item);
               }
            }
            System.out.println("Done");
         }else if (input.equals("Q") || input.equals("q")){
            break;
            }        
         }
      }

}
