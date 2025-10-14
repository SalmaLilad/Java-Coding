import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        ArrayList<Integer> inverseIndex = new ArrayList<>();
        // this is how to initialize an array list
        //this arraylist will hold integer values
        
        for (int task = 1; task <= n; task++){
            int duration = sc.nextInt();
            for (int i = 0; i <= duration - 1; i++){
                inverseIndex.add(task); // way to add to an array list
            }
        }
        
        for (int i = 0; i <= q - 1; i++){
            int t = sc.nextInt();
            System.out.println(inverseIndex.get(t));
            //.get(index) retrieves elements from array lists
        }
        
    }
}
