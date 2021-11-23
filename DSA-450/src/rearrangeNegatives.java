import java.util.*; 
public class rearrangeNegatives {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		rearrangeArray(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void rearrangeArray(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
	}
}
