import java.util.*;
public class DiagonalMatrixPrinting {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(i == j || i + j == arr.length - 1) {
					System.out.print(arr[i][j] + "\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}	
