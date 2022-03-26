import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();   
        printSubsequence(str, "");        
    }

    public static void printSubsequence(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }

        printSubsequence(str.substring(1), ans);
        printSubsequence(str.substring(1), ans + str.charAt(0));
    }
}