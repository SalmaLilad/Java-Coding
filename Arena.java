import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] roomPop = new int[n];
        
        for (int i = 0; i <= n-1; i++){
            roomPop[i] = sc.nextInt();
        }
        
        int minimum = 1000000000;
        
        for (int i = 0; i <= n-1; i++){
            int distance = 0;
            for (int j = 0; j <= n-1; j++){
                int room = (i + j) % n;
                distance += roomPop[room] * j;
            }
            minimum = Math.min(minimum, distance);
        }
        
        System.out.println(minimum);
    
    }
}
