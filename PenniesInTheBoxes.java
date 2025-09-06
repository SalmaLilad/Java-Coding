import java.util.*;

public class PenniesInTheBoxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // step 1: game setup
        System.out.println("Enter the number of boxes:");
        int n = scan.nextInt();

        System.out.println("Enter pennies in each box:");
        int[] board = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = scan.nextInt();
        }

        int turn = 1;        // first player's turn
        int score1 = 0;      // initialize player 1 score
        int score2 = 0;      // initialize player 2 score
        int left = 0;        // left marker
        int right = n - 1;   // right marker
        int[] undo = new int[100]; // store undo moves
        int uCount = 0;      // undo counter

        // main game loop
        while (true) {
            // step 2: draw screen
            System.out.println("\nBoxes:");
            for (int i = left; i <= right; i++)
                System.out.print(board[i] + " ");
            System.out.println();

            System.out.println("Player 1 score: " + score1);
            System.out.println("Player 2 score: " + score2);

            // prompt move
            System.out.println("Enter player " + turn + " move (1 for leftmost, 2 for rightmost, 3 for undo):");

            // step 3: read the move
            int move = scan.nextInt();
            int point = 0;

            // step 4: validate and execute move
            if (move < 1 || move > 3) {
                System.out.println("Invalid move!");
            }
            else if (move == 1) { // pick from left
                point = board[left];
                left++;
                undo[uCount] = 1;
                uCount++;
            }
            else if (move == 2) { // pick from right
                point = board[right];
                right--;
                undo[uCount] = 2;
                uCount++;
            }
            else if (move == 3 && uCount > 0 && undo[uCount - 1] == 1) { // undo left
                uCount--;
                left--;
                point = board[left];
            }
            else if (move == 3 && uCount > 0 && undo[uCount - 1] == 2) { // undo right
                uCount--;
                right++;
                point = board[right];
            }

            // update scores
            if (point != 0 && turn == 1) {
                score1 += point;
                turn = 2; // switch to player 2
            }
            else if (point != 0 && turn == 2) {
                score2 += point;
                turn = 1; // switch to player 1
            }

            // step 5: end game check
            if (left > right) break;
        }

        // step 6: end of game screen
        System.out.println("\nFinal Scores:");
        System.out.println("Player 1 score: " + score1);
        System.out.println("Player 2 score: " + score2);

        if (score1 > score2)
            System.out.println("Player 1 won!");
        else if (score2 > score1)
            System.out.println("Player 2 won!");
        else
            System.out.println("It's a tie!");
    }
}
