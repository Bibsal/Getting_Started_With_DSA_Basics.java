import java.util.*;
public class MinimumElementOfArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int minimum = MinimumElement(arr, 0);
		System.out.println(minimum);
	}
	
	public static int MinimumElement(int[] arr, int idx) {
		if(idx == arr.length - 1) {
			return arr[idx];
		}
		
		int misa = MinimumElement(arr, idx + 1);    // misa -->> maximum in smaller array i.e element from index 1 till last element  
		if(arr[idx] > misa) {
			return arr[idx];
		} else {
			return misa;
		}
	}
}
