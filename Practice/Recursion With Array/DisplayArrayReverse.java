import java.util.*;
public class DisplayArrayReverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		printElementsOfArrayInReverse(arr, 0);
		//// As we have to print from last to the 0th element of array so we've passed the 0 as index 0 and in the displayArr function first we called the function and then printed arr of idx 
	//// and 
	
	}
	
	public static void printElementsOfArrayInReverse(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		
		printElementsOfArrayInReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}
}
