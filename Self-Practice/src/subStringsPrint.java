import java.util.*;
public class subStringsPrint {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i , j);
				System.out.println(s);
			}
		}
	}
}
