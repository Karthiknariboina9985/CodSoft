import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The number was " + numberToGuess);
        }

        scanner.close();
    }
}

