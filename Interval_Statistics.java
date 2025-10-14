import java.util.*;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int largest = -100;
        int smallest = 100;
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scan.nextInt();
            if (num == 0){
                break;
            }
         if (num > largest) {
            largest = num;
         }
        if (num < smallest) {
            smallest = num;
        }

      sum += num;
      count++;
    
    
    }
 if (count == 0) {
    System.out.println();
 } else {
    System.out.println(largest);
    System.out.println(smallest);
    System.out.println(sum);
 }

scan.close();

    }
}
