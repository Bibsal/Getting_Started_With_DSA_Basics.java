import java.util.*;
public class SpiralTraversal {
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
		
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int totalnoofelements = n * m;
		int count = 0;
		
		while(count < totalnoofelements) {
			//For Left wall
			for(int i = minr , j = minc; i <= maxr && count < totalnoofelements; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			
			//For Bottom Wall
			for(int i = maxr , j = minc; j <= maxc && count < totalnoofelements; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			
			//For Right Wall
			for(int i = maxr , j = maxc; i >= minr && count < totalnoofelements; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			
			//For Top Wall
			for(int i = minr , j = maxc; j >= minc && count < totalnoofelements; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
		
	}
}
