//import java.util.*;
public class StringBuilderExample {
	public static void main(String args[]) {
//	int n = 100000;
//	
//	long start = System.currentTimeMillis();
//	String str = "";
//	for(int i = 0; i < n; i++) {
//		str += i;
//	}
//	
//	long end = System.currentTimeMillis();
//	
//	long duration = end - start;
//	
//	System.out.println(duration+ " For Strings to execute 100000");
		
		
//The above code takes lot of time to just execute 100000 operations while below StringBuilders takes very less amount of time in comparison to Strings , which increases the performance of StringBuilder's		
		
		int n = 10000000;
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(i);
		}
		
		long end = System.currentTimeMillis();
		
		long duration = end - start;
		
		System.out.println(duration+ " milliseconds For StringBuilder to execute 1000000 operations");
  }
}
