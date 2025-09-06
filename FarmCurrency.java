
/*
find the maximum amount of money we can create using X & Y dollars
the amount of money we have must be at most M dollars
*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int M = sc.nextInt();
        
        int maxMoney = 0;
        
        //how many copeies of X do I have & how many copies of Y do I have?
        for(int i = 0; i <= M/X; i++){
            for(int j = 0; j <= M/Y; j++){
                int money = i*X + j*Y;
                if (money > maxMoney && money <= M){
                    maxMoney = money;
                }
            }
        }
        
        System.out.print(maxMoney);
        
    }
}
