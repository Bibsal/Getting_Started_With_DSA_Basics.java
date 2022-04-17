import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] mergesort = MergeSort(arr, 0, arr.length - 1);
        printArr(mergesort);
        scn.close();
    }

    public static int[] MergeSort(int[] arr, int low, int high) {
        if(low == high) {
            int[] bsArr = new int[1];
            bsArr[0] = arr[low];
            return bsArr;
        }
        int mid = (low + high) / 2;
        int[] fsh = MergeSort(arr, low, mid);                          // first sorted half
        int[] ssh = MergeSort(arr, mid + 1, high);                     // second sorted half
        int[] mergeBothArr = mergeTwoSortedArrays(fsh, ssh);

        return mergeBothArr;
    }

    public static int[] mergeTwoSortedArrays(int[] fsh, int[] ssh) {
        int[] finalArr = new int[fsh.length + ssh.length];
        int i = 0, j = 0, k = 0;
        while(i < fsh.length && j < ssh.length) {
            if(fsh[i] < ssh[j]) {
                finalArr[k++] = fsh[i++];
            } else {
                finalArr[k++] = ssh[j++];
            }
        }

        while(i < fsh.length) {
            finalArr[k++] = fsh[i++];
        }

        while(j < ssh.length) {
            finalArr[k++] = ssh[j++];
        }

        return finalArr;
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
