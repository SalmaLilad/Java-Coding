import java.util.Scanner;

public class SimpleGuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the secret number from input
        int secretNumber = scan.nextInt();
        scan.nextLine();
        
        int numGuesses = 0; // Initialize the number of guesses
        
        while (true) {
            // Print the message before each guess
            System.out.println("Guess the number:");
            
            // Read the guessed number from input
            int guessedNumber = scan.nextInt();
            
            
            
            // Check if the guessed number is valid
            if (guessedNumber < 1 || guessedNumber > 100) {
                System.out.println("invalid guess");
                scan.nextLine();
                continue;
            }
            
            numGuesses++; // Increment the number of guesses for valid guesses
            
            // Provide feedback to the player
            if (guessedNumber < secretNumber) {
                System.out.println("go up");
            } else if (guessedNumber > secretNumber) {
                System.out.println("go down");
            } else {
                // Correct guess
                System.out.println("correct");
                System.out.println("Number of guesses: " + numGuesses);
                break;
            }
            
            scan.nextLine();
        }
        
        
    }
    
}
