import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("The number to guess is: " + numberToGuess); // For debugging

        while (!hasGuessedCorrectly) {
            System.out.print("Guess a number between 1-100 (inclusive) or -999 to exit: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == -999) {
                System.out.println("The number was " + numberToGuess + ". Bye!");
                break;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println(guess + " is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println(guess + " is too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                if (numberOfTries == 1) {
                    System.out.println("Correct! With " + numberOfTries + " guess.");
                } else {
                    System.out.println("Correct! With " + numberOfTries + " guesses.");
                }
            }
        }

        input.close();
    }
}