// (Eg n = 5) We want to print 5 4 3 2 1 0 1 2 3 4 5 
import java.util.*;
public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printDecInc(n);
    }

    public static void printDecInc(int n) {
        if(n == 0) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecInc(n - 1);
        System.out.print(n+" ");
    }
}
