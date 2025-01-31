import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        
        System.out.println("Welcome to the JEYAJANAANI's Number Guessing Game!");
        System.out.println("I've selected a random whole number between 1 and 100.");
        System.out.println("If you want to quit the game, type '0'");
        System.out.println("Can you guess what it is?");

        while (true) {
            System.out.print("Enter your guess: ");
        
            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess == 0) {
                    System.out.println("You quit the game. Let's play later");
                    System.out.println("The number was "+ secretNumber);
                    break;   
                }
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } 
                else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("\nCongratulations! You've guessed the number!");
                    System.out.println("Number of attempts: " + attempts);
                    break;
                }

            } 
             catch (InputMismatchException e) { 
                 System.out.println("Invalid input. Please enter a whole number.");
                 scanner.next(); 
            }
        }
        scanner.close();
    }
}