//import java.util.*;
public class BasicPrinting {
	public static void main(String args[]) {
//		String s = "Bishal";            // For directly giving input
		
		
		//  For taking string input from user we use scanner and with that scanner variable we use 
		//  next() or nextLine()   method , next() method takes input till before space and nextLine() method takes
		//  a full line , whatever string is present in a single line
		
//		@SuppressWarnings("resource")
/*The @SuppressWarnings annotation type allows Java programmers to disable compilation warnings for a certain part of a program (type, field, method, parameter, constructor, and local variable). Normally warnings are good. However in some cases they would be inappropriate and annoying. */
//		Scanner scn = new Scanner(System.in);
//		String s = scn.nextLine();
//		String s1 = scn.next();
//		System.out.println(s1+"B");
//		System.out.println(s1);
		
		
		//  Now Looking at some functionalities of strings like charAt, length() etc
		
//		String str = scn.nextLine();
//		System.out.println(str);
//		
//		System.out.println(str.charAt(1));              // strvariable.charAt(index); //For getting element of particular index
		
		
		//In arrays we only used to write arr.length , and in strings we write str.length() , 
		//because length was a data member in arrays but in strings length is a function so you need to put the brackets too
		
//		System.out.println(str.length());               // strvariable.length(); // For getting the length of the string
		
		
		//In arrays we write(arr[index]) --> arr[0] to get the element of 0th index , but in string we need to write (str.charAt(index)) --> str.charAt(0) to get the element at 0th index!!
		
//		char ch = str.charAt(3);
//		System.out.println(ch);
		
		
		// Now below applying loop and printing the characters of the inputted strings
		
//		for(int i = 0; i < str.length(); i++) {
//			char ch1 = str.charAt(i);
//			System.out.println(ch1);
//		}
		
		
		// Strings are immutable so you cannot set / change any characters , like you can do that in arrays (arr[2] = 4 ) , but in strings you cant do this as they are immutable!!
		// You can do it using StringBuilder class because it is mutable and can be changed at instance
		
		
		// Now coding on substrings  -->> substrings help you to get the pieces of the string  
		// -->> substrings prints starting from starting index and goes till end index but does not print the character at end index , 
		// -->> it only prints characters from start index till end index - 1 ;;;
		
		//Example : -> String str = "abcd";
		//Method column          , Output below one after arrow
		//str.substring(0,1) -- >> a      ||                                     ||                                  ||
		//str.substring(0,2) -- >> ab     ||   //str.substring(1,2) -- >> b      ||                                  ||
		//str.substring(0,3) -- >> abc    ||   //str.substring(1,3) -- >> bc     ||  //str.substring(2,3) -- >> c    ||
		//str.substring(0,4) -- >> abcd   ||   //str.substring(1,4) -- >> bcd    ||  //str.substring(2,4) -- >> cd   ||  //str.substring(3,4) -- >> d
		
		// And if you pass only one parameter (say , str.substring(1)) then it prints every characters from index 1 to the last index.
		
//		String str = "abcd";
//		System.out.println(str.substring(1,3));
//		System.out.println(str.substring(1));
		
		//Printing the substring using loop 
//		String str = scn.next();
//		for(int i = 0; i < str.length(); i++) {
//			for(int j = i+1; j <= str.length(); j++) {
//				System.out.println(str.substring(i,j));
//			}
//		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//How do we add strings  :::---
		
//		String s1 = "Bishal";
//		s1 += " ";
//		s1 += 'P';
//		s1 += 'r';
//		s1 += 'a';
//		s1 += 's';
//		s1 += 'a';
//		s1 += 'd';
//		s1 += " ";
//		s1 += 29;
//		String s2 = "Keshri";
//		String s3 = s1 + " " + s2;
//		System.out.println(s1);
		 
//		System.out.println("hello"+ 10 + 20);           //hello1020
//		System.out.println(10+20+"hello");              //30hello
		
		
		//You can split you string using variable.split("anythingWithWhichYouWantToSplit");
		//You can split with any value either it be space , or comma , or any element or any character
		
//		String str = "abc def ghi jkl mno";
//		String parts[] = str.split(" ");              //Splitting them with space and storing them in array named parts and then printing it with loop
//		for(int i = 0; i < parts.length; i++) {
//			System.out.println(parts[i]);
//		}
		
		
		String str = "abc, def , ghi ,jkl mno";
		String parts[] = str.split(",");              //Splitting them with comma and storing them in array named parts and then printing it with loop
		for(int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
		
		
		
		char c='a';  
		char c2='1';  
		int a=c;  
		int b=c2;  
		System.out.println(a);  
		System.out.println(b);
		
		
		// Interning is sharing memory by strings , and it is done to optimize space
		
	}
}
