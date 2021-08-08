import java.util.*;
public class subArray_Printing_Problem {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(array[k] + "\t");
				}
				System.out.println();
			}
		}
		scn.close();
	}
	
}
