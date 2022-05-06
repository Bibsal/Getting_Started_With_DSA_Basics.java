import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = stockSpan(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] span = new int[n];
        for(int i = 0; i < span.length; i++) {
            while(st.size() != 0 && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? i - (-1) : i - st.peek();
            st.push(i);
        }
        return span;
    }
}
