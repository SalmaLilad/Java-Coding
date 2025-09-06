import java.util.Scanner;

public class MatchstickGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMatches;
        int currentPlayer = 1;
        int maxMatches;

        System.out.println("Enter the number of matches: ");
        numMatches = scanner.nextInt();

        System.out.println("Enter the maximum number of matches a player can pick: ");
        maxMatches = scanner.nextInt();

        while (numMatches > 0) {
            System.out.println("Number of remaining matches: " + numMatches);
            drawMatches(numMatches);

            System.out.println("Player " + currentPlayer + ": How many matches do you want to pick? (1,2, ..., " + maxMatches + ")");
            int numToRemove = scanner.nextInt();

            if (numToRemove >= 1 && numToRemove <= maxMatches && numToRemove <= numMatches) {
                numMatches -= numToRemove;
                currentPlayer = 3 - currentPlayer;
            } else {
                System.out.println("Invalid move!");
                continue;
            }
        }

        int winner = 3 - currentPlayer;
        System.out.println("Player " + winner + " won the game!");
        scanner.close();
    }

    public static void drawMatches(int numMatches) {
        int numSpaces = numMatches; // Calculate number of spaces needed between vertical bars
        for (int i = 0; i < numSpaces; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < numMatches; i++) {
            System.out.print("| ");
        }
        System.out.println();
    }
}
