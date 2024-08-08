public class TimePeriod {

   private Duration lowerBound;
   private Duration upperBound;
   

   public TimePeriod (Duration lowerBound , Duration upperBound) {
      this.upperBound = upperBound;
      this.lowerBound = lowerBound;
   }

   public Duration lowerBound() {
      return this.lowerBound;
   }
   
   public Duration upperBound() {
      return this.upperBound;
   }
   
   public boolean includes (Duration duration) {
      if ( duration.compareTo(lowerBound()) >= 0 && duration.compareTo(upperBound()) < 0 ) {
         return true;
      } else {
         return false;
      }  
   }
   
   public boolean precedes (TimePeriod other) {
      int value = upperBound().compareTo(other.lowerBound());
      if ( value < 1  ) {
         return true;
      }else{
         return false;
      }
   }
   
   public boolean adjacent (TimePeriod other) {
      if ( upperBound().equals(other.lowerBound()) || lowerBound().equals(other.upperBound()) ) {
         return true;
      }else{
         return false;
      }
   }
   
   public String toString() {
      String formatLower = this.lowerBound.format(this.lowerBound, "minute");
      String formatUpper = this.upperBound.format(this.upperBound, "minute"); 
      return "[" + formatLower + " .. " + formatUpper + "]";
   }
}