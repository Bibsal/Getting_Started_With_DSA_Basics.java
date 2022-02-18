import java.util.*;
public class ReverseAStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char[] arr = new char[str.length()];
		reverseString(arr,str);
		System.out.println(arr);
	}
	
	public static void reverseString(char[] arr, String str) {
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int left = 0;
		int right = str.length() - 1;
		while(left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++; 
			right--;
		}
	}
	

}
