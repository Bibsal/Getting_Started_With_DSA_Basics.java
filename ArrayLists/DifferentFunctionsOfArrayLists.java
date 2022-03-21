import java.util.*;
public class DifferentFunctionsOfArrayLists {
	public static void main(String args[]) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		for(int i = 0; i < n; i++) {
//			System.out.println(list);
//		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list +" -->> "+ list.size());
		list.add(1);      //This normal add adds to the last index of the arraylist
		list.add(2);
		list.add(3);
		System.out.println(list +" -->> "+ list.size());
		
		list.add(1 , 99);    // This add method adds the give value to the given index i.e variable.add(index , value);
		System.out.println(list +" -->> "+ list.size());
		
		int val = list.get(1);
		System.out.println(val);
		
		list.set(2, 1500);     // This set method updates the value of array list to whatever index and value is mentioned i.e variable.set(index , value)
		System.out.println(list +" -->> "+ list.size());
		
		
		list.remove(2);        // We can also remove any element from the arraylist
		System.out.println(list +" -->> "+ list.size());  

		// We can also use arraylist for strings
		ArrayList<String> l2 = new ArrayList<>();
		System.out.println(l2 + " -->> " +l2.size());
		l2.add("Bishal");
		l2.add("Prasad");
		l2.add("Keshri");
		System.out.println(l2 + " -->> " +l2.size());
		
		// Using loops to print our arraylist of integer 
		for(int i = 0; i < list.size(); i++) {
			int val1 = list.get(i);
			System.out.println(val1);
		}
		
		// Or we can also use for each loop
		for(int val2 : list) {
			System.out.println(val2);
		}
		
		// Using loops to print our arraylist of Strings 
		for(int i = 0; i < l2.size(); i++) {
			String val1 = l2.get(i);
			System.out.println(val1);
		}
		
		// Or we can also use for each loop
		for(String val2 : l2) {
			System.out.println(val2);
		}      
 	}
}
