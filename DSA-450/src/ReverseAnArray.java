import java.util.*;
public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		reverseArray(arr);
		printReversedArray(arr);
	}
	
	public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp; 
			
			left++;
			right--;
		}
	}
	
	public static void printReversedArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
