import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int answer = factorial(n);
        System.out.println(answer);
    }

    public static int factorial(int n){
        if(n == 0) {
            return 1;
        }

        int fact = factorial(n - 1);
        int factFinal = fact * n;
        return factFinal;
    }

}