import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();

       
        int[] nums = new int[N];

      
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        int K = scanner.nextInt();

        int count = 0;
         for (int i = 0; i < nums.length; i++) {
         if (nums[i] == K) {
        count++;
    }
}
            
        

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}
