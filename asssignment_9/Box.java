// Program to create a Box Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class Box extends combine{

   private int amountOfMemory;
   
   public Box(String serialNumber, String manufacturer, String colour, int amountOfMemory) {
      super(serialNumber, manufacturer, colour);
      this.amountOfMemory = amountOfMemory;
   }
   
    @Override
    public String toString() {
        return "Box: " + super.toString()+", " + this.amountOfMemory;
    }
}