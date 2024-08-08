public class Shape {
  
  private String name;
  private String colour;
  
  public Shape (Shape original) {
      this.name = original.name;
      this.colour = original.colour;
   }
  
  public Shape (String name , String colour) {
      this.name = name;
      this.colour = colour;
  } 
  
  @Override
  public String toString() {
      return this.name + " " + this.colour;
  }
  
}