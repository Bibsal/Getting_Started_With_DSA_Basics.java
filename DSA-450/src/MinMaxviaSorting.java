import java.util.*;
public class MinMaxviaSorting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		Arrays.sort(arr);   	//O(nlogn);//Merge Sort or Tim Sort is used in Arrays.sort() function
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
	}
}
