import java.util.*;
public class ToggleCase {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(toGGleCase(str));
	}
	
	public static String toGGleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < sb.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				char upc = (char)('A' + ch - 'a');
				sb.setCharAt(i, upc);
			} else if(ch >= 'A' && ch <= 'Z') {
				char lwc = (char)('a' + ch - 'A');
				sb.setCharAt(i , lwc);
			}
		}
		
		return sb.toString();
		
	}
}
