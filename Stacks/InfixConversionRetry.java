import java.util.*;
public class InfixConversionRetry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Stack<String> st1 = new Stack<>();    // prefix
        Stack<Character> st2 = new Stack<>();    // operator
        Stack<String> st3 = new Stack<>();    // postfix

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                st1.push(ch+"");
                st3.push(ch+"");
            } else if(ch == '(') {
                st2.push(ch);
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(st2.size() > 0 && precedence(st2.peek()) >= precedence(ch)) {
                    String op2 = st1.pop();
                    String op1 = st1.pop();
                    char operator = st2.peek();
                    st1.push(operator + op1 + op2);

                    String opost2 = st3.pop();
                    String opost1 = st3.pop();
                    char operatorpost = st2.pop();
                    st3.push(opost1 + opost2 + operatorpost);
                }
                st2.push(ch);
            } else if(ch == ')') {
                while(st2.peek() != '(') {
                    String op2 = st1.pop();
                    String op1 = st1.pop();
                    char operator = st2.peek();
                    st1.push(operator + op1 + op2);

                    String opost2 = st3.pop();
                    String opost1 = st3.pop();
                    char operatorpost = st2.pop();
                    st3.push(opost1 + opost2 + operatorpost);
                }
                st2.pop();
            } else {
                // do nothing
            }
        }

        while(st2.size() != 0) {
            String op2 = st1.pop();
            String op1 = st1.pop();
            char operator = st2.peek();
            st1.push(operator + op1 + op2);

            String opost2 = st3.pop();
            String opost1 = st3.pop();
            char operatorpost = st2.pop();
            st3.push(opost1 + opost2 + operatorpost);
        }
        System.out.println("Postfix -->> " + st3.peek());
        System.out.println("Prefix -->> " + st1.peek());
    }

    public static int precedence(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        } else if(ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
