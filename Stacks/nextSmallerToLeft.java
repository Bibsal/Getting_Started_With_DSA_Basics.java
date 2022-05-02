import java.util.*;
public class nextSmallerToLeft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = nsmlLeft(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] nsmlLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            while(st.size() != 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
        
    }
}
