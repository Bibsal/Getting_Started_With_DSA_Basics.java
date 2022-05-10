import java.util.*;
public class PrefixEvaluationAndConversion1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        // Step 1
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        Stack<String> st3 = new Stack<>();
// APPROACH NOTE IMP :- As we are given a prefix value so we know that prefix values start with the operators first then the operands comes
// Eg: ->  +-*267  so if we traverse our loop in the same manner that we were doing in our previous questions(i.e. from 0 to str.length()-1), so in that case we would get operator first and as we solve the question i.e. when we get operand we push and when we get operator we pop and get our ans
// but yaha(prefix me) agar hum 0 se loop traverse karnge tho hame first character hi operator melegi and as soon as we try popping to get our ans hame empty stack exception miljaigi because abhi tak hamne stack me kuch bhi push tho kiya nhi tha so how can we pop, 
// so to solve this we will traverse our loop from last to first taki last me hi operand hote hai prefix me and last sae karnge tho hum push kardnge operand ko and ab jab operator aayega tho hum pop bhi kar paynge and hamara answer bhi mil jaiyaega
// ANOTHER TWIST WE NEED TO NOTICE IS THAT as ham apna loop last sae chal rhe hai so stack me jo phle push hoga wo hamara last ka hi hoga, tho isiliye jab ham pop karnge tho ham dusre questions ki tarha op2 me phle apne popped value ko store nhi karnge, balki yaha op1 me apne phle popped k answer ko store kange
// qki ham tho last sae loop chal rhe hai na and last sae jab push karnge tho phle last ka hi push hoga and jab pop karnge tho stack k top pr tho hamara starting ka hi value/operand hoga na tho isilye we will store the popped value in op1 first then in second we'll store for op2, that's it and rest all are same.
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            // Step 2
            if(ch >= '0' && ch <= '9') { 
                st1.push(ch -'0');
                st2.push(ch + "");
                st3.push(ch + "");
            } else {      // else me tho operators hi honge, qki prefix expresiion me ya tho operand hota hai ya tho operator, operand tho if me handle kar diye ab operator else me handle kar lnge
// ANOTHER TWIST WE NEED TO NOTICE IS THAT as ham apna loop last sae chal rhe hai so stack me jo phle push hoga wo hamara last ka hi hoga, tho isiliye jab ham pop karnge tho ham dusre questions ki tarha op2 me phle apne popped value ko store nhi karnge, balki yaha op1 me apne phle popped k answer ko store kange
// qki ham tho last sae loop chal rhe hai na and last sae jab push karnge tho phle last ka hi push hoga and jab pop karnge tho stack k top pr tho hamara starting ka hi value/operand hoga na tho isilye we will store the popped value in op1 first then in second we'll store for op2, that's it and rest all are same.
                // Now in this part we work with all the other steps i.e to evaluate the prefix and get it's value, also to convert it to infix and also to convert it to postfix
                // Step 3 for evaluating the value
                int op1 = st1.pop();         // in other questions we used to store our first popped element in op2 qki waha ham first sae last tak traverse kar rhe the, but yaha first me op1 me hi store karnge qki last sae first traverse kar rhe hai
                int op2 = st1.pop();
                int ans = solve(op1, op2, ch);
                st1.push(ans);

                // Step 4 now conversion for infix
                String op1in = st2.pop();
                String op2in = st2.pop();
                st2.push("("+ op1in + ch + op2in + ")");

                // Step 5 now conversion for postfix
                String op1post = st3.pop();
                String op2post = st3.pop();
                st3.push(op1post + op2post + ch);
            }
        }
        System.out.println("Prefix solved value is :- "+ st1.pop());   // yaha st1.peek() bhi kar skte the, both are correct
        System.out.println("Infix expression is :- "+ st2.pop());   // yaha st1.peek() bhi kar skte the, both are correct
        System.out.println("Postfix expression is :- "+ st3.pop());   // yaha st1.peek() bhi kar skte the, both are correct
    }

    public static int solve(int op1, int op2, char operator) {
        if(operator == '+') {
            return op1 + op2;
        } else if(operator == '-') {
            return op1 - op2;
        } else if(operator == '*') {
            return op1 * op2;
        } else {   // yaha else hi likhna not else if warna error throw kar dega ki return statement missing, & else me tho divide hi bachega so hum usi k according return kar dnge.
            return op1 / op2;
        }
    }
}