import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and M from the first line
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Create an array of size N filled with zeros
        int[] arr = new int[N];

        // Read M lines of operations and update the array
        for (int i = 0; i < M; i++) {
            int P = scanner.nextInt(); // position
            int V = scanner.nextInt(); // value
            arr[P] = V; // update the value at position P
        }

        // Print the updated array
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
