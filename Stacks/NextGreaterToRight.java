import java.util.*;
public class NextGreaterToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();       // size of array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = nextGreaterToRight(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }
    }

    public static int[] nextGreaterToRight(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];                   // created new answer array for storing or next greater to right values
        for(int i = n - 1; i >= 0; i--) {
            while(st.size() != 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}
