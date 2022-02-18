import java.util.*;
public class StringCompression {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(stringCompression1(str));
		System.out.println(stringCompression2(str));
	}
	
	public static String stringCompression1(String str) {
		String ans = "";
		for(int i = 0; i < str.length() - 1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i + 1);
			if(ch1 != ch2) {
				ans += str.charAt(i);
			}
		}
		ans += str.charAt(str.length() - 1);
		return ans;
	}
	
	public static String stringCompression2(String str) {
		String ans = "";
		
		int count = 1;
		for(int i = 0; i < str.length() - 1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i + 1);
			if(ch1 == ch2) {
				count++;
			} else {
				ans += str.charAt(i);
				if(count > 1) {
					ans += count;
					count = 1; 
				}
			}
		}
		ans += str.charAt(str.length() - 1);
		if(count > 1) {
			ans += count;
		}
		return ans;
	}
}
