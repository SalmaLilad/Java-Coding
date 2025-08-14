import java.util.Scanner;

public class alphaMan {

    // global variables and arrays
    static int n, m;                           // maze size N x M
    static char[][] maze = new char[20][20];   // current maze
    static int rowAM, colAM;                   // Alphaman's position
    static int rowExit, colExit;               // Exit position
    static int rowTarget, colTarget;           // Target position after move
    static int finish;                         // Game status: -1 (in progress), 0 (win), 1 (loss)
    static int gemCount = 0;                   // Number of remaining gems
    static Scanner scan = new Scanner(System.in);

    static void setupGame() {
        n = scan.nextInt();
        m = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String line = scan.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == 'A') {
                    rowAM = i;
                    colAM = j;
                } else if (maze[i][j] == 'E') {
                    rowExit = i;
                    colExit = j;
                } else if (maze[i][j] == 'G') {
                    gemCount++; // count initial gems
                }
            }
        }
        finish = -1;
    }

    static void drawScreen() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        System.out.println("Remaining gems: " + gemCount);  // show remaining gems
        System.out.println();
    }

    static void getMove() {
        int valid = 0;

        while (valid == 0) {
            System.out.println("Enter move:");
            String line = scan.next();
            char move = line.charAt(0);

            if (move == 'u') {
                rowTarget = rowAM - 1;
                colTarget = colAM;
            } else if (move == 'd') {
                rowTarget = rowAM + 1;
                colTarget = colAM;
            } else if (move == 'r') {
                rowTarget = rowAM;
                colTarget = colAM + 1;
            } else if (move == 'l') {
                rowTarget = rowAM;
                colTarget = colAM - 1;
            } else {
                System.out.println("Invalid move!");
                continue;
            }

            char targetChar = maze[rowTarget][colTarget];

            if (rowTarget >= 0 && rowTarget < n && colTarget >= 0 && colTarget < m) {
                if (targetChar == '#') {
                    System.out.println("Invalid move!");
                } else if (targetChar == 'E' && gemCount > 0) {
                    System.out.println("Invalid move!");
                } else {
                    valid = 1;
                }
            } else {
                System.out.println("Invalid move!");
            }
        }
    }

    static void makeMove() {
        char targetChar = maze[rowTarget][colTarget];

        // If target is monster
        if (targetChar == 'M') {
            maze[rowAM][colAM] = '.';
            rowAM = rowTarget;
            colAM = colTarget;
            finish = 1; // lost
            return;
        }

        // Collect gem
        if (targetChar == 'G') {
            gemCount--;
        }

        // Move Alphaman
        if (maze[rowAM][colAM] != 'E') {
            maze[rowAM][colAM] = '.';
        }

        rowAM = rowTarget;
        colAM = colTarget;
        
        maze[rowAM][colAM] = 'A';

    }
    

    static int checkEndGame() {
        if (rowAM == rowExit && colAM == colExit && gemCount == 0) {
            return 0; // win
        } else if (finish == 1) {
            return 1; // lost
        } else {
            return -1; // still playing
        }
    }

    public static void main(String[] args) {
        setupGame();

        while (true) {
            drawScreen();
            getMove();
            makeMove();
            finish = checkEndGame();
            if (finish == 0 || finish == 1) break;
        }

        drawScreen();
        if (finish == 0) {
            System.out.println("Congrats, you finished!!!");
        } else if (finish == 1) {
            System.out.println("You lost!!!");
        }
    }
}
