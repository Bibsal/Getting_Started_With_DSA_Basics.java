
public class Checking_Swap_Array {

	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr;
		
		arr = new int[5];
		arr[0] = 33;
		arr[1] = 47;
		arr[2] = 59;
		arr[3] = 67;
		arr[4] = 98;
		
		System.out.println("This was the original value's in array :-");
		for(int i=0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		swap(arr,0,4);  //with this the value of index 0 will go to index 4 and value of index 4 will come to index 0 !! 
		
		System.out.println("\n\nNow after swapping the value of index 0 and index 4, this is the updated value for the array :-");
		for(int i=0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
