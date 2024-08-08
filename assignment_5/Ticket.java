// Program to create a ticket
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 25 August 2023

class Ticket {

   // creating my variables
   public String id;
   public Time issueTime;
   
   // initializing my variables
   public Ticket(Time currentTime , String ID) {
      this.id = ID;
      this.issueTime = currentTime;
   }
   
   public String ID(){
      return this.id;
   }
    
   public Duration age(Time currentTime) {
      Duration duration = currentTime.subtract(issueTime);
      return duration;
   }
   
   public String toString() {
      return "Ticket[id=" + this.id + ", time=" + this.issueTime.toString() + "]";
   } 
}