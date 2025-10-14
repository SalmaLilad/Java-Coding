import java.util.*;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
       
       //computing 2^A 
       long power = 1;
       for(int i = 0; i < A; i++){
           power*=2;
       }
       
       int answer = 0;
       
       //2^(A+1) and beyond
        for (int E=A+1; E <= 62; E++) {
        power *= 2;
        long firstDig = power;
       
       while (firstDig > 9) {
           firstDig /= 10;
       }
       
       if (firstDig ==B){
          answer = E; 
          break;
       }
      
        }
     System.out.println(answer);
        
        
    }
}
