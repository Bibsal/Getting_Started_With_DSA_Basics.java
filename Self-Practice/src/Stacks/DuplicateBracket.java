import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean ans = duplicateBrackets(str);
        System.out.println(ans);
    }
    
    public static boolean duplicateBrackets(String str) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')') {
                st.push(ch);
            } else {
                if(st.peek() == '(') {
                    return true;
                } else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        return false;
    }

}