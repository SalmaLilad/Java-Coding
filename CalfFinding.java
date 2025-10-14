import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int Y = sc.nextInt();
        
        int currentPos = x;
        int distance = 0;
        int searchRadius = 1;
        
        while (true){
            
            int futurePos = x + searchRadius;
            
            if (currentPos <= Y && Y <= futurePos || futurePos <= Y && Y <= currentPos){
                distance += Math.abs(Y - currentPos);
                break;
                }
            distance += Math.abs(futurePos - currentPos);
            currentPos = futurePos;
            searchRadius = searchRadius * -2;
        }
        
        System.out.println(distance);
        
        
  
    }
}
