import java.util.*;
public class My_reverse_of_an_Array {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takinginput(n , arr);
		System.out.print("The array before reversing was :- ");
		printingfn(n , arr);
		reverse(n , arr);
		System.out.print("\nThe array after reversing is :- ");
		printingfn(n , arr);
		scn.close();
	}
	
	public static void takinginput(int n , int[] arr) {
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
	}
	
	public static void reverse(int n , int[] arr) {
		int i = 0;                   // i = 0 will set a pointer to the first element of the array
		int j = arr.length - 1;      // j = arr.length - 1 will set a pointer to the last element of the array
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;          // Moving the pointer 'i' ahead from first(index 0) by incrementing it..
			j--;          // Moving the pointer 'j' backwards from last(index arr.length - 1) by decrementing it..
		}
	}
	
	public static void printingfn(int n , int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
