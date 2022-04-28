import java.util.*;
public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean ans = checkDuplicate(str);
        System.out.println(ans);
    }

    public static boolean checkDuplicate(String str) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                if(st.peek() == '(') {
                    return true;                  // this true means that yes the given string has duplicate brackets.
                } else {
                    while(st.peek() != '(') {     // opening bracket kae phle tak sara pop karnge.
                        st.pop();
                    }
                    st.pop();                     // and yaha opening bracket ko bhi pop kar dnge.
                }
            } else {
                st.push(ch);
            }
        }
        return false;                             // yaha tak agar aa gya hamara code tho matlab our string does not contain any duplicate brackets.
    }
}
