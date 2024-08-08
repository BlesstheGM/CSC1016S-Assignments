// Program to create a Car Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class Car extends Vehicle {
   
   private double weight;
   private int capacity;
   
   public Car(Car C) { // creating a deep copy
      super(C);
      this.weight = C.weight;
      this.capacity = C.capacity;
   }
   
   public Car(int cylinders, String manufacturer, Student owner, int capacity, double weight) {
      super(cylinders, manufacturer, owner);
      this.weight = weight;
      this.capacity = capacity;
   }

   @Override
   public String toString() {
      return "The car is a " + this.capacity + "-seater weighing " + this.weight + " kg";
   }
} 
