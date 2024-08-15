import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int maxAttempts = 5;
        int numberOfTries = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (numberOfTries < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == numberToGuess) {
                System.out.println(" Congratulations! You found my number in " + numberOfTries + " tries.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (numberOfTries == maxAttempts) {
                System.out.println("Sorry, you didn't guess my number. The correct answer is " + numberToGuess);
            }
        }
    }
}