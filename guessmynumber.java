
import java.util.Random;
import java.util.Scanner;

public class guessmynumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the 'Guess My Number' game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.printf("Congratulations! You've guessed the number %d in %d tries.%n", numberToGuess, numberOfTries);
            }
        }

        scanner.close();
    }
}



