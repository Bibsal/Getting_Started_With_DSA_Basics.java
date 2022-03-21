import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int fact = factorial(n);
        System.out.print(fact);
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fact = n * fnm1;
        return fact;

        // or return n * factorial(n - 1);
    }
}
