import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int itr = 1; itr <= n - 1; itr++) {
            for(int i = 0; i <= n - itr - 1; i++) {
                if(arr[i+1] < arr[i]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
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