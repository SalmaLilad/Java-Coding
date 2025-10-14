import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [][] moves = new int[n][3];
        
        for (int i = 0; i < n; i++){
            moves[i][0] = sc.nextInt();
            moves[i][1] = sc.nextInt();
            moves[i][2] = sc.nextInt();
            }
    
        int [] posScores = new int[3];
        
        for (int start = 1; start <= 3; start++){
            int markedPos = start;
            int score = 0;
            
            for (int i = 0; i < n; i++){
                int pos1 = moves[i][0];
                int pos2 = moves[i][1];
                int guess = moves[i][2];
                
                if (markedPos == pos1){
                    markedPos = pos2;
                } else if (markedPos == pos2) {
                    markedPos = pos1;
                }
                
                if (markedPos == guess){
                    score++;
                } 
                
            }
            
            posScores[start - 1] = score;
        
        }
        
       System.out.println(Math.max(posScores[0], Math.max(posScores[1], posScores[2]))); 
    }
}
