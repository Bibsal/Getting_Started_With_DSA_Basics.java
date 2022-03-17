import java.util.*;
public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasingDecreasing(n , 1);
    }

    public static void printIncreasingDecreasing(int n , int idx) {
        if(idx > n) {
            return;
        }

        System.out.print(idx+" ");
        printIncreasingDecreasing(n - 1, idx + 1);
        System.out.print(idx+" ");
    }
}