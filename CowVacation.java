import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] bids = new int[m];
        
        for (int i = 0; i < m; i++){
            bids[i] = sc.nextInt();
        }
        
        int maxRev = 0;
        int maxPrice = 0;
        
        for (int i = 0; i < m; i++){
            int price = bids[i];
            int willingPayer = 0;
            for (int j = 0; j < m; j++){
                if (price <= bids[j]){
                    willingPayer++;
                }
            }
            int rev = Math.min(willingPayer, n) * price;
            if (maxRev < rev){
                maxRev = rev;
                maxPrice = price;
            }
        }
            
        System.out.println(maxPrice + " " + maxRev);
        
        
        
        
        
    }
}
