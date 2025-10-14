import java.util.Scanner;

public class MoveZerosToFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N
        int N = scanner.nextInt();

        // Create an array to store the numbers
        int[] nums = new int[N];

        // Read N numbers into the array and count the number of zeros
        int zeroCount = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        // Overwrite the array with the non-zero elements followed by zeros
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < N; i++) {
            nums[i] = 0;
        }

        // Print the numbers
 for (int i = 0; i < N; i++) {
    if (nums[i] == 0) {
        System.out.print(nums[i] + " ");
    }
}

// Print the non-zero elements
for (int i = 0; i < N; i++) {
    if (nums[i] != 0) {
        System.out.print(nums[i] + " ");
    }
}

System.out.println();
    }
}
