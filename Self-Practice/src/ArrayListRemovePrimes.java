import java.util.*;
public class ArrayListRemovePrimes {
	@SuppressWarnings("resource")
	public static void main(String args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(scn.nextInt());
		}
		removePrime(list);
		System.out.println(list);
	}
	
	public static void removePrime(ArrayList<Integer> list) {
		for(int i = list.size() - 1; i >= 0; i++) {
			int val = list.get(i);
			if(isPrime(val) == true) {
				list.remove(val);
			}
		}
	}
	
	
	public static boolean isPrime(int val) {
		for(int div = 2; div * div <= val; div++) {
			if(val % div == 0) {
				return false;
			}
		}
		return true;
	}
}
