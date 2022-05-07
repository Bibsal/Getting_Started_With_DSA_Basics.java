// HERE YOU ARE GIVEN A INFIX EXPRESSION AND YOU NEED TO CONVERT IT TO POSTFIX AND PREFIX
import java.util.*;
public class InfixConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        // Step 1
        Stack<String> st1 = new Stack<>();    // for postfix
        Stack<Character> st2 = new Stack<>();  // for operator
        Stack<String> st3 = new Stack<>();    // for prefix
        // Step 2,3,4,5
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {    // step 2
                st1.push(ch+"");
                st3.push(ch+"");
            } else if(ch == '(') {          // step 3
                st2.push(ch);
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {           // step 4
                while(st2.size() > 0 && precedence(st2.peek()) >= precedence(ch)) {
                    String op2 = st1.pop();
                    String op1 = st1.pop();
                    char operator = st2.peek();
                    st1.push(op1 + op2 + operator);          // pushing the answer back after concatenation, and also this is postfix answer so in postfix operator is at last
                    
                    String op2pre = st3.pop();
                    String op1pre = st3.pop();
                    char operatorpre = st2.pop();
                    st3.push(operatorpre + op1pre + op2pre);          // pushing the answer back after concatenation, and this is prefix so in prefix the operator is at the starting of the operand
                }
                st2.push(ch);
            } else if(ch == ')') {                         // step 5
                while(st2.peek() != '(') {
                    // postfix
                    String op2 = st1.pop();
                    String op1 = st1.pop();
                    char operator = st2.peek();
                    st1.push(op1 + op2 + operator);


                    // prefix
                    String op2pre = st3.pop();
                    String op1pre = st3.pop();
                    char operatorpre = st2.pop();
                    st1.push(operatorpre + op1pre + op2pre);
                }
                st2.pop();
            }
        }
        // step 6  , here now after traversing the whole string , now we take out our solution unless st2 i.e of the operators is not equal to 0, and once it is zero we'll get our answer in the peek of the operand stack
        while(st2.size() != 0) {
            String op2 = st1.pop();
            String op1 = st1.pop();
            char operator = st2.peek();
            st1.push(op1 + op2 + operator);

            
            String op2pre = st3.pop();
            String op1pre = st3.pop();
            char operatorpre = st2.pop();
            st3.push(operatorpre + op1pre + op2pre);
        }
        System.out.println("Postfix answer -->> "+ st1.peek());
        System.out.println("Prefix answer -->> "+ st3.peek());
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
