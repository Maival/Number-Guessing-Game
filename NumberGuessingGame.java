
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            int secretNumber = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("Number Guessing Game : ");
            System.out.println("Guess the number between 1 and 100");

            while (guess != secretNumber) {

                System.out.print("Enter your guess: ");

                try {
                    guess = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too lower! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too higher! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("\nPress 'again' to play again or type 'exit' to close the program: ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("Thank you for playing the Number Guessing Game!");
                break;
            }
        }

        scanner.close();
    }
}