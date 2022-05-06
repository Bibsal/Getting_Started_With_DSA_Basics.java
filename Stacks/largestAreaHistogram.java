import java.util.*;
public class largestAreaHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = largestAreahist(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] largestAreahist(int[] arr) {
        return maxArea(arr);
    }

    public static int maxArea(int[] heights) {
        int left = nsl(heights);
        int right = nsr(heights);
        int maxAr = 0;
        for(int i = 0; i < heights.length; i++) {
            maxAr = Math.max(maxAr, (right[i] - left[i] - 1) * heights[i]);
        }
        return maxAr;
    }

    public static int[] nsl(int[] arr) {
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

    public static int[] nsr(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            while(st.size() != 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}