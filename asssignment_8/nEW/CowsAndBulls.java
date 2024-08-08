public class CowsAndBulls{

   public final static int NUM_DIGITS = 4;
   public final static int MAX_VALUE = 9876;
   public final static int MIN_VALUE = 1234;
   public final static int MAX_GUESSES = 10;
   public int secretNum=0;
   public int NoOfGuesses = 10;
   public boolean gameOver;
   
   public CowsAndBulls (int seed) {
      NumberPicker numberPicker = new NumberPicker(seed, 1, 9);
            for (int i=0; i<(NUM_DIGITS-1); i++) {             
               this.secretNum += numberPicker.nextInt(); 
               this.secretNum *= 10;              
            }
               this.secretNum += numberPicker.nextInt();
   }
   
   public int guessesRemaining() {
      return NoOfGuesses;
   }
   
   public Result guess(int guessNumber) {
      NoOfGuesses -= 1;
      NumberUtils number = NumberUtils.createNumberUtils();
      int bulls = number.countMatches(guessNumber, this.secretNum);
      int cows = number.countIntersect(guessNumber, this.secretNum) - bulls;
      if (cows == 0 && bulls == 4) {
         gameOver = true;
      }
      Result result = new Result(cows, bulls);
      return result;
   } 
   
   public int giveUp() {
      NoOfGuesses = 0;
      return secretNum;
   }
   
   public boolean gameOver() {
      if (this.NoOfGuesses== 0 || gameOver == true) {
         return true;
      } else {
         return false;
      }
   }

}