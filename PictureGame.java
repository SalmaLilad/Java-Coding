import java.util.*;

public class Main{

    static int countLetter(String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  

        String[] front = new String[n];
        String[] back = new String[n];

        for (int i = 0; i < n; i++){
            front[i] = sc.next();
            back[i] = sc.next();
        }

        for (int i = 0; i < 26; i++){
            char letter = (char) ('a' + i); 

            int total = 0;

            for (int j = 0; j < n; j++){
                int countFront = countLetter(front[j], letter);
                int countBack = countLetter(back[j], letter);

                total += Math.max(countFront, countBack);
            }
            System.out.println(total);
        }
    }
}

