// Program to create a Student Model
// Student Number: HLNBLE002
// Date: 02 October 2023


public class Student extends Person{

   private int yearOfStudy;   
   private String hobbies;
   private String nameOfInstitution;
   private String programOfStudy;
   
   public Student(Student s) { // creating a deep copy
      super(s);
      this.yearOfStudy = s.getYearOfStudy();
      this.hobbies = s.getHobbies();
      this.nameOfInstitution = s.getNameOfInstitution();
      this.programOfStudy = s.getProgramOfStudy();
   }
   
   public Student (String hobbies, int yearOfStudy, String nameOfInstitution, String programOfStudy, String gender, int age, String name) {
      super(gender, age, name);
      this.yearOfStudy = yearOfStudy;
      this.hobbies = hobbies;
      this.nameOfInstitution = nameOfInstitution;
      this.programOfStudy = programOfStudy;
   }
   
   public int getYearOfStudy() {
      return yearOfStudy;
   }
   
   public String getHobbies() {
      return hobbies;
   }
   
   public String getNameOfInstitution() {
      return nameOfInstitution;
   }
   
   public String getProgramOfStudy() {
      return programOfStudy;
   }
   
   public void setHobbies(String hobbies) {
      this.hobbies = hobbies;
   }
   
   public void setNameOfInstitution(String nameOfInstitution) {
      this.nameOfInstitution = nameOfInstitution;
   }
   
   public void setProgramOfStudy(String programOfStudy) {
      this. programOfStudy =  programOfStudy;
   }
   
   public void setYearOfStudy(int yearOfStudy) {
      this.yearOfStudy = yearOfStudy;
   }
   
}