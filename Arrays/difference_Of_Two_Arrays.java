//HERE WE ASSUME OUR second array to be greater or equal to first array so that we can subtract arr2 - arr1;;
import java.util.*;
public class difference_Of_Two_Arrays {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		//Array 1
//		System.out.print("Enter the size of arr1 :-");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		
		//Array2
//		System.out.print("Enter the size of arr1 :-");
		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		
		int[] diff = new int[n2];
		int c = 0;
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		
		
		while(k >= 0) {
			int d = 0;
			//array 1 value(arr1v)
			int arr1v = i >= 0 ? arr1[i] : 0;
			
			if(arr2[j] + c >= arr1v) {
				d = arr2[j] + c - arr1v;
				c = 0;
			}else {
				d = arr2[j] + c + 10 - arr1v;
				c = -1;
			}
			
			diff[k] = d;
			
			i--;
			j--;
			k--;
		}
		
		//This condition is to avoid printing the starting zero's of difference (Eg :- 1000 - 999 = 0001 so we only print 1 and avoid the 0's before the no.
		int index = 0;
		while(index < diff.length) {
			if(diff[index] == 0) {
				index++;
			}else {
				break;
			}
		}
		
		//To print the answer with remaining numbers
		while(index < diff.length) {
			System.out.print(diff[index]);
			index++;
		}
		
		scn.close();
		
	}	
}		
