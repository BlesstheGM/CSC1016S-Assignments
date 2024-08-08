// Program to create integer functions
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 22 September 2023

public class NumberUtils {

    // Private constructor to prevent instantiation of this utility class
    private NumberUtils() {
    }

    // Static method to create an instance of NumberUtils
    public static NumberUtils createNumberUtils() {
        return new NumberUtils();
    }

    // Converts an integer to an array of its digits
    public static int[] toArray(int number) {
        String myNumbers = Integer.toString(number);
        int[] numbers;
        numbers = new int[myNumbers.length()];
        for (int i = 0; i < myNumbers.length(); i++) {
            numbers[i] = Character.getNumericValue(myNumbers.charAt(i));
        }
        return numbers;
    }

    // Counts the number of matching digits at the same position in two integers
    public static int countMatches(int numberA, int numberB) {
        int countMatches = 0;
        String numbersA = Integer.toString(numberA);
        String numbersB = Integer.toString(numberB);
        for (int i = 
