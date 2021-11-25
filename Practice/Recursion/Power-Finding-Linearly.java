import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int answer = power(x , n);
        System.out.println(answer);
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }

        int powerrr = power(x , n - 1);
        int finalans = powerrr * x;
        return finalans;
    }

}