import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] X = new int[n]; //making x & y coordinate arrays
        int[] Y = new int[n];
        
        for(int i = 0; i < n; i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            
        }
        
        int maxDistSqr = 0;
        int p1 = 0;
        int p2 = 0;
        
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int distSqr  = ((X[i]-X[j])*(X[i]-X[j]) + (Y[i]-Y[j])*(Y[i]-Y[j])); //distance formula
                if (distSqr > maxDistSqr){
                    maxDistSqr = distSqr;
                    p1 = i+1;
                    p2 = j+1; //index is 0 based, and there can't be a 0th person
                }
            }
        }
        
        System.out.print(p1 + " " + p2);
        
    }
}
