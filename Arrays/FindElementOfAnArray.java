import java.util.*;
public class FindElementOfAnArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int data = scn.nextInt();
		int index = -1;            // if we don't find the data anywhere in the array then we can directly print the index so we initialized here
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == data) {
//				System.out.println(d +" is found at index "+ i);
				index = i;
				break;    // we used break as we wanted to print only the first index where the value is found
			}
		}
		
		System.out.println(index);
			
			
		scn.close();

	}

}
