// Program to Model CowsAndBulls Shape
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 22 September 2023

public class CowsAndBulls {

    // Constants for the game
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;

    // Fields for the game state
    public int mysteryNumber = 0;
    public int guesses = 10;
    public boolean gameOver;

    // Constructor that initializes the game with a random seed
    public CowsAndBulls(int seed) {
        NumberPicker numberPicker = new NumberPicker(seed, 1, 9);

        // Generate a random 4-digit mystery number
        for (int i = 0; i < 3; i++) {
            this.mysteryNumber += numberPicker.nextInt();
            this.mysteryNumber *= 10;
        }
        this.mysteryNumber += numberPicker.nextInt();
    }

    // Method to get the number of remaining guesses
    public int guessesRemaining() {
        return guesses;
    }

    // Method to make a guess and calculate the result
    public Result guess(int guessNumber) {
        guesses -= 1;

        NumberUtils number = NumberUtils.createNumberUtils();
        int bulls = number.countMatches(guessNumber, this.mysteryNumber);
        int cows = number.countIntersect(guessNumber, this.mysteryNumber) - bulls;

        // Check if the player has won the game
        if (bulls == 4 && cows == 0) {
            gameOver = true;
        }

        // Create and return the result of the guess
        Result result = new Result(cows, bulls);
        return result;
    }

    // Method to give up the game
    public int giveUp() {
        guesses = 0;
        return mysteryNumber;
    }

    // Method to check if the game is over
    public boolean gameOver() {
        // The game is over if there are no remaining guesses or if the player has won
        if (this.guesses == 0 || gameOver == true) {
            return true;
        } else {
            return false;
        }
    }
}
