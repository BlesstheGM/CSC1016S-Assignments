// Program to create a vehicle model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023


public class Vehicle {

   protected int cylinders;
   protected String manufacturer;
   protected Student owner;
   
   public Vehicle (Vehicle v) { // creating a deep copy
      this.cylinders = v.cylinders;
      this.manufacturer = v.manufacturer;
      this.owner = v.owner;
   }

   public Vehicle (int numCylinders, String maker, Student owner) {
      this.cylinders = numCylinders;
      this.manufacturer = maker;
      this.owner = owner;
   }
   
   public String toString () {
      return this.manufacturer + ", " + this.cylinders + " cylinders, owned by " + this.owner.getName() + ", a " + owner.getAge() + "-year old " + owner.getGender() + " studying " + owner.getProgramOfStudy() + " at " + owner.getNameOfInstitution() + ". " + owner.getName() + " likes " + owner.getHobbies() + ". "; 
   }
 
   
}