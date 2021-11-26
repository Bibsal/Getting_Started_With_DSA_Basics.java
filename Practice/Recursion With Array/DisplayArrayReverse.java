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
	}
	
	public static void printElementsOfArrayInReverse(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		
		printElementsOfArrayInReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}
}
