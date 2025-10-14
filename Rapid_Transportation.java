import java.util.*;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
      int a = scan.nextInt();
       int b = scan.nextInt();
       int x = scan.nextInt();
       int y = scan.nextInt();
       
       int  smallerTransporterDistance = -1;
       if (Math.abs(a-x) + Math.abs(b-y) > (Math.abs(a-y) + Math.abs(b-x))) {
           smallerTransporterDistance = Math.abs(a-y) + Math.abs(b-x);
           
       }
           else {
               smallerTransporterDistance = Math.abs(a-x) + Math.abs(b-y);
           }
       
       
        //without transporter
        int regDistance = Math.abs(a-b);
        
        if (smallerTransporterDistance > regDistance){
            System.out.println(regDistance);
        } else {
            System.out.println(smallerTransporterDistance);
        }
   
 
 
    }
}
