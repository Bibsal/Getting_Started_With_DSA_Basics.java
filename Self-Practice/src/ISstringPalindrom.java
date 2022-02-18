import java.util.*;
public class ISstringPalindrom {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		subStrings(str);
	}
	
	public static void subStrings(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				
				String s = str.substring(i , j);         //Taking out Substring's so that this substrings can be checked, whether we have any palindrome or not
				boolean isitPalindrome = IsPalindrome(s);
				if(isitPalindrome == true) {
					System.out.println(s);
				}
			}
		}
	}
	
	public static boolean IsPalindrome(String s) {
		boolean flag = true;
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			
			if(ch1 != ch2) {
				flag = false;
				break;
			}
				i++;
				j--;
			
		}
		
		return flag;
	}
}
