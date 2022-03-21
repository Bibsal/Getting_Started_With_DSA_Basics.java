import java.util.*;
public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printIncreasing(n);
	}
	public static void printIncreasing(int n) {
		if(n ==0) {                          //BASE CASE
			return;
		}
		printIncreasing(n - 1);              //Recursive Function
		System.out.println(n);               //Self-work
	}

}
