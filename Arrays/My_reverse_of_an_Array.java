import java.util.*;
public class My_reverse_of_an_Array {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takinginput(arr);        // we have not passed 'n'(size) while calling / defining any of our functions because int the above line we've already set our array's size to n , so its already of size n so no need to pass it again and again as it's of no use
		System.out.print("The array before reversing was :- ");
		printingfn(arr);
		reverse(arr);
		System.out.print("\nThe array after reversing is :- ");
		printingfn(arr);
		scn.close();
	}
	
	public static void takinginput(int[] arr) {
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
	}
	
	public static void reverse(int[] arr) {
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
	
	public static void printingfn(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
