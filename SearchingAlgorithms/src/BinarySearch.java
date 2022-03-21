import java.util.*;
public class BinarySearch {
	
	
	//ALWAYS REMEMBER THAT BINARY SEARCH WORKS ON SORTED ARRAYS
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int dataToSearch = scn.nextInt();
		int index = binarySearch(arr , dataToSearch);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] arr, int dataToSearch) {
		int left = 0;
		int right = arr.length - 1;
		int index = -1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(dataToSearch == arr[mid]) {
				index = mid;
				System.out.print("Element found at index -->> ");
				break;
			} else if(dataToSearch > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return index;
	}
}
