import java.util.*;
public class FindFirstIndexOfElement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int data = scn.nextInt();
		int firstIndex = firstIndexElement(arr, 0, data);
		System.out.println(firstIndex);
	}
	
	public static int firstIndexElement(int[] arr, int idx, int data) {
		if(idx == arr.length) {
			return -1;
		}
		
		if(arr[idx] == data) {
			return idx;
		} else {
			int fiisa = firstIndexElement(arr, idx + 1, data);
			return fiisa;
		}
	}
}
