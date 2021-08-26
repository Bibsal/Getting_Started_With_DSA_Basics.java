import java.util.*;
public class ExitPoint {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		
		int direction = 0;
		int i = 0;
		int j = 0;
		while(true) {
			if(direction == 0) {    // For east direction is 0
				j++;
			} else if(direction == 1) {   //For south direction is 1
				i++;
			} else if(direction == 2) {   //For west direction is 2
				j--;
			} else if(direction == 3) {    //For north direction is 3
				i--;
			}
			
			//Now for breaking the loop after increasing the indices for printing the correct indices
			if(i < 0) {
				i++;
				break;
			} else if(j < 0) {
				j++;
				break;
			} else if(i == arr.length) {
				i--;
				break;
			} else if(j == arr[0].length) {
				j--;
				break;
			}
		}
		
		System.out.println(i);
		System.out.println(j);
	}
}
