import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<Integer> elise = new ArrayList<>();
        //empty array ArrayList
        
        for (int i = 0; i <= n - 1; i++){
            int duration = sc.nextInt();
            int rate = sc.nextInt();
            for (int j = 0; j < duration; j++){
                elise.add(rate);
                //adds element in array lists
            }
            
        }
        
        ArrayList<Integer> bessie = new ArrayList<>();
        
        for (int i = 0; i < m; i++){
            int duration = sc.nextInt();
            int rate = sc.nextInt();
            for (int j = 0; j < duration; j++){
                bessie.add(rate);
            }
        }
    
        int max = 0;
        
        for (int t = 0; t < 100; t++){
            if (bessie.get(t) - elise.get(t) > max){
                max = bessie.get(t) - elise.get(t);
            }
        }
        
        System.out.println(max);
    }
}
