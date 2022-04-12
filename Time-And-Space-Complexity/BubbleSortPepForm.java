import java.util.*;

public class BubbleSortPepForm {

  public static void bubbleSort(int[] arr) {
    //write your code here
    int n = arr.length;
    for(int itr = 1; itr <= n - 1; itr++) {
      for(int i = 0; i <= n - itr - 1; i++) {
        if(isSmaller(arr,i+1,i) == true) {
          swap(arr,i+1,i);
        }
      }
    }
    
  }
  // return true if the i+1 th element is smaller than ith element.
  public static boolean isSmaller(int[] arr, int ip1, int i) {
    System.out.println("Comparing "+ arr[ip1] + " and "+ arr[i]);
    if(arr[ip1] < arr[i]) {
      return true;
    } else {
      return false;
    }
  } 
  // used for swapping ith and jth elements of array.
  public static void swap(int[] arr, int ip1, int i) {
    System.out.println("Swapping "+ arr[ip1] + " and "+ arr[i]);
      int temp = arr[ip1];
      arr[ip1] = arr[i];
      arr[i] = temp;
  }

  public static void print(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  } 

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}