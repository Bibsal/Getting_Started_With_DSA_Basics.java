import java.util.ArrayList;
import java.util.Scanner;
public class RemovePrimeWithoutReturning {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(scn.nextInt());
		}
		removePrime(list);
		System.out.print(list);  	//In previous removePrime program we directly called removePrime function in the print statement and also made a returnType ArrayList<Integer> and returned the list.
		// And here if we put the removePrime in the print statement then it'll give an error because the removePrime function isn't returning anything 
		// (i.e return type void) so if it does not return anything then what will it print , so it gives an error , so we call it(the removePrime function) first and then print our arraylist 
		// and in the previous code we directly called and printed it in the same print statement 
	}
	
//	public static ArrayList<Integer> removePrime(ArrayList<Integer> list) {
		public static void removePrime(ArrayList<Integer> list) {
			
		  for(int i = list.size() - 1; i >= 0; i--) {
			int val = list.get(i);
			if(isPrime(val) == true) {
				list.remove(i);
			}
		  }
//		return list;
	}
	
	public static boolean isPrime(int val) {
		for(int div = 2; div*div <= val; div++) {
			if(val % div == 0) {
				return false;
			}
		}
		
		return true;
	}
}
