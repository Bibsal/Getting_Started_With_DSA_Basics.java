import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Now we will work with the gaps of the matrix
        for(int gap = 0; gap < arr.length; gap++) {
            for(int i = 0, j = gap; j < arr.length; i++, j++) {        // since every diagonal starts with 0 for i and with gap value for j so we have initialised the value of loop here like that only, and as it travels both i and j increases by 1 so we've incremented both by 1
                System.out.println(arr[i][j]);
            }
        }
    }

}