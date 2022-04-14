import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <= arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        insertionSort(arr);
        printArr(arr);
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i <= arr.length - 1; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
