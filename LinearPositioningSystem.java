import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        for (int k = 1; k <= n; k++){
            boolean unique = true;
            
            for (int p = 0; p <= n-k; p++){
                String substr = s.substring(p, p+k); 
                
                
                if (s.substring(p+1, n).contains(substr)){
                    unique = false;
                    break;
                }
            }
            
            if (unique){
                System.out.println(k);
                break;
            }
        }
    }
}
