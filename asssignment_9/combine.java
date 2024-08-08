// Program to create a parent class
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023


public class combine {

   protected String serialNumber;
   protected String manufacturer;
   protected String colour;
   
   public combine (String serialNumber, String manufacturer, String colour) {
      this.serialNumber = serialNumber;
      this.manufacturer = manufacturer;
      this.colour = colour;
   }
   
   public String getserialNumber() {
      return this.serialNumber;
   }
   
    @Override
    public String toString() {
        return serialNumber+", " + manufacturer+", "  + colour;
    }


} 