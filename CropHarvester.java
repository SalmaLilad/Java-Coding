/* 
Crop Harvester
[ Memory: 16 MB, CPU: 1 sec ]

After a hard day of harvesting crops, Farmer John realizes that he can no longer harvest crops without hurting his back, so he purchases a crop harvester that will automatically harvest crops for him.  However, the crop harvester can only harvest rectangular areas of his field, and Farmer John does not want to have to continuously reposition and recalibrate the crop harvester.So he wants to figure out what rectangular area he wants to have the crop harvester run on. Farmer John’s crops can be mapped to a coordinate plane as two overlapping rectangles with integer coordinates between -1000 and 1000. Given that Farmer John already finished harvesting the crops on one of these rectangles, determine the area of the smallest rectangle that Farmer John can set his new crop harvester to harvest all his crops.

INPUT FORMAT

The first line of input contains four space separated integers x_1, y_1, x_2, and y_2, representing the coordinates of the bottom left and top right corners of the unharvested rectangle of crops. The second line contains four space separated integers x_3, y_3, x_4, and y_4, representing the coordinates of the bottom left and top right corners of the rectangle of crops that Farmer John already harvested. 

OUTPUT FORMAT

Output a single integer representing the area of the smallest rectangle that Farmer John can set his new crop harvester to harvest in order to harvest all of his crops.

SAMPLE INPUT

-3 2 8 5
2 4 9 10
SAMPLE OUTPUT

33
Although Farmer John has already harvested the upper-right corner of the unharvested rectangle of crops, he still needs to set his crop harvester to harvest the entire rectangle to have all his crops harvested.
*/

import java.util.*;

public class Crop_Harvester{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        int minX = 1000;
        int maxX = -1000;
        
        int minY = 1000;
        int maxY = -1000;
        
        for (int i = x1; i < x2; i++){
            for (int j = y1; j < y2; j++){
            
                if (!((i >= x3 && i < x4) && (j < y4 && j >= y3))) {
                    minX = Math.min(i, minX);
                    minY = Math.min(j, minY);
                    
                    maxX = Math.max(i, maxX);
                    maxY = Math.max(j, maxY);
                }
            }
        }
        
        int area = Math.max(maxX - minX + 1, 0) * Math.max(maxY - minY + 1, 0);
        System.out.print(area);
        
        
    }
}
