/*

Survey
[ Memory: 16 MB, CPU: 1 sec ]

Alpha has surveyed his class of N (2 ≤ N ≤ 50,000) students with IDs 1..N with a questionnaire with NQ (1 ≤ NQ ≤ 50) questions (labelled R1 to RNQ), each with an integer answer from 1 to 5.

After compiling the results of his questionnaire, Alpha wants to answer a series of simple questions, such as "How many students answered 2 to question 3, 4 to question 7, and also 1 to question 8?" More specifically, Alpha has P (1 ≤ P ≤ 10) questions, and each question has question number Qj (1 ≤ Qj ≤ NQ) and required answer Aj (1 ≤ Aj ≤ 5). Alpha wants you to find the total number of students that answered Aj to Qj for j in the range 1..R.

For example, consider a class of 4 students and a survey of 6 questions; the responses are:

Student  Question
ID       1  2  3  4  5  6
----     ----------------
1        1  1  1  1  1  1
2        1  2  3  4  5  2
3        1  2  1  2  3  3
4        1  1  3  2  2  2
If Alpha asks, "How many students answered 3 to question 3 and 2 to question 4?" the answer would be 1 (just student 4). If Alpha asks, "How many students answered 1 to question 1 and 2 to question 6?" the answer would be 2 (students 2 and 4).

*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int NQ = sc.nextInt();
        int P = sc.nextInt();
        
        int grid [][] = new int [N][NQ];
        
        for(int i = 0; i < N; i++){
            for (int j = 0; j < NQ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        int questions [] = new int [P];
        int answers [] = new int [P];
        
        for (int i = 0; i < P; i++){
            questions[i] = sc.nextInt();
            answers[i] = sc.nextInt();
            
            questions[i] = questions[i] - 1;
        }
        
        int count = 0;
        
        for (int i = 0; i < N; i++){
            int correct = 0;
            for (int j = 0; j < P; j++){
                int currA = answers[j];
                int currQ = questions[j];
                
                if (grid[i][currQ] == currA){
                    correct++;
                }
            }
           
            if (correct == P){
                count++; 
            }
        
        }
        
        System.out.print(count);
    }
}
