// Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 
// For example, in an array A :-
/* 
   Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
   Output: 3 
   3 is an equilibrium index, because: 
   A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

   Input: A[] = {1, 2, 3} 
   Output: -1  
*/

import java.util.*;
public class EquilibriumIndexOfArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int equilibrium = equilibriumIndex(arr); 
	}
	
	public static int equilibriumIndex(int[] arr) {
		
		
		return 1;
	}
}
