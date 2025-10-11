// ### Project: Toads and Frogs Game ###
import java.util.*;

public class toadsAndFrogsGame {

    // global variables and arrays
    static int n;                        
    // board size
    static char[] board = new char[21];   // current board,
                                         
    // create a board of size 21 which is the max value of N
    static int dashPos;      // the position of the empty spot on the current board
    static int finish;                    // status of the game - {-1:in progress,0:player lost,1:player won}
   
    static int curMove;                   // the move chosen by the player in the current turn
    static int numOfMoves;               
    // keep the number of moves

    static Scanner scan = new Scanner (System.in);  // scanner that will used in the entire code

    static void setupGame() {
       
    n = scan.nextInt(); // N is size
    int middle = n/2;
    dashPos = middle;
    for(int i = 0; i < n; i++){
    if (i <dashPos){
        board[i] += 'T';
    } else if (i == dashPos){
        board[i] = '-';
    } else {
        board[i] += 'F';
    }
}
numOfMoves = 0;
finish = -1;

    }

    static void drawScreen() {
        for(int i = 0; i < n; i++){
            System.out.print(board[i]);
            }
            System.out.println();
            System.out.println("Number of moves: " + numOfMoves);
            System.out.println();
        }

    static void getMove() {
        System.out.print("Enter move (1.." + n + "):");
        System.out.println();
        curMove = scan.nextInt();
       
    
    }

    static void makeMove() {
        char temp;
        curMove = curMove -1;
        
        temp = board[curMove];
        board[curMove] = board[dashPos];
        board[dashPos] = temp; 

        dashPos = curMove;
        numOfMoves = numOfMoves + 1;

        
    }

    static int checkEndGame() {
        for (int i = 0; i <n; i++) {
            if (board[i] == 'T' && i < n / 2) {
                return -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[i] == 'F' && i >= n / 2) {  // 'F' found on the right side
                return -1;
            }
        }
      if (board[n/2] != '-'){
          return -1;
      }

return 0;

    }

    public static void main(String args[]) {

        setupGame();                       
    // STEP 1

        // main game loop
        while (true) {
            drawScreen();                  
    // STEP 2
            getMove();                      // STEP 3
           
    makeMove();                     // STEP 4
            finish = checkEndGame();       
    // STEP 5
            if (finish>-1) break;            // if game is finished, break the loop
       
    }
    

        drawScreen();
        
        System.out.println("You finished!");
        // *** TO BE FILLED
    }
}
