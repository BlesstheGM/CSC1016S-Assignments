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
      if ( lowerBound.compareTo(duration) <= 1 && duration.compareTo(upperBound) < 0 ) {
         return true;
      } else {
         return false;
      }  
   }
   
   public boolean precedes (TimePeriod other) {
      int value = upperBound.compareTo(other.lowerBound);
      if ( value < 1  ) {
         return true;
      }else{
         return false;
      }
   }
   
   public boolean adjacent (TimePeriod other) {
      if ( upperBound.compareTo(other.lowerBound()) == 0 || lowerBound.compareTo(other.upperBound) == 0 ) {
         return true;
      }else{
         return false;
      }
   }
   
   public String toString() {
      return "[" + lowerBound.format(lowerBound, "minute") + " .. " + upperBound.format(upperBound, "minute") + "]";
   }
}