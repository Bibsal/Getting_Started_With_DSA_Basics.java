//In this program we will input n that will represent the count/size of an array
//then we'll input the array and print the difference between the max element and min element of the array
import java.util.*;
public class DifferenceSpanOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i < arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		scn.close();
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		int span = max - min;
		System.out.println("Therefore the difference between "+ max +" - "+ min +" = "+span);

	}

}
