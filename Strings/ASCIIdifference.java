import java.util.*;
public class ASCIIdifference {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(differenceASCII(str));
	}
	
	public static String differenceASCII(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i -1);
			
			int gap = curr - prev;
			
			sb.append(gap);
			sb.append(curr);
		}
		
		 return sb.toString();
	}
	
}
