import java.util.*;
public class firstIndexLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int fi = 0;
        int li = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == d) {
                fi = i;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == d) {
                li = i;
                break;
            }
        }

        System.out.println(fi + " , " + li);
    }
}