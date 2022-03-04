import java.util.*;
public class spiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // So out approach will be that we will take 4 variables as minr, minc, maxr, maxc and will work with 4 for loops and get out output.
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int noOfElements = n * m;           // total number of elements
        int count = 0;      // we take this count to check wheather all the elements have been iterated or not, so we always check whether our count is less than noOfElements or not.
        while(count < noOfElements) {  // checking whether all elements have been visited or not.
            // left wall
            for(int i = minr, j = minc; i <= maxr && count < noOfElements; i++) {  
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minc++;

            // bottom wall
            for(int i = maxr, j = minc; j <= maxc && count < noOfElements; j++) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxr--;

            // right wall
            for(int i = maxr, j = maxc; i >= minr && count < noOfElements; i--) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxc--;

            // top wall
            for(int i = minr, j = maxc; j >= minc && count < noOfElements; j--) {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minr++;
        }
    }
}