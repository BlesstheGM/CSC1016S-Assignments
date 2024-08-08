// Program to Model Rectangle
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 22 September 2023

public class Rectangle extends Shape {

    // Private fields to store the length and width of the rectangle
    private double length;
    private double width;

    // Copy constructor to create a new Rectangle object by copying another Rectangle
    public Rectangle(Rectangle original) {
        super(original); // Call the constructor of the parent class (Shape)
        this.length = original.length; // Copy the length from the original rectangle
        this.width = original.width;   // Copy the width from the original rectangle
    }

    // Constructor to create a Rectangle with a specified name, color, length, and width
    public Rectangle(String name, String colour, double length, double width) {
        super(name, colour); // Call the constructor of the parent class (Shape) with name and color
        this.length = length; // Set the length of the rectangle
        this.width = width;   // Set the width of the rectangle
    }

    // Override the toString method to provide a custom string representation of the Rectangle
    @Override
    public String toString() {
        // Call the toString method of the parent class (Shape) and append the length and width
        return super.toString() + " Length " + this.length + " Width " + this.width;
    }
}
