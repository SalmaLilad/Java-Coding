import java.io.*;
 
class GFG 
{
 
// Function to find the minimum and the
// maximum possible length of the third
// side of the given triangle
static void find_length(int s1, int s2)
{
 
    // Not a valid triangle
    if (s1 <= 0 || s2 <= 0)
    {
        System.out.print(-1);
        return;
    }
    int max_length = s1 + s2 - 1;
    int min_length = Math.max(s1, s2) - Math.min(s1, s2) + 1;
 
    // Not a valid triangle
    if (min_length > max_length) 
    {
        System.out.print(-1);
        return;
    }
 
    System.out.println("Max = " + max_length);
    System.out.print("Min = " + min_length);
}
 
// Driver code
public static void main (String[] args) 
{
    int s1 = 8, s2 = 5;
    find_length(s1, s2);
}
}
