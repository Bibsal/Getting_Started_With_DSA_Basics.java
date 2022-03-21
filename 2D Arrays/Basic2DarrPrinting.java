// Here we will just print the rows and columns of our 2D array

import java.util.*;
public class Basic2DarrPrinting {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();           //Size For ROWS
		int m = scn.nextInt();           //Size For COLUMNS
		
		int[][] arr = new int[n][m];            //Declaring a 2D array with size n rows and m columns
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {            //Printing our 2D Array
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scn.close();
	}
}
