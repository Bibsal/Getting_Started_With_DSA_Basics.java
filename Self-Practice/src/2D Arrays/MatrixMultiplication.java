/* 
MATRIX MULTIPLICATION
// n1 = 2, m1 = 3 
arr1 :- 
10 0 0
0 20 0 

n2 = 3, m2 = 4
arr2 :-
1 0 1 0
0 1 1 2
1 1 0 0

Output :-
10 0 10 0 
0 20 20 40

*/

import java.util.*;
public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = new int[n1][m1];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = new int[n2][m2];
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }

        if(m1 != n2) {
            System.out.println("Invalid Input, Matrix cannot be multiplied");
            return;
        }

        int[][] prd = new int[n1][m2];
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < m2; j++) {
                for(int k = 0; k < m1; k++) {              // to multiply and traverse over the row and column and add their multiples we use this k variable....
                    prd[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i = 0; i < prd.length; i++) {
            for(int j = 0; j < prd[0].length; j++) {
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }

    }
}