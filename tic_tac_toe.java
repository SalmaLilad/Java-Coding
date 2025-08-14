// ### Project: Tic Tac Toe Game ###
import java.util.*;

public class tic_tac_toe {

    // global variables and arrays
    static int n;                             // board size
    static char[][] board = new char[3][3];   // create a board of size 3x3
    static int curPlayer;                     // current player (1 or 2)
    static int numOfMoves;                    // keep the number of moves
    static int row, col;                      // current move
    static int finish;                        // status of the game
                                 //  {-1:in progress, 0:tie, 1:player 1 won, 2:player 2 won}
    static Scanner scan = new Scanner (System.in);  // scanner that will used in the entire code

    static void setupGame() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] += '-';
            }
        }
        numOfMoves = 0;
        curPlayer = 1;
        finish = -1;    
    }

    static void drawScreen() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void getMove() {
        
        int valid = 0;
        while (valid == 0){
            System.out.println("Player " + curPlayer + ", please enter your move (row, col): ");
            row = scan.nextInt();
            col = scan.nextInt();
            
            if (row < 1 || row > 3 || col < 1 || col > 3){
                System.out.println("Invalid move!");
            } else if ( board[row-1][col-1] != '-'){
                System.out.println("Invalid move!");
            } else {
                valid = 1;
                numOfMoves++;
                curPlayer = 3 - curPlayer;
            }
        }
    }

    static void makeMove() {
        if (curPlayer == 1){
            board[row-1][col-1] = 'O';
      } else {
        board[row-1][col-1] = 'X';
}


    }

    static int checkEndGame() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                drawScreen();
            if (board[i][0] == 'O') {
                System.out.println("Player 2 won the game!");
                return 1;
            } else {
                System.out.println("Player 1 won the game!");
                return 2;
            }
        }

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                drawScreen();
                if (board[0][i] == 'O') {
                    System.out.println("Player 2 won the game!");
                    return 1;
                } else {
                    System.out.println("Player 1 won the game!");
                    return 2;
                }
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            drawScreen();
            if (board[0][0] == 'O') {
                System.out.println("Player 2 won the game!");
                return 1;
            } else {
                System.out.println("Player 1 won the game!");
                return 2;
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            drawScreen();
            if (board[0][2] == 'O') {
                System.out.println("Player 2 won the game!");
                return 1;
            } else {
                System.out.println("Player 1 won the game!");
                return 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return -1; // Game is still in progress
                }
            }
        }

        drawScreen();
        System.out.println("Tie!");
        return 0; // It's a tie
    }

    public static void main(String args[]) {

        setupGame();                        // STEP 1

        // main game loop
        while (true) {
            drawScreen();                   // STEP 2
            getMove();                      // STEP 3
            makeMove();                     // STEP 4
            finish = checkEndGame();        // STEP 5
            if (finish>-1) break;            // if game is finished, break the loop
        }

        // STEP 6: end game information
        // *** TO BE FILLED
    }
}