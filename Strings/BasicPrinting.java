import java.util.*;
public class BasicPrinting {
	public static void main(String args[]) {
//		String s = "Bishal";            // For directly giving input
		
		
		//  For taking string input from user we use scanner and with that scanner variable we use 
		//  next() or nextLine()   method , next() method takes input till before space and nextLine() method takes
		//  a full line , whatever string is present in a single line
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
//		String s = scn.nextLine();
//		String s1 = scn.next();
//		System.out.println(s1+"B");
//		System.out.println(s1);
		
		
		//  Now Looking at some functionalities of strings like charAt, length() etc
		
		String str = scn.nextLine();
		System.out.println(str);
		
		System.out.println(str.charAt(1));              // strvariable.charAt(index); //For getting element of particular index
		
		
		//In arrays we only used to write arr.length , and in strings we write str.length() , 
		//because length was a data member in arrays but in strings length is a function so you need to put the brackets too
		
		System.out.println(str.length());               // strvariable.length(); // For getting the length of the string
		
		
		//In arrays we write(arr[index]) --> arr[0] to get the element of 0th index , but in string we need to write (str.charAt(index)) --> str.charAt(0) to get the element at 0th index!!
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		
		// Now below applying loop and printing the characters of the inputted strings
		
		for(int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			System.out.println(ch1);
		}
		
		
		// Strings are immutable so you cannot set / change any characters , like you can do that in arrays (arr[2] = 4 ) , but in strings you cant do this as they are immutable!!
		// You can do it using StringBuilder class because it is mutable and can be changed at instance
	}
}
