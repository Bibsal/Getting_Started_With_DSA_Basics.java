import java.util.*;
public class PrintDecreasingandIncreasing {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecInc(n);
	}
	
	public static void printDecInc(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.print(n + " ");
		printDecInc(n - 1);
		System.out.print(n + " ");
	}
}
