import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int NQ = sc.nextInt();
        int P = sc.nextInt();
        
        int grid [][] = new int [N][NQ];
        
        for(int i = 0; i < N; i++){
            for (int j = 0; j < NQ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        int questions [] = new int [P];
        int answers [] = new int [P];
        
        for (int i = 0; i < P; i++){
            questions[i] = sc.nextInt();
            answers[i] = sc.nextInt();
            
            questions[i] = questions[i] - 1;
        }
        
        int count = 0;
        
        for (int i = 0; i < N; i++){
            int correct = 0;
            for (int j = 0; j < P; j++){
                int currA = answers[j];
                int currQ = questions[j];
                
                if (grid[i][currQ] == currA){
                    correct++;
                }
            }
           
            if (correct == P){
                count++; 
            }
        
        }
        
        System.out.print(count);
    }
}
