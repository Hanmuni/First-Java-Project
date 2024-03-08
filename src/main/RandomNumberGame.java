import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a Random object for generating a random number
        Random obj = new Random();

        // Define the lowest and largest numbers for the random number
        int lowestNumber = 1;
        int largestNumber = 100;

        // Generate a random number within the specified range
        int numberToGuess = obj.nextInt(largestNumber - lowestNumber + 1) + lowestNumber;

        // Initialize the number of tries
        int numberOfTries = 0;


        // Start a loop for the game
        while (true) {
            // Prompt the user to guess the number
            System.out.print("Please guess the number: ");
            int userGuess = input.nextInt();

            // Increment the number of tries
            numberOfTries++;

            // Check if the user's guess is correct
            if (userGuess == numberToGuess) {
                // If the guess is correct, display a win message with the number of tries and exit the loop
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (userGuess < numberToGuess) {
                // If the guess is too low, provide feedback to try a higher number
                System.out.println("You can try a higher number.");
            } else {
                // If the guess is too high, provide feedback to try a lower number
                System.out.println("You can try a lower number.");
            }
        }

        // Close the Scanner object to release system resources
        input.close();
    }
}
