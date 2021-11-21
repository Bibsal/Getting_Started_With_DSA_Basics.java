import java.util.*;
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int ourSecondHighest = secondHighestFunction(arr);
		System.out.println(ourSecondHighest);
	
	}
		
		public static int secondHighestFunction(int[] arr) {
			int highest = Integer.MIN_VALUE;
			int secondHighest = Integer.MIN_VALUE;

			for (int i = 0; i < arr.length; i++) {
	 
			    if (arr[i] > highest) {
			        secondHighest = highest;
			        highest = arr[i];
			    } else if (arr[i] > secondHighest) {
			        secondHighest = arr[i];
			    }
			}
			return secondHighest;
		
	
	}
}


