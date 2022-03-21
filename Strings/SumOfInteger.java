import java.util.*;
public class SumOfInteger {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		while(n != 0) {
			int rem = n % 10;
			n /= 10;
			sum = sum + rem;
			if(n > 0) {
				System.out.print(rem + " + ");
			} else {
				System.out.print(rem);
			}
		}
		
		System.out.println(" = " + sum);
		
	}
}
