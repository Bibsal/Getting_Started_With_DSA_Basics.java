import java.util.*;
public class RotateBy90degree {
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
		
		//Transpose the given input first
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		
		//Now as we've transposed the matrix we will now reverse the columns
		for(int i = 0; i < arr.length; i++) {
			
			int li = 0;                     //left index used for holding the element of left side
			int ri = arr[0].length - 1;     //right index used for holding the element of right side
			
			while(li < ri) {
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				
				li++;
				ri--;
			}
		}
		
		display(arr);
	}
	//Printing our rotated array using a display function
	public static void display(int[][] arr) {     
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
