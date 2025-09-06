import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] hills = new int[n];
        
        for (int i = 0; i < n; i++){
            hills[i] = sc.nextInt();
        }
    
        int minCost = 1000*100*100;
        
        for (int i = 0; i < 84; i++){
            int minHeight = i;
            int maxHeight = i + 17;
            int cost = 0;
            
            for (int height : hills){
                if (height < minHeight){
                    cost += (minHeight - height) * (minHeight - height); 
                } else if (height > maxHeight){ // no ^2 in Java
                    cost += (height - maxHeight) * (height - maxHeight);
                }
            }
            
            minCost = Math.min(minCost, cost);
        }
        
        System.out.println(minCost);
        
    }      
}
