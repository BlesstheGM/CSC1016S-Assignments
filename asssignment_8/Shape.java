// Program to Model Shape
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 22 September 2023

public class Shape {

    // Private fields to store the name and color of the shape
    private String name;
    private String colour;

    // Copy constructor to create a new Shape object by copying another Shape
    public Shape(Shape original) {
        this.name = original.name;     // Copy the name from the original shape
        this.colour = original.colour; // Copy the color from the original shape
    }

    // Constructor to create a Shape with a specified name and color
    public Shape(String name, String colour) {
        this.name = name;       // Set the name of the shape
        this.colour = colour; // Set the color of the shape
    }

    // Override the toString method to provide a custom string representation of the shape
    @Override
    public String toString() {
        return this.name + " " + this.colour;
    }
}
