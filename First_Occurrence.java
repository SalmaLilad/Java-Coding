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

      
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (nums[i] == K) {
                index = i;
                break;
            }
        }

       
        System.out.println(index);

        scanner.close();
    }
}
