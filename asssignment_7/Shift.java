// Program to record shifts
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 15 September 2023

public class Shift {
   private CalendarTime start;
   private CalendarTime finish;
   
   public Shift (CalendarTime start, CalendarTime finish ) {
      this.start = start;
      this.finish = finish;
   }
   
  public CalendarTime start() {
      return this.start;
  }
  
  public CalendarTime finish() {
      return this.finish;
  }
  
  public boolean inWeek(Week w) {
      return w.includes(this.start.date()) || w.includes(this.finish.date());
  }
  
  public boolean includesDate(Date other) {
      if ( other.compareTo(this.start.date()) == 0 || other.compareTo(this.finish.date()) == 0) {
         return true;
      } else {
         return false;
      }
  }
  
  public Duration length() {
      Duration ourDuration = this.finish.subtract(this.start);
      return ourDuration;
  }
  
  public String toString() {
      return this.start.date() + "%" + this.start.time() + " - " + this.finish.date() + "%" + this.finish.time();
  }
  
}