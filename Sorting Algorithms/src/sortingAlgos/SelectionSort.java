package sortingAlgos;
import java.util.*;
public class SelectionSort {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {              // here we did arr.length - 1 as in selection sort for n elements we have to do n - 1 iterations
			int min = arr[i];             // array kae 1st element ko min man rahe hai humlog, aaur usi 1st element kae sath baki elements ko compare kar kae hum minimum nikal rahe hai aaur us minimum ko 1st position par line wise place kar rahe hai
			int minIndex = i;            //This is made taki jis element k sath compare hokr hame smallest mila ab us element ko 1st index par lana hoga, tho us element ka index pta krne k liye hamne minimum index liya hai aaur since we've assumed minimum element as arr[i] i.e currently arr[0] so we've declared minIndex as 0 as 0th index par hi hamara assumed minimum value hai
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		
//Now as we've sorted the array in the below function so now we will print the sorted array or the array that has now been sorted
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
