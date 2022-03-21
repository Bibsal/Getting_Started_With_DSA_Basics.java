import java.util.*;
public class My_Rotate_An_Array {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);
		int k = scn.nextInt();
		rotatearray(arr , k);
		printRotatedArr(arr);
		scn.close();
	}

	
	public static void takeinput(int[] arr) {
		@SuppressWarnings("resource")    //As we won't be able to close the scanner object of this loop (because if we close we wont be able to take input like k and others) so we use SupperssWarnings("resources") to stop the warning
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	//	scn.close();
	}
	
	

	public static void reversearrayfor_rotating(int[] arr , int i , int j) {
		
		while ( i < j ) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

	public static void rotatearray(int[] arr, int k) {
		
		k = k % arr.length;
		if(k < 0) {
			k = k + arr.length;
		}
		
//		Part 1 Reverse for Rotation
		reversearrayfor_rotating(arr , 0 , arr.length - k - 1 );
		
//		Part 2 Reverse for Rotation
		reversearrayfor_rotating(arr , arr.length - k , arr.length - 1);
		
//		All Reverse for Final Rotation
		reversearrayfor_rotating(arr , 0 , arr.length - 1);
		
	}
	
	
	public static void printRotatedArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
