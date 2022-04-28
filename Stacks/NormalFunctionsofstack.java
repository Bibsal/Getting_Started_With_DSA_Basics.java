import java.util.*;
public class NormalFunctionsofstack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);                          // push is used to add elements in stack
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());       // peek is used to view the topmost element present in stack
        System.out.println(st.size());       // size is used to check the size of stack
        System.out.println(st.pop());
        st.pop();                            // pop is used to remove elements from stack
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.size());
    }
}