package murach.games;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // Get upper limit
        System.out.print("Enter the upper limit for the number: ");
        int upperLimit = Integer.parseInt(sc.nextLine());

        NumberGame numberGame = new NumberGame(upperLimit);
        System.out.println("OK, I'm thinking of a number between 0 and " +
                numberGame.getUpperLimit());
        System.out.println();
        
        System.out.print("Enter your guess: ");
        int guess = Integer.parseInt(sc.nextLine());
        while (guess != numberGame.getTargetNumber()) {
            if (guess < numberGame.getTargetNumber()) {
                System.out.println("Your guess is too low.\n");
            } else if (guess > numberGame.getTargetNumber()) {
                System.out.println("Your guess is too high.\n");
            }
            numberGame.incrementGuessCount();
            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(sc.nextLine());
        }        
        System.out.println("Correct!\n");
        
        System.out.println("You guessed the correct number in " + numberGame.getNumTries() +
                " guesses.\n");
        System.out.println("Bye!");
        sc.close();
    }
   
}