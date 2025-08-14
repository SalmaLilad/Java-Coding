import java.math.BigInteger;
import java.util.*;

class Fib {

    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return b;
    }


    public static void main(String[] args) {
        System.out.print("List nth number in Fibonacci sequence you would like to calculate: ");
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.println("F(0) = " + a);
        System.out.println("F(1) = " + b);
        

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;

            System.out.println("F(" + i.toString() + ") = " + a);
            System.out.println("F(" + (i.add(BigInteger.ONE)).toString() + ") = " + b);
            
        }

        System.out.println();
        System.out.println("The " + n.toString() + "th Fibonacci number is: " + fib(n));

        sc.close();
    }
}

