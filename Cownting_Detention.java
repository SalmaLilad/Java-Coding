import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();
        int y = sc.nextInt();
       
        int[] counts = new int[10];
 
        for (int num = x; num <= y; num++) {
            int temp = num; // to keep original num value
            while (temp > 0) {
                int digit = temp % 10; 
                counts[digit]++;
                temp = temp / 10; 
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + " ");
        }
    }
}
