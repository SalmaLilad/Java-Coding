/*

Stone Jumping
[ Memory: 64 MB, CPU: 1 sec ]

Bessie is playing a game with three stones arranged along a number line. Each of the three stones begins in a unique position P_i (1 <= P_i <= 1,000,000,000). Bessie’s objective is to place the stones on consecutive integers using the following rule: she can select the leftmost or rightmost stone and move it between the remaining two stones. Over time, this rule brings the stones closer and closer together.

Determine the minimum and maximum number of stone moves Bessie can make to arrange the stones on consecutive integers.

*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int stones [] = new int [3];
        
        for(int i = 0; i < 3; i++){
            stones[i] = sc.nextInt();
        }
        
        Arrays.sort(stones); //Puts numbers in order
        
        int gap1 = stones[1] - stones[0];
        int gap2 = stones[2] - stones[1];
        
        if (gap1 == 1 && gap2 == 1){
            System.out.println(0);
        }
        
        else if (gap1 == 2 || gap2 == 2){
            System.out.println(1);
        }
        
        else{
            System.out.println(2);
        }
        
        System.out.println(Math.max(gap1, gap2) - 1);
    }
}
