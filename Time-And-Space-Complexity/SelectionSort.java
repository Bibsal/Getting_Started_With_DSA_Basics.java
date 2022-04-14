// Selection sort is also similar to bubble sort as in bubble sort we used to sort each greater element to the last position
// and in selection sort we sort each smaller element to the 1st position or ith position and just yahi difference hai ki bubble bara element ko last me swap karta tha and selection chota ko karta hai. 
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        selectionSort(arr);
        printArr(arr);
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            // ak minIdx le lo and ith value ko man lo ki sabse chota hai and phir compare karo agar ussae bhi chota mile tho us value ko sabse chota/minIdx me assign kar do and 
            // ak pura iteration k bad jab sabse chota element minIdx me assign ho jai tab usko ith value jo ki 1st value hai ussae swap kar do.
            int minIdx = i;
            for(int j = i + 1; j <= arr.length; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // after each iteration swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
