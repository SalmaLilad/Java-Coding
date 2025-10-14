import java.util.*;

public class hello{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N;
    do {
     N = scan.nextInt();
    } while (N <= 1);



    int M;
    do {
        M = scan.nextInt();
    } while (M >= 1000);
    
    System.out.print(N +" ");
    while (N > 1) {
        if (N % M ==0) {
            N /= M;
        } else {
            
            N++;
        }
    
     System.out.print(N + " ");
    }
        
}

}
