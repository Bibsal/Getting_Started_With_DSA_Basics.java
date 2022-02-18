import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);     // As we have to print from 0 to the last element of array so we've passed the 0 as index 0 and in the displayArr function first we printed the arr of idx
                                //and then called the recursive function by passing the array and index + 1 so that another index is called and is printed..
    }

    public static void displayArr(int[] arr, int idx){

        if(idx == arr.length) {
            return;
        }
        
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }

}