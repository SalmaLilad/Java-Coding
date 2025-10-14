import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] order = new int[n];
        
        for (int i = 0; i < n; i++){
            order[i] = sc.nextInt();
        }
       
       int [] acornsIDs = new int[n];
       
       for (int i = 0; i < n; i++){
           acornsIDs[i] = sc.nextInt();
       }
       
       for (int i = 0; i < 3; i++){
           int[] newAcornIDs = new int[n];
           for (int j = 0; j < n; j++){
               int newPos = order[j] - 1;
               newAcornIDs[j] = acornsIDs[newPos];
           }
           
           acornsIDs = newAcornIDs;
           
       } 
    
       for (int i = 0; i < n; i++){
           System.out.println(acornsIDs[i]);
       } 
        
    }
}
