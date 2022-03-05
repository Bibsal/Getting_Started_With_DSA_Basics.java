import java.io.*;
import java.util.*;

public class ShellRingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();    // konsi shell ko rotate karna hai
        int r = scn.nextInt();    // kitne value sae rotate karna hai
        ringRotate(arr,s,r);
        display(arr);
    }

    public static void ringRotate(int[][] arr, int s, int r) {
        // We solve this problem using three methods.
        // 1. fill the shell to be rotated in a single dimentional matrix from 2d matrix
        // 2. rotate this single dimention matrix with the value of r
        // 3. refill it back to the same shell of the 2d matrix
        int[] oned = fillOnedFromShell(arr, s);        // step 1
        rotateOned(oned, r);                         // step 2
        fillShellFromOned(arr, s, oned);             // step 3
    }
    // step 1 start
    public static int[] fillOnedFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int size = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[size];
        int idx = 0;
        // left wall
        for(int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        minc++;
        // bottom wall
        for(int i = maxr, j = minc; j <= maxc; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        maxr--;
        // right wall
        for(int i = maxr, j = maxc; i >= minr; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        maxc--;
        // top wall
        for(int i = minr, j = maxc; j >= minc; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        minr++;
        return oned;
    }
    // step 1 end

    // step 2 start
    public static void rotateOned(int[] oned, int r) {
        r = r % oned.length;
        if(r < 0) {
            r = r + oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] oned, int li, int ri) {
        while(li < ri) {
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;

            li++;
            ri--;
        }
    }
    // step 2 end

    // Step 3 start 

    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int idx = 0;
        // left wall
        for(int i = minr , j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        minc++;
        // bottom wall
        for(int i = maxr , j = minc; j <= maxc; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        maxr--;
        // right wall
        for(int i = maxr, j = maxc; i >= minc; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        maxc--;
        // top wall 
        for(int i = minr, j = maxc; j >= minc; j--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        minr++;
    }

    // Step 3 end
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}