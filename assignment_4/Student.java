// Program to model Student
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 18 August 2023

class Student {
      private String firstName;
      private String middleName;
      private String lastName;
               
   public void setNames(String first ,String second ,String third) {
      this.firstName = first;
      this.middleName = second;
      this.lastName = third;
   }
   
   public String getFullName() {
      char initial;
      initial = this.middleName.charAt(0); // Getting the first character
      return this.firstName + " " + initial + ". " + this.lastName;
   }

}
   