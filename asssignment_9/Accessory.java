// Program to create an Accessory Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class Accessory extends combine { // Calling Combine the parent class
   
   public Accessory (String serialNumber, String manufacturer, String colour) {
      super(serialNumber, manufacturer, colour);
   }
   
   public String getserialNumber() {
      return super.serialNumber;
   }
   
   @Override 
   public String toString () {
      return "Accessories: " + super.toString();
   }


} 