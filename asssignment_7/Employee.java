// Program to track and record Employee shifts
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 15 September 2023

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String uid;
   private CalendarTime signInDate=null;
   private CalendarTime signOutDate=null;
   private List<Shift> shifts = new ArrayList<>();
   
   public Employee (String name , String uid) {
      this.name = name;
      this.uid = uid;  
   }
 
   public String name() {
      return this.name;
   }
   
   public String UID() {
      return this.uid;
   }
   
   public void signIn(Date d , Time t) {
      this.signInDate = new CalendarTime(d, t);
   }
   
   public void signOut (Date d, Time t) {
      this.signOutDate = new CalendarTime(d, t);
      shifts.add(new Shift(this.signInDate, this.signOutDate)); // After sign out we start all over 
      this.signInDate = null; // By setting the signInDate to Null
      this.signOutDate = null; // And setting the signOutDate to Null
   }
   
   public boolean present() {
      if (this.signOutDate == null && this.signInDate != null ) {
         return true;
      } else {
         return false;
      }
   }
   
   public boolean worked(Date d) {
      for (Shift shift: this.shifts ) { // Iterating through recorded shifts
         if ( shift.includesDate(d)) {
            return true;
         } 
      }
      return false;
   }
   
   public boolean worked(Week w) {
      for (Shift shift: this.shifts ) {         
         if (shift.inWeek(w)) {
            return true;
         }
       }
      return false;
   }
   
   public List<Shift> get(Date d) {
      List<Shift> ourShifts = new ArrayList<>();
         for (Shift dateShifts: this.shifts ) {
               if (dateShifts.includesDate(d)) {
                  ourShifts.add(dateShifts);
               }
               continue;
      }
          return ourShifts;
   }
   
   public List<Shift> get(Week w) {
      List<Shift> newShifts = new ArrayList<>();
         for (Shift weekDates: this.shifts ) {
               if (weekDates.inWeek(w)) {
                  newShifts.add(weekDates);
               }
               continue;
         }
       return newShifts; 
   }
   
   public Duration hours(Week w){
      long time=0; 
      for (Shift shifts: shifts) {
         if (shifts.inWeek(w)) {
            time += shifts.length().intValue("hour");
         }
      }
      return new Duration("hour", time);
   } 
}