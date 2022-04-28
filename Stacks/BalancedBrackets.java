import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean check = checkBalanced(str);
        System.out.println(check);
    }

    public static boolean checkBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                if(ch == ')' && st.peek() != '(') {
                    return false;
                } else if(ch == '}' && st.peek() != '{') {
                    return false;
                } else if(ch == ']' && st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();                 // hamesha last me bhi isi tarha check karna ki stack empty hua ki nahi, directly true mat return karna 
    }
}
