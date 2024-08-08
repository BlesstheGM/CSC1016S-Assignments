// Program to create a screen model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023


public class Screen extends combine {
   
   private int size;
   
   public Screen (String serialNumber, String manufacturer, String colour, int size) {
      super(serialNumber, manufacturer, colour);
      this.size = size;
   }
      
   @Override
   public String toString() {
      return "Screen: "+ super.serialNumber+", " + super.colour + ", " + super.manufacturer + ", "  + this.size;
   }

}