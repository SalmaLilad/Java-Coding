import java.util.*;

public class hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[4];

        for (int i=0; i < 4; i++) {
            numbers[i] = scan.nextInt();

        }
        boolean found = false;
        for (int i=0; i < 4 && !found; i++) {
            for (int a = i + 1; a < 4 && !found; a++) {
                for (int b = a + 1; b < 4 && !found; b++) {
                    if (numbers[i] + numbers[a] + numbers[b] == numbers[6-i-a-b]) {

                        System.out.println(numbers[i] + " + " + numbers[a] + " + " + numbers[b] + " = " + numbers[6-i-a-b]);
                        found = true;
                    }
                }
            } 
        }
    
    scan.close();
    }
