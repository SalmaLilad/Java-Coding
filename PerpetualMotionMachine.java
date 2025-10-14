import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [] capacity = new int [3];
        int [] contents = new int [3];
        
        for (int i = 0; i < 3; i++){
            capacity[i] = sc.nextInt();
            contents[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i <= 99; i++){
            
            int curr = i % 3;
            int next = (i + 1) % 3;
            
            int pour = Math.min(contents[curr], capacity[next] - contents[next]);
            
            contents[curr] -= pour;
            contents[next] += pour;
            
        }
        System.out.println(contents[0]);
        System.out.println(contents[1]);        // the numbers are indexes
        System.out.println(contents[2]);
        
    }
}
