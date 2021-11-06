import java.util.*;
public class PrintDecreasingviaRecursion {
	
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecreasing(n);
	}
	
	public static void printDecreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.print(n+ " ");
		printDecreasing(n - 1);
	}
}
