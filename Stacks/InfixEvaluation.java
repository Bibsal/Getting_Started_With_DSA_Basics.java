import java.util;
public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        // step 1
        Stack<Integer> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        // step 2,3,4,5
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(0);
            // for operands
            if(ch >= '0' && ch <= '9') {                  // step 2
                st1.push(ch - '0');          // to convert the charater into the number/integer we substract it with 0
            } else if(ch == '(') {                       // step 3
                st2.push(ch);
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {               // step 4
                while(st2.size() > 0 && precedence(st2.peek()) > precedence(ch)) {
                    char operator = st2.pop();
                    int op2 = st1.pop();
                    int op1 = st2.pop();

                    int result = solve(op1, op2, operator);
                    st1.push(result);
                }
                st2.push(ch);
            } else if(ch == ')') {                   // step 5
                while(st2.peek() != '(') {
                    char operator = st2.pop();
                    int op2 = st1.pop();
                    int op1 = st2.pop();

                    int result = solve(op1, op2, operator);
                    st1.push(result);
                }
                st2.pop();           // this is used for popping the opening bracket
            }

            // after traversing the whole string now we'll move on to getting out our answer, i.e by solving the remaining operator from st2
            // step 6
            while(st2.size() > 0) {
                char operator = st2.pop();
                int op2 = st1.pop();
                int op1 = st1.pop();

                int result = solve(op1, op2, operator);
                st1.push(result);
            }
            System.out.print(st2.peek());
        }
    }

    public static int solve(int op1, int op2, char operator) {
        if(operator == '+') {
            return op1 + op2;
        } else if(operator == '-') {
            return op1 - op2;
        } else if(operator == '*') {
            return op1 * op2;
        } else {
            return op1 / op2;
        }
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
