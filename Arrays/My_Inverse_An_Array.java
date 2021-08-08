import java.util.*;
public class My_Inverse_An_Array {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);
		int[] inv = inverse(arr);
		print_inverse(inv);
		scn.close();
	}

	public static void takeinput(int[] arr) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			for(int i = 0; i < arr.length; i++) {
				arr[i] = input.nextInt();
			}
//		input.close();
		
	}
	
	
	public static int[] inverse(int[] arr) {
		int[] inverse = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int value = arr[i];
			inverse[value] = i;
		}
		return inverse;
	}
	
	
	public static void print_inverse(int[] inv) {
		for(int i = 0 ; i < inv.length ;  i++) {
			System.out.print(inv[i]+ " ");
		}
		
	}
	
	
}
