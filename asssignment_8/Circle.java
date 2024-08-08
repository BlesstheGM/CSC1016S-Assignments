// Program to model circle
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 18 August 2023

public class Circle extends Shape {

    // Private field to store the radius of the circle
    private double radius;

    // Copy constructor to create a new Circle object by copying another Circle
    public Circle(Circle original) {
        super(original); // Call the constructor of the parent class (Shape)
        this.radius = original.radius; // Copy the radius from the original circle
    }

    // Constructor to create a Circle with a specified name, color, and radius
    public Circle(String name, String colour, double radius) {
        super(name, colour); // Call the constructor of the parent class (Shape) with name and color
        this.radius = radius; // Set the radius of the circle
    }

    // Override the toString method to provide a custom string representation of the Circle
    @Override
    public String toString() {
        // Call the toString method of the parent class (Shape) and append the radius
        return super.toString() + " Radius " + this.radius;
    }
}
