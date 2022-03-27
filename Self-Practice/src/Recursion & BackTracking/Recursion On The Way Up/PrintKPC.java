import java.util.*;
public class PrintKPC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str, "");
    }
    static String[] array = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        String word = array[str.charAt(0) - '0'];
        for(int i = 0; i < word.length(); i++) {
            printKPC(str.substring(1), ans + word.charAt(i));
        }
    }
}
