import java.util.*;
public class Sort012 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		sortkro012(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sortkro012(int[] arr) {
		int j = 0;
		int k = arr.length - 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				swap(arr,i,j);
				i++;
				j++;
			} else if(arr[i] == 1) {
				i++;
			} else {
				swap(arr,i,k);
				k--;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		while(i > j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
