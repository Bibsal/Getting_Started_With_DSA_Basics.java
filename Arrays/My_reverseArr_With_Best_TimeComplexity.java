import java.util.Scanner;
public class My_reverseArr_With_Best_TimeComplexity {
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
	
//	public static void reverse(int[] arr) {
//		int i = 0;                   // i = 0 will set a pointer to the first element of the array
//		int j = arr.length - 1;      // j = arr.length - 1 will set a pointer to the last element of the array
//		
//		while(i < j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			
//			i++;          // Moving the pointer 'i' ahead from first(index 0) by incrementing it..
//			j--;          // Moving the pointer 'j' backwards from last(index arr.length - 1) by decrementing it..
//		}
//	}
	
//	This above commented part can be done in the below way for best time and space complexity
//We can program this function slightly different so that we do not use two variables as pointers and get work done using a single integer variable:
//This was sumeet bhaiya's approach and previous was mine , but mine had 9 lines but bhaiya's code has only 4 line with best time and space complexity	
	public static void reverse(int[] arr) {
		for(int i = 0 ; i < arr.length / 2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
// For above code We just created an expression using 'i' which performs the same function as 'j' and to deal with the overshoot condition, we just run our loop for "half of the array", as we are swapping the first half with the last half, the traversal of the array only needs to be done of the first half.
//As one can observe, the output is absolutely same, but the alternate programming technique is time and memory efficient if you compare the time stamps and memory used information.


	
	public static void printingfn(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
