import java.util.*;

public class BallGame {


    public static boolean beats(int[][] balls, int a, int b) {
        int aWins = 0;
        int bWins = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (balls[a][i] > balls[b][j]) {
                    aWins++;
                }
                if (balls[b][i] > balls[a][j]) {
                    bWins++;
                }
            }
        }
        
        return aWins > bWins;
    }

    public static String solution(int[][] balls) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    for (int l = 1; l <= 10; l++) {
                        balls[2] = new int[]{i, j, k, l}; // Define ball C
                        if (beats(balls, 0, 1) && beats(balls, 1, 2) && beats(balls, 2, 0)) {
                            return "yes";
                        }
                        if (beats(balls, 1, 0) && beats(balls, 2, 1) && beats(balls, 0, 2)) {
                            return "yes";
                        }
                    }
                }
            }
        }
        return "no";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        while (T-- > 0) {
            int[][] balls = new int[3][4];

          
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    balls[i][j] = scanner.nextInt();
                }
            }

            System.out.println(solution(balls));
        }


    }
}
