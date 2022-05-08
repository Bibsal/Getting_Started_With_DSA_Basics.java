// IN THIS QUESTION YOU HAVE BEEN GIVEN A POSTFIX EXPRESSION AND YOU NEED TO CALCULATE IT'S ANSWER, ALSO CONVERT IT TO INFIX AND PREFIX AND PRINT IT
import java.util.*;
public class PostfixEvaluationANDConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Stack<Integer> st1 = new Stack<>();        // for calculating/evaluating the answer of postfix expression
        Stack<String> st2 = new Stack<>();         // for conversion to infix expression
        Stack<String> st3 = new Stack<>();         // for conversion to prefix expression

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9') {
                st1.push(ch-'0');   // for converting into integer we subtract a 0 in character form // for evaluating our answer
                st2.push(ch+"");   // for converting into string  // for infix
                st3.push(ch+"");   // for converting into string  // for prefix
            } else {   // else me tho sirf operators hi ho sakta hai na because postfix expressions does not have brackets so we don't need to handle the cases of bracket and can directly write else which will handle the operators
                // So yaha hum answer calculate karnge 
                // Evaluation
                int op2 = st1.pop();
                int op1 = st1.pop();
                int ans = solve(op1, op2, ch);    // the ch here is the character or the operator that we will be using to calculating/evaluating our answers
                st1.push(ans);

                // Infix
                String op2in = st2.pop();
                String op1in = st2.pop();
                st2.push("("+ op1in + ch + op2in + ")");       // since our infix is in this format so we maintained the brackets and also the format i.e operand + operator + operand

                // Prefix
                String op2pre = st3.pop();
                String op1pre = st3.pop();
                st3.push(ch + op1pre + op2pre);     // and in prefix operator + operand + operand and no brackets are present so we work accordingly
            }
        }
        System.out.println("Evaluated answer -->> "+st1.pop());
        System.out.println("Infix Conversion -->> "+st2.pop());
        System.out.println("Prefix Conversion -->> "+st3.pop());
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
}
