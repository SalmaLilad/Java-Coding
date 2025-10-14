import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
    
        int[] sortedHeights = new int[n];
        
        for (int i = 0; i < n; i++){
            sortedHeights[i] = heights[i];
        }
    
        int swaps = 0;
        
        for (int i = 0; i < n; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (sortedHeights[j] < sortedHeights[minIndex]) {
                    minIndex = j;
                }
            }
        
            if (minIndex != i){
                int temp = sortedHeights[i];
                sortedHeights[i] = sortedHeights[minIndex];
                sortedHeights[minIndex] = temp;
                swaps++;
            }
        }
    
        System.out.println(swaps);
    }
}
