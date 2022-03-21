//RECURSION  -->>  When a function calls itself it is said to be recursive
import java.util.*;
public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecreasing(n);
		
	}
	public static void printDecreasing(int n) {
		if(n == 0) {                        //BASE CASE
			return;
		}
		System.out.println(n);              //Self-work  
		printDecreasing(n - 1);             //Recursive Function
	}

}
