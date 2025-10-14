import java.util.*;

public class CowRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  
        int N = sc.nextInt();
        int[] B = new int[N - 1];
        

        for (int i = 0; i < N - 1; i++) {
            B[i] = sc.nextInt();
        }
   
        int[] A = new int[N];
        
    
        for (int A1 = 1; A1 <= N; A1++) {
            A[0] = A1; 
            boolean valid = true;
            boolean[] used = new boolean[N + 1]; 
            used[A1] = true; 
            
       
            for (int i = 1; i < N; i++) {
                A[i] = B[i - 1] - A[i - 1];
      
                if (A[i] < 1 || A[i] > N || used[A[i]]) {
                    valid = false;
                    break;
                }
                used[A[i]] = true; 
            }
            
         
            if (valid) {
                for (int i = 0; i < N; i++) {
                    System.out.print(A[i] + " ");
                }
                System.out.println();
                return; 
                
            }
        }
    }
}
