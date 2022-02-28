//  %  = 
import java.util.*;
public class TwoDBasicIO {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();       // for rows
        int m = scn.nextInt();       // for columns
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();                 // you're taking input for each value of i and j(0th row, 0th column - 0th row, 1st column - 0th row - 2nd column and so on i(row) will increase when column loop will not satisfy)
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        
    }
}