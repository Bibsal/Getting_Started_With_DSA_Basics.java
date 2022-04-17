import java.util.*;
public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] finalArr = mergeTwoSortedArr(arr1, arr2);
        printArr(finalArr);
    }

    public static int[] mergeTwoSortedArr(int[] arr1, int[] arr2) {
        int[] finalArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                finalArr[k] = arr1[i];
                i++;
                k++;
            } else {
                finalArr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length) {
            finalArr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length) {
            finalArr[k] = arr2[j];
            j++;
            k++;
        }

        return finalArr;
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
