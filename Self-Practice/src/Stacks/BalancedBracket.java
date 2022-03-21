import java.util.*;
public class BalancedBracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        boolean balance = balancedBracket(str);
        System.out.print(balance);
    }

    public static boolean balancedBracket(String str) {
        Stack<Character> st = new Stack<>();
        char[] charArr = str.toCharArray();
        for(char ch : charArr) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {         // isko else if me is liye likhe taki agar brackets k alawa koi aaur character ya alphabet ya sign ho tho wo automatically ignore ho jai and hum sirf brackets k sath khel pai and check kar pai
                if(st.empty()) {
                    return false;
                } else if(ch == ')' && st.peek() != '(') {
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
        return st.isEmpty();
    }
}

/*
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(checker(str));
    }
    
    public static boolean checker(String str) {
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                if(st.isEmpty()) {   // checking whether stack is empty or not
                    return false;
                } 
                if(ch == ')' && st.peek() != '(') {
                    return false;
                }
                if(ch == '}' && st.peek() != '{') {
                    return false;
                } 
                if(ch == ']' && st.peek() != '[') {
                    return false;
                }
                st.pop();
            }  
            
        }
        return st.isEmpty();
    }

}

*/