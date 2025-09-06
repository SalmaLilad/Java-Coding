import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] cows = new int [n];
        
        for (int i = 0; i < n; i++){
            cows[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int sum = 0;
                
                for (int k = i; k <= j; k++){
                    sum += cows[k];
                }
                
                for (int k = i; k <= j; k++){
                    if (sum % (j - i + 1) == 0){
                        int ave = sum / (j - i + 1);
                        if (cows[k] == ave) {
                            count++;
                            break;
                            
                
                        }            
                            
                        }
                
            }  
                
        }
    }
   System.out.println(count);
   
    }
}
