// Basically Linear Search is normal traversing 
import java.util.*;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int dataToSearch = scn.nextInt();
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == dataToSearch) {
				index = i;
				System.out.print("Element found at index -->> ");
				break;
			}
		}
		
		System.out.println(index);
	}
}
