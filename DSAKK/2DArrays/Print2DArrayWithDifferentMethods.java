import java.util.*;
public class Print2DArrayWithDifferentMethods {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();       // row
        int m = scn.nextInt();       // col

        int[][] arr = new int[n][m];       // Declaring 2D Array
        int[][] arr1 = {
            {1,3,5},
            {6,9,2,4},
            {7,4}
        };
        System.out.println("Length of array is " + arr.length);     // printing the length of the array

        // Taking inputs
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
            }
        }

        // Printing with normal for loop
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++) {              // here since the size of all rows will be same as we pass one value of m(col) so we can consider the length of first row and work for all other rows with same length
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // Printing with normal for loop
        for(int row = 0; row < arr1.length; row++) {
            for(int col = 0; col < arr1[row].length; col++) {              // here arr1[0].length won't work as we have differnt sized element of rows of arr1 array, so we run loop for arr[row].length which goes on each row and work according to their size. 
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }

        // Printing using enhanced for loop or for each loop
        for(int[] element : arr) {
            for(int val : element) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
        // Printing using collections (i.e Arrays.toString(arrayPass))
        for(int[] elemArr : arr) {
            System.out.println(Arrays.toString(elemArr));
        }

        // Printing using collections (i.e Arrays.deepToString(arr))
        System.out.println(Arrays.deepToString(arr));        // if you directly want to print a 2D array in one line then you use deepToString(passArr) method and your work will be done.

    }
}