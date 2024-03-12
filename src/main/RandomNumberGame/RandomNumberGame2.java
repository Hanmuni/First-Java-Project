package RandomNumberGame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame2 {
    public static void main(String[] args) {
        // Scanner (wie HTML Input field) erstellen
        Scanner input = new Scanner(System.in);

        // zufällige Zahl
        int numberToGuess = new Random().nextInt(101);

        // geratene Zahl
        int guess;

        // Rateschleife
        do {
            System.out.print("Gib eine Zahl ein:");
            guess = input.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Versuche eine größere Nummer!");
            }

            else if (guess > numberToGuess){
                System.out.println("Versuche eine kleinere Nummer!");
            }

        } while (guess != numberToGuess);

        System.out.println("Du hast Gewonnen! :)");
    }
}
