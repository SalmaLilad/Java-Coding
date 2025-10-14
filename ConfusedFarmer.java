import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] milk = new int[7];
        for (int i = 0; i < 7; i++){
            milk[i] = sc.nextInt();
        }
        
    
        for (int i = 0; i < milk.length - 1; i++){
            for (int j = 0; j < milk.length -1 -i; j++){
                if (milk[j] > milk[j+1]){
                    int temp = milk[j];
                    milk[j] = milk[j+1];
                    milk[j+1] = temp;
                    // swap places in array
                }
            }
        }
    
        int a = milk[0];
        int b = milk[1];
        int c = milk[6] - a - b;
        
        System.out.println(a + " " + b + " " + c);
    }
}
