import java.util.*;
public class max_and_min_Array {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();       // Taking Size form user
		int[] arr = new int[n];		 //Creating an array of size n
		
		for(int i = 0;i < arr.length; i++) {       // Taking the elements of the array of size n from the user
			arr[i] = scn.nextInt();
		}
		
		int max = arr[0];     //Declaring a variable max and initializing it to 0 index of the array so that we can run it in the loop and update it accordingly
		int min = arr[0];	   //Declaring a variable min and initializing it to 0 index of the array so that we can run it in the loop and update it accordingly	
		
		for(int i = 1; i < arr.length; i++) {
			//For max value
			if(arr[i] > max) {
				max = arr[i];
			}
			//For min value
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		//Printing the max and min value
		System.out.println("Maximum value of the array is :-> " +max);
		System.out.println("Minimum value of the array is :-> " +min);
		
		
		//Its always good to close the scanner
		scn.close();
	}
}
