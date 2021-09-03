import java.util.*;
public class RemovePrimeUsingArraylist {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(scn.nextInt());
		}
		
		System.out.print(removePrime(list));
	}
	
	public static ArrayList<Integer> removePrime(ArrayList<Integer> list) {
		
		for(int i = list.size() - 1; i >= 0; i--) {
			int val = list.get(i);
			if(isPrime(val) == true) {
				list.remove(i);
			}
		}
		return list;
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
