import java.util.*;


public class hello {
 public static void main(String [] args){
   Scanner scan = new Scanner(System.in);
   int N = scan.nextInt();
   int[] nums = new int[N];
   for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
   for (int i = 0; i < N; i++) {
    if (nums[i] < 0) {
        System.out.print(nums[i] + " ");
    }
}

// Print the rest of the numbers
for (int i = 0; i < N; i++) {
    if (nums[i] >= 0) {
        System.out.print(nums[i] + " ");
    }
}

System.out.println();
}   
}
