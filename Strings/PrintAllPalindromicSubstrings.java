import java.util.*;
public class PrintAllPalindromicSubstrings {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		substringscheck(str);
	}
	
	
	public static void substringscheck(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				String subst = str.substring(i , j);
				if(isPalindrome(subst) == true) {
					System.out.println(subst);
				}
			}
		}
	}
	
	
	public static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i <= j) {
			char ch = str.charAt(i);
			char ch1 = str.charAt(j);
			
			if(ch != ch1) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		
		return true;
	}
}
