public class NumberUtils{

   private NumberUtils() {
   }   
   
   public static NumberUtils createNumberUtils() {
      return new NumberUtils();
   }
      
   public static int[] toArray(int number) {
      String myNumbers = Integer.toString(number);
      int[] numbers;
      numbers = new int[myNumbers.length()];
      for (int i=0; i<myNumbers.length(); i++) {
         numbers[i] = Character.getNumericValue(myNumbers.charAt(i));
      }
      return numbers;
   } 
   
   public static int countMatches(int numberA, int numberB) {
      int countMatches = 0;
      String Anumbers = Integer.toString(numberA);
      String Bnumbers = Integer.toString(numberB);
      for (int i=0; i< Anumbers.length() ; i++) {
         if (Anumbers.charAt(i) == Bnumbers.charAt(i)) {
            countMatches += 1;
         }
      }
      return countMatches;
   }
   
   public static int countIntersect(int numberA , int numberB) {
      int countIntersect = 0;
      String Anumbers = Integer.toString(numberA);
      String Bnumbers = Integer.toString(numberB);
      for (int i=0; i< Anumbers.length() ; i++) {
         for (int j=0; j < Bnumbers.length(); j++) {
            if (Anumbers.charAt(i) == Bnumbers.charAt(j)) {
               countIntersect += 1;
            } 
         }
      }
      return countIntersect;
   }
}


   