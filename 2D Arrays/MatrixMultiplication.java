import java.util.*;
public class MatrixMultiplication {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		int[][] arr1 = new int[r1][c1];
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				arr1[i][j] = scn.nextInt();
			}
		}
		
		int r2 = scn.nextInt();
		int c2 = scn.nextInt();
		int[][] arr2 = new int[r2][c2];
		for(int i = 0; i < r2; i++) {
			for(int j = 0; j < c2; j++) {
				arr2[i][j] = scn.nextInt();
			}
		}
		
		if(c1 != r2) {
			System.out.println("Invalid input , this cannot be multiplied");
			return;
		}
		
		int[][] prd = new int[r1][c2];
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				for(int k = 0; k < c1; k++) {
					prd[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				System.out.print(prd[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}



/*
//Input
2
3
10 0 0
0 1 20
3
4
10 1 1 1
20 1 1 1
3 2 0 30

//Output
100 10 10 10 
80 41 1 601 
*/
