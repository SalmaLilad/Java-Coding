import java.util.*;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int counter = 0;
        
    for (int A = 1; A <= 500 ; A++) {
       for (int B = 1; B <= 500; B++) {
          if (B*B - A*A == N){
            counter ++; //Need counter to count number of pairs possible
                       //This line says that if B^2 - A^2 = N, count it
        }
         
       }
       
    }

    System.out.println(counter);     
   
   
    }
}
