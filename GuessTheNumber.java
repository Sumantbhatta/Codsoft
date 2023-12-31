import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Display a border around the entire game
        displayGameBorder();

        System.out.println("Welcome to the Guess the Number Game!");

        while (true) {
            // Step 1: Generate a random number within the specified range
            int targetNumber = random.nextInt(100) + 1;

            // Additional details (Step 5): Limit the number of attempts
            int maxAttempts = 10;
            int attempts = 0;

            System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it right!");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                attempts++;
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            // Additional details (Step 7): Display the user's score
            if (attempts < maxAttempts) {
                System.out.println("You guessed the number in " + attempts + " attempts. Great job!\n");
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + "\n");
            }

            // Additional details (Step 6): Allow the user to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }
    }

    // Method to display a border around the entire game
    private static void displayGameBorder() {
        System.out.println("************************************************");
        System.out.println("*               GUESS THE NUMBER               *");
        System.out.println("************************************************");
    }
}
