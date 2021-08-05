import java.util.*;
public class practiceSumofArraywithForEachLoop {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		//Array 1
		System.out.print("Enter the size of 1st array :-");
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		System.out.println("Enter "+n1+" elements for your 1st array:- ");
		for(int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		
		//Array 2
		System.out.print("Enter the size of 2nd array :-");
		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		System.out.println("Enter "+n2+" elements for your 2nd array:- ");
		for(int i = 0; i < a2.length; i++) {
			a2[i] = scn.nextInt();
		}
		scn.close();
		
		
		int[] sum = new int[n1 > n2 ? n1 : n2];
		int c = 0;     //Carry
		//Making 3 containers/rooms where values are kept and if the value still exists the we keep on adding and also keeping the extra part in  carry by dividing the total added value by 10;;and storing the remainder in the same container..
		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = sum.length - 1;
		
		while(k >= 0) {
			int d = c;
			
			if(i >= 0) {
				d += a1[i];
			}
			
			if(j >= 0) {
				d += a2[j];
			}
			
			c = d / 10;
			d = d % 10;
			
			sum[k] = d;
			
			i--;
			j--;
			k--;
		}
		
		// Now when the space of k is over and we still have a carry left then we will print that carry first and then print out sum using the for each loop
		if(c != 0) {
			System.out.print(c);
		}
		System.out.print("Sum is -- >> ");
		for(int val: sum) {
			System.out.print(val+" ");
		}
	}
}
