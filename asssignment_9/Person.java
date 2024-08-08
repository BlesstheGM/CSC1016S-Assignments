// Program to create a Person Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class Person {

   protected int age;
   protected String gender;
   protected String name;
      
   public Person(String gender, int age, String name) {
      this.age = age;
      this.gender = gender;
      this.name = name;
   }
   
   public Person(Person original) {
      this.age = original.getAge();
      this.gender = original.getGender();
      this.name = original.getName();
   }
   
   public int getAge () {
      return this.age;
   }
   
   public String getGender() {
      return this.gender;
   }
   
   public String getName() {
      return this.name;
   }
   
   public void setAge(int age) {
      this.age = age;
   }
   
   public void setGender(String gender) {
      this.gender = gender;
   }
   
   public void setName(String name) {
      this.name = name;
   }
      

}