import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int answerLogWala = power(x , n);
        System.out.println(answerLogWala);
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }

        int halfPower = power(x , n/2);
        int FinalLogAnswer = halfPower * halfPower;
        if(n % 2 == 1) {
            FinalLogAnswer = FinalLogAnswer * x;
        }

        return FinalLogAnswer;

    }

}